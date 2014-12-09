package oop;

public class Calculateclass {
	private int start_holiday_date, finish_holiday_date, start_solar_or_lunar, finish_solar_or_lunar, elapsedDays, year = 2014;
	private int[] date = new int[7];
	private String start_HolidayName, finish_HolidayName;
	private Holidays holidays;
	private Solaric solaric;
	private Lunaric lunaric;
	private Holidays[] array_Holidays;

	public Calculateclass() {
		holidays = new Holidays();
		lunaric = new Lunaric();
		solaric = new Solaric();
	}

	void 값_설정하기(String start_holidayName, int start_solar_or_lunar, String finish_holidayName, int finish_solar_or_lunar, Holidays[] holidays) {
		this.start_HolidayName = start_holidayName;
		this.finish_HolidayName = finish_holidayName;
		this.start_solar_or_lunar = start_solar_or_lunar;
		this.finish_solar_or_lunar = finish_solar_or_lunar;
		array_Holidays = holidays;
	}
	void clacualte_ElapsedDays() {
		date[5]=0;
		date[6]=0;
		int start_date = array_Holidays[holidays.get_holidayIndex_From_Name(start_HolidayName)].get_hDay_date();
		int finish_date = array_Holidays[holidays.get_holidayIndex_From_Name(finish_HolidayName)].get_hDay_date();
		

		if (start_solar_or_lunar == 1 && finish_solar_or_lunar == 1) {
			date[0] = start_date / 100;
			date[1] = start_date % 100;
			date[2] = finish_date / 100;
			date[3] = finish_date % 100;
			int start_date_lunaric = lunaric.calculate_LunaricElapsedDays(year, date[0], date[1]);
			int finish_date_lunaric = lunaric.calculate_LunaricElapsedDays(year, date[2], date[3]);
			elapsedDays = finish_date_lunaric - start_date_lunaric;
			
			int start_lunarMonth, start_lunarDay, finish_lunarMonth, finish_lunarDay;
			start_lunarMonth = start_date / 100;
			start_lunarDay = start_date % 100;
			finish_lunarMonth = finish_date / 100;
			finish_lunarDay = finish_date % 100;
			
			int start_Lunaric_ElapsedDay = lunaric.calculate_LunaricElapsedDays(year, start_lunarMonth, start_lunarDay);
			start_holiday_date = solaric.convert_LunaricElapsedDayToSolaricElapsedDay(start_Lunaric_ElapsedDay);
			int finish_Lunaric_ElapsedDay = lunaric.calculate_LunaricElapsedDays(year, finish_lunarMonth, finish_lunarDay);
			finish_holiday_date = solaric.convert_LunaricElapsedDayToSolaricElapsedDay(finish_Lunaric_ElapsedDay);
			
			date[5] = start_holiday_date;
			date[6] = finish_holiday_date;

		} else if (start_solar_or_lunar == 1 && finish_solar_or_lunar == 0) {
			int start_lunaricMonth, start_lunaricDay;
			start_lunaricMonth = start_date / 100;
			start_lunaricDay = start_date % 100;
			date[5] = start_date;
			int start_LunaricElapsedDay = lunaric.calculate_LunaricElapsedDays(year, start_lunaricMonth, start_lunaricDay);
			start_holiday_date = solaric.convert_LunaricElapsedDayToSolaricElapsedDay(start_LunaricElapsedDay);
			date[0] = start_holiday_date / 100;
			date[1] = start_holiday_date % 100;
			
			
			date[2] = finish_date / 100;
			date[3] = finish_date % 100;
			int start_ElapsedDay = solaric.calculate_SolaricElapsedDays(date[0], date[1]);
			int finish_ElapsedDay = solaric.calculate_SolaricElapsedDays(date[2], date[3]);
			
			elapsedDays = finish_ElapsedDay - start_ElapsedDay;
		} else if (start_solar_or_lunar == 0 && finish_solar_or_lunar == 1) {
			date[0] = start_date / 100;
			date[1] = start_date % 100;

			int finish_lunaricMonth, finish_lunaricDay;
			finish_lunaricMonth = finish_date / 100;
			finish_lunaricDay = finish_date % 100;
			date[6] = finish_date;

			int lunaric_elapsedDays = lunaric.calculate_LunaricElapsedDays(year, finish_lunaricMonth, finish_lunaricDay);
			finish_holiday_date = solaric.convert_LunaricElapsedDayToSolaricElapsedDay(lunaric_elapsedDays);
			date[2] = finish_holiday_date / 100;
			date[3] = finish_holiday_date % 100;
			int start_ElapsedDay = solaric.calculate_SolaricElapsedDays(date[0], date[1]);
			int finish_ElapsedDay = solaric.calculate_SolaricElapsedDays(date[2], date[3]);
			
			elapsedDays = finish_ElapsedDay - start_ElapsedDay;
		} else {
			date[0] = start_date / 100;
			date[1] = start_date % 100;
			date[2] = finish_date / 100;
			date[3] = finish_date % 100;

			int start_ElapsedDay = solaric.calculate_SolaricElapsedDays(date[0], date[1]);
			int finish_ElpsedDay = solaric.calculate_SolaricElapsedDays(date[2], date[3]);
			
			elapsedDays = finish_ElpsedDay - start_ElapsedDay;
		}
		date[4]=elapsedDays;
	}
	int[] get_Date_Array() { return date; }
}