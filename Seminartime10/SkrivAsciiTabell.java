class SkrivAsciiTabell{
	public static void main(String[] args) {

		for(int i = 0; i < 255; i++){
			System.out.print("ASCII position: " + i + "\t\t");
			System.out.println((char)i);
		}
	
	}
}