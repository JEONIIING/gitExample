package ch19;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MultiChatClient {
	static String nickName = null; //대화명
	static JTextArea ta;
	static JTextField tf;
	static DataOutputStream out;
	
	public static void main(String[] args) {
		nickName = JOptionPane.showInputDialog("대화명을 입력하세요.");
		new ClientScreen(nickName);
		Socket socket;
		try {
			String serverIP = "localhost";
			//String serverIP = "192.168.0.101";
			//소켓을 생성하여 연결을 요청
			socket = new Socket(serverIP,7777);
			System.out.println("서버에 연결되었습니다.");
			Thread receiveThread = new ClientReceiver(socket);
			receiveThread.start();
			Thread sender = new ClientSender(socket, nickName);
			sender.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//메시지 전송용 스레드 클래스
	static class ClientSender extends Thread{
		Socket socket;
		String name;
		
		public ClientSender(Socket socket, String name) {
			this.socket = socket;
			try {
				out = new DataOutputStream(socket.getOutputStream());
				this.name = name;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		@Override
		public void run() {
			Scanner sc = new Scanner(System.in);
			try {
				if(out != null) {
					out.writeUTF(name);//대화명 보내기
				}
				while (out != null) {
					out.writeUTF("[" + name + "]" + sc.nextLine());
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}//end run()
	}//end CilentSender class

	//메시지 수신용 스레드 클래스
	static class ClientReceiver extends Thread{
		Socket socket;
		DataInputStream in;
		
		public ClientReceiver(Socket socket) {
			this.socket = socket;
			try {
				in = new DataInputStream(socket.getInputStream());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		@Override
		public void run() {
			while (in != null) {
				try {
					String s = in.readUTF(); 
					System.out.println(s);
					ta.append(s + "\n"); //들어온 메시지를 텍스트 에리어에 넣어줌
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}//run()
	}//end ClientReceiver class
	
	//화면 구성용 클래스(GUI 활용)
	static class ClientScreen extends JFrame implements ActionListener{
		public ClientScreen(String nick) {
			setSize(300, 500);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle(nick + "의 채팅방 클라이언트!");
			ta = new JTextArea(25,40);
			tf = new JTextField(25);
			tf.addActionListener(this);
			JPanel panel = new JPanel(); //기본 FlowLayout
			//패널의 레이아웃을 변경 (BorderLayout으로)
			panel.setLayout(new BorderLayout()); 
			//패널의 배치 방향 설정 (좌에서 우방향으로)
			panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
			JLabel label_name = new JLabel(nick + "님 ");
			panel.add(label_name, BorderLayout.WEST);
			panel.add(tf, BorderLayout.CENTER);
			//JTextArea 처리
			JScrollPane jspanel = new JScrollPane();
			panel.add(jspanel, BorderLayout.NORTH);
			jspanel.setViewportView(ta);
			add(panel, BorderLayout.SOUTH);
			setVisible(true);
		}
		
		@Override
		public void actionPerformed(ActionEvent e) { //이벤트 처리
			if(e.getSource() == tf) { //텍스트 필드에서 엔터키입력하면 반응
				try {
					//텍스트 필드에 입력한 문자열을 보낸ㅁ
					out.writeUTF("[" + nickName +"]" + tf.getText());
					tf.setText("");
				} catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		}
		
	}//end ClientScreen class
	

}//class
