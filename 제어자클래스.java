package project.seven;

public class 제어자클래스 {
	   입력클래스 입력;
	   출력클래스 출력;
	   계산클래스 계산;
	   기념일클래스 기념일;
	   String 기념일들[];
	   String 처음기념일, 두번째기념일;
	   int[] 처음날짜, 두번째날짜;
	   int 경과일수;

	   public void 기념일_선택(String 날1, String 날2) {
		this.처음기념일 = 날1;
		this.두번째기념일 = 날2;
	   }

	   public void set날짜(int[] 날짜, int i) {
		// TODO Auto-generated method stub
		if (i == 1) { // 두번째 매개변수는 i가 1이면 처음날짜 2이면 두번째 날짜에 Set
		this.처음날짜 = 날짜;
		} else {
		this.두번째날짜 = 날짜;
		}
	   }

	   public void set경과일수(int 경과일) { this.경과일수 = 경과일;}

	   public void process() {
		입력 = new 입력클래스(this);
		출력 = new 출력클래스();
		계산 = new 계산클래스(this);
		기념일 = new 기념일클래스(this, 계산);

		기념일들 = 기념일.기념일들_얻기(); // 기념일날짜들 배열을 가져옴.

		입력.기념일입력(기념일들); //입력클래스에서 기념일들을 매개변수로 받아 출력                                       후, 직접 제어자에 변수를 set

		계산.경과일수_구하기(처음기념일, 두번째기념일); // 계산클래스에서 날짜                                             경과일 계산후, 제어자클래스 변수 set

		출력.결과_출력(처음기념일, 두번째기념일, 처음날짜, 두번째날짜, 경과일수);                                     // set된 변수들 할당후 출력.
	   }

	   public static void main(String[] args) {
		제어자클래스 제어 = new 제어자클래스();
		제어.process();
	   }

	}


