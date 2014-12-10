package oop;

public class Outputclass {
	private int start_month, start_day, finish_month, finish_day, start_lunarMonth, start_lunarDay, finish_lunarMonth, finish_lunarDay;
	private int elapsedDay; 
	private int isStartLunar = 0, isFinishLunar = 0;
	private int[] recievedDate;
	private String start_HolidayName, finish_HolidayName; 
	private Holidays[] array_Holidays;
	private Holidays holidays;
	public Outputclass(){
		holidays = new Holidays();
	}

	public void set_values(int[] date, String[] holiday_names) {
		this.recievedDate = date;
		start_month = recievedDate[0];
		start_day = recievedDate[1];
		finish_month = recievedDate[2];
		finish_day = recievedDate[3];
		elapsedDay = recievedDate[4];
		start_HolidayName = holiday_names[0];
		finish_HolidayName = holiday_names[1];
		if (isStartLunar()) {
			isStartLunar = 1;
			start_lunarMonth = recievedDate[5] / 100;	//�޼ҵ� ������
			start_lunarDay = recievedDate[5] % 100;
		}
		if (isLastLunar()) {
			isFinishLunar = 1;
			finish_lunarMonth = recievedDate[6] / 100;
			finish_lunarDay = recievedDate[6] % 100;
		}
	}
	private boolean isLastLunar() {
		return recievedDate[6] != 0;
	}
	private boolean isStartLunar() {
		return recievedDate[5] != 0;
	}
	public void show_List(Holidays[] array_holidays){
		System.out.println(" �� �� �� �� ");
		this.array_Holidays= array_holidays;
		for (int i = 1 ; i < holidays.get_hDay_numbers() ; i++){
			
			System.out.print((i) + ". " + array_Holidays[i].get_Holiday_name() + " ");
			if (i==6||i==11||i==16){
				System.out.print("\n");
			}
		}//inputclass���� ����ڿ��Լ� �Է��� �ޱ����� ������ ��� ��� �޼ҵ� 
	}
	public void show_Result() {
		if (isStartLunar != 0) {
			System.out.print("���� ����� : " + start_HolidayName + start_lunarMonth + " �� " + start_lunarDay + " ��   ");
			System.out.println("        #### ��³�¥ : " + start_month + " �� " + start_day + "��");
		} else {
			System.out.print("���� ����� : " + start_HolidayName + start_month + " �� " + start_day+ " ��   \n");
		}
		
		if (isFinishLunar != 0) {
			System.out.print("���� ����� : " + finish_HolidayName + finish_lunarMonth + " �� " + finish_lunarDay + " ��    ");
			System.out.println("        #### ��³�¥ : " + finish_month + " �� " + finish_day + "��");
		} else {
			System.out.print("���� ����� : " + finish_HolidayName + finish_month + " �� " + finish_day + " ��");
		}
		System.out.print("����ϼ� : " + elapsedDay);
	}
	
}