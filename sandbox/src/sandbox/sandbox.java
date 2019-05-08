
package sandbox;



public class sandbox {
	
	static void testing() {
		
		try {
			
		int[] mynumbers = {1,2,3,4,5};
		
		if ( mynumbers[1] < 0 ) {
			System.out.println(mynumbers[10]);
		}else {
			throw new Exception( mynumbers[1] + " is nich kleinaaaaa als 0,  du alte sau");
		}
		
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ein error: " + e.getMessage());
			//System.out.println(e.fillInStackTrace());
		} finally {
			System.out.println("kannst du überhaupt programmieren du arsch");
		}
	}
	
	
	public static void main (String[] args) {

		testing();
		
		
/*		//arrays und so
		String[] cars = {"volov","bmw","ford","mazda","opel","mercedes"};
		
		for ( int i = 0, j = cars.length; i<j; i++ ) {
			
			System.out.println(cars[i]);
			
		}
		
		System.out.println("");
		
		for( String car:cars){
			System.out.println(car);
		}
*/
		
		
		
	}
}


