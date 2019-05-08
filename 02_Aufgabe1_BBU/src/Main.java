/**
 * 
 */

/**
 * @author Student
 *
 */
public class Main {

	private String FirstName;
	private String MiddleName;
	private String LastName;
	private int Alter;
	private short Id;
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return FirstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return MiddleName;
	}

	/**
	 * @param middleName the middleName to set
	 */
	public void setMiddleName(String middleName) {
		MiddleName = middleName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return LastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		LastName = lastName;
	}

	/**
	 * @return the alter
	 */
	public int getAlter() {
		return Alter;
	}

	/**
	 * @param alter the alter to set
	 */
	public void setAlter(int alter) {
		Alter = alter;
	}

	/**
	 * @return the id
	 */
	public short getId() {
		return Id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(short id) {
		Id = id;
	}

	
	/**
	 * 
	 */
	public Main() {
		// TODO Auto-generated constructor stub
		System.out.println("konstruktor");
	}
	/**
	 * 
	 */
	public Main(String firstname) {
		// TODO Auto-generated constructor stub
		System.out.println("konstruktor Firstname");
		this.setFirstName(firstname);
	}
	public Main(String firstname, String middlename) {
		// TODO Auto-generated constructor stub
		System.out.println("konstruktor Firstname, middlename");
		this.setFirstName(firstname);
		this.setMiddleName(middlename);
	}
	public Main(String firstname, String middlename, String lastname) {
		// TODO Auto-generated constructor stub
		System.out.println("konstruktor Firstname, middlename, lastname");
		this.setFirstName(firstname);
		this.setMiddleName(middlename);
		this.setLastName(lastname);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main test = new Main("vorne","mitte","hinten");
		System.out.println(test.getFirstName() + " " + test.getMiddleName() + " " + test.getLastName());
		
	}

}
