package excutablefiles;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utils.BaseClass;

public class Excutable extends BaseClass {

	@Test
	public void init () {
		initialize();
	}

	@AfterSuite
	public void close() {
		tearDown();
	}

}




