import java.util.HashMap;
class HenteHashMap{
	public static void main(String[] args) {
		Administrasjon a = new Administrasjon();
		a.meny();
	}

}

class Administrasjon{
	public void meny(){
		Person p = new Person();
		p.settInn("Hei");

	}

}

class Person{
	private HashMap<String,String> ting = new HashMap<>();

	// (Ikke gjør dette)
	public HashMap<String, String> faaHashMap(){
		return ting;
	}

	// Gjør dette
	public void settInn(String s){
		ting.put(s,s);
	}




}