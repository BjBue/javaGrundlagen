package app;

public class Rechner {
	
	/**
	 * 
	 * @param a - eine Zahl
	 * @param b - eine Zahl
	 * @param op (+,-,*,/)
	 * @return Ergebnis der Berechnung
	 * @throws Exception 
	 */
	public static double  rechne(double a, double b, char op) throws Exception {
		
		double result = 0;
		
		if( (a == 0) | (b == 0) ) {
			throw new Exception("you shall not pass with zero!");
		} else {

			// switch-case
			switch (op) {
			
				case '+':
				{
					//plus rechnen
					result = a + b;
					break;
				}
				case '-':
				{
					//minus rechnen
					result = a - b;
					break;
				}
				case '*':
				{
					//multibaby rechnen
					result = a * b;
					break;
				}
				case '/':
				{
					//dividiere rechnen
					result = a / b;
					break;
				}
				default:
				{
					//keine op angegeben
					result = 0;
					break;
				}
			}
		
		}
		return result;
		
	}
	

}
