package ch17;

import javax.swing.JFrame;

public class JFrameEx extends JFrame{
	//main 메서드에서 GUI코드를 작성해도 되지만 가급적 Frame extends받아 기본생성자에서 GUI코드처리 하는것을 권장한다.
	//이런기법 권장함.
	
	public JFrameEx() { //JFrame은 이벤트핸들러가 기본 장착이 되어있다.
		super("JFrame 예제"); //제목처리, 부모생성자 호출
		setSize(400, 300); //창의 크기
		setVisible(true); //화면에 보이게 하는 것
	}
	
	public static void main(String[] args) {
		new JFrameEx(); //객체생성겸 기본생성자 호출
		
	}

}
