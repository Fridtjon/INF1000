
class Enkeltobjekt {

	int tall;
	String setning;


	public void setVerdier(int tallverdi, String setningverdi){
		tall = tallverdi;
		setning = setningverdi;
	}

	public void skrivUt(){
		System.out.println("Tall: " + tall);
		System.out.println("Setning: " + setning);
		System.out.println(" ");
	}

}