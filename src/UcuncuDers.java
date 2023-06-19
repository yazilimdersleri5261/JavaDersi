import java.util.Scanner;
import java.util.Random;

public class UcuncuDers {

	public static void main(String[] args) {
		//while(koşul){} => () parantez içerisine aldığı değer doğru olduğu süre boyunca çalışmaya devam eder
		//for döngüsü (başlangıç değeri ; koşul ; artış-azalış miktarı){}
		// 8%3 => 2 , 8 %2 => 0 , 9%3 => 0 , 10%3 => 1
		
//		Scanner scan = new Scanner(System.in);
//		Random random = new Random();
//		int tuttugumSayi = random.nextInt(0,100);
//		int girilenSayi;
//		System.out.print("Lütfen 0 ile 100 arasındaki tahmininizi giriniz:");
//		girilenSayi = scan.nextInt();
//		
//		while(girilenSayi != tuttugumSayi) {
//			if(girilenSayi < tuttugumSayi) {
//				System.out.println("Bilemediniz. Lütfen daha büyük bir sayı giriniz.");
//			}else {
//				System.out.println("Bilemediniz. Lütfen daha küçük bir sayı giriniz.");
//			}
//			System.out.print("Lütfen 0 ile 100 arasındaki tahmininizi giriniz:");
//			girilenSayi = scan.nextInt();
//		}
//		System.out.println("Doğru bildiniz tebrikler.");
		
//		for(int i = 0; i<100 ;i++) {
//			if(i%2 == 0) {
//				System.out.println(i + " çift sayıdır.");
//			}
//			else{
//				System.out.println(i + " tek sayıdır.");
//			}
//		}
//		
		
		
//	Asal sayılar sadece 1 ve kendisine bölünen sayılardır.
//  5 sayısı 1,2,3,4,5
		 
//		5/2 => Bölünmücek.(Kalan 0 olmayacak)
//		5/3 => Bölünmücek.
//		5/4 => Bölünmücek.
		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("Sayı giriniz : ");
//		int secilenSayi = scan.nextInt();
//		boolean asalSayiMi = true;
//		for(int i =2; i<secilenSayi;i++) {
//			System.out.println(secilenSayi + "%" + i + " = " + (secilenSayi%i) );
//			if(secilenSayi%i == 0) {
//				System.out.println(secilenSayi + "/" + i + " = " + (secilenSayi/i) );
//				asalSayiMi = false;
//				break;  // Döngüyü bozar, Kelime anlamı kırmak,bozmak.
//						//continue; Devam et demek. 
//			}
//		}
//		
//		if(asalSayiMi) {
//			System.out.println("Evet bu bir asal sayıdır.");
//		}else {
//			System.out.println("Hayır bu bir asal sayı değildir.");
//		}
//		
		
//		for(int a = 1000; a>50; a = a/2 ) {
//			System.out.println("a = " + a);
//		}
		
	}

}
