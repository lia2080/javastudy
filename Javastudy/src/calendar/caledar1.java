package calendar;

import java.util.Calendar;

public class caledar1 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int year = c.get( Calendar.YEAR );
		System.out.println(year);
		
		int month = c.get(Calendar.MONTH );
		System.out.println(month);
		
		int week = c.get( Calendar.DAY_OF_WEEK );
		System.out.println(week);
	}

}
