package app;

public class Automobil {

	public Automobil () {
		
	}

	private float Tankinhalt;
	private float Kilometerstand;
	private int Raeder;
	private String Fabrikat;
	
	String Farbe = "rot";
	

	
	public void IHaveACar () {
		
	}
	
	public String getFarbe () {
		return this.Farbe;
	}
	
	public boolean setFarbe (String neueFarbe) {
		
		this.Farbe = neueFarbe;
		if ( this.Farbe != "") {
			return true;
		} else {
			return false;
		}
	}
	
	public void fahre () {
		
		System.out.println("auto fährt");
		
	}


	/**
	 * @return the tankinhalt
	 */
	public float getTankinhalt() {
		return Tankinhalt;
	}


	/**
	 * @param tankinhalt the tankinhalt to set
	 */
	public void setTankinhalt(float tankinhalt) {
		Tankinhalt = tankinhalt;
	}


	/**
	 * @return the kilometerstand
	 */
	public float getKilometerstand() {
		return Kilometerstand;
	}


	/**
	 * @param kilometerstand the kilometerstand to set
	 */
	public void setKilometerstand(float kilometerstand) {
		Kilometerstand = kilometerstand;
	}


	/**
	 * @return the raeder
	 */
	public int getRaeder() {
		return Raeder;
	}


	/**
	 * @param raeder the raeder to set
	 */
	public void setRaeder(int raeder) {
		Raeder = raeder;
	}


	/**
	 * @return the fabrikat
	 */
	public String getFabrikat() {
		return Fabrikat;
	}


	/**
	 * @param fabrikat the fabrikat to set
	 */
	public void setFabrikat(String fabrikat) {
		Fabrikat = fabrikat;
	}
	
}
