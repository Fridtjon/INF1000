import java.util.ArrayList;

public class Koe{	
	ArrayList<Person> koe = new ArrayList<>();

	public void settInn(Person p){
		if(finnesPerson(p)){
			System.out.println("Person " + p + " finnes i koen.");
		} else {
			koe.add(p);	
			System.out.println("Satt inn " + p);
		}	
	
	}

	public boolean finnesPerson(Person p){
		/*for(int i = 0; i < koe.size(); i++){
			if(koe.get(i) == p){
				return true;
			}
		} */
		for(Person person : koe){
			if(person == p){
				return true;
			}
		}
		return false;

	}

	public void fjernAlle(){
		
		for(int i = 0;i < koe.size(); i += 0){
			koe.remove(0);
		}

		System.out.println(koe.size());
	}

	public Person fjernFraKoe(){
		if(koe.size() > 0){
			Person fjernPerson = koe.get(0);
			koe.remove(0);
			return fjernPerson;
		} 
		
		System.out.println("Koen er tom.");
		return null;
		
		
	}




}