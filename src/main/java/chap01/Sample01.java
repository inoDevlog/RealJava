package chap01;

public class Sample01 {
	public static void main(String[] args) {
		System.out.print("HHHHHHello, ");
		System.out.print("       World");
		
		int sum = 0;
		
		for (int i=0; i<5 ; i++) {
			sum = sum + i;
			System.out.println(sum);
		}
		System.out.println(sum);
	}
}