class Flaske {
	
	private double kapasitet; //kapasitet i antall liter
	private double veskeiflasken; //Hvor mye veske som i flasken i liter
	private String type;

	private int id;
	static int teller = 0;

	public Flaske(double kapasitet, double veskeiflasken, String type){
		this.kapasitet = kapasitet;
		if( veskeiflasken > kapasitet){
			System.out.println("Du kan ikke sette inn mer veske enn kapasiteten.");
			veskeiflasken = kapasitet;
		} else{
			this.veskeiflasken = veskeiflasken;
		}

		this.type = type;

		id = teller;
		teller ++;
	}

	public String identify(){
		return "Flaske med id: " + id 
				+ " har kapasitet: " + kapasitet + " og er av typen " + type;
	}

	public void fyllVeske(int dl){
		if (veskeiflasken + (dl / 10.0) <= kapasitet ){
			veskeiflasken += (dl / 10.0);
			System.out.println("Du fylte flasken med " + dl + " dl.");
		} else {
			System.out.println("Du kan ikke fylle saa mye i flasken.");
		}
	}

	public void drikk(int dl){
		if (veskeiflasken - (dl / 10.0) < 0){
			System.out.println("Du kan ikke drikke saa mye fra flasken.");
		} else {
			veskeiflasken -= (dl / 10.0);
			System.out.println("Du drakk " + dl + " dl.");
		}
	}

	public boolean erTom(){
		return veskeiflasken <= 0;
	}
}










