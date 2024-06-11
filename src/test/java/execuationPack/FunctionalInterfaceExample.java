package execuationPack;

public class FunctionalInterfaceExample {
	
	public static void main(String[] args) {
		Game ga =()-> System.out.println("Ezhile start Cricket");
		ga.start();
		Game.cricket();
	}

}
