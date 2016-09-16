public class ArraysOgLoekker{
	
	public static void main(String[] args){

		int[] tall = new int[3];
		
		tall[2] = 7;
		tall[0] = 4;
		tall[1] = 5;
		  
	//	System.out.println("" + tall[0] + " " + tall[1] 
	//						+ " " + tall[2]);
		/*
		int teller = 0;
		while(teller < tall.length){
			System.out.println(tall[teller]);

			teller += 1;
		} */


		int[] mangeTall = {0, 2, 3, 42, 5, 42, 1, 42};
		int sumAv42 = 0;
		int indeks = 0;
		
		while(indeks < mangeTall.length){
			/*
			System.out.println("Indeks = " + indeks);
			System.out.println("Mangetall pa plassen = " 
								+ mangeTall[indeks]); */
			if(mangeTall[indeks] == 42){
				sumAv42 += 1;
			}

			indeks ++;
		}
		System.out.println("Tallet 42 forekommer " + sumAv42 
							+ " ganger.");


	}
}








