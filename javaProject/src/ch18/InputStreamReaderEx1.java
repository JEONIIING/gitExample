package ch18;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderEx1 {
	//InputStream : 1byte 단위로 읽음
	//InputStreamReader : 문자 단위(2byte)로 읽음
	public static void main(String[] args) {
		InputStream is = System.in; //1byte처리
		//new ~Reader(Stream계열을 매개변수로 넣어줘야함)
		InputStreamReader isr = new InputStreamReader(is); //2byte처리 => 한글처리 할때는 Reader계열 쓰기
		System.out.println("한글자를 입력하세요 : ");
		try {
			int code = isr.read(); //글자의 코드값
			System.out.println("code : "+code);
			char ch = (char)code;
			System.out.println("char : " + ch);
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}

}
