package project.seven;

import project.seven.*;

public class 기념일클래스 {
	   제어자클래스 제어;
	   계산클래스 계산;
	   기념일들 c기념일들;
	   private static String[] 기념일들 = new String[] { "신정", "설날()",             "삼일절", "한식","어린이날", "석가탄신일(음)", "현충일",                            "단오(음)", "제헌절", "초복", "중복", "말복", "광복절",
			"중추절(음)", "내생일(음)", "개천절", "한글날", "성탄절" };
	   public 기념일클래스(제어자클래스 제어, 계산클래스 계산) {
		this.제어 = 제어;
		this.계산 = 계산;
	   }

	   public 기념일클래스(계산클래스 계산) {
		this.계산 = 계산;
	   }

	   public void 날짜_얻기(String 입력기념일, int i) {
		this.c기념일들 = new 기념일들();
		int[] 날짜 = new int[4];
		날짜 = c기념일들.날짜_얻기(입력기념일);
		계산.setDate(날짜, i);
	   }

	   public String[] 기념일들_얻기() {
		return 기념일들;
	   }
	}