import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.cucumber.java.After;

public class OrangeHrmCase extends ReusableComponents2 {
	
	OpenBrowser lp;

	@BeforeMethod
	public void browsersetup() {
		lp = new OpenBrowser();
		lp.intialization("FirefoxDriver");
	}
	@Test
	public void loginTestCases() {
		login("Admin", "admin123");
		clickAdmin();
		enterUsername("yuvi");
		enterUserrole();
		enterEmployeename("yuvaraj");
		checkStatus();
		enterSearch();
		clickJob();
		clickJobTitle();
		clickAdd();
		enterJobTitlename("Automated Software test Engineer");
		enterJobDecription("testing the webelements");
		enterNote("seeking for job");
		clickCancel();
		clickJob1();
		clickPayGrades();
		clickAdd1();
		enterPayGradesName("yuvaraj");
		clickSave();
		 clickJob2();
		 clickEmploymentStatus();
		 clickAdd2();
		 enterEmploymentStatusName2("nirmal");
		 clickSave2();
		 clickJob3();
		 clickJobcategories();
		 clickAdd3();
		 enterobcategoriesName3("yuvaraja");
		 clickSave3();
		 clickJob4();
		 clickWorkShift();
		 clickAdd4();
		 enterShiftName("YUVARAJ");
	}
		 @AfterMethod
			public void closebrowser() {
				lp.teardown();
			}
	
		
	}


