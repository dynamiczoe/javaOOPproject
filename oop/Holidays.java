package oop;

public class Holidays {
	private int[] date = { 0, 101, 101, 301, 307, 505, 403, 606, 505, 717, 719,
			729, 808, 815, 815, 1003, 1009, 922, 1225 };
	private int[] solar_lunar = { 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0 };
	private int[] normal_abnormal = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0 };
	private String[] holiday_name_Array = { "", "신정", "설날", "삼일절", "한식", "어린이날", "석가탄신일",
			"현충일", "단오", "제헌절", "초복", "중복", "말복", "광복절", "중추절", "개천절", "한글날",
			"내생일", "성탄절" }; // 내생일 (윤달) 9.22일
	private String holiday_name = null;
	private int hDay_date = 0;
	private int hDay_isLunar = 0;
	private int hDay_isAbnormal = 0;
	
	public int get_holidayIndex_From_Name(String recieved_name) {
		int index = 0;
		for (index = 0; index < holiday_name_Array.length; index++) {
			if (holiday_name_Array[index].equals(recieved_name))
				break;
		}
		return index;
	}
	public void set_Hday_name(int i) { holiday_name = holiday_name_Array[i]; }
	public void set_Hday_date(int i) { hDay_date = date[i]; }
	public void set_Hday_solar_or_lunar(int i) { hDay_isLunar = solar_lunar[i]; }
	public void set_Hday_normal_or_abnormal(int i) { hDay_isAbnormal = normal_abnormal[i]; }
	
	public String get_Holiday_name() { return holiday_name; }
	public int get_hDay_numbers() { return date.length; }
	public int get_hDay_date() { return hDay_date; }
	public boolean get_IsItLunar() { 
		if(hDay_isLunar==1)
			return true;
		else
			return false; 
		}
	public boolean get_IsItAbnormal() { 
		if(hDay_isAbnormal==1)
			return true;
		else
			return false; }
}
