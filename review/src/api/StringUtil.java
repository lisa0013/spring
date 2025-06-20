package api;

import java.util.Calendar;
import java.util.Date;

/*
 *  String 메서드 indexOf
 *  Date, LocalDate, Calendar
 *  List
 *  Set
 *  Map
 */
public class StringUtil {
	// 문자형 날짜에서 년도만 월
	public static String getYear(String date) {
		return date.substring(0, 4);
	}
	
	public static String getYear(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int year = calendar.get(Calendar.YEAR);
		return String.valueOf(year);
	}

	public static String getMonth(String date) {
		return date.substring(4, 6);
	}
}
