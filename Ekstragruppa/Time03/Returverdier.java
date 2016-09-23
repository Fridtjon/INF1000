class Returverdier{
	
	public static void main(String[] args){
		int tall = 10;
		// metode1(4,5);
		
		// (4 + 5) + (5 + 6) 
		int returverdi = returnerSum(4,5);
		int returverdi2 = returnerSum(5,6);

		int fasit = returnerSum(returverdi, returverdi2);
		System.out.println("Fasit: " + fasit);
		returintarray();
	}
//	public static <returverdi> <metodenavn>(<parametere>){}
	public static int[] returintarray(){
		int[] array = {1,2,3,4};
		return array;
	}

	public static int returnerSum(int tall1, int tall2){
		int sum = tall1 + tall2;
		System.out.println("Hei alle sammen! :D ");
		
		
		return sum;
		
	}

/*	public static void metode1(int parameter1, int parameter2){
		int sum = parameter1 + parameter2;
		System.out.println("Summen er: " + sum);
	} */



}