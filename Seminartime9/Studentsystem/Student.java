import java.util.HashMap;
public class Student{

	private String navn;
	private HashMap<String, Fag> fagliste = new HashMap<String,Fag>();

	public Student(String navn){
		this.navn = navn;
	}

	public String toString(){
		return navn;
	}

	public boolean finnesFagFraFoer(Fag f){
		return fagliste.containsKey(f.toString());
	}

	public void leggTilFag(Fag f){
		if(finnesFagFraFoer(f)){
			System.out.println("Studenten tar allerede dette faget.");
			return;
		}
		System.out.println("La til faget " + f.toString() + " i " + navn + " sin liste.");
		fagliste.put(f.toString(),f);
	}

	public void fjernFag(Fag f){
		if(!finnesFagFraFoer(f)){
			System.out.println("Studenten tar ikke dette faget.");
			return;
		}
		System.out.println("Fjernet faget " + f.toString() + " fra " + navn + " sin liste.");
		fagliste.remove(f.toString());
	}

	public void skrivUtMineFag(){
		for(String s : fagliste.keySet()){
			System.out.println(s);
		}
	}

	public void fjernMegFraAlleFag(){
		for(Fag f : fagliste.values()){
			f.fjernStudent(this);
		}
	}

	public void fjernAlleMineFag(){
		fagliste.clear();
	}

	public int antallFag(){
		return fagliste.size();
	}
}







