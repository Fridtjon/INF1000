import java.util.Scanner;
import java.io.File;

class SkrivHistorier{
	public static void main(String[] args) throws Exception{
		String filnavn = "Historie.txt";
		int antLinjer = tellLinjer(filnavn);
		System.out.println("Antall linjer er: " + antLinjer);
		String[] innlestFil = lagreIArray(filnavn, antLinjer);

		skrivUtFil(innlestFil, 0);
		System.out.println("");
		skrivUtFil(innlestFil, 1);
		System.out.println("");
		System.out.println("");
		skrivUtPeerGynt(innlestFil);
	}

	//Skriver ut tekstene, 0 for peer gynt, 1 for den andre.
	public static void skrivUtPeerGynt(String[] innlestFil){
		for(int i = 0; i < innlestFil.length; i ++){
			if(innlestFil[i].contains("Peer Gynt")){
				System.out.println(innlestFil[i]);
			}
		}
	}

	public static void skrivUtFil(String[] innlestFil, int tekst){
		for(int i = tekst; i < innlestFil.length; i += 2){
			System.out.println(innlestFil[i]);
		}
	}



	public static String[] lagreIArray(String filnavn, int antallLinjer) throws Exception{
		String[] fila = new String[antallLinjer];
		Scanner lesFil2 = new Scanner(new File(filnavn));
		/*
		for(int i = 0; lesFil2.hasNextLine(); i++){
			fila[i] = lesFil2.nextLine();
		} */
		int index = 0;
		while(lesFil2.hasNextLine()){
			fila[index] = lesFil2.nextLine();
			//System.out.println(fila[index]);
			index ++;
		}
		return fila;

	}

	//Teller antall linjer i en fil, og returnerer dette tallet. 
	public static int tellLinjer(String filnavn) throws Exception{
		/*
		File f = new File(filnavn);
		Scanner lesFil = new Scanner(f);
		*/
		Scanner lesFil = new Scanner(new File(filnavn));
		int antLinjer = 0;
		while(lesFil.hasNextLine()){
			lesFil.nextLine();
			antLinjer ++;
		}
		return antLinjer;
	}

}











