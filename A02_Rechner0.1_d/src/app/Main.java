package app;

public class Main {

	public static void main(String[] args) {
		
		// welche Ausnahmen/ Fehler sind möglich und was kann ich tun?
		
		double result = 0;
		try {
			result = Rechner.rechne(3, 7.123, '+');
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(result);
	}

}
