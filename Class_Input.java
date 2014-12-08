import java.util.Scanner;

public class Class_Input {
	private String str_former, str_follow;
	Scanner sc;
	Class_Control ent_control;

	public Class_Input(Class_Control ent_control) {
		this.ent_control = ent_control;
	}

	public void input_AnniversaryNum(String[] array_anniveasary) {
		sc = new Scanner(System.in);
		System.out.println("기념일들");

		for (int i = 0; i < array_anniveasary.length; i++) {
			System.out.print((i + 1) + ":" + array_anniveasary[i] + "\t");
			
			if (i % 5 == 0 && i != 0) {
				System.out.println();
			}
		}

		System.out.println("\n시작 기념일의 번호는?");
		int fisrtDay = sc.nextInt();
		System.out.println("종료 기념일의 번호는?");
		int secondDay = sc.nextInt();

		str_former = array_anniveasary[fisrtDay - 1];
		str_follow = array_anniveasary[secondDay - 1];
		ent_control.set_annivDays(str_former, str_follow);
	}
}
