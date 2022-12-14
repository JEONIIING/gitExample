package ch19;

import java.net.Inet4Address;
import java.net.InetAddress;

public class InenAdreessExam {
	
	public static void main(String[] args) {
		try {//네트워크 프로그램 필수 try-catch 써야함
			InetAddress address = Inet4Address.getByName("google.com");
			System.out.println(address);//호스트이름, ip주소
			System.out.println(address.getHostName());//호스트이름(도메인이름)
			System.out.println(address.getAddress());//ip주소
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
