public class Class_Solaric {
	private int[] array_solaricLastDay;
	private int int_lunaricFirstDay = 30;

	public Class_Solaric() {
		array_solaricLastDay = new int[] { 30, 29, 30, 29, 30, 29, 30, 29, 30, 30, 29, 30, 29 };
	}

	public int[] solaric_WhatDateIsItToday(int int_lunaricElapsedDay) {
		int i;

		int_lunaricElapsedDay = int_lunaricElapsedDay + int_lunaricFirstDay;

		for (i = 0; i < 12; i++) {

			if (int_lunaricElapsedDay < array_solaricLastDay[i]) {
				break;
			}
			int_lunaricElapsedDay = int_lunaricElapsedDay - array_solaricLastDay[i];
		}
		int[] array_monthAndDay = new int[4];
		array_monthAndDay[0] = i;
		array_monthAndDay[1] = int_lunaricElapsedDay;
		array_monthAndDay[2] = 0; // 정수형날짜배열의 3번째인자가 1이면 음력, 0이면 양력

		return array_monthAndDay;
	}

	public int solaricElapsedDays(int[] month_day) {
		int int_solaricElapsedDay = 0;

		for (int i = 0; i < month_day[0]; i++) {

			int_solaricElapsedDay = int_solaricElapsedDay + array_solaricLastDay[i];

		}
		int_solaricElapsedDay = int_solaricElapsedDay + month_day[1];
		return int_solaricElapsedDay;
	}
}