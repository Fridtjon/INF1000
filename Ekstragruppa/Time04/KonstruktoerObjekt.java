class KonstruktoerObjekt{
	private int tall;
	private String verdi;
	private int kvadrat;

	public KonstruktoerObjekt(int nummer, String setning){
		tall = nummer;
		verdi = setning;
		beregnKvadrat();
	}

	private void beregnKvadrat(){
		kvadrat = (tall * tall);
	}

	public void skrivUt(){
		System.out.println("Tallet: " + tall);
		System.out.println("Verdi: " + verdi);
		System.out.println(" ");
	}



}