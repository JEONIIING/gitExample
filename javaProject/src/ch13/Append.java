package ch13;

public class Append {
	public static void main(String[] args) {
		//불변형(immutable)
		String a = "hello";
		System.out.println(System.identityHashCode(a));
		a = a + "java";
		System.out.println(a);
		System.out.println(System.identityHashCode(a));
		System.out.println("===가변형 StringBuildder===");
		
		//가변형(mutable)
		StringBuilder b = new StringBuilder("hello");
		System.out.println(System.identityHashCode(b));
		b.append(" java"); //hello java
		System.out.println(b);
		System.out.println(System.identityHashCode(b));
		System.out.println(b.append(" Programmer")); // hello java Programmer
		System.out.println(b); //hello java Programmer
	
	}
}
