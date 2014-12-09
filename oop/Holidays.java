package oop;

public class Holidays {
	private int[] date = { 0, 101, 101, 301, 307, 505, 403, 606, 505, 717, 719,
			729, 808, 815, 815, 1003, 1009, 922, 1225 };
	private int[] solar_lunar = { 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0 };
	private int[] normal_abnormal = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0 };
	private String[] holiday_name_Array = { "", "����", "����", "������", "�ѽ�", "��̳�", "����ź����",
			"������", "�ܿ�", "������", "�ʺ�", "�ߺ�", "����", "������", "������", "��õ��", "�ѱ۳�",
			"������", "��ź��" }; // ������ (����) 9.22��
	private String holiday_name = null;
	private int hDay_date = 0;
	private int hDay_solar_or_lunar = 0;
	private int hDay_normal_or_abnormal = 0;
	
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
	public void set_Hday_solar_or_lunar(int i) { hDay_solar_or_lunar = solar_lunar[i]; }
	public void set_Hday_normal_or_abnormal(int i) { hDay_normal_or_abnormal = normal_abnormal[i]; }
	
	public String get_Holiday_name() { return holiday_name; }
	public int get_hDay_numbers() { return date.length; }
	public int get_hDay_solar_or_lunar() { return hDay_solar_or_lunar; }
	public int get_hDay_normal_or_abnormal() { return hDay_normal_or_abnormal; }
	public int get_hDay_date() { return hDay_date; }
}
