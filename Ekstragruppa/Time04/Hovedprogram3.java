class Hovedprogram3{
	public static void main(String[] args) {
		
		Enkeltobjekt[] array = new Enkeltobjekt[100];

		for(int i = 0; i < array.length; i++){
			array[i] = new Enkeltobjekt();
			array[i].setVerdier(i, "Loekke");
		}

		array[50] = null;
		
		for(int i = 0; i < array.length; i++){
			if(array[i] == null){
				System.out.println("Objektet paa plass " + i + " finnes ikke.");
			} else{
				array[i].skrivUt();
			}
		}

	}
}