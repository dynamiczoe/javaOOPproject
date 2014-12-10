package oop;

public class Lunaric {
	private int[] months = { 0, 1, 2, 1, 2, 1, 2, 1, 2, 4, 2, 1, 2 };

	public int get_LunaricLastDayOfMonth(int lunar_year, int lunar_month,
			int normal_or_abnormal) {
		int lastday = 0;

		switch (months[lunar_month]) {
		case 1:
			lastday = 29;
			break;
		case 2:
			lastday = 30;
			break;
		case 3:
			lastday = 29;
			if (isAbnormal(normal_or_abnormal)) 
				lastday = 30;
						
			break;
		case 4:
			lastday = 30;
			if (isAbnormal(normal_or_abnormal)) 
				lastday = 29;
					
			break;
		case 5:
			lastday = 30;
			break;
		default:
			break;
		}
		return lastday;
	}
	public int calculate_LunaricElapsedDays(int lunar_year, int lunar_month, int lunar_day) {
		int elapsedDay = 0;
		for (int i = 1; i < lunar_month; i++) {
			if (isAbnormal(lunar_month)) {
				break;
			}

			switch (months[i]) {
			case 1:
				elapsedDay = elapsedDay + 29;
				break;
			case 2:
				elapsedDay = elapsedDay + 30;
				break;
			case 3:
				elapsedDay = elapsedDay + 29 + 30;
				break;
			case 4:
				elapsedDay = elapsedDay + 30 + 29;
				break;
			case 5:
				elapsedDay = elapsedDay + 30 + 30;
				break;
			default:
				break;
			}
		}
		elapsedDay = elapsedDay + lunar_day;
		return elapsedDay;
	}
	private boolean isAbnormal(int normal_or_abnormal) {
		return normal_or_abnormal == 1;
	}

}
