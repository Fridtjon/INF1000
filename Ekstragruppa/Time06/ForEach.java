import java.util.ArrayList;

class ForEach{
	
	public static void main(String[] args) {
		
		String[] stringArr = {"Hei", "alle", "sammen!"};
		System.out.println("For each for string:");
		for(String s : stringArr){
			System.out.println(s);
		}

		System.out.println("");
		System.out.println("For each for int");
		int[] tallArr = {1,2,3,4};
		for(int i : tallArr){
			System.out.println(i);
		}


		ArrayList<String> arrL = new ArrayList<>();
		arrL.add("Hvordan");
		arrL.add("går");
		arrL.add("obligen?");
		System.out.println("");
		System.out.println("For each med ArrayList");
		for(String s : arrL){
			System.out.println(s);
		}
		/*
		Person p = new Person("Fridtjof");
		Person p2 = new Person("Fridtjof");
		p2.setAlder(10); */

		ArrayList<Person> personListe = new ArrayList<>();

		personListe.add(new Person("Fridtjof"));
		personListe.add(new Person("Lise"));
		personListe.add(new Person("Per"));

		String navn = "Lise";
		
		for(Person p : personListe){
			if(navn.equals(p.toString())){
				p.haBursdag();
			}
		}

		int tmpHoyest = 0;
		Person tmpPerson = personListe.get(0);

		for(Person p : personListe){
			if(p.hentAlder > tmpHoyest){
				tmpHoyest = p.hentAlder;
				tmpPerson = p;
			}
		}

		return tmpPerson;

		Person nyperson = new Person(navn);
		nyperson.haBursdag();


	
	}










}