public class Testfil{
	public static void main(String[] args) throws Exception{
		Student testperson1 = new Student("Gunnar");
		Fag testfag1 = new Fag("INF1000");
		StudentSystem system = new StudentSystem();

		system.lesFil("emnestudenter.txt");
		system.hovedMeny();

		/* Tester Person.java */
		
		/*
		Fag testfag1 = new Fag();
		System.out.println("\nTester å legge til et fag.");
		testperson1.leggTilFag(testfag1);

		System.out.println("\nTester å legge til samme fag på nytt.");
		testperson1.leggTilFag(testfag1);

		System.out.println("\nTester å fjerne faget fra studenten.");
		testperson1.fjernFag(testfag1);
	
		System.out.println("\nTester å fjerne samme fag på nytt.");
		testperson1.fjernFag(testfag1);
	 	*/
		/*
	 	if(testFjernAlle(testperson1)){
	 		System.out.println("Det gaar a fjerne alle emnekoder fra student.");
	 	} 
	 	testSkrivUt(testperson1); */
		/* Tester Fag.java */
		/*
		System.out.println("\nTester å legge til en person.");
		testfag1.leggTilStudent(testperson1);

		System.out.println("\nTester å legge til samme person på nytt.");
		testfag1.leggTilStudent(testperson1);

		System.out.println("\nTester å fjerne studenten fra faget.");
		testfag1.fjernStudent(testperson1);
	
		System.out.println("\nTester å fjerne samme student på nytt.");
		testfag1.fjernStudent(testperson1);
		*/
	}	

	public static void testSkrivUt(Student s){
		s.leggTilFag(new Fag("INF1060"));
		s.leggTilFag(new Fag("INF2220"));
		s.leggTilFag(new Fag("INF1600"));
		s.skrivUtMineFag();
	}

	// Returnerer true hvis testen gikk fint.
	public static boolean testFjernAlle(Student s){
		s.leggTilFag(new Fag("INF1010"));
		s.leggTilFag(new Fag("INF2220"));
		s.fjernAlleMineFag();

		/* //Overfloedig kode.
		if(s.antallFag() == 0){
			return true;
		} else {
			return false;
		} */
		return s.antallFag() == 0;

	}

}