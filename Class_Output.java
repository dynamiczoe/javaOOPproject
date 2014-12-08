public class Class_Output {
	private int int_Month_Former, int_Day_Former, int_Month_Follower, int_Day_Follower;

	public void showResult(String str_FormerAnniversary, String str_FollowerAnniversary, int[] array_Date_Former, int[] array_Date_Follower,
			int int_ElapsedDays) {

		int_Month_Former = array_Date_Former[0];
		int_Day_Former = array_Date_Former[1];
		int_Month_Follower = array_Date_Follower[0];
		int_Day_Follower = array_Date_Follower[1];

		System.out.println(str_FormerAnniversary + "(" + int_Month_Former + "월" + int_Day_Former + "일)부터\n" + str_FollowerAnniversary
				+ "(" + int_Month_Follower + "월" + int_Day_Follower + "일)까지");
		System.out.println("경와일수는 " + int_ElapsedDays + "입니다.");

	}

}