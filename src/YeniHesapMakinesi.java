import java.util.Scanner;

public class YeniHesapMakinesi {
	
	static void selamVer() {
		System.out.println("Hoşgeldin :)");
	}
	
	
	
	
    static void toplamaIslemi1() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Birinci sayı ...");
		int birinciSayi = scan.nextInt();
		System.out.print("İkinci sayı...");
		int ikinciSayi=scan.nextInt();
		System.out.print("sonuç=" + (birinciSayi + ikinciSayi));
    }
    
    static void cikarmaIslemi2(){
		Scanner scan = new Scanner(System.in);
		System.out.print("Birinci sayı ...");
		int birinciSayi = scan.nextInt();
		System.out.print("İkinci sayı...");
		int ikinciSayi=scan.nextInt();
		System.out.print("sonuç=" + (birinciSayi - ikinciSayi));
    }
    
    static void carpmaIslemi(){
		Scanner scan = new Scanner(System.in);
		System.out.print("Birinci sayı ...");
		int birinciSayi = scan.nextInt();
		System.out.print("İkinci sayı...");
		int ikinciSayi=scan.nextInt();
		System.out.print("sonuç=" + (birinciSayi * ikinciSayi));
    }
    
    static void bolmeIslemi(){
		Scanner scan = new Scanner(System.in);
		System.out.print("Birinci sayı ...");
		int birinciSayi = scan.nextInt();
		System.out.print("İkinci sayı...");
		int ikinciSayi=scan.nextInt();
//		System.out.print("sonuç=" + ((birinciSayi * 1.0)/ ikinciSayi));
		
		/*
		if (ikinciSayi == 0  ) {
			System.out.println("Bir Sayının Sıfıra Bölümü Tanımsızdır..");
		}
		else {				
			double sonuc = (birinciSayi * 1.0)  / ikinciSayi ;
			System.out.print("Bölme İşleminin sonucu = " + sonuc );
		
		}
		 */
		
		try {
			double sonuc = (birinciSayi * 1.0)  / ikinciSayi ;
			System.out.print("Bölme İşleminin sonucu = " + sonuc );
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Bir Sayının Sıfıra Bölümü Tanımsızdır..");
		}
	}

	public static void main(String[] args) {
	
	
		int birinciSayi = 0;
		int ikinciSayi = 0;
		int secim;
		Scanner tarayaci = new Scanner(System.in);
		
		
		System.out.println("****İSLEMİNİZİ SEÇİNİZ***");
		System.out.println(" 1. TOPLAMA");
		System.out.println(" 2. ÇIKARMA");
		System.out.println(" 3. ÇARPMA");
		System.out.println(" 4. BÖLME");
		System.out.print("Seciminizi giriniz :");
		secim = tarayaci.nextInt();
		
		
		switch(secim) {
			case 1:
				toplamaIslemi1();
				break;
			case 2:
				cikarmaIslemi2();
				break;
			case 3:
				carpmaIslemi();
				break;
			case 4:
				bolmeIslemi();
				break;
			default:
				System.out.println("1 ile 4 arası bir rakam giriniz");
		}
			 
		/*	
		if(secim == 1) {
			toplamaIslemi1();
		}
		else if(secim == 2) {
			cikarmaIslemi2();
		}
		else if (secim == 3) {
			carpmaIslemi();
		}
		else if  (secim  == 4)	{
			bolmeIslemi();
		}
		*/
	}
}


	
	
	
	
		

	


