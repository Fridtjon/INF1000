import java.util.HashMap;
import java.io.File;
import java.util.Scanner;

public class StudentSystem{
	
	private HashMap<String, Student> alleStudenter = new HashMap<String,Student>();
	private HashMap<String, Fag> alleFag = new HashMap<String,Fag>();

	public void lesFil(String filnavn) throws Exception{
		System.out.println("Filnavn = " + filnavn);
		File fil = new File(filnavn);
		Scanner filleser = new Scanner(fil);

		Fag nyttFag = null;
		Student nyPerson;
		while(filleser.hasNextLine()){

			String linje = filleser.nextLine();
			if(linje.substring(0,1).equals("*")){
				nyttFag = new Fag(linje.substring(1));
				alleFag.put(nyttFag.toString(),nyttFag);
			} 
			else{
				if(!finnesStudent(linje)){
					nyPerson = new Student(linje);
					alleStudenter.put(nyPerson.toString(), nyPerson);
				}else {
					nyPerson = alleStudenter.get(linje);
				}
				nyttFag.leggTilStudent(nyPerson);
				nyPerson.leggTilFag(nyttFag);
			}

			
		//	System.out.println(linje);

		}

	}

	public void hovedMeny(){
		Scanner in = new Scanner(System.in);
		Boolean kjoer = true;
		
		while(kjoer){
			System.out.println("Meny: 0: LeggTilStudent, 1: leggTilFag");
			String linje = in.nextLine();
			int valg = Integer.parseInt(linje);

			if(valg == 0){
				leggTilStudent();
			} 

			else if (valg == 1){
				//leggTilFag();
				//System.out.println("Du valgte leggTilFag");
			}
			else if (valg == 2){
				// Skrive kode inne i if-else
				// Kalle på metoder <--- Lurest!
			}

			else if (valg == 9){
				/* Avslutte med return:
				return;
				*/
				/* Avslutte med break:
				*/
				//break;
				/* Avslutte med å endre while-løkkens boolske uttrykk
				kjoer = false; */

				/* Avslutte med å avslutte programmet */
				//System.exit(0);

			}

		}

	}

	public void skrivAlleStudenter(){
		for(Student s : alleStudenter.values()){
			System.out.println(s.toString());
		}
	}

	public void skrivAlleFag(){
		for(Fag f : alleFag.values()){
			System.out.println(f.toString());
		}
	}

	public void fagSomFlestTar(){
		int hoyest = 0;
		Fag hoyestFag = null;
		for(Fag f : alleFag.values()){
			if(f.antallStudenter() > hoyest){
				hoyest = f.antallStudenter();
				hoyestFag = f;
			}
		}
		if(hoyestFag != null){
			System.out.println("Det faget med flest studenter er " + hoyestFag.toString());
		} else {
			System.out.println("Det er ingen fag i listen.");
		}

	}

	public void studentMedFlestFag(){
		int hoyest = 0;
		Student flestFag = null;
		for(Student s : alleStudenter.values()){
			if(s.antallFag() > hoyest){
				hoyest = s.antallFag();
				flestFag = s;
			}
		}
		if(flestFag != null){
			System.out.println("Den studenten med flest fag er " + flestFag.toString());
		} else {
			System.out.println("Det er ingen studenter i listen.");
		}
	}

	public void skrivFagsStudenter(String fag){
		if(alleFag.containsKey(fag)){
			alleFag.get(fag).skrivUtMineStudenter();
		} else {
			System.out.println("Faget finnes ikke i systemet.");
		}
	}

	public void skrivStudentsFag(String studentnavn){
		if(alleStudenter.containsKey(studentnavn)){
			Student s = alleStudenter.get(studentnavn);
			s.skrivUtMineFag();
		} else {
			System.out.println("Studenten finnes ikke i systemet.");
		}

	}
	
	public void leggTilFag(){
		Scanner in = new Scanner(System.in);
		System.out.println("Du valgte leggTilFag");
		System.out.println("Skriv inn emnekoden:");
		String emnekode = in.nextLine();
		if(finnesFag(emnekode)){
			System.out.println("Emnet finnes fra før");
		} else {
			Fag nyttFag = new Fag(emnekode);
			alleFag.put(emnekode, nyttFag);
			System.out.println("Lagde faged " + nyttFag.toString());
		}
	} 

	public void leggTilStudent(){
		Scanner in = new Scanner(System.in);
		System.out.println("Du valgte leggTilStudent");
		System.out.println("Skriv inn navnet til studenten:");
		String studentNavn = in.nextLine();
		if(finnesStudent(studentNavn)){
			System.out.println("Studenten finnes fra før");
		} else {
			Student nyStudent = new Student(studentNavn);
			alleStudenter.put(studentNavn, nyStudent);
			System.out.println("Lagde studenten " + nyStudent.toString());
		}
	}

	public boolean finnesFag(String emnekode){
		return alleFag.containsKey(emnekode);
	}

	public boolean finnesStudent(String student){
		return alleStudenter.containsKey(student);
	}







}