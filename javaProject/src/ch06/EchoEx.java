package ch06;

public class EchoEx {
	public static void main(String[] args) {
		echo("안녕!",3);
	}

	public static void echo(String str, int n) { //str="안녕!" , n=3
		for(int i=0; i<n; i++) {
			System.out.println(str);
		}
		
	}
}
