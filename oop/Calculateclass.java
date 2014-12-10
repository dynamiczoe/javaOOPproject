package oop;

public class Calculateclass {
	private int start_holiday_date, finish_holiday_date, elapsedDays, year = 2014;
	boolean isStartLunar, isFinishLunar;
	private int[] date = new int[7];
	private String start_HolidayName, finish_HolidayName;
	private Holidays[] array_Holidays;

	private Holidays holidays;
	private Solaric solaric;
	private Lunaric lunaric;

	public Calculateclass() {
		holidays = new Holidays();
		lunaric = new Lunaric();
		solaric = new Solaric();
	}

	public void set_DataToCalculate(String start_holidayName, boolean isStartLunar, String finish_holidayName,	boolean isFinishLunar, Holidays[] holidays) {
		this.start_HolidayName = start_holidayName;
		this.finish_HolidayName = finish_holidayName;
		this.isStartLunar = isStartLunar;
		this.isFinishLunar = isFinishLunar;
		array_Holidays = holidays;
	}

	public void clacualte_ElapsedDays() {
		date[5] = 0;
		date[6] = 0;
		int start_date = array_Holidays[holidays.get_holidayIndex_From_Name(start_HolidayName)].get_hDay_date();
		int finish_date = array_Holidays[holidays.get_holidayIndex_From_Name(finish_HolidayName)].get_hDay_date();

		if (islunarXlunar()) {
			date[0] = start_date / 100;
			date[1] = start_date % 100;
			date[2] = finish_date / 100;
			date[3] = finish_date % 100;
			int start_date_lunaric = lunaric.calculate_LunaricElapsedDays(year,
					date[0], date[1]);
			int finish_date_lunaric = lunaric.calculate_LunaricElapsedDays(
					year, date[2], date[3]);
			elapsedDays = finish_date_lunaric - start_date_lunaric;

			int start_lunarMonth, start_lunarDay, finish_lunarMonth, finish_lunarDay;
			start_lunarMonth = start_date / 100;
			start_lunarDay = start_date % 100;
			finish_lunarMonth = finish_date / 100;
			finish_lunarDay = finish_date % 100;

			int start_Lunaric_ElapsedDay = lunaric
					.calculate_LunaricElapsedDays(year, start_lunarMonth,
							start_lunarDay);
			start_holiday_date = solaric
					.convert_LunaricElapsedDayToSolaricElapsedDay(start_Lunaric_ElapsedDay);
			int finish_Lunaric_ElapsedDay = lunaric
					.calculate_LunaricElapsedDays(year, finish_lunarMonth,
							finish_lunarDay);
			finish_holiday_date = solaric
					.convert_LunaricElapsedDayToSolaricElapsedDay(finish_Lunaric_ElapsedDay);

			date[5] = start_holiday_date;
			date[6] = finish_holiday_date;
		} else if (islunarXsolar()) {
			int start_lunaricMonth, start_lunaricDay;
			start_lunaricMonth = start_date / 100;
			start_lunaricDay = start_date % 100;
			date[5] = start_date;
			int start_LunaricElapsedDay = lunaric.calculate_LunaricElapsedDays(
					year, start_lunaricMonth, start_lunaricDay);
			start_holiday_date = solaric
					.convert_LunaricElapsedDayToSolaricElapsedDay(start_LunaricElapsedDay);
			date[0] = start_holiday_date / 100;
			date[1] = start_holiday_date % 100;

			date[2] = finish_date / 100;
			date[3] = finish_date % 100;
			int start_ElapsedDay = solaric.calculate_SolaricElapsedDays(
					date[0], date[1]);
			int finish_ElapsedDay = solaric.calculate_SolaricElapsedDays(
					date[2], date[3]);

			elapsedDays = finish_ElapsedDay - start_ElapsedDay;
		} else if (issolarXlunar()) {
			date[0] = start_date / 100;
			date[1] = start_date % 100;

			int finish_lunaricMonth, finish_lunaricDay;
			finish_lunaricMonth = finish_date / 100;
			finish_lunaricDay = finish_date % 100;
			date[6] = finish_date;

			int lunaric_elapsedDays = lunaric.calculate_LunaricElapsedDays(
					year, finish_lunaricMonth, finish_lunaricDay);
			finish_holiday_date = solaric
					.convert_LunaricElapsedDayToSolaricElapsedDay(lunaric_elapsedDays);
			date[2] = finish_holiday_date / 100;
			date[3] = finish_holiday_date % 100;
			int start_ElapsedDay = solaric.calculate_SolaricElapsedDays(
					date[0], date[1]);
			int finish_ElapsedDay = solaric.calculate_SolaricElapsedDays(
					date[2], date[3]);

			elapsedDays = finish_ElapsedDay - start_ElapsedDay;
		} else if (issolarXsolar()) {
			date[0] = start_date / 100;
			date[1] = start_date % 100;
			date[2] = finish_date / 100;
			date[3] = finish_date % 100;

			int start_ElapsedDay = solaric.calculate_SolaricElapsedDays(
					date[0], date[1]);
			int finish_ElpsedDay = solaric.calculate_SolaricElapsedDays(
					date[2], date[3]);

			elapsedDays = finish_ElpsedDay - start_ElapsedDay;
		}
		date[4] = elapsedDays;
	}

	private boolean islunarXlunar() {
		if (isStartLunar == true && isFinishLunar == true) {			
			return true;
		} else
			return false;
	}
	private boolean issolarXlunar() {
		if (isStartLunar == false && isFinishLunar == true) {
			return true;
		} else
			return false;
	}
	private boolean islunarXsolar() {
		if (isStartLunar == true && isFinishLunar == false) {
			return true;
		} else
			return false;
	}
	private boolean issolarXsolar() {
		if (isStartLunar == false && isFinishLunar == false) {
			return true;
		} else
			return false;
	}
	public int[] get_Date_Array() {
		return date;
	}
}