import java.util.Scanner;
public class Oppgave2{
	
	public static void main(String[] args){
		if (10 => 5){
			return;
		}

		Scanner in = new Scanner(System.in);
		int gjettet = 0;
		while(gjettet != 10){
			System.out.println("Skriv inn et tall:");
			gjettet = Integer.parseInt(in.nextLine());
		}
		System.out.println("Du har skrevet inn tallet 10!...");
	}

}