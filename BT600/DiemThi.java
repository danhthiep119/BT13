	package BT600;

import java.io.Serializable;
import java.util.Scanner;

public class DiemThi implements Serializable{
	int maMon,maSv;
	float diem;
	
	public int getMaMon() {
		return maMon;
	}
	public void setMaMon(int maMon) {
		this.maMon = maMon;
	}
	public int getMaSv() {
		return maSv;
	}
	public void setMaSv(int maSv) {
		this.maSv = maSv;
	}
	public float getDiem() {
		return diem;
	}
	public void setDiem(float diem) {
		this.diem = diem;
	}
	
	public DiemThi(int maMon, int maSv, float diem) {
		this.maMon = maMon;
		this.maSv = maSv;
		this.diem = diem;
	}
	public DiemThi() {
		
	}

	public void input() {
		Scanner input=new Scanner(System.in);
		System.out.println("Nhập Mã Môn:");
		maMon=Integer.parseInt(input.nextLine());
		System.out.println("Nhập Mã SV:");
		maSv=Integer.parseInt(input.nextLine());
		System.out.println("Điểm:");
		diem=Float.parseFloat(input.nextLine());
		
	}
	public void display() {
		
	}
}
