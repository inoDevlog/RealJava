package chap02;

public class Sample10 {

	public static void main(String[] args) {

		String a1 = "abcd";
		char[] a2 = a1.toCharArray();

		char b1 = 'a';
		String b2 = String.valueOf(b1);
		String b3 = "" + b1;

		System.out.println(a1);
		System.out.println(a2);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);

	}

}