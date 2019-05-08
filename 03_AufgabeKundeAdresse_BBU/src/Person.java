/**
 * 
 */

/**
 * @author Student
 *
 */
public class Person {

	private String Firstname;
	private String Middlename;
	private String Lastname;
	
	private Adresse Adresse;
	
	/**
	 * @return the adresse
	 */
	public Adresse getAdresse() {
		return Adresse;
	}


	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(Adresse adresse) {
		Adresse = adresse;
	}


	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return Firstname;
	}


	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}


	/**
	 * @return the middlename
	 */
	public String getMiddlename() {
		return Middlename;
	}


	/**
	 * @param middlename the middlename to set
	 */
	public void setMiddlename(String middlename) {
		Middlename = middlename;
	}


	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return Lastname;
	}


	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		Lastname = lastname;
	}


	/**
	 * 
	 */
	public Person() {
		// TODO Auto-generated constructor stub
		this.Firstname = "";
		this.Middlename = "";
		this.Lastname = "";

	}

	public Person(String firstname, String lastname) {
		// TODO Auto-generated constructor stub
		this.setFirstname(firstname);
		this.setLastname(lastname);
	}

	public Person(String firstname, String middlename, String lastname) {
		// TODO Auto-generated constructor stub
		this.setFirstname(firstname);
		this.setMiddlename(middlename);
		this.setLastname(lastname);
	}

	public Person(String firstname, String middlename, String lastname, Adresse adresse) {
		// TODO Auto-generated constructor stub
		this.setFirstname(firstname);
		this.setMiddlename(middlename);
		this.setLastname(lastname);
		this.setAdresse(adresse);
	}

	
	public String getPersonendaten() {
		String out = "";
		if ( (this.getMiddlename() != null) || this.getMiddlename() == "" ) {
			out = " " + this.getFirstname() + " " + this.getMiddlename() + " " + this.getLastname() + " ";
		} else {
			out = " " + this.getFirstname() + " "  + this.getLastname() + " ";
		}
		return out;
	}

	public String getAdressdaten() {
		return this.Adresse.getAdressDaten();
	}


	@Override
	public String toString() {
		return "Person [Firstname=" + Firstname + 
			   ", Middlename=" + Middlename + 
			   ", Lastname=" + Lastname + 
			   ", Adresse="
				+ Adresse + "]";
	}
	
}
