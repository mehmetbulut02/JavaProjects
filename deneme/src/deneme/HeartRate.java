package deneme;

public class HeartRate {
	public String adi;
	public String soyadi;
	public int dogumyili;
	public float boy;
	public double kilo;
	
	

	public HeartRate(String adi,String soyadi,int dogumyili,float boy,double kilo) {
		this.adi = adi;
		this.soyadi = soyadi;
		this.dogumyili = dogumyili;
		this.boy = boy;
		this.kilo = kilo;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	public int getDogumyili() {
		return dogumyili;
	}
	
	public double getBoy() {
		return boy;
	}

	public void setBoy(float boy) {
		this.boy = boy;
	}

	public double getKilo() {
		return kilo;
	}

	public void setKilo(double kilo) {
		this.kilo = kilo;
	}

	public void setDogumyili(int dogumyili) {
		this.dogumyili = dogumyili;
	}
	public int yasHesapla() {
		int yıl= 2023;
		int yas = yıl - dogumyili;
		return yas;
	}
	public int maxHeartRate() {
		int yas = yasHesapla();
		return 220-yas;
	}
	public String thrHesapla() {
		int maximumHt = maxHeartRate();
		int dusukThr = (int) (maximumHt * 0.5);
		int yuksekThr =(int) (maximumHt * 0.85);
		return dusukThr + "-" + yuksekThr;
	}
	
	public double hesaplaBMI() {
		double bmi=kilo/(boy*boy);
		return bmi ;
	}
	public void show() {
		int yas = yasHesapla();
		int maximumHt = maxHeartRate();
		String thr = thrHesapla();
		double bmi = hesaplaBMI();
		System.out.println("Adı Soyadı:"+ adi+ " " + soyadi);
		System.out.println("Yası:"+yas);
		System.out.println("MHR:"+maximumHt);
		System.out.println("THR:"+thr);
		System.out.println("BMİ:"+bmi);
	}
}
