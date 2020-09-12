package chap02;

import java.util.Random;

/**
 * @author ino
 * 난수를 학습합니다.
 */
public class Sample16 {

	
	public static void main(String[] args) {

		Random random = new Random();
		int num = random.nextInt(3) + 1;
		System.out.printf("난수 : %d", num);
	}

}