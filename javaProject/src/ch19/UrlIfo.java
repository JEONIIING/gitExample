package ch19;

import java.net.MalformedURLException;
import java.net.URL;

public class UrlIfo {

	public static void main(String[] args) {
		//URL : url정보를 분석하는 클래스
		URL url;
		try {
			url = new URL("https://www.youtube.com/watch?v=ayRKMT6x-ms&list=PLW2UjW795-f5JPTsYHGAawAck9cQRw5TD&index=19");
			System.out.println("프로토콜 이름 : " + url.getProtocol());
			System.out.println("URL의 포트 번호 : " + url.getPort());
			System.out.println("호스트 이름 : " + url.getHost());
			System.out.println("URL 파일의 이름 : " + url.getFile());
			System.out.println("기타 : " + url.toExternalForm()); //전체 URL의 문자열 객체를 반환하는 메서드
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}
