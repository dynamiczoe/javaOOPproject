package oop;

import java.util.Scanner;

public class Inputclass {
	private int start_holiday_number, finish_holiday_number;
	private Scanner scn;
	private Holidays holidays;
	
	public Inputclass(){
		holidays = new Holidays();
	}
	
	public void input_StartAndEnd() {
		do {
			System.out.print("\n\n���� ������� ��ȣ��? ");
			scn = new Scanner(System.in);
			start_holiday_number = scn.nextInt();
			
			System.out.print("���� ������� ��ȣ��? ");
			finish_holiday_number = scn.nextInt();
		} while (start_holiday_number > holidays.get_hDay_numbers() || finish_holiday_number > holidays.get_hDay_numbers() );
	}
	public int[] get_InputedNumbers(){
		int[] numbers={start_holiday_number, finish_holiday_number};
		return numbers;
	}//srp���� �Է�å���� ������ ������ ����.
}
