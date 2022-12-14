package ch17;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class MyEventColor implements ActionListener {
	private JFrame j; //JFrame타입 참조변수 j
	private Color c;  //Color타입 참조변수 c
	private Container con; //Container타입 참조변수 con

	//매개변수 있는 생성자
	public MyEventColor(JFrame j, Color c) {
		this.j = j;
		this.c = c;
		con = j.getContentPane(); //그릇에 콘텐츠영역 넣기
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		con.setBackground(c); //컨텐츠 영역 배경색깔을 color로 셋팅될 수 있도록?
	}


}
