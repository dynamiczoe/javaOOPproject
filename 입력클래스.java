package project.seven;

import java.util.Scanner;

public class �Է�Ŭ���� {
	private String ù��°�����, �ι�°�����;
	Scanner sc;
	������Ŭ���� ����;

	public �Է�Ŭ����(������Ŭ���� ����) {
		this.���� = ����;
	}

	public void ������Է�(String[] ����ϵ�) {

	sc = new Scanner(System.in);

	System.out.println("����ϵ�");

	  for (int i = 0; i < ����ϵ�.length; i++) {

	    System.out.print((i + 1) + ":" + ����ϵ�[i]+"\t");

	     if (i % 5 == 0 && i != 0) {

	       System.out.println();

	     }
          }
   
   System.out.println("\n���� ������� ��ȣ��?");

   int fisrtDay = sc.nextInt();

   System.out.println("���� ������� ��ȣ��?");

   int secondDay = sc.nextInt();


   ù��°����� = ����ϵ�[fisrtDay - 1];

   �ι�°����� = ����ϵ�[secondDay - 1];


   ����.�����_����(ù��°�����, �ι�°�����);

 }
}
