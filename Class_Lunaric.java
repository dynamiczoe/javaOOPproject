public class Class_Lunaric {
	private int[] array_lunaricLastDays;

	public Class_Lunaric() {
		array_lunaricLastDays = new int[] { 2014, 30, 29, 30, 29, 30, 29, 30,
				29, 30, 30, 29, 30, 29, 384, 9 };
	}

	public int lunaric_WhatDateIsItToday(int[] array_month_Day) {
		int int_lunaricElapsedDay = 0;
		
		for (int i = 1; i < array_month_Day[0]; i++) {
			int_lunaricElapsedDay = int_lunaricElapsedDay
					+ array_lunaricLastDays[i];
			if (array_lunaricLastDays[14] > 366 && i == 8
					&& array_month_Day[3] > 0) {
				int_lunaricElapsedDay = int_lunaricElapsedDay
						+ array_lunaricLastDays[i + 1];
			}
		}
		int_lunaricElapsedDay = int_lunaricElapsedDay + array_month_Day[1];
		return int_lunaricElapsedDay;
	}
}