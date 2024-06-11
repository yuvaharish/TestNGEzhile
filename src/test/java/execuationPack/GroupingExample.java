package execuationPack;

import org.testng.annotations.Test;

public class GroupingExample {
	
	@Test(groups = {"Smoke"})
	public void apple() {
		System.out.println("Apple 1");
	}
	
	@Test(groups = {"Sanity"})
	public void moto() {
		System.out.println("moto 1");
	}
	
	@Test(groups = {"Smoke"})
	public void apple2() {
		System.out.println("Apple 2");
	}
	@Test(groups = {"Sanity"})
	public void moto2() {
		System.out.println("moto 2");
	}

}
