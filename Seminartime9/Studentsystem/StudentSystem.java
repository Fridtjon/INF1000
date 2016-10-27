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
			} else{
				if(!finnesStudent(linje)){
					nyPerson = new Student(linje);
					alleStudenter.put(nyPerson.toString(), nyPerson);
				}else {
					nyPerson = alleStudenter.get(linje);
				}
				nyttFag.leggTilStudent(nyPerson);
			}

			
		//	System.out.println(linje);

		}

	}

	public void hovedMeny(){
		Scanner in = new Scanner(System.in);
		while(true){
			System.out.println("Meny: 0: LeggTilStudent, 1: leggTilFag");

			int valg = Integer.parseInt(in.nextLine());

			if(valg == 0){
				leggTilStudent();
			} else if (valg == 1){
				System.out.println("Du valgte leggTilFag");
			}

		}

	}

	public void leggTilStudent(){
		Scanner in = new Scanner(System.in);
		System.out.println("Du valgte leggTilStudent");
		System.out.println("Skriv inn navnet til studenten:");
		String studentNavn = in.nextLine();
		if(finnesStudent){
			System.out.println("Studenten finnes fra før");
		} else {
			Student nyStudent = new Student(studentNavn);
			System.out.println("Lagde studenten " + nyStudent.toString());
		}
	}


	public boolean finnesStudent(String student){
		return alleStudenter.containsKey(student);
	}







}