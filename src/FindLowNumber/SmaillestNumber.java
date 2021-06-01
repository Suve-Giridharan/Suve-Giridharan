package FindLowNumber;

public class SmaillestNumber {

	public static void main(String[] args) {

		int a[] = { 5, 8, 9, 8, 4, 8, 1, 2, 4, 0, 9, 4, 7 };

		int min = a[0];

		System.out.println(a.length);

		for (int i = 1; i < a.length; i++) {

			if (a[i] < min) {

				min = a[i];
				
				

				
			}
		}
		System.out.println("The minimum Value in the List" + min);
		/*
		 * Arrays.sort(a);
		 * 
		 * System.out.println(a[0]);
		 */

	}

}
