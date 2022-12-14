package ch19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
//1:1통신
public class ChatServer {

	public static void main(String[] args) throws Exception{
		ServerSocket serverSocket = null;
		try {
			//서비스를 위한 포트 개방
			serverSocket = new ServerSocket(5555); //5555번 포트 개방
			System.out.println("서비스가 시작되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("서비스를 시작할 수 없습니다.");
			System.exit(1); //비정상적 종료, (0) => 정상종료
		}
		Socket clientSocket =null;
		try {
			//서버쪽에서는 항상 클라이언트의 접속을 기다리다가 요청이 오면 접속하여 소켓 연결
			clientSocket = serverSocket.accept();
			System.out.println("클라이언트의 ip : " + clientSocket.getInetAddress().getHostAddress());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//서버쪽 발신용 스트림
		PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);
		
		//수신용 스트림
		BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		
		String receive="";
		String send="Welcome!!!"; //접속시 환여인사
		
		writer.println(send); //실제로 메세지 보내기
		Scanner sc = new Scanner(System.in);
		while(true) {//채팅 주거니받거니 무한반복
			receive = reader.readLine(); //한 라인을 읽음
			if(receive == null || receive.equals("quit")) { //종료 조건
				break;
			}
			System.out.println("[client] " + receive);
			System.out.println("서버님 입력하세요(종료 : quit) : ");
			send = sc.nextLine();
			writer.println(send); //메세지 보내기
			if(send.equals("quit")) break;
		}
		//리소스(자원) 정리
		sc.close();
		writer.close();
		reader.close();
		clientSocket.close();
		serverSocket.close();
	}
}
