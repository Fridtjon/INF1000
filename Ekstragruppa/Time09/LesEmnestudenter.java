import java.util.Scanner;
import java.io.File;

class LesEmnestudenter{
	public static void main(String[] args) throws Exception{
		String linje = "";		
		String filnavn = "emnestudenter.txt";
		File nyfil = new File(filnavn);
		Scanner filinput = new Scanner(nyfil);

		linje = filinput.nextLine();
		while(!linje.equals("-")){
			System.out.println(linje + " er et fag!");
			linje = filinput.nextLine();
		}
		System.out.println("Leste inn alle fagene!");
		System.out.println("");
		
		while(filinput.hasNextLine()){
		//	linje = filinput.nextLine(); // Fjerner -
			
			System.out.println("---BOLK---"); // Ny bolk
			linje = filinput.nextLine(); // Få faget!
			System.out.println(linje + " er et fag!");

			while(filinput.hasNextLine() && !linje.equals("-")){
				linje = filinput.nextLine(); // Student nr x
				if(!linje.equals("-")){
					System.out.println(linje + " er en student.");
				}
			}
			System.out.println("---SLUTT---");
		
		}

	}
}





