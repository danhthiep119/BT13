package BT600;

import java.io.Serializable;
import java.util.Scanner;

public class SinhVien implements Serializable{
	int maSv;
	String name,date,addr;
	
	public int getMaSv() {
		return maSv;
	}
	public void setMaSv(int maSv) {
		this.maSv = maSv;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public SinhVien(int maSv, String name, String date, String addr) {
		this.maSv = maSv;
		this.name = name;
		this.date = date;
		this.addr = addr;
	}
	public SinhVien() {

	}
	
	@Override
	public String toString() {
		return "SinhVien [maSv=" + maSv + ", name=" + name + ", date=" + date
				+ ", addr=" + addr + "]";
	}
	
	public void input() {
		Scanner input=new Scanner(System.in);
		System.out.println("Nhập Mã SV:");
		maSv=Integer.parseInt(input.nextLine());
		System.out.println("Nhập Tên:");
		name=input.nextLine();
		System.out.println("Nhập Ngày Sinh:");
		date=input.nextLine();
		System.out.println("Nhập Địa Chỉ:");
		addr=input.nextLine();
	}
	public void display() {
		System.out.println(toString());
	}
}
