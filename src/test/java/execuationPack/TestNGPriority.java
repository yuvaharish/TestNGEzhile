package execuationPack;

import org.testng.annotations.Test;

public class TestNGPriority {

	//ignore
	@Test(priority = 4,enabled = false)
	public void music() {
		System.out.println("music");
	}

	@Test(priority = 0)
	public void startTheCar() {
		System.out.println("startTheCar");
	}
	
	@Test(priority = 1)
	public void firstGear() {
		System.out.println("firstGear");
	}
	
	@Test(priority = 2)
	public void secondGear() {
		System.out.println("secondGear");
	}

	@Test(priority = 3)
	public void thirdGear() {
		System.out.println("thirdGear");
	}

	@Test(groups = {"Smoke"})
	public void apple() {
		System.out.println("Apple Test");
	}
	
	@Test(groups = {"Sanity"})
	public void moto() {
		System.out.println("moto Test");
	}
}
