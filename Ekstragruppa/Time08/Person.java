import java.util.HashMap;
class Person{

	String navn;
	// Bokliste hvis personen har skrevet noen bøker
	HashMap<String,Bok> bokliste = new HashMap<String,Bok>();

	public Person(String navn){
		this.navn = navn;
	}

	public String toString(){
		return navn;
	}

	public void skrivBok(Bok bok){
		
		bokliste.put(bok.toString, bok);
	}


}