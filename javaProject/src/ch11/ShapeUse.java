package ch11;

public class ShapeUse {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.x = 100; //draw()메서드에 받아줄 x,y 값 지정 
		r.y = 200;
		r.draw();
		
		Circle c = new Circle();
		c.x = 300;
		c.y = 300;
		c.draw();
	}

}
