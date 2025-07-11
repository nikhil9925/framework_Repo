package pac1;

import org.testng.annotations.Test;

public class ContactTest {
 
	@Test
	public void createContactTest() {
		
		String URL=System.getProperty("url");
		String BROWSER=System.getProperty("browser");
		String UN=System.getProperty("username");
		String PW=System.getProperty("password");
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(UN);
		System.out.println(PW);
		System.out.println("Execute createContactTest");
	}
	
	@Test
	public void modifyContactTest() {
		System.out.println("Execute modifyContactTest");
	}
	
	@Test
	public void deleteContactTest() {
		System.out.println("Execute deleteContactTest");
	}
}
