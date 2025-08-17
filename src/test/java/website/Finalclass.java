package website;

import java.io.IOException;

import org.testng.annotations.Test;

public class Finalclass {
	
	@Test
	public void finalMethod() throws InterruptedException, IOException
	{
		Baseclass base=new Baseclass();
		base.basemethod();
		
		headerpart nav = new headerpart(base.driver);
//		home homepage = new home(base.driver);
//		Configure configure = new Configure(base.driver);
//		Smarttech smart = new Smarttech(base.driver);
//		Uvracing f99 = new Uvracing(base.driver);
//		Testride testride = new Testride(base.driver);
//		Limitedpage Limited = new Limitedpage(base.driver);
//		Legal legal= new Legal(base.driver);
//		Press press = new Press(base.driver);
//		Contact contact = new Contact(base.driver);
//		Faqpage faq = new Faqpage(base.driver);
//		Careers career = new Careers(base.driver);
//		Squadron squadron = new Squadron(base.driver);
//		Locations location = new Locations(base.driver);
//		Enquiry enquiry = new Enquiry(base.driver);
	//about about = new about(base.driver);
		
//		nav.navigation();
//		homepage.homepage();           /////////////// working
	//	configure.configureMethod();      
//		smart.smartmethod();               /////////// working 
//		f99.F99Method();                   //////////  working
//		testride.TestRideMethod();         //////////  working
//		Limited.LimitedMethod();           /////////   working
//		legal.LegalMethod();                
//	    press.PressMethod();              ////////// working
//	    retail.RetailPageMethod();
//	    contact.ContactMethod();          //////////  working (handle other browsers)
//	    faq.FAQMethod();                  ///////////  working (handle popups and alerts)
//	    career.Careers_Method();          ///////////  working
//		squadron.SquadronMethod();        //////////   working
//		location.LocationMethod();        //////////   working
//		enquiry.EnquiryMethod();          //////////   working
//		about.aboutPageMethod();          //////////   working

}
}
