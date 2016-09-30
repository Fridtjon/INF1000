class Hovedprogram{
	
	public static void main(String[] args){

		Enkeltobjekt objekt1 = new Enkeltobjekt();

		objekt1.setVerdier(10, "Hei alle sammen!");
		objekt1.skrivUt();

		Enkeltobjekt objekt2 = new Enkeltobjekt();
		objekt2.skrivUt();

		objekt2.setVerdier(20, "Dette er en annen setning.");
		objekt2.skrivUt();
		System.out.println("-------------");
		System.out.println(" ");

		Enkeltobjekt objekt3 = objekt1;
		objekt3.setVerdier(30, "Hva skjer naa?");

		objekt3.skrivUt();
		objekt1.skrivUt();

	}
}













