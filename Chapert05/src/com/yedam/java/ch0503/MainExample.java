package com.yedam.java.ch0503;

import java.util.Calendar;

public class MainExample {

	public static void main(String[] args) {
		week today = null;
		
		Calendar cal= Calendar.getInstance();
		int Week = cal.get(Calendar.DAY_OF_WEEK);//일1~7토 
		
		switch(Week){
			case 1:
				today = week.SUNDAY;
				break;
			case 2:
				today = week.MONDAY;
				break;
			case 3:
				today = week.TUESDAY;
				break;
			case 4:
				today = week.WEDNESDAY;
				break;
			case 5:
				today = week.TURSDAY;
				break;
			case 6:
				today = week.FRIDAY;
				break;
				
		}

	}

}
