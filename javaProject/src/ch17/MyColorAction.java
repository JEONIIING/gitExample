package ch17;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

//이벤트
public class MyColorAction implements ActionListener {
	//멤버변수
	private JFrame f;
	private Color c;
	//Container : 다른 컴포넌트를 담을 수 있는 요소
	//contentPane : 스윙에서는 contentPane에 컴포넌트를 부착할 수 있는데, 
	//contentPane은 JFrame 객체가 처음 생길때 자동으로 생성되며, getContentPane()메서드를 사용해 얻을 수 있다.
	private Container con;
	
	public MyColorAction(JFrame f, Color c) {
		this.f = f;
		this.c = c;
		//다형성
		//좌:부 => Container 
		//우:자 => JFrame 
		// Containter con = f.getContentPane();
		con = f.getContentPane(); //프레임의 컨텐츠 영역 - 요소를 갖다가 활용 할 때
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		con.setBackground(c); //배경색상 변경
	}

	
}
