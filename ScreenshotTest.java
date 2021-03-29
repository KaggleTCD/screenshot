package TestNGListenerconcept;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class ScreenshotTest extends Base{
	
	@BeforeMethod
	public void setUp() {
		initialization();
	}
	
	@Test
	public void takeScreenShot() {
		Assert.assertEquals(false, true);
		
	}
	@Test
	public void takeScreenShot1() {
		Assert.assertEquals(false, true);
		
	}
	@Test
	public void takeScreenShot2() {
		Assert.assertEquals(false, true);
		
	}
	@AfterMethod
	public void tearDown() {
		webDriver.quit();
	}

}
