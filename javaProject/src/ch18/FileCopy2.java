package ch18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

public class FileCopy2 {
	static void fileWrite() {
		OutputStream os = null;
		try {
			os = new FileOutputStream("C:\\test\\abc.txt");
			System.out.println("입력하세요 : ");
			while(true) {
				int a = System.in.read();
				if(a == 13) break;
				os.write(a);
			}
			System.out.println("[파일이 저장되었습니다.]");
		} catch (Exception e) {
			System.out.println("[파일 저장에 실패하였습니다.]");
			e.printStackTrace();
		}
	}
	
	static void fileCopy() {
		String str =""; //내용 복사될 곳
		String filed1 = "C:\\test\\abc.txt"; //원본
		String filed2 = "C:\\test\\abcCopy.txt"; //복사본
		
		BufferedReader br=null;
		BufferedWriter bw=null;
		
		try {
			br = new BufferedReader(new FileReader(new File(filed1)));
			bw = new BufferedWriter(new FileWriter(new File(filed2)));
			
			while(true) {
				str=br.readLine();
				if(str==null)break;
				bw.write(str);
			}
			System.out.println("[파일 복사가 완료되었습니다.]");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) br.close();{
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if(bw != null) bw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		FileCopy2.fileWrite();
		FileCopy2.fileCopy();
	}

}
