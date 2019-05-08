/**
 * 
 */

/**
 * @author Student
 *
 */
public class Main {

	/**
	 * 
	 */
	public Main() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person Keule = new Person("Vorne", "Mitte", "Hinten");
		System.out.println(Keule.getPersonendaten());
		System.out.println("");
		
		Person Keule2 = new Person("Vorne", "Hinten");
		System.out.println(Keule2.getPersonendaten());
		System.out.println("");
		
		Adresse EineAdresse = new Adresse("Beispielweg", 1, 12345, "Berlin");
		Person KeuleMitAdresse = new Person("ersterName", "Mittelname", "Nachname", EineAdresse);
		System.out.println(KeuleMitAdresse.getPersonendaten());
		System.out.println(KeuleMitAdresse.getAdressdaten());
		System.out.println("");
		
		Adresse EineAndereAdresse = new Adresse("Dingensstrasse", 10, 15324, "Hamburg");
		Person Keule2MitAdresse = new Person("Vorname", "MittlererName", "Nachname", EineAndereAdresse);
		System.out.println(Keule2MitAdresse.getPersonendaten());
		System.out.println(Keule2MitAdresse.getAdressdaten());
		System.out.println("");
		//Interessantes Konstrukt!
		System.out.println("Hmmm, mal die Stadt ändan:");
		Keule2MitAdresse.getAdresse().setStadt(KeuleMitAdresse.getAdresse().getStadt());
		
		System.out.println(Keule2MitAdresse.getPersonendaten());
		System.out.println(Keule2MitAdresse.getAdressdaten());

		System.out.println(Keule2MitAdresse);
		
		
		
		
		
	}

}
