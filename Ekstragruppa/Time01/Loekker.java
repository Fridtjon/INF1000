import java.util.Scanner;

public class Loekker{
	/*
	int-array aldere {1001,1002,1003,1004}, int tusen = 1004, int i = 4,
	*/
	public static void main(String[] args){
		int[] aldere = {4,5,6,7};
		int[] nyArray = new int[4];

		Scanner in = new Scanner(System.in);
	//	nyArray[0] = Integer.parseInt(in.nextLine());
	//	nyArray[2] = Integer.parseInt(in.nextLine());
		int tusen = 1000;
		aldere[0] = 0;
		//Så lenge noe er sant, utfør kode.
		int i = 0;

		while(i < 4){
			tusen ++;
			System.out.println("Skriv inn et tall:");
			aldere[i] = Integer.parseInt(in.nextLine());
			System.out.println("I er naa: " + i);
			System.out.println("Aldere er: " + aldere[i]);

			i ++;

		}

		System.out.println("" + (aldere[0]  + aldere[1]));

		//System.out.println("i er naa 10");
	}

}