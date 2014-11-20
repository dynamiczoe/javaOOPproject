package project.seven;

public class 출력클래스 {
	private int 첫월, 첫일, 두번째월, 두번째일;

	public void 결과_출력(String 처음기념일, String 두번째기념일, int[] 처음날짜, int[] 두번째날짜,
			int 경과일수) {

		첫월 = 처음날짜[0];
		첫일 = 처음날짜[1];
		두번째월 = 두번째날짜[0];
		두번째일 = 두번째날짜[1];

		System.out.println(처음기념일 + "(" + 첫월 + "월" + 첫일 + "일)부터\n" + 두번째기념일
				+ "(" + 두번째월 + "월" + 두번째일 + "일)까지");
		System.out.println("경와일수는 " + 경과일수 + "입니다.");

	}

}