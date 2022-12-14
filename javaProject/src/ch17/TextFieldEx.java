package ch17;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TextFieldEx extends JFrame{
	public TextFieldEx() { //한줄짜리 글자를 넣을 수 있는 , 웹 만들때 많이 사용됨 
		super("텍스트필드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //JFrame 참조변수 생략가능
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("이름"));
		c.add(new JTextField(20)); //창(필드)크기 20
		c.add(new JLabel("학과"));
		c.add(new JTextField("컴퓨터공학과", 20)); //필드도 지정하고 글자도 세팅가능
		c.add(new JLabel("주소"));
		c.add(new JTextField("서울시 강남구",20));
		c.add(new JLabel("비번"));
		c.add(new JPasswordField(20)); // 텍스트를 치면 비공개처리됨
		
		setSize(500, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new TextFieldEx();
	}
	
}
