import java.util.Scanner;

public class DorduncuDers {

	static void selamVer() {
		System.out.println("Hoşgeldiniz...");
	}
	
	static void toplamaIslemi() {
		Scanner scan2 = new Scanner(System.in);
		System.out.print("Birinci sayi ...");
		int birinciSayi = scan2.nextInt();
		System.out.print("İkinci sayi ...");
		int ikinciSayi = scan2.nextInt();
		System.out.println("Sonuç = " + (birinciSayi + ikinciSayi));
	}
	
	static void maininIci() {
		int secim = 1;
		
		int secim2 = 0;
		Scanner scan = new Scanner(System.in);
		selamVer();		
		switch(secim) {
			case 1:
				{
					toplamaIslemi();
					break;
				}
			case 2:
				{
					System.out.println("Çıkarma");
					break;
				}
			case 3:
				{
					System.out.println("Çarpma");
					break;
				}
			case 4:
				{
					try {						
						System.out.println("Sonuç = " + (5/secim2));
					} catch (Exception e) {
						System.out.println("Sayı 0'a bölünemez.");
					}
					break;
				}
			default:
			{
				System.out.println("Böyle bir değer yok.");
			}
		}
		
		System.out.println("Kod bitti...");		
	}
	
	static void byebye() {
		System.out.println("Hoşçakal.Görüşmek üzere.");
	}
	
	public static void main(String[] args) {
		// Switch-case => 
		//try -catch
		
		// Değişkenler => int(Tam sayılar) , boolean (true - false), double (virgüllü sayılar),
		// Değişkenler => String (Yazılar), char(Karakter '')
		
		// for(tanımla; koşul ; arttırma){} - while (koşul){} - if(koşul){} , else if ,else
		// switch-case 
		// try-catch => Hataları yakalıyoruz.		
		maininIci();
		byebye();
	}

}
