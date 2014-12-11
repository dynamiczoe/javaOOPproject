package oop;

public class Controller {
	int start, finish;
	int[] intArray_CalculatedDate, inputedNumbers;
	Calculateclass calculate;
	Inputclass input;
	Outputclass output;
	Holidays holidays;
	static Holidays[] array_Holidays;

	public Controller() {
		calculate = new Calculateclass();
		input = new Inputclass();
		output = new Outputclass();
		holidays = new Holidays();
		array_Holidays = new Holidays[holidays.get_hDay_numbers()];
	}

	public void setHolidays() {
		for (int i = 1; i < holidays.get_hDay_numbers(); i++) {
			array_Holidays[i] = new Holidays();

			array_Holidays[i].set_Hday_name(i);
			array_Holidays[i].set_Hday_date(i);
			array_Holidays[i].set_Hday_solar_or_lunar(i);
			array_Holidays[i].set_Hday_normal_or_abnormal(i);
		}
	}

	public String[] get_Holiday_Names() {
		String holidayName[] = new String[2];
		holidayName[0] = array_Holidays[start].get_Holiday_name();
		holidayName[1] = array_Holidays[finish].get_Holiday_name();
		return holidayName;
	}

	public boolean[] get_Islunar() {
		boolean isStartHolidayLunar = array_Holidays[start].get_IsItLunar();
		boolean isFinishHolidayLunar = array_Holidays[finish].get_IsItLunar();
		boolean[] islunar = { isStartHolidayLunar, isFinishHolidayLunar };
		return islunar;
	}

	public void ShowDifferenceOfDaysBetwenTheseTwoHolidays() {
		
		setHolidays();
		output.show_List(array_Holidays);
		input.input_StartAndEnd();

		inputedNumbers = input.get_InputedNumbers();
		start = inputedNumbers[0];
		finish = inputedNumbers[1];
		String[] strArray_InputedHolidayNames = get_Holiday_Names();
		boolean[] booleanArray_islunar = get_Islunar();

		calculate.set_DataToCalculate(strArray_InputedHolidayNames, booleanArray_islunar, array_Holidays);
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
