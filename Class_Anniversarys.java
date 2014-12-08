public class Class_Anniversarys {
	private static String[] array_anniversary = new String[] { "신정", "설날()",
			"삼일절", "한식", "어린이날", "석가탄신일(음)", "현충일", "단오(음)", "제헌절", "초복", "중복",
			"말복", "광복절", "중추절(음)", "내생일(음)", "개천절", "한글날", "성탄절" };
	private static int[] array_anniv_Date = new int[] { 101, 101, 301, 406,
			505, 403, 606, 505, 717, 719, 729, 808, 815, 815, 922, 1003, 1009,
			1225 };

	public String[] getAnniversaryNames_array() {
		return array_anniversary;
	}

	public int[] getAnniversaryDate(String annivname) {
		int[] array_date = new int[4];
		int int_arrayindex;
		for (int_arrayindex = 0; int_arrayindex < array_anniversary.length; int_arrayindex++) {
			if (annivname.equals(array_anniversary[int_arrayindex])) {
				break;
			}
		}

		array_date[0] = array_anniv_Date[int_arrayindex] / 100;
		array_date[1] = array_anniv_Date[int_arrayindex] % 100;

		if (int_arrayindex == 1 || int_arrayindex == 5 || int_arrayindex == 7
				|| int_arrayindex == 13 || int_arrayindex == 14) {
			array_date[2] = 1;

			if (int_arrayindex == 14) {
				array_date[3] = 2; // 바로앞 평달과 윤달의 관계 큰큰 = 1, 큰작=2, 작큰=3, 작작=4;
			}
		} else {
			array_date[2] = 0;
		}
		return array_date;
	}
}