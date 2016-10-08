import java.util.ArrayList;

class ArrayListeTrening {
	
	public static void main(String[] args) {
		
		ArrayList<String> arrL = new ArrayList<>();
		arrL.add("Hei");
		arrL.add("På");
		arrL.add("Deg");
		arrL.add("!");

		for(int i = 0; i < arrL.size(); i ++){
			System.out.println("Element på plass " + i +
				" er " + arrL.get(i));
		}

		System.out.println(arrL.get(arrL.size() - 1));


	}

}