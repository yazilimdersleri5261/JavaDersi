import java.util.Scanner;

public class BesinciDers {
	
	
	
	public static void main(String[] args) {
		Person kisi1 = new Person("Bediralp",15,1.62,"Yazılımcı");
		kisi1.setMeslek("Öğrenci");
		Person kisi2 = new Person();
		System.out.println(kisi1.kendiniTanit());
		
		Person kisi3 = new Person();
		kisi3.setName("Melike");
		kisi3.setBoy(1.52);
		kisi3.setAge(24);
		kisi3.setMeslek("Dolandırıcı");
		kisi3.setHobi("Dolandırmak");
		kisi3.kendiniTanit();
		
	}

}
