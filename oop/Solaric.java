package oop;

public class Solaric implements Calendar{
	private int solaric_firstday = 31, years = 2014;
	private int months[] = { 0, 1, 3, 2, 1, 2, 1, 2, 2, 1, 2, 1, 2, 2 };      //마찬가지로 ocp고려

//	public int get_SolaricLastDayOfMonth(int solar_year, int solar_month) {
//		int lastday = 0;
//		switch (months[solar_month]) {
//		case 1:
//			lastday = 30;
//			break;
//		case 2:
//			lastday = 31;
//			break;
//		case 3:
//			lastday = 28;
//			break;
//		case 4:
//			lastday = 29;
//			break;
//		default:
//			break;
//		}
//		return lastday;
//	}
//
//	public int calculate_SolaricElapsedDays(int solar_month, int solar_day) {
//		int elapsedDay = 0;
//		for (int i = 1; i < solar_month; i++) {
//			switch (months[i]) {
//			case 1:
//				elapsedDay = elapsedDay + 30;
//				break;
//			case 2:
//				elapsedDay = elapsedDay + 31;
//				break;
//			case 3:
//				elapsedDay = elapsedDay + 28;
//				break;
//			case 4:
//				elapsedDay = elapsedDay + 29;
//				break;
//			default:
//				break;
//			}
//			elapsedDay = elapsedDay + solar_day;
//		}
//		return elapsedDay;
//	}
	@Override
	public int get_lastDayOfMonth(int solar_month, int solar_day, int normal_or_abnormal) {
		// TODO Auto-generated method stub
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
	@Override
	public int calculate_ElapsedDays( int solar_month, int solar_day,int solar_year) {
		// TODO Auto-generated method stub
		int elapsedDay = 0;
		for (int i = 1; i <= solar_month; i++) {
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
		}
		elapsedDay = elapsedDay + solar_day+1;
		return elapsedDay;
	}

	public int convert_LunaricElapsedDayToSolaricElapsedDay(int elapsedDay) {
		int i = 0;
		int lunaricElapsedDay = elapsedDay + 30;
		int initialValue = elapsedDay;
		while (i < 12) {
			if (initialValue == 31){
				break;
			}
			if (lunaricElapsedDay >= 31) {
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
			if (isItEndOfLoop(lunaricElapsedDay, i)) {
				i++;
				break;
			}
			i++;
		}
		int convertedDate = lunaricElapsedDay + ((i) * 100) ;
		return convertedDate;
	}

	private boolean isItEndOfLoop(int elapsedDay, int i) {
		if (elapsedDay < get_lastDayOfMonth(i + 1, 0, 0)) {
			return true;
		}
		return false;
	}

}