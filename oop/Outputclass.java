package oop;

public class Outputclass {
	private int start_month, start_day, finish_month, finish_day, start_lunarMonth, start_lunarDay, finish_lunarMonth, finish_lunarDay; // 시작/종료 기념일 월,일
	private int elapsedDay; // 경과일
	private int isStartLunar = 0, isFinishLunar = 0;
	private int[] recievedDate;
	private String start_HolidayName, finish_HolidayName; // 시작/종료 기념일 이름값

	void set_values(int[] date, String[] holiday_names) {
		this.recievedDate = date;
		start_month = recievedDate[0];
		start_day = recievedDate[1];
		finish_month = recievedDate[2];
		finish_day = recievedDate[3];
		elapsedDay = recievedDate[4];
		start_HolidayName = holiday_names[0];
		finish_HolidayName = holiday_names[1];
		if (recievedDate[5] != 0) {
			isStartLunar = 1;
			start_lunarMonth = recievedDate[5] / 100;
			start_lunarDay = recievedDate[5] % 100;
		}
		if (recievedDate[6] != 0) {
			isFinishLunar = 1;
			finish_lunarMonth = recievedDate[6] / 100;
			finish_lunarDay = recievedDate[6] % 100;
		}
	}
	void show_Result() {
		if (isStartLunar != 0) {
			System.out.print("시작 기념일 : " + start_HolidayName + start_lunarMonth + " 월 " + start_lunarDay + " 일   ");
			System.out.println("        #### 양력날짜 : " + start_month + " 월 " + start_day + "일");
		} else {
			System.out.print("시작 기념일 : " + start_HolidayName + start_month + " 월 " + start_day+ " 일   \n");
		}
		
		if (isFinishLunar != 0) {
			System.out.print("종료 기념일 : " + finish_HolidayName + finish_lunarMonth + " 월 " + finish_lunarDay + " 일    ");
			System.out.println("        #### 양력날짜 : " + finish_month + " 월 " + finish_day + "일");
		} else {
			System.out.print("종료 기념일 : " + finish_HolidayName + finish_month + " 월 " + finish_day + " 일");
		}
		System.out.print("경과일수 : " + elapsedDay);
	}
}