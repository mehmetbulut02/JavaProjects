package deneme;

import java.util.Scanner;

public class Soru_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int r;
		double alan,cevre,pi=3.14159;
		System.out.println("Yarı çap giriniz");
		r = input.nextInt();
		cevre = 2 * pi * r;
		alan = pi * (r*r);
		System.out.println("Alan:" + alan);
		System.out.println("Çevre:" + cevre);
		
		

	}

}
