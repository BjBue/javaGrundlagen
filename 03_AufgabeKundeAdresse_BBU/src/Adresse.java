/**
 * 
 */

/**
 * @author Student
 *
 */
public class Adresse {

	private String Strasse;
	private int Hausnummer;
	private int PLZ;
	private String Stadt;
	
	/**
	 * @return the strasse
	 */
	public String getStrasse() {
		return this.Strasse;
	}

	/**
	 * @param strasse the strasse to set
	 */
	public void setStrasse(String strasse) {
		this.Strasse = strasse;
	}

	/**
	 * @return the hausnummer
	 */
	public int getHausnummer() {
		return this.Hausnummer;
	}

	/**
	 * @param hausnummer the hausnummer to set
	 */
	public void setHausnummer(int hausnummer) {
		this.Hausnummer = hausnummer;
	}

	/**
	 * @return the pLZ
	 */
	public int getPLZ() {
		return this.PLZ;
	}

	/**
	 * @param pLZ the pLZ to set
	 */
	public void setPLZ(int pLZ) {
		this.PLZ = pLZ;
	}

	/**
	 * @return the stadt
	 */
	public String getStadt() {
		return this.Stadt;
	}

	/**
	 * @param stadt the stadt to set
	 */
	public void setStadt(String mystadt) {
		//System.out.println(mystadt);
		this.Stadt = mystadt;
	}

	/**
	 * 
	 */
	public Adresse() {
		// TODO Auto-generated constructor stub
		this.setStrasse("");
		this.setHausnummer(0);
		this.setPLZ(0);
		this.setStadt("");
	}

	public Adresse(String Strasse, int Hausnummer, int Postleitzahl, String Stadt) {
		// TODO Auto-generated constructor stub
		this.setStrasse(Strasse);
		this.setHausnummer(Hausnummer);
		this.setPLZ(Postleitzahl);
		this.setStadt(Stadt);
	}

	
	public String getAdressDaten() {
		return " " + this.getStrasse() + " " + this.getHausnummer() + " \n " 
	               + this.getPLZ() + " " + this.getStadt();
	}

	@Override
	public String toString() {
		return "Adresse [Strasse=" + Strasse + 
			   ", Hausnummer=" + Hausnummer + 
			   ", PLZ=" + PLZ + 
			   ", Stadt=" + Stadt + "]";
	}
	
	
	
}
