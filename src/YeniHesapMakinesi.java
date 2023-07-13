import java.util.Scanner;

public class YeniHesapMakinesi {
	
	static void selamVer() {
		System.out.println("Hoşgeldin :)");
	}
	
    static int toplamaIslemi(int x,int y) {
		return x + y;
    }   
    
    static int cikarmaIslemi(int x,int y){
		return x-y;
    }

    static int cikarmaIslemi(int... args){
		int sonuc = 0;
    	for(int item : args) {
			sonuc = sonuc + item;
    	}
    	return sonuc;
    }
    
    static int carpmaIslemi(int x,int y){   //method-Parametre
    	return x*y;							
    }
    
    static double bolmeIslemi(int x,int y){
    	return ((double)x)/y;
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
		System.out.print("Birinci sayı ...");
		birinciSayi = tarayaci.nextInt();
		System.out.print("İkinci sayı...");
		ikinciSayi=tarayaci.nextInt();
		
		switch(secim) {
			case 1:
				System.out.println("Toplama işleminin sonucu = " + toplamaIslemi(birinciSayi,ikinciSayi));
				break;
			case 2:
				System.out.println("Çıkarma işleminin sonucu = " + cikarmaIslemi(birinciSayi,ikinciSayi));
				break;
			case 3:
				System.out.println("Çarpma işleminin sonucu = " +carpmaIslemi(birinciSayi,ikinciSayi));
				break;
			case 4:
				if(ikinciSayi == 0) {
					System.out.println("Bir sayının sıfıra bölümü tanımsızdır.");
				}else {					
					System.out.println("Bölme işleminin sonucu = " + bolmeIslemi(birinciSayi,ikinciSayi));
				}
				break;
			default:
				System.out.println("1 ile 4 arası bir rakam giriniz");
		}
	}
}


	
	
	
	
		

	


