
public class Person {
	private String name;
	private int age;
	private double boy;
	private String meslek;
	private String hobi = "Satranç oynamak";
	
	public Person() {
	}
	
	public Person(String name,int age, double boy,String meslek) {
		setName(name);
		setAge(age);
		setBoy(boy);
		setMeslek(meslek);
	}
	
	public String kendiniTanit() {
		String result = "Benim adım " + getName() + " . " 
				+ getAge() + " yaşındayım. "+ "Boyum " 
				+ getBoy() + ". Mesleğim " + getMeslek() + ". "
				+ " Hobilerim : " + getHobi();
		System.out.println(result);  
		return result;   
	}

	public void kendiniHerkeseTanit() {
		System.out.println("Benim adım " + getName() + ". " 
				+ getAge() + " yaşındayım. "+ "Boyum " 
				+ getBoy() + ". Mesleğim " + getMeslek());   
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public double getBoy() {
		return boy;
	}

	public void setBoy(double boy) {
		this.boy = boy;
	}

	public String getMeslek() {
		return meslek;
	}

	public void setMeslek(String meslek) {
		this.meslek = meslek;
	}

	public String getHobi() {
		return hobi;
	}
	
	public void setHobi(String hobi) {
		this.hobi = hobi;
	}
	
	
}
