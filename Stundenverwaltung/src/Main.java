

public class Main {

	public static void main(String[] args) {

		/**
		 * ein paar Kurse anlegen
		 */
		kurs[] kurse;
		kurse = new kurs[4];
		kurse[0] = new kurs("Mathe");
		kurse[1] = new kurs("Informatik");
		kurse[2] = new kurs("Java");
		kurse[3] = new kurs("C++");
		System.out.println("Kurse:");
		for(kurs kurs:kurse) {
			System.out.println( kurs.getKursName() );
		}
		
		klasse[] klassen;
		klassen = new klasse[4];
		for ( int i = 0, ende = kurse.length; i<ende; i++) {
			klassen[i] = new klasse(kurse[i].getKursName());
		}
		System.out.println();
		System.out.println("Klassen:");
		for (klasse klasse:klassen) {
			System.out.println( klasse.getKlassenZiel() );
		}
		System.out.println();
		
		/**
		 * ein paar Studenten anlegen
		 */
		
		student[] studenten;
		studenten = new student[10];
		studenten[0] = new student("Andrea");
		studenten[1] = new student("Berta");
		studenten[2] = new student("Charlie");
		studenten[3] = new student("Dora");
		studenten[4] = new student("Emil");
		studenten[5] = new student("Frieda");
		studenten[6] = new student("Gerda");
		studenten[7] = new student("Hansi");
		studenten[8] = new student("Inge");
		studenten[9] = new student("Julia");
		
		//jedem Student zwei random kurse zuordnen
		for (int zaehler = 0, ende = studenten.length; zaehler < ende; zaehler++) {

			for (int i=0; i<2;i++) {
				
				int x = 0 + (int)(Math.random() * ((3 - 0) + 1));

				studenten[zaehler].addKurs(kurse[x].getKursName() );
				
				klassen[x].setKlassenMitglied(studenten[zaehler].getStudentName() );
				
			}
			System.out.println(" Name: " +  studenten[zaehler].getStudentName() + 
					           " belegt " + studenten[zaehler].getAllKurse() );
		
			
		}
		
		System.out.println();
		System.out.println("Klassen Mitglieder:");
		for (klasse klasse:klassen) {
			System.out.println(klasse.getKlassenZiel());
			klasse.getAllKlassenMitglieder();
		}
		
		
		
		
		
	}

}
