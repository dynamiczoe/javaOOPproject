package project.seven;

import java.util.Scanner;

public class 입력클래스 {
	private String 첫번째기념일, 두번째기념일;
	Scanner sc;
	제어자클래스 제어;

	public 입력클래스(제어자클래스 제어) {
		this.제어 = 제어;
	}

	public void 기념일입력(String[] 기념일들) {

	sc = new Scanner(System.in);

	System.out.println("기념일들");

	  for (int i = 0; i < 기념일들.length; i++) {

	    System.out.print((i + 1) + ":" + 기념일들[i]+"\t");

	     if (i % 5 == 0 && i != 0) {

	       System.out.println();

	     }
          }
   
   System.out.println("\n시작 기념일의 번호는?");

   int fisrtDay = sc.nextInt();

   System.out.println("종료 기념일의 번호는?");

   int secondDay = sc.nextInt();


   첫번째기념일 = 기념일들[fisrtDay - 1];

   두번째기념일 = 기념일들[secondDay - 1];


   제어.기념일_선택(첫번째기념일, 두번째기념일);

 }
}
