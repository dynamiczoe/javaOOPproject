package oop;

public interface Calendar {
	
	public int calculate_ElapsedDays(int year, int month, int day);
	public int get_lastDayOfMonth(int year, int month, int normal_or_abnormal);
}
