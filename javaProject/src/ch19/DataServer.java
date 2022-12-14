package ch19;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

//서버용 프로그램(먼저 실행이 되어져야 함.)
public class DataServer {

	public static void main(String[] args) throws Exception {
		//try-with문
		try(ServerSocket ss = new ServerSocket(8000)){
			System.out.println("서비스가 시작되었습니다.");
			while(true) {
				//Clent Socket
				//클라이언트에서 접속하면 소켓연결(논리적인 회선 연결)
				//ServerSocket클래스의 accept()메서드를 이용하여 클라이언트로부터 연결 요청을 기다린다.
				Socket socket = ss.accept();
				PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
				String str = sdf.format(new Date()); //시스템 날짜
				out.println(str); //클라이언트에게 데이터 전송
				socket.close(); //연결종료 
			}
		}
	}

}
