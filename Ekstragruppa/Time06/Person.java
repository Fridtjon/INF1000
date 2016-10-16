class Person{
	
	private String navn;
	private int alder;

	public Person(String navn){
		this.navn = navn;
	}

	public void settAlder(int alder){
		this.alder = alder;
	}

	public String toString(){
		return navn;
	}

	public void haBursdag(){
		alder ++;
	}











}