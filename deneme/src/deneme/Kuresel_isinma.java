package deneme;

import java.util.Scanner;

public class Kuresel_isinma {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dogruCevaplar=0;
		String[] sorular = {
				"1. Küresel ısınma hangi faktörlerden etkilenir?\n"
		                + "a) İnsan faaliyetleri ve doğal olaylar\n"
		                + "b) Ay ve güneş etkisi\n"
		                + "c) Rüzgar ve yağış miktarı\n"
		                + "d) Yerçekimi ve manyetik alanlar\n"
		                + "Cevabınız: ",
		            "2. Sera gazları neden küresel ısınmayı artırır?\n"
		                + "a) Güneş ışınlarını yansıtırlar\n"
		                + "b) Isıyı atmosferde tutarlar\n"
		                + "c) Ozon tabakasını delerler\n"
		                + "d) Atmosferde daha fazla oksijen üretirler\n"
		                + "Cevabınız: ",
		            "3. Hangi gaz en çok sera etkisi yaratır?\n"
		                + "a) Karbondioksit (CO2)\n"
		                + "b) Azot oksit (NO2)\n"
		                + "c) Metan (CH4)\n"
		                + "Cevabınız: ",
		            "4. Kuresel isinmanin olumusuz etkileri nelerdir?\n"
		                + "a) Deniz seviyelerinin yukselmesi\n"
		            	+ "b) Ormanlarin artmasi\n"
		                + "c) Daha serin iklimler\n"
		            	+ "d) Toprak erezyonu\n"
		                + "Cevabınız:",
		            "5. Sera gazi emisyonlarinin azaltmanin onemi nedir?\n"
		                + "a) İklim degisikligini hizlandirir\n"
		            	+ "b) Hava kalitesini iyilestirir\n"
		                + "c) Dogal kaynaklari artirir\n"
		            	+ "d) Deniz seviyelerini dusurur\n"
		                + "Cevabınız:",
		};
		
		String[] dogruCevaplar1 = {"a","b","a","a","b"};
		String[] kullaniciCevaplari = new String[sorular.length];
		
		for (int i = 0; i < sorular.length; i++) {
			System.out.print(sorular[i]);
			kullaniciCevaplari[i]=scanner.nextLine().toLowerCase();
			if (kullaniciCevaplari[i].equals(dogruCevaplar1[i])) {
				dogruCevaplar++;
			}
		}
		System.out.println("\nCevaplariniz:");
		for (int i = 0; i < sorular.length; i++) {
			System.out.println((i+1)+". Soru:"+kullaniciCevaplari[i]);
		}
		System.out.println("Dogru Cevaplar:"+dogruCevaplar);
		if (dogruCevaplar==5) {
			System.out.println("Mükemmel");
		}else if (dogruCevaplar==4) {
			System.out.println("Cok iyi");
		}else {
			System.out.println("Küresel hakkındaki bilgilerinizi tazeleme zamani");
		}
		}

}


