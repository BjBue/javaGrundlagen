import java.util.ArrayList;

/**
 * 
 */

/**
 * @author Student
 *
 */
public class student {

	private String studentName;
	
	private ArrayList<String> kurse = new ArrayList<String>(); 
	
	/**
	 * 
	 */
	public student(String name) {
		this.studentName = name;
	}

	public student() {
		System.out.println("I need a name");
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentenName(String studentName) {
		this.studentName = studentName;
	}
	
	public void addKurs(String kurs) {
		this.kurse.add(kurs);
	}
	
	public String getAllKurse() {
		String temp = " ";
		for ( String kursName:kurse) {
			temp += kursName + ", ";
		}
		return temp.trim();
	}

}
