package deneme;

import java.util.Scanner;

public class Soru_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sayi,ilk,ikinci,ucuncu,dorduncu,besinci;
		System.out.println("5 basamakli sayi giriniz");
		sayi = input.nextInt();
		
		System.out.print((sayi % 10 ));
		sayi= sayi/10;
		System.out.print((sayi % 10));
		sayi = sayi/10;
		System.out.print((sayi % 10));
		sayi = sayi/10;
		System.out.print((sayi % 10));
		sayi = sayi/10;
		System.out.print(sayi);

	}

}
