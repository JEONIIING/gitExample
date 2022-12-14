package ch18;

import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderEx2 {

	public static void main(String[] args) {
		int var = 0;
		//new InputStreamReader(InputStream)나 마찬가지임 
		//System은 InputStream의 대표적
		Reader input = new InputStreamReader(System.in); //다형성
		System.out.println("입력하세요 : ");
		try {
			while (true) {
				var = input.read(); //1문자를 읽어드림
				if(var == 13) break; //엔터키가 들어오면 종료
				System.out.println(var+ " ==> "+ (char)var);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
