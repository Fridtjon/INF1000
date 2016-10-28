import java.util.HashMap;
class TestHashMap{
	
	public HashMap<String, String> hashmap = new HashMap<String,String>();

	public void kjoer(){
		hashmap.put("Noekkel", "Objekt");

		hashmap.get("Noekkel");

		for(String noekkel : hashmap.keySet()){
			System.out.println(noekkel + " " + hashmap.get(noekkel));
		}



	}



}