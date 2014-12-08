public class Class_Anniversarys {
	private static String[] array_anniversary = new String[] { "����", "����()",
			"������", "�ѽ�", "��̳�", "����ź����(��)", "������", "�ܿ�(��)", "������", "�ʺ�", "�ߺ�",
			"����", "������", "������(��)", "������(��)", "��õ��", "�ѱ۳�", "��ź��" };
	private static int[] array_anniv_Date = new int[] { 101, 101, 301, 406,
			505, 403, 606, 505, 717, 719, 729, 808, 815, 815, 922, 1003, 1009,
			1225 };

	public String[] getAnniversaryNames_array() {
		return array_anniversary;
	}

	public int[] getAnniversaryDate(String annivname) {
		int[] array_date = new int[4];
		int int_arrayindex;
		for (int_arrayindex = 0; int_arrayindex < array_anniversary.length; int_arrayindex++) {
			if (annivname.equals(array_anniversary[int_arrayindex])) {
				break;
			}
		}

		array_date[0] = array_anniv_Date[int_arrayindex] / 100;
		array_date[1] = array_anniv_Date[int_arrayindex] % 100;

		if (int_arrayindex == 1 || int_arrayindex == 5 || int_arrayindex == 7
				|| int_arrayindex == 13 || int_arrayindex == 14) {
			array_date[2] = 1;

			if (int_arrayindex == 14) {
				array_date[3] = 2; // �ٷξ� ��ް� ������ ���� ūū = 1, ū��=2, ��ū=3, ����=4;
			}
		} else {
			array_date[2] = 0;
		}
		return array_date;
	}
}