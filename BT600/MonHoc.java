package BT600;

import java.io.Serializable;
import java.util.Scanner;

public class MonHoc implements Serializable{
	int maMon;
	String tenMon;
	
	public int getMaMon() {
		return maMon;
	}
	public void setMaMon(int maMon) {
		this.maMon = maMon;
	}
	public String getTenMon() {
		return tenMon;
	}
	public void setTenMon(String tenMon) {
		this.tenMon = tenMon;
	}
	
	public MonHoc(int maMon, String tenMon) {
		this.maMon = maMon;
		this.tenMon = tenMon;
	}
	public MonHoc() {
	
	}

	
	@Override
	public String toString() {
		return "MonHoc [maMon=" + maMon + ", tenMon=" + tenMon + "]";
	}
	
	public void input() {
		Scanner input=new Scanner(System.in);
		System.out.println("Nhập Mã Môn:");
		maMon=Integer.parseInt(input.nextLine());
		System.out.println("Nhập Tên Môn");
		tenMon=input.nextLine();
	}
	public void display() {
		System.out.println(toString());
	}
}
