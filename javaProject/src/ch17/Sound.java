package ch17;

import java.applet.AudioClip;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;

public class Sound extends JApplet implements ActionListener{
	private AudioClip audio; //사운드처리 객체
	private JButton play,stop,loop;
	
	@Override
	public void init() {
		//화면 레이아웃 설정(애플릿 기본 레이아웃-> BorderLayout)
		setLayout(new FlowLayout()); //보더레이아웃에서 플로우레이아웃으로 변경
		audio = getAudioClip(getClass().getResource("dingdong.wav"));
		//버튼을 애플릿에 추가
		play = new JButton("PLAY");
		stop = new JButton("STOP");
		loop = new JButton("LOOP");
		add(play);
		add(stop);
		add(loop);
		
		//버튼 클릭 이벤트 기능 추가
		play.addActionListener(this);
		stop.addActionListener(this);
		loop.addActionListener(this);
	}
	
	//actionPerformed는 버튼을 누르면 자동으로 실행됨
	@Override 
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton)e.getSource(); //getSource()가 Object타입이어서 형변환 해주어야 한다.
		System.out.println(e.getSource());
		if(btn == play) {
			audio.play();
		}else if(btn == stop){
			audio.stop();
		}else if(btn == loop) {
			audio.loop();
		}
	}
}
