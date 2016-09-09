
/* Oppgave lage et program med en metode som tar imot et int-array,
 og printer ut alle elementene i arrayet */


 public class ArrayPrinter{

 	public static void main(String[] args){

 		int[] array = {42,10,3,4};
 		array = new int[] {1,2,3,4,5};
 		
 		skrivUt(array);

 	}

 	// Skriver ut alle verdiene i en int-array
 	public static void skrivUt(int[] array){

 		int i = 0;

 		//Loekke som gaar gjennom alle plassene i arrayen, 
 		//og skriver de ut.
 		while(i < array.length){
 			System.out.println(array[i]);
 			i++;
 		}		
 	}

 }