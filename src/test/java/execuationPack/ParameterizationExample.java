package execuationPack;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExample {

	@Parameters("broserName")
	@Test
	public void browser(@Optional("Edge") String name) {

		switch (name) {
		case "Chrome":
			System.out.println(name+"Chrome Browser opened");
			break;
		case "Firefox":
			System.out.println(name+"FireFox Browser opened");
			break;
		case "Edge":
			System.out.println(name+"Edge Browser opened");
			break;

		case "Safari":
			System.out.println(name+"safari Browser opened");
			break;

		default:
			System.out.println(name+"No Browser Launched");
			break;
		}
	}

}
