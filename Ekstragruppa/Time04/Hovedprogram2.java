class Hovedprogram2{
	
	public static void main(String[] args) {
		
		KonstruktoerObjekt objekt1 = new KonstruktoerObjekt(10,"Hei.");
		//objekt1.skrivUt();

		KonstruktoerObjekt[] objektarray;
		objektarray = new KonstruktoerObjekt[4];

		objektarray[0] = objekt1;

		objekt1.skrivUt();
		System.out.println("--");
		objektarray[0].skrivUt();
		System.out.println("--");
	
		//		i = 0; 
		for(int i = 1; i < objektarray.length; i++){
			objektarray[i] = objekt1;
		}
		//Motsatt-vei-loekke
		for(int i = objektarray.length -1; i >= 0; i--){

		}

		System.out.println("Jeg bryr meg ikke om nullpointerexceptions!!!");
	}
}










