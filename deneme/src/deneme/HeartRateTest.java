package deneme;

import java.util.Scanner;

public class HeartRateTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Adınızı giriniz:");
		String adi=scan.next();
		System.out.println("Soyadınızı giriniz:");
		String soyadi=scan.next();
		System.out.println("Dogum yılınızı giriniz:");
		int dogumyili=scan.nextInt();
		System.out.println("Boyunuzu (m) giriniz:");
		float boy=scan.nextFloat();
		System.out.println("Kilonuzu giriniz:");
		double kilo=scan.nextDouble();
		
		HeartRate hRate = new HeartRate(adi, soyadi, dogumyili,boy,kilo);
		hRate.show();

	}

}
