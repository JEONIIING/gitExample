package ch17;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuEx extends JFrame{
	//"Exit"만 메뉴아이템으로 별도 생성
	private JMenuItem mie = new JMenuItem("Exit");
	
	public MenuEx() {
		super("Menu 예제");
		createMenu(); //따로 메서드 만들어서 호출도 가능 (무조건 생성자 안에서 하라는 법도 없다.)
		setSize(300, 200);
		setVisible(true);
	}

	public void createMenu() {
		JMenuBar mb = new JMenuBar(); //메뉴바 생성
		JMenu jm = new JMenu("File"); //메뉴 생성
		jm.add(new JMenuItem("Open")); //메뉴에 메뉴아이템 추가 ->File메뉴안에 Open바 추가
		jm.add(new JMenuItem("Save"));
		jm.add(new JMenuItem("Print"));
		jm.addSeparator(); //메뉴아이템들 사이에 분리선, 구분선 추가 가능
		jm.add(mie); //매개변수 참조변수 메뉴아이템 참조변수 넣을수도 있고 바로 new 해서 객체생성도 가능
		mb.add(jm); //메뉴바에 메뉴를 붙임
		mb.add(new JMenu("Edit")); //메뉴바에 메뉴 추가
		mb.add(new JMenu("Project"));
		mb.add(new JMenu("Run"));
		
		//프레임에 메뉴바를 붙임(메뉴바는 프레임에만 붙일 수 있다.)
		setJMenuBar(mb);
		
		//메뉴아이템 이벤트처리 -> "Exit"메뉴아이템을 클릭하면 프로그램 종료 이벤트 처리
		mie.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}//createMenu()
	public static void main(String[] args) {
		new MenuEx();
	}

}
