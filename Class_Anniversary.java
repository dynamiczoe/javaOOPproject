public class Class_Anniversary {
	Class_Control ent_ctr;
	Class_Calculate ent_cal;
	Class_Anniversarys ent_anniv;
	private static String[] array_anniversary = new String[] { "����", "����(��)",
			"������", "�ѽ�", "��̳�", "����ź����(��)", "������", "�ܿ�(��)", "������", "�ʺ�", "�ߺ�",
			"����", "������", "������(��)", "������(��)", "��õ��", "�ѱ۳�", "��ź��" };

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