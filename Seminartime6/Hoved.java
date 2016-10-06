public class Hoved{


	public static void main(String[] args) {	
		Koe koe = new Koe();
		Person p = new Person("Fridtjof");
		Person p2 = new Person("Nina");
		Person p3 = new Person("Petter");
		//System.out.println(p);
		
		koe.settInn(p);
		koe.settInn(p2);
		koe.settInn(p3);
		koe.settInn(new Person("Per"));
		koe.settInn(p); 

		koe.fjernAlle();



	}
}