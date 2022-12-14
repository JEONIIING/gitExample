package ch17;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

//그래픽 처리
public class PaintExam extends JFrame {
	public PaintExam() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g); //JFrame의 paint()가 실행됨
		g.drawString("hello java", 10, 60); //drawString("문자열",x좌표, y좌표): 그래픽인데 문자열 형태로 출력
		
		g.drawOval(30, 100, 50, 50); //도형 원
		
		g.setColor(Color.blue); //색을 지정
		g.fillOval(100, 100, 50, 50); //바로위에서 지정한 색을 채움
		
		g.setColor(Color.yellow);
		g.fillRect(200, 200, 60, 60); //도형 사각형
		System.out.println("paint 호출..."); //호출을 하는시점을 보기위해서 임시로 씀.
		
	}
	
	public static void main(String[] args) {
		new PaintExam();
	}
}
