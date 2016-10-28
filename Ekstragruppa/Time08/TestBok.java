class TestBok{
	
	public static void main(String[] args) {
		
		//Person forfatter = new Person();
		Person forfatter = new Person("Tolkien");
		Bok lotr = new Bok("Lotr",forfatter);

		System.out.println("Tittel: " + lotr.toString());

	}

}