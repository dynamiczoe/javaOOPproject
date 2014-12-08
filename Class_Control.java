public class Class_Control {
	Class_Input ent_inp;
	Class_Output ent_oup;
	Class_Calculate ent_cal;
	Class_Anniversary ent_anniv;
	String array_anniversaryName[];
	String str_former_name, str_follower_name;
	int[] array_former_date, array_follower_date;
	int int_elapsedDays;

	public void set_annivDays(String ��1, String ��2) {
		this.str_former_name = ��1;
		this.str_follower_name = ��2;
	}

	public void setDate(int[] date, int i) {
		// TODO Auto-generated method stub
		if (i == 1) { // �ι�° �Ű������� i�� 1�̸� ó����¥ 2�̸� �ι�° ��¥�� Set
			this.array_former_date = date;
		} else {
			this.array_follower_date = date;
		}
	}

	public void setElapsedDays(int elapsedDay) {
		this.int_elapsedDays = elapsedDay;
	}

	public void procedure() {
		ent_inp = new Class_Input(this);
		ent_oup = new Class_Output();
		ent_cal = new Class_Calculate(this);
		ent_anniv = new Class_Anniversary(this, ent_cal);

		array_anniversaryName = ent_anniv.getAnniversary_to_array(); // ����ϳ�¥�� �迭�� ������.
		ent_inp.input_AnniversaryNum(array_anniversaryName); // �Է�Ŭ�������� ����ϵ��� �Ű������� �޾� ��� ��, ���� �����ڿ�
										// ������ set
		ent_cal.howManyDays_Elapsed(str_former_name, str_follower_name); // ���Ŭ�������� ��¥ ����� �����, ������Ŭ���� ���� set
		ent_oup.showResult(str_former_name, str_follower_name, array_former_date, array_follower_date, int_elapsedDays); // set�� ������ �Ҵ��� ���.
	}

	public static void main(String[] args) {
		Class_Control ent_control = new Class_Control();
		ent_control.procedure();
	}
}