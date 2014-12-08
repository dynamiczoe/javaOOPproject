public class Class_Calculate {
	Class_Control ent_control;
	Class_Anniversary ent_anniv;
	Class_Solaric ent_solar;
	Class_Lunaric ent_lunar;

	private String str_FormerAnniversary, str_FollowerAnniversary;
	private int[] int_dateFormerAnniversary, int_dateFollowerAnniversary;

	public Class_Calculate(Class_Control ent_ctr) {
		this.ent_control = ent_ctr;
	}

	public void setDate(int[] int_date, int i) {

		if (i == 1) { // 두번째 매개변수는 i가 1이면 처음날짜 2이면 두번째 날짜에 Set
			this.int_dateFormerAnniversary = int_date;
		} else {
			this.int_dateFollowerAnniversary = int_date;
		}
	}

	public void howManyDays_Elapsed(String str_formerAnniversary, String str_followerAnniversary) {
		int int_solaricElapsedDay_Former, int_solaricElapsedDay_Follower;
		int int_lunaricElapsedDay_Former, int_lunaricElapsedDay_Follower;
		int int_elapsedDay;
		int[] array_date;

		ent_solar = new Class_Solaric();
		ent_lunar = new Class_Lunaric();
		ent_anniv = new Class_Anniversary(this);
		ent_anniv.getDates(str_formerAnniversary, 1); // 매개변수로 주어지는 1은 첫번째입력값인지, 두번째 입력값인지 확인하는 변수임.

		if (int_dateFormerAnniversary[2] == 1) {

			int_lunaricElapsedDay_Former = ent_lunar.lunaric_WhatDateIsItToday(int_dateFormerAnniversary);
			array_date = ent_solar.solaric_WhatDateIsItToday(int_lunaricElapsedDay_Former);
			int_dateFormerAnniversary[0] = array_date[0];
			int_dateFormerAnniversary[1] = array_date[1];
			int_solaricElapsedDay_Former = ent_solar.solaricElapsedDays(array_date);

		} else {
			int_solaricElapsedDay_Former = ent_solar.solaricElapsedDays(int_dateFormerAnniversary);
		}
		ent_control.setDate(int_dateFormerAnniversary, 1);
		ent_anniv.getDates(str_followerAnniversary, 2);

		if (int_dateFollowerAnniversary[2] == 1) {
			int_lunaricElapsedDay_Follower = ent_lunar.lunaric_WhatDateIsItToday(int_dateFollowerAnniversary);
			array_date = ent_solar.solaric_WhatDateIsItToday(int_lunaricElapsedDay_Follower);
			int_dateFollowerAnniversary[0] = array_date[0];
			int_dateFollowerAnniversary[1] = array_date[1];
			int_solaricElapsedDay_Follower = ent_solar.solaricElapsedDays(array_date);
		} else {
			int_solaricElapsedDay_Follower = ent_solar.solaricElapsedDays(int_dateFollowerAnniversary);
		}
		ent_control.setDate(int_dateFollowerAnniversary, 2);
		int_elapsedDay = int_solaricElapsedDay_Follower - int_solaricElapsedDay_Former;
		ent_control.setElapsedDays(int_elapsedDay);
	}

}
