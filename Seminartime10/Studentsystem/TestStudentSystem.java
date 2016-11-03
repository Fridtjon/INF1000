class TestStudentSystem{
	public static void main(String[] args) throws Exception{
		StudentSystem s = new StudentSystem();
		//testLeggTilStudent(s);
		//testLeggTilFag(s);
		s.lesFil("emnestudenter.txt");
		System.out.println("Tester skrivUtStudentsFag\n");
		//s.skrivStudentsFag("person1");
		System.out.println("Faget flest tar:");
		s.fagSomFlestTar();
		System.out.println("\nStudenten som tar flest fag:");
		s.studentMedFlestFag();
		System.out.println("\nINF1060s studenter:");
		s.skrivFagsStudenter("INF1060");
		
	}

	public static void testLeggTilStudent(StudentSystem s){
		s.leggTilStudent();
		s.leggTilStudent();
		s.skrivAlleStudenter();
	}

	public static void testLeggTilFag(StudentSystem s){
		s.leggTilFag();
		s.leggTilFag();
		s.skrivAlleFag();
	}
}