package chap01;

public class Sample02 {

	public static void main(String[] args) {

		System.out.println("HHHHHHello, ");
		System.out.println("       World");

		int sum = 0;

		for (int i = 0; i < 10; i++) {

			for (int j = 0; j < 10; j++) {
				
				for (int k = 0; k < 10; k++) {
				System.out.print(i);
				System.out.print(j);
				System.out.print(k);
				}
			}
		}
	}
}