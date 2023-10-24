package deneme;

import java.util.Scanner;

public class Soru_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Vucut ağırlığını giriniz:");
		double kilo = input.nextDouble();
		System.out.println("Boyunuzu giriniz:");
		double boy = input.nextDouble();
		
		boy=boy/100;
		double endeks = kilo/(boy*boy);
		System.out.println(boy);
		System.out.println(kilo);
		
		if (endeks < 18.5) {
			System.out.println("Zayıf");
		}
		if (endeks > 18.5 && endeks < 24.9) {
			System.out.println("Normal ");
		}
		if (endeks > 24.9 && endeks < 29.9) {
			System.out.println("Şişman ");
		}
		if (endeks > 30) {
			System.out.println("Obez");
		}
		
		

	}

}
