package chap02;

public class Sample06 {

	public static void main(String[] args) {
		
		int a = 32767;
		short b = 40;

		b = (short) a;
		System.out.println(b);

		int c = 32768;
		b = (short) c;
		System.out.println(b);

		int d = -32769;
		b = (short) d;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

	}

}
