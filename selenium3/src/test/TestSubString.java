package test;

public class TestSubString {
	public static void main(String[] args) {
		String testString1 = "05/27/2018";
		String testString2 = "12/27/2018";

		System.out.println(addMounth(testString1));
		System.out.println(addMounth(testString2));

	}

	public static String addMounth(String date) {
		System.out.println("the intital date is " + date);
		// 1 ����
		String month = date.substring(0, 2);

		String day = date.substring(3, 5);

		String year = date.substring(6);
		String result;

		int int_mounth = Integer.parseInt(month);
		int int_year = Integer.parseInt(year);

		System.out.println(day);
		System.out.println(month);
		System.out.println(year);

		if (int_mounth == 12) {
			int_mounth = 1;
			int_year = int_year + 1;

		} else {
			int_mounth = int_mounth + 1;
		}

		if (int_mounth < 10) {
			result = day + "/0" + int_mounth + "/" + int_year;

		} else {
			result = day + "/" + int_mounth + "/" + int_year;
		}

		System.out.println(
				"^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

		return result;
	}

}
