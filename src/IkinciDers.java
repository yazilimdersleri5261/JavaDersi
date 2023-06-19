import java.util.Scanner;

public class IkinciDers {
//	Kullanıcıdan 1. ve 2. notunun bilgisini alalım. Bunun ortalamasını kullanıcıya söyleyelim.
//	85 - 100 => Pek İyi
//	70 - 85 => İyi
//	55 - 70 => Orta
//	45 - 55 => Kötü
//	25 - 45 => Çok Kötü
//	0 - 25 => Kendine kalacak yer bul.
// 	&& ==> ve anlamına gelir.
//	|| ==> veya anlamına gelir.
	
//  if => Bu koşulu sağlıyorsa süslü parantez içindeki kodu çalıştır.
//  else if => Bundan bir önceki if bloğuna girmezse bu koşula da bak.
// 	Tüm if'ler yanlış(false) ise else içini çalıştırır.
	
	
	public static void main(String[] args) {
		int birinciNot;
		int ikinciNot;
		double notOrtalamasi;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Lütfen birinci notu giriniz : ");
		birinciNot = scan.nextInt();
		System.out.print("Lütfen ikinci notu giriniz : ");
		ikinciNot = scan.nextInt();
		notOrtalamasi = (birinciNot + ikinciNot)/2.0;

		if(notOrtalamasi >= 85 && notOrtalamasi <= 100) {
			System.out.println("Not ortalamanız = " + notOrtalamasi + " (Pek İyi)");
		}else if(notOrtalamasi >= 70) {
			System.out.println("Not ortalamanız = " + notOrtalamasi + " (İyi)");
		}else if(notOrtalamasi >= 55) {
			System.out.println("Not ortalamanız = " + notOrtalamasi + " (Orta)");
		}else if(notOrtalamasi >= 45) {
			System.out.println("Not ortalamanız = " + notOrtalamasi + " (Kötü)");
		}else if(notOrtalamasi >= 25) {
			System.out.println("Not ortalamanız = " + notOrtalamasi + " (Çok Kötü)");
		}else {
			System.out.println("Not ortalamanız = " + notOrtalamasi + " (Kendine kalacak yer bul)");
		}
	}
}
