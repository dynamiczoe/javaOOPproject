package oop;

import java.util.Scanner;

public class Inputclass {
	private int start_holiday_number, finish_holiday_number;
	private Scanner scn;
	private Holidays holidays;
	private Holidays[] array_Holidays;
	public Inputclass(){
		holidays = new Holidays();
	}
	
	public void input_StartAndEnd(Holidays[] array_holidays) {
		do {
			System.out.println(" �� �� �� �� ");
			this.array_Holidays= array_holidays;
			for (int i = 1 ; i < holidays.get_hDay_numbers() ; i++){
				
				System.out.print((i) + ". " + array_Holidays[i].get_Holiday_name() + " ");
				if (i==6||i==11||i==16){
					System.out.print("\n");
				}
			}
			System.out.print("\n\n���� ������� ��ȣ��? ");
			scn = new Scanner(System.in);
			start_holiday_number = scn.nextInt();
			
			System.out.print("���� ������� ��ȣ��? ");
			finish_holiday_number = scn.nextInt();
		} while (start_holiday_number > holidays.get_hDay_numbers() || finish_holiday_number > holidays.get_hDay_numbers() );
	}
	public String[] get_Holiday_Names(Holidays[] holidays) {	
		this.array_Holidays=holidays;
		String ����[] = new String[2];
		����[0] = array_Holidays[start_holiday_number].get_Holiday_name();
		����[1] = array_Holidays[finish_holiday_number].get_Holiday_name();
		return ����;
	}
}
