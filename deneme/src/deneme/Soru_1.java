package deneme;

import java.util.Scanner;

public class Soru_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number1;
		int number2;
		int toplam;
		int fark;
		int carpim;
		int bolum;
		
		System.out.println("Enter first number:");
		number1 = input.nextInt();
		System.out.println("Enter second number");
		number2 = input.nextInt();
		
		
		
		System.out.println("Toplam:" + (number1 + number2));
		System.out.println("Fark:" + (number1 - number2));
		System.out.println("Çarpım:" + (number1 * number2));
		System.out.println("Bölüm:" + (number1 / number2));
		
		
		

	}

}
