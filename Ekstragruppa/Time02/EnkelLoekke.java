import java.util.Scanner;

public class EnkelLoekke{
	
	public static void main(String[] args){

		//tidligere kode
		int tall = 0;
		while(tall != 3){

			/* hva dere vil */
			System.out.println("Tallet er: " + tall);
			//tall = tall + 1;
			tall += 1;
			//tall ++;
		}

		String brukerInput = "";
		Scanner fridtjof = new Scanner(System.in);
		//String brukerInput2; IKKE GJOR DETTE

		while(!brukerInput.equals("Quit")){
			brukerInput = fridtjof.nextLine();
		}
	}


















}