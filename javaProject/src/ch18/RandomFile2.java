package ch18;

import java.io.RandomAccessFile;

public class RandomFile2 {

	public static void main(String[] args) {
		try {
			RandomAccessFile f= new RandomAccessFile("C:\\test\\rand2.txt", "rw");
			f.seek(9); //인덱스9부터
			f.write("park".getBytes()); //park로 바꿈
			System.out.println("파일 내용이 변경되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
