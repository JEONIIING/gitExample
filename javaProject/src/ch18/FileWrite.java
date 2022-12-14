package ch18;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileWrite {
	//프로그램 ==> 파일(출력스트림이 필요)
	public static void main(String[] args) {
		OutputStream os = null;
		try {
			os = new FileOutputStream("C:\\test\\aa.txt");
			System.out.println("입력하세요 : ");
			while(true) {
				int ch = System.in.read();//1byte 읽음
				if(ch==13) break; //엔터키를 만나면 빠져나옴
				os.write(ch); //파일에 1byte값을 저장
			}
			System.out.println("저장되었습니다.");
		} catch (Exception e) {
			System.out.println("파일저장에 실패하였습니다.");
			e.printStackTrace();
		}
		
	}

}
