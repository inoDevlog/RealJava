package chap01;

public class Sample02 {

	public static void main(String[] args) {

		System.out.println("HHHHHHello, ");
		System.out.println("       World");

		int sum = 0;

		for (int i = 0; i < 10; i++) {

			for (int j = 0; j < 10; j++) {
				System.out.print(i);
				System.out.println(j);
				sum +=i;
				System.out.println(sum);
						
			}
		}
	}
}