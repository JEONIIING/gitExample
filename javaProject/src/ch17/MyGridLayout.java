package ch17;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class MyGridLayout extends JFrame{ //JFrame상속받기
	//기본생성자
	public MyGridLayout() {
		setTitle("GridLayout TextField");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); //현재 창 닫기
		
		Container con = getContentPane(); //그릇에 콘텐츠영역 넣기 곧, con=콘텐츠영역이 됨
		setLayout(new GridLayout(4,1)); //4행 1열 레이아웃 변경
		
		con.add(new JLabel("id                   : "));
		con.add(new TextField("hong",20));
		con.add(new JLabel("비밀번호     : "));
		con.add(new JPasswordField("1234", 20));
		con.add(new JLabel("이메일         : "));
		con.add(new TextField("hong@daum.net",20));
		con.add(new JLabel("HP                 : "));
		con.add(new TextField("010-1234-5678",20));
		
		setSize(350, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyGridLayout();
	}

}
