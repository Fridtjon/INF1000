/* Lag et program med metoder som:
	- Tar inn en int-array som parameter og printer arrayen
	- Tar inn en int-array som parameter og finner summen av tallene
	- Tar inn en int-array som parameter og finner høyeste og laveste tall
	- Tar inn en int-array som parameter og finner gjennomsnittet  
*/
public class ArrayMetoder{

	public static void main(String[] args) {
		
		int[] array = new int[14];

		int i = 0;
		while(i < array.length){
			array[i] = (i * 2) + 1;
			i ++;
		}

		printArray(array);
		System.out.println("Summen er " + summerArray(array));
		finnHoyestOgLavest(array);
		gjennomsnitt(array);
	}

	public static int[] finnHoyestOgLavest(int[] tallArray){

		int hoyeste = tallArray[0];
		int laveste = tallArray[0];
		int i = 1;

		while(i < tallArray.length){
			if(tallArray[i] > hoyeste){
				hoyeste = tallArray[i];
			}
			if(tallArray[i] < laveste){
				laveste = tallArray[i];
			}

			i++;
		}

		int[] hoyestOgLavest = new int[2];
		hoyestOgLavest[0] = hoyeste;
		hoyestOgLavest[1] = laveste;
		System.out.println("Hoyeste tall: " + hoyeste +", laveste tall: " +laveste);
		return hoyestOgLavest;

	}

	public static void printArray(int[] tallArray){

		int i = 0;
		while(i < tallArray.length){
			System.out.print(tallArray[i] + " ");
			i ++;
		}
		System.out.println("");

	}

	public static int summerArray(int[] tallArray){
		int sum = 0;
		int i = 0;
		while(i < tallArray.length){
			sum += tallArray[i];
			// sum = sum + tallArray[i];
			i ++;
		}

	//	System.out.println("Summen er: " + sum);

		return sum;
	}

	public static int gjennomsnitt(int[] tallArray){
		int sum = summerArray(tallArray);
		int snitt = sum / tallArray.length;

		System.out.println("Snittet er: " + snitt);
		
		return snitt;

	}
















}