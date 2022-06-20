package Utilities;

import Pages.AllserviceClickTable;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.TestCase3;

public class PageInitilizer extends BaseClass {
	
	public static HomePage all;
	
	public static AllserviceClickTable ver;
	
	public static TestCase3 rrr;
	
	public static LoginPage DC3;
	
	
	
	
	
	public static void initilize() {
		
		ver = new AllserviceClickTable();
		
		all = new HomePage();
		
		rrr = new TestCase3();
		
	   DC3 = new LoginPage();
		
	}

}
