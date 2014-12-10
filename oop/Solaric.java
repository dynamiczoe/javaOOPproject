package oop;

public class Solaric {
	private int solaric_firstday = 31, years = 2014;
	private int months[] = { 0, 2, 4, 2, 1, 2, 1, 2, 2, 1, 2, 1, 2, 2 };      

	public int get_SolaricLastDayOfMonth(int solar_year, int solar_month) {
		int lastday = 0;
		switch (months[solar_month]) {
		case 1:
			lastday = 30;
			break;
		case 2:
			lastday = 31;
			break;
		case 3:
			lastday = 28;
			break;
		case 4:
			lastday = 29;
			break;
		default:
			break;
		}
		return lastday;
	}

	public int calculate_SolaricElapsedDays(int solar_month, int solar_day) {
		int elapsedDay = 0;
		for (int i = 1; i < solar_month; i++) {
			switch (months[i]) {
			case 1:
				elapsedDay = elapsedDay + 30;
				break;
			case 2:
				elapsedDay = elapsedDay + 31;
				break;
			case 3:
				elapsedDay = elapsedDay + 28;
				break;
			case 4:
				elapsedDay = elapsedDay + 29;
				break;
			default:
				break;
			}
			elapsedDay = elapsedDay + solar_day;
		}
		return elapsedDay;
	}

	public int convert_LunaricElapsedDayToSolaricElapsedDay(int lunaricElapsedDay) {
		int i = 1;
		while (i < 12) {
			if (lunaricElapsedDay <= 31) {
				switch (months[i]) {
				case 1:
					lunaricElapsedDay = lunaricElapsedDay - 30;
					break;
				case 2:
					lunaricElapsedDay = lunaricElapsedDay - 31;
					break;
				case 3:
					lunaricElapsedDay = lunaricElapsedDay - 28;
					break;
				case 4:
					lunaricElapsedDay = lunaricElapsedDay - 29;
					break;
				default:
					break;
				}
			}
			i++;
			if (isItEndOfLoop(lunaricElapsedDay, i)) {
				break;
			}
		}
		int convertedElapsedDay = lunaricElapsedDay + ((i) * 100) + solaric_firstday;
		return convertedElapsedDay;
	}

	private boolean isItEndOfLoop(int elapsedDay, int i) {
		if (elapsedDay < get_SolaricLastDayOfMonth(years, i + 1)) {
			return true;
		}
		return false;
	}
}