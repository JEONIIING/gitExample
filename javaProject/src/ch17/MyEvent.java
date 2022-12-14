package ch17;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyEvent extends JFrame{ //JFrame 상속받기
	//버튼 선언
	JButton b1, b2, b3, b4;
	
	//생성자
	public MyEvent() {
		super("BorderLayout Event");
		
		//레이블세팅
		setLayout(new BorderLayout());
		//JButton객체생성
		b1 = new JButton("red");
		b2 = new JButton("green");
		b3 = new JButton("blue");
		b4 = new JButton("yellow");
	
		//버튼추가
		add(b1, "North");
		add(b2, "East");
		add(b3, "South");
		add(b4, "West");
		
		//버튼에 이벤트핸들러? 추가
		b1.addActionListener(new MyEventColor(this, Color.red));
		b2.addActionListener(new MyEventColor(this, Color.green));
		b3.addActionListener(new MyEventColor(this, Color.blue));
		b4.addActionListener(new MyEventColor(this, Color.yellow));

		setSize(700, 500); //사이즈설정
		setVisible(true);  //보이게하기
		setDefaultCloseOperation(EXIT_ON_CLOSE); //프로그램종료설정
	}
	
	public static void main(String[] args) {
		new MyEvent(); 
	}

}
