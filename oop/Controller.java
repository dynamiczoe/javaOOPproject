package oop;

public class Controller {
	private String startHolidayName, finishHolidayName;
	int[] intArray_CalculatedDate;
	String[] strArray_InputedHolidayNames = new String[2];
	Calculateclass calculate;
	Inputclass input;
	Outputclass output;
	Holidays holidays;
	static Holidays[] array_Holidays;
	public Controller(){
		calculate = new Calculateclass();
		input = new Inputclass();
		output = new Outputclass();
		holidays = new Holidays();
		array_Holidays = new Holidays[holidays.get_hDay_numbers()];
	}
	
	void ShowDifferenceOfDaysBetwenTheseTwoHolidays(){
		for (int i = 1 ; i < holidays.get_hDay_numbers() ; i++) {
			array_Holidays[i] = new Holidays();
			
			array_Holidays[i].set_Hday_name(i);
			array_Holidays[i].set_Hday_date(i);
			array_Holidays[i].set_Hday_solar_or_lunar(i);
			array_Holidays[i].set_Hday_normal_or_abnormal(i);
		}
		input.input_StartAndEnd(array_Holidays);
		strArray_InputedHolidayNames = input.get_Holiday_Names(array_Holidays);
		startHolidayName = strArray_InputedHolidayNames[0];
		finishHolidayName = strArray_InputedHolidayNames[1];
		int startHoliday_Solar_or_Lunar= array_Holidays[holidays.get_holidayIndex_From_Name(startHolidayName)].get_hDay_solar_or_lunar();
		int finishHoliday_Solar_or_Lunar= array_Holidays[holidays.get_holidayIndex_From_Name(finishHolidayName)].get_hDay_solar_or_lunar();
		
		calculate.값_설정하기(startHolidayName, startHoliday_Solar_or_Lunar, finishHolidayName, finishHoliday_Solar_or_Lunar,array_Holidays);
		calculate.clacualte_ElapsedDays();
		intArray_CalculatedDate = calculate.get_Date_Array();
		
		output.set_values(intArray_CalculatedDate, strArray_InputedHolidayNames);
		output.show_Result();
	}
	public static void main(String[] args) {
		Controller controler;
		controler = new Controller();
		controler.ShowDifferenceOfDaysBetwenTheseTwoHolidays();
	}
}
