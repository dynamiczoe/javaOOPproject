public class Class_Control {
	Class_Input ent_inp;
	Class_Output ent_oup;
	Class_Calculate ent_cal;
	Class_Anniversary ent_anniv;
	String array_anniversaryName[];
	String str_former_name, str_follower_name;
	int[] array_former_date, array_follower_date;
	int int_elapsedDays;

	public void set_annivDays(String 날1, String 날2) {
		this.str_former_name = 날1;
		this.str_follower_name = 날2;
	}

	public void setDate(int[] date, int i) {
		// TODO Auto-generated method stub
		if (i == 1) { // 두번째 매개변수는 i가 1이면 처음날짜 2이면 두번째 날짜에 Set
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

		array_anniversaryName = ent_anniv.getAnniversary_to_array(); // 기념일날짜들 배열을 가져옴.
		ent_inp.input_AnniversaryNum(array_anniversaryName); // 입력클래스에서 기념일들을 매개변수로 받아 출력 후, 직접 제어자에
										// 변수를 set
		ent_cal.howManyDays_Elapsed(str_former_name, str_follower_name); // 계산클래스에서 날짜 경과일 계산후, 제어자클래스 변수 set
		ent_oup.showResult(str_former_name, str_follower_name, array_former_date, array_follower_date, int_elapsedDays); // set된 변수들 할당후 출력.
	}

	public static void main(String[] args) {
		Class_Control ent_control = new Class_Control();
		ent_control.procedure();
	}
}