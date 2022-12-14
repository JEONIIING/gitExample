package ch17;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextAreaEx extends JFrame{
	//멤버변수
	private JTextField tf = new JTextField(20); //한줄짜리 입력창
	private JTextArea ta = new JTextArea(6, 20);//6행 20열의 여러입력창 생성
	
	public TextAreaEx() {
		super("TextArea 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("입력 후 <Enter> 키를 입력하세요."));
		c.add(tf); //컴포넌트 텍스트필드 붙여넣기
		c.add(new JScrollPane(ta)); //textarea안에 스크롤 넣음
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				ta.append(t.getText()+ "\n"); //텍스트한줄짜리 필드의 문자열을 textarea영역으로 옮기는 역할을 한다.
				t.setText(""); //현재 텍스트 필드에 입력된 내용 지우기 역할. ""문자로 처리
			}
		});
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new TextAreaEx();
	}

}
