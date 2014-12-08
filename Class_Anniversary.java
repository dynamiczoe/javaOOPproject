public class Class_Anniversary {
	Class_Control ent_ctr;
	Class_Calculate ent_cal;
	Class_Anniversarys ent_anniv;
	private static String[] array_anniversary = new String[] { "신정", "설날(음)",
			"삼일절", "한식", "어린이날", "석가탄신일(음)", "현충일", "단오(음)", "제헌절", "초복", "중복",
			"말복", "광복절", "중추절(음)", "내생일(음)", "개천절", "한글날", "성탄절" };

	public Class_Anniversary(Class_Control ctr, Class_Calculate cal) {
		this.ent_ctr = ctr;
		this.ent_cal = cal;
	}

	public Class_Anniversary(Class_Calculate cal) {
		this.ent_cal = cal;
	}

	public void getDates(String anniv_name, int i) {
		this.ent_anniv = new Class_Anniversarys();
		int[] date = new int[4];
		date = ent_anniv.getAnniversaryDate(anniv_name);
		ent_cal.setDate(date, i);
	}

	public String[] getAnniversary_to_array() {
		return array_anniversary;
	}
}