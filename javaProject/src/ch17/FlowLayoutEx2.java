package ch17;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayoutEx2 extends JFrame{
	//멤버변수
	JPanel jp; //JPanel 변수선언
	JButton jb1, jb2, jb3, jb4, jb5, jb6; //버튼 변수 선언
	
	//기본생성자
	public FlowLayoutEx2() {
		super("FlowLayout 예제2"); //JFrame에다가 타이틀을 지정해준다.
		jp = new JPanel(); //패널생성
		jb1 = new JButton("버튼 1"); //버튼생성
		jb2 = new JButton("버튼 2"); //버튼생성
		jb3 = new JButton("버튼 3"); //버튼생성
		jb4 = new JButton("버튼 4"); //버튼생성
		jb5 = new JButton("버튼 5"); //버튼생성
		jb6 = new JButton("버튼 6"); //버튼생성
	
		//패널에 버튼 추가
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		jp.add(jb5);
		jp.add(jb6);
	
		//패널을 FlowLayout으로 설정
		//jp.setLayout(new FlowLayout()); //패널의 기본레이아웃은 FlowLayout이기도 해서 생략 가능하다.
		
		add(jp, "South"); //JFrame에 "South"영역에 패널을 배치
		add(jb5);
		setSize(600, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}
	
	public static void main(String[] args) {
		new FlowLayoutEx2();
	}

	
}
