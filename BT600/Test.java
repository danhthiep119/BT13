package BT600;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import LearnHashMap_LinkedLink_TreeMap_Vector.Student;

public class Test {
	static List<SinhVien> sinhvienList=new ArrayList<>();
	static List<MonHoc> monhocList=new ArrayList<>();
	static List<DiemThi> diemthiList=new ArrayList<>();
	static Scanner input=new Scanner(System.in);
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		while(true) {
			showMenu();
			int chon=Integer.parseInt(input.nextLine());
			switch(chon) {
				case 1:
					addSv();
					break;
				case 2:
					addMon();
					break;
				case 3:
					addDiem();
					break;
				case 4:
					hienThi();
					break;
				case 5:
					saveText();
					break;
				case 6:
					saveObj();
					break;
				case 7:
					readObj();
					break;
				default: 
					System.out.println("Bạn Nhập Sai");
					break;
			}
		}
	}

	private static void readObj() throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("student.obj");
		ObjectInputStream ois=new ObjectInputStream(fis);
		sinhvienList=(List<SinhVien>) ois.readObject();
		monhocList=(List<MonHoc>) ois.readObject();
		diemthiList=(List<DiemThi>) ois.readObject();
		ois.close();
		fis.close();
	}

	private static void saveObj() throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos=new FileOutputStream("student.obj");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(sinhvienList);
		oos.writeObject(monhocList);
		oos.writeObject(diemthiList);
		oos.close();
		fos.close();
	}

	private static void saveText() throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos=new FileOutputStream("danhSach.txt");
		OutputStreamWriter osw=new OutputStreamWriter(fos);
		BufferedWriter bw=new BufferedWriter(osw);
		for (SinhVien sinhVien : sinhvienList) {
			for (DiemThi diemThi : diemthiList) {
				if(diemThi.getMaSv()==sinhVien.getMaSv())
				{
					for (MonHoc monHoc : monhocList) {
						if(diemThi.getMaMon()==monHoc.getMaMon())
						{
							String line = sinhVien.getMaSv()+" "+sinhVien.getName()+" "+sinhVien.getDate() +" "+sinhVien.getAddr()+" "+monHoc.tenMon+" "+diemThi.getDiem();
							bw.write(line);
							bw.newLine();
						}
					}
				}
			}
		}
		bw.close();
		osw.close();
		fos.close();
	}

	private static void hienThi() {
		// TODO Auto-generated method stub
		for (SinhVien sinhVien : sinhvienList) {
			for (DiemThi diemThi : diemthiList) {
				if(diemThi.getMaSv()==sinhVien.getMaSv())
				{
					for (MonHoc monHoc : monhocList) {
						if(diemThi.getMaMon()==monHoc.getMaMon())
						{
							String line = sinhVien.getMaSv()+" "+sinhVien.getName()+" "+monHoc.tenMon+" "+diemThi.getDiem();
							System.out.println(line);
						}
					}
				}
			}
		}
	}

	private static void addDiem() {
		// TODO Auto-generated method stub
		System.out.println("Mời Bạn Nhập Số Điểm:");
		int number=Integer.parseInt(input.nextLine());
		for(int i=0;i<number;i++) {
			DiemThi diemThi=new DiemThi();
			diemThi.input();
			diemthiList.add(diemThi);
		}
	}

	private static void addMon() {
		// TODO Auto-generated method stub
		System.out.println("Mời Bạn Nhập Số Môn:");
		int number=Integer.parseInt(input.nextLine());
		for(int i=0;i<number;i++) {
			MonHoc monhoc=new MonHoc();
			monhoc.input();
			monhocList.add(monhoc);
		}
	}

	private static void addSv() {
		// TODO Auto-generated method stub
		System.out.println("Mời Bạn Nhập Số Sinh Viên:");
		int number=Integer.parseInt(input.nextLine());
		for (int i = 0; i < number; i++) {
			SinhVien sinhvien=new SinhVien();
			sinhvien.input();
			sinhvienList.add(sinhvien);
		}
	}

	static void showMenu() {
		System.out.println("1. Thêm Sinh Viên");
		System.out.println("2. Thêm Môn Học");
		System.out.println("3. Thêm Điểm Thi");
		System.out.println("4. Hiện Thị Thông Tin");
		System.out.println("5. Lưu Thông Tin Text");
		System.out.println("6. Lưu Thông Tin student.obj");
		System.out.println("7. Lấy Thông Tin");
		System.out.println("Chọn");
	}
}
