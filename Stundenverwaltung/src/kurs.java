
public class kurs {

	private String kursName; 
	
	public kurs() {
		System.out.println("Wir brauchen ein Kursnamen");
	}

	public kurs(String kursName) {
		this.kursName = kursName;
	}

	public String getKursName() {
		return kursName;
	}

	public void setKursName(String kursName) {
		this.kursName = kursName;
	}

}
