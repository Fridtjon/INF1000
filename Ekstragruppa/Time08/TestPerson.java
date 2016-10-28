class TestPerson{
	public static void main(String[] args) {
		
		Person tolkien = new Person("Tolkien");
		Bok lotr = new Bok("Lotr", tolkien);

		tolkien.skrivBok(lotr);

	}
}