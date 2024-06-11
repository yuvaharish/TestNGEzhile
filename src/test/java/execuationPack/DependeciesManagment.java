package execuationPack;

import org.testng.annotations.Test;

public class DependeciesManagment {
	
	@Test(enabled = true)
	public void highSchool() {
		System.out.println("High School Failed");
	}
	
	@Test(dependsOnMethods = "highSchool")
	public void higherSecondarySchool() {
		System.out.println("higherSecondarySchool");
	}
	
	@Test(dependsOnMethods = "higherSecondarySchool")
	public void enginnering() {
		System.out.println("enginnering");
	}

}
