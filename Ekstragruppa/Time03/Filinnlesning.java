import java.io.File;
import java.util.Scanner;

class Filinnlesning{
	public static void main(String[] args) throws Exception {
		lesFil();
	}

	public static void lesFil() throws Exception{
		// Scanner filInput = new Scanner(new File("Tekstfil.txt"))

		String filnavn = "Tekstfil.txt";
		File fil = new File(filnavn);
		Scanner filInput = new Scanner(fil);
		String linje = "";

		while(filInput.hasNextLine()){
			linje = filInput.nextLine();
			System.out.println(linje);
		}

		System.out.println("Ferdig med programmet.");
	}

}













