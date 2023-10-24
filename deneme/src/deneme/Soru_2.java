package deneme;

import java.util.Scanner;

public class Soru_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sayi,ilk,ikinci,ucuncu,dorduncu,besinci;
		System.out.println("5 basamakli sayi giriniz");
		sayi = input.nextInt();
		
		System.out.println("Son basamak:" + (sayi % 10 ));
		sayi= sayi/10;
		System.out.println("Dördüncü basamak:" + (sayi % 10));
		sayi = sayi/10;
		System.out.println("Üçüncü basamak:" + (sayi % 10));
		sayi = sayi/10;
		System.out.println("İkinci basamak:" + (sayi % 10));
		sayi = sayi/10;
		System.out.println("İlk basamak:" + sayi);
		

	}

}
