import java.io.File;
import java.util.Scanner;

class Multiplisering{
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(new File("Tall.txt"));

		int sum = 1;

		while(s.hasNextLine()){
			int tall = Integer.parseInt(s.nextLine());
			sum = sum * tall;
		}

		System.out.println("Tallene multiplisert er: " + sum);
	}

}