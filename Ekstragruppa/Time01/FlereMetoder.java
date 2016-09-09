public class FlereMetoder{
	public static void main(String[] args){
		metode1();
		metode2();
		metode3();

	}

	public static void metode1(){
		System.out.println("Vi er naa i metode 1");
		metode2();
	}

	public static void metode2(){
		System.out.println("Vi er naa i metode 2");
	}


	public static void metode3(){
		System.out.println("Vi er naa i metode 3");
	}
}