package ch07;

import ch06.ModiEx;


public class ModiExUse extends ModiEx{
	//상속관계에 있어서 부모클래스가 아닌 자식클래스를 인스턴스화 해야함.

	public static void main(String[] args) {
		ModiExUse me = new ModiExUse();
		System.out.println(me.name);
		
	}

}
