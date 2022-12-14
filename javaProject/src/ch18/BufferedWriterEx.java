package ch18;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class BufferedWriterEx {

	public static void main(String[] args) {
		PrintStream ps = System.out; 
		OutputStream os = ps;
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out); 한줄로도 가능
		
		try {
			bw.write("환영합니다.\n");
			bw.write("Java");
			bw.newLine(); //개행처리를 해주는 메서드
			bw.write("world!!");
			bw.flush(); //버퍼에 남아있는 모든 바이트를 출력
			bw.close(); //스캐너처럼 종료해주는 것도 좋다.
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
