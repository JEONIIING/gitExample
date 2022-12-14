package ch17;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JApplet;

public class MyEventImg extends JApplet implements MouseListener,MouseMotionListener,KeyListener{
	private int x,y; //좌표
	private int width, height; //가로세로 사이즈
	private Image img; //이미지 객체
	private boolean flag=true;
	
	
	@Override
	public void init() {
		setSize(600, 600);
		img = Toolkit.getDefaultToolkit().
				getImage(getClass().getResource("R.png"));
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		this.addKeyListener(this);
		
		setFocusable(true);
		requestFocus();
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		width = img.getWidth(null);
		height = img.getHeight(null);
		g.drawImage(img, x, y, this);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		
		System.out.print("마우스 클릭 좌표 ");
		System.out.println("x : " +x +" , y : "+y);

		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		System.out.print("마우스 움직임 좌표 ");
		System.out.println("x = "+ x+ " , y = "+y);
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		System.out.println("키 코드값 : "+e.getKeyCode());

		switch (e.getKeyCode()) {
		case KeyEvent.VK_UP:
			y = Math.max(0, y-10); break;
		case KeyEvent.VK_DOWN:
			y = Math.min(600-height, y+10); break;
		case KeyEvent.VK_LEFT:
			x = Math.max(0, x-10); break;
		case KeyEvent.VK_RIGHT:
			x = Math.min(600-width, x+10); break;
		}
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
