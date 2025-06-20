package api;

import java.util.Date;

public class BoardController {
	public static void main(String[] args) {
		String year = StringUtil.getYear(new Date());
		System.out.println(year);
		String month = StringUtil.getMonth("20240408");
		System.out.println(month);
	}
	
	
}
