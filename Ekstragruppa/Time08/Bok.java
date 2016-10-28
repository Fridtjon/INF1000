class Bok{
	
	private String tittel;
	private Person forfatter;

	public Bok(String tittel, Person forfatter){
		this.tittel = tittel;
		this.forfatter = forfatter;
	}

	public String toString(){
		return tittel;
	}

	public Person hentForfatter(){
		return forfatter;
	}
	

}