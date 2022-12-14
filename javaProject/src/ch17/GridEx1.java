package ch17;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridEx1 extends JFrame{
	public GridEx1() {
		super("GridLayout 예제"); //Title처리
		//기본은 보더레이아웃이기 떄문에 setLayout 그리드레이아웃으로 세팅
		//그리드레이아웃 : 균등하게 버튼이 화면에 나뉨 
		setLayout(new GridLayout(2,3)); //2행 3열의 그리드 레이아웃 설정
		JButton btn1 = new JButton("1"); //각 버튼 설정
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		JButton btn4 = new JButton("4");
		JButton btn5 = new JButton("5");
		JButton btn6 = new JButton("6");
		
		//그리드레이아웃에 버튼 추가
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);
		
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new GridEx1();
	}
	
}
