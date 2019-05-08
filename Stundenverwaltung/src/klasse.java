
import java.util.ArrayList;


public class klasse {

	
	private String klassenZiel;
	
	private ArrayList<String> klassenMitglied = new ArrayList<String>(); 
	
	public klasse() {
		System.out.println("Wir brauchen ein Klassenziel");
	}

	public klasse(String ziel) {
		this.klassenZiel = ziel;
	}

	public String getKlassenZiel() {
		return klassenZiel;
	}

	public void setKlassenZiel(String klassenZiel) {
		this.klassenZiel = klassenZiel;
	}

	public String getKlassenMitglied(int position) {
		return klassenMitglied.get(position);
	}

	public void setKlassenMitglied(String mitglied) {
		this.klassenMitglied.add( mitglied );
	}

	public void getAllKlassenMitglieder() {
		for( String member:this.klassenMitglied ) {
			System.out.println("Klassenmitglied: " + member);
		}
	}


}
