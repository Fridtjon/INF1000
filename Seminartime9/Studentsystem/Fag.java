import java.util.HashMap;
public class Fag{
	
	private String emnekode;
	private HashMap<String, Student> studenter = new HashMap<String, Student>();
	
	public Fag(String emnekode){
		this.emnekode = emnekode;
	}

	public String toString(){
		return emnekode;
	}

	public boolean finnesStudentFraFoer(String studentnavn){
		return studenter.containsKey(studentnavn);
	}

	public void leggTilStudent(Student s){
		if(finnesStudentFraFoer(s.toString())){
			System.out.println("Studenten finnes allerede fra før.");
		} else {
			System.out.println("La til studenten " + s + " til " + emnekode);
			studenter.put(s.toString(), s);
		}
	}

	public void fjernStudent(Student s){
		if(!finnesStudentFraFoer(s.toString())){
			System.out.println("Studenten tar ikke dette emnet");
		} else {
			System.out.println("Fjernet student " + s.toString());
			studenter.remove(s.toString());
		}
	}

	public void skrivUtMineStudenter(){
		for(String s : studenter.keySet()){
			System.out.println(s);
		}
	}

	public void fjernMegFraAlleStudenter(){
		for(Student s : studenter.values()){
			s.fjernFag(this);
		}
	}

	public void fjernAlleMineStudenter(){
		studenter.clear();
	}

	public int antallStudenter(){
		return studenter.size();
	}
}