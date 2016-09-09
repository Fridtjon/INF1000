import java.util.Scanner;

public class Oppgave1{

	public static void metode(String navn){
		System.out.println("Hei " + navn);
	}

	public static void metodeUtenParametere(){

	}

	public static void tall(int nummer, int nummer2){
		int sum = nummer + nummer2;
		//Alternativ 1:
		//System.out.println("Tallet er: " + (nummer + nummer2));
		//Alternativ 2:
		System.out.println("Tallet er: " + sum);
	}

	public static void main(String[] args){
		//Linje 1 i main
		Scanner input = new Scanner(System.in);
		//Leser inn tekst
		metodeUtenParametere();
		tall(5,4);
		tall(10,5);
		String tekst = input.nextLine();

		//Leser inn tall
		String fraTerminal = input.nextLine();
		int tallInput = Integer.parseInt(fraTerminal);
	
		/*String tekst = "Fridtjof";
		metode("Vilde");
		metode(tekst); */

		

		

		//Siste linje i main
	}

}