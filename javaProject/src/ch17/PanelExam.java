package ch17;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelExam extends JFrame {
	public PanelExam() { //기본생성자에서 GUI코드를 작성을 권장
		//패널에는 2개 이상의 컴포넌트를 배치할 수 있기 때문에, 버튼을 패널에 추가 후
		//패널을 프레임에 붙여 여러 개의 컴포넌트를 처리할 수 있다.
		JPanel p = new JPanel();
		p.setBackground(Color.red); //패널의 배경색상 설정
		
		//버튼 생성(Swing은 한글처리가 잘된다.)
		JButton button1 = new JButton("버튼1"); //버튼의 로고
		JButton button2 = new JButton("버튼2"); //버튼의 로고
		JButton button3 = new JButton("버튼3"); //버튼의 로고
		JButton button4 = new JButton("버튼4"); //버튼의 로고
		JButton button5 = new JButton("버튼5"); //버튼의 로고
		JButton button6 = new JButton("버튼6"); //버튼의 로고
	
		//패널에 버튼을 추가 -> 2개이상의 버튼을 같이 두고 싶다면 패널을 사용 
		p.add(button1); 
		p.add(button6);
		
		//보더레이아웃에 버튼 및 패널을 추가
		add(p, BorderLayout.NORTH); //패널에 추가
		add(button2); //보더레이아웃의 위치를 생략하면 Center로 배치
		add(button3,"South");
		add(button4,"West");
		add(button5,"East");
		
		setSize(300, 300); //화면사이즈 설정
		setVisible(true);  //JFrame을 화면에 표시
		
		//윈도우 닫기 버튼을 눌렀을 때 (프로그램 완전 종료)
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new PanelExam();
	}
}
