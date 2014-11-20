package project.seven;

public class 양력클래스 {
	private int[] 양력_마지막날;
	private int 음력시잘날 = 30;

	public 양력클래스() {
		양력_마지막날 = new int[] { 30, 29, 30, 29, 30, 29, 30, 29, 30, 30, 29, 30,
				29 };
	}

	public int[] 양력_날짜_구하기(int 음의경과일) {
		// TODO Auto-generated method stub

		int i;

		음의경과일 = 음의경과일 + 음력시잘날;

		for (i = 0; i < 12; i++) {

			if (음의경과일 < 양력_마지막날[i]) {

				break;

			}

			음의경과일 = 음의경과일 - 양력_마지막날[i];

		}

		int[] 월일 = new int[4];

		월일[0] = i;

		월일[1] = 음의경과일;

		월일[2] = 0; // 정수형날짜배열의 3번째인자가 1이면 음력, 0이면 양력

		return 월일;
	}

	public int 양력_경과일_구하기(int[] 월일) {

		// TODO Auto-generated method stub
		int 양의경과일 = 0;

		for (int i = 0; i < 월일[0]; i++) {

			양의경과일 = 양의경과일 + 양력_마지막날[i];

		}
		양의경과일 = 양의경과일 + 월일[1];
		return 양의경과일;
	}
}