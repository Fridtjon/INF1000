class Hovedprogram {
	
	public static void main(String[] args){
		/*
		Flaske flaske1 = new Flaske(1.5, 1.5, "Cola");
		String flaske1tekst = flaske1.identify();
		System.out.println(flaske1tekst);

		Flaske flaske2 = new Flaske(0.5, 0.5, "Imsdal");
		System.out.println(flaske2.identify());

		flaske1.fyllVeske(5);
		flaske1.drikk(5);
		flaske2.fyllVeske(5);

		Flaske flaske3 = new Flaske(0.5, 0.0, "Fanta");
		if (flaske3.erTom()){
			System.out.println("Flaske 3 er tom.");
		} else {
			System.out.println("Flaske 3 er ikke tom.");
		} */

		String[] stringarr = new String[3];
		//[null][null][null]

		Flaske[] flaskearr = new Flaske[3];
		// [null][null][null]

		flaskearr[0] = new Flaske(1.5, 1.5, "Cola");
		flaskearr[0].drikk(5);
		flaskearr[1] = new Flaske(0.5, 0.5, "Imsdal");
		flaskearr[2] = new Flaske(0.5, 0.0, "Pils");
		

		Flaske tmp = flaskearr[0];
		flaskearr[0] = flaskearr[1];
		flaskearr[1] = tmp;

		/*
		Flaske[] colaflasker = new Flaske[15];
		for(int i = 0; i < colaflasker.length; i ++){
			colaflasker[i] = new Flaske(0.5,0.5, "Cola");
		}
	*/


	}






}











