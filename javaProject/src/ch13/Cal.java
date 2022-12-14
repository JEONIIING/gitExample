package ch13;

import java.util.Calendar;
import java.util.Date;

public class Cal {

	public static void main(String[] args) {
		//Calendar 인스턴스 생성은 new로 만들지 않는다.
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH)+1); //월은 0~11로 카운트하기 때문에 MONTH같은 경우는 반드시 +1를 해줘야한다. 
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.HOUR)); //12시간제
		System.out.println(c.get(Calendar.HOUR_OF_DAY)); //24시간제
		System.out.println(c.get(Calendar.MINUTE));
		System.out.println(c.get(Calendar.SECOND));
		System.out.println(c.get(Calendar.AM_PM)); //오전 0, 오후 1
		if(c.get(Calendar.AM_PM)==0) {
			System.out.println("오전");
		}else {
			System.out.println("오후");
		}
		
		//1년중 몇번째 날
		System.out.println(c.get(Calendar.DAY_OF_YEAR));
		//월의 몇번째 날
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		//요일
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		String yoil = "";
		switch(c.get(Calendar.DAY_OF_WEEK)) {
		case 1 : yoil = "일요일"; break;
		case 2 : yoil = "월요일"; break;
		case 3 : yoil = "화요일"; break;
		case 4 : yoil = "수요일"; break;
		case 5 : yoil = "목요일"; break;
		case 6 : yoil = "금요일"; break;
		case 7 : yoil = "토요일"; break;
		}
		System.out.println("오늘은 "+yoil+"입니다.");
		
		//1년중 몇번째 주
		System.out.println(c.get(Calendar.WEEK_OF_YEAR));
		
		Date d = c.getTime(); //줄 그어져있는건 앞으로 되도록 사용하지 말자는 의미 
		System.out.println(d.getYear()+1900);
		System.out.println(d.getMonth()+1);
		System.out.println(d.getDate());
		
	}

}
