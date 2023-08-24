import java.util.Iterator;
import java.util.List;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;

public class ReusableComponents2 extends OpenBrowser{
	public void loginfo(String message) {
		System.out.println("INFO:" +message);
	}
	public void login(String username, String password ) {
		try {
			loginfo("login " + "execuation started");
			driver.findElement(ObjectRepository.userName).sendKeys(username);
			driver.findElement(ObjectRepository.passWord).sendKeys(password);
			driver.findElement(ObjectRepository.submit).click();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void clickOnOkFromAlertPopup() {
		try {
			loginfo("clickOnOkFromAlertPopup" + " execuation started");
			Thread.sleep(2000);
			Alert al = driver.switchTo().alert();
			al.accept();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void clickAdmin() {
		try {
			loginfo("clickAdmin" + "execuation started");
			driver.findElement(ObjectRepository.Admin).click();
			
		} catch (Exception e) {
			// TODO: handle exception
		} 
	}
		public void enterUsername(String username) {
			try {
				loginfo("enterUsername" +"execuation started");
				driver.findElement(ObjectRepository.UserName).sendKeys(username);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		public void enterUserrole() {
			try {
				loginfo("enterUserrole" +"execuation started");
				 List<WebElement> list  =	driver.findElements(ObjectRepository.UserRole);
				Iterator<WebElement> iterator = list.iterator();
				 while (iterator.hasNext()) {
					WebElement webElement = (WebElement) iterator.next();
					System.out.println(webElement.getText());
					if(webElement.getText().equals("Admin")) 
						webElement.click();
				
			}} catch (Exception e) {
				// TODO: handle exception
			}}
		
		public void enterEmployeename( String name) {
			try {
				loginfo("enterEmployeename" + "execuation started");
				driver.findElement(ObjectRepository.EmployeeName).sendKeys(name);
				
			} catch (Exception e) {
				// TODO: handle exception
			}}
		public void checkStatus() {
			try {
				loginfo("checkStatus" + "execuation started");
				 List<WebElement> listt  =	driver.findElements(ObjectRepository.UserRole);
					Iterator<WebElement> iterator2 = listt.iterator();
					 while (iterator2.hasNext()) {
						WebElement webElement = (WebElement) iterator2.next();
						System.out.println(webElement.getText());
						if(webElement.getText().equals("Enabled")) 
							webElement.click();
				
			}} catch (Exception e) {
				// TODO: handle exception
			}}
		
		public void enterSearch() {
			try {
				loginfo("enterSearch" + "execuation started");
				driver.findElement(ObjectRepository.Search).click();
			} catch (Exception e) {
				// TODO: handle exception
			}}
		
	public void clickJob() {
		try {
			loginfo("clickJob" + "execuation started");
			driver.findElement(ObjectRepository.Job).click();
		} catch (Exception e) {
			// TODO: handle exception
		}}
	public void clickJobTitle() {
		try {
			loginfo("clickJobTtile" + "execuation started");
			driver.findElement(ObjectRepository.Job_Title).click();
		} catch (Exception e) {
			// TODO: handle exception
		}}
		
		
		public void clickAdd() {
			try {
				loginfo("clickAdd" + "execuation started");
				driver.findElement(ObjectRepository.Add).click();
			} catch (Exception e) {
				// TODO: handle exception
			}}
		
			public void enterJobTitlename(String name) {
				try {
					loginfo("enterJobTitlename" + "execuation started");
					driver.findElement(ObjectRepository.Jobbtitle).sendKeys(name);
				} catch (Exception e) {
					// TODO: handle exception
				}}
		
			public void enterJobDecription(String name) {
				try {
					loginfo("enterJobDecription" + "execuation started");
					driver.findElement(ObjectRepository.JobDescription).sendKeys(name);
				} catch (Exception e) {
					// TODO: handle exception
				}}
		
			public void enterNote(String name) {
				try {
					loginfo("enterNote" + "execuation started");
					driver.findElement(ObjectRepository.Note).sendKeys(name);
				} catch (Exception e) {
					// TODO: handle exception
				}}
		
			public void clickCancel() {
				try {
					loginfo("enterNote" + "execuation started");
					driver.findElement(ObjectRepository.Note).click();
				} catch (Exception e) {
					// TODO: handle exception
				}}
			
			public void clickJob1() {
				try {
					loginfo("clickJob1" + "execuation started");
					driver.findElement(ObjectRepository.Job1).click();
				} catch (Exception e) {
					// TODO: handle exception
				}}
		
		
			public void clickPayGrades() {
				try {
					loginfo("clickPayGrades" + "execuation started");
					driver.findElement(ObjectRepository.PayGrades).click();
				} catch (Exception e) {
					// TODO: handle exception
				}}
		
			public void clickAdd1() {
				try {
					loginfo("clickAdd1" + "execuation started");
					driver.findElement(ObjectRepository.Add1).click();
				} catch (Exception e) {
					// TODO: handle exception
				}}
		
			public void enterPayGradesName(String name) {
				try {
					loginfo("enterPayGradesName" + "execuation started");
					driver.findElement(ObjectRepository.Name).sendKeys(name);
				} catch (Exception e) {
					// TODO: handle exception
				}}
		
			public void clickSave() {
				try {
					loginfo("clickSave()" + "execuation started");
					driver.findElement(ObjectRepository.Save).click();
				} catch (Exception e) {
					// TODO: handle exception
				}}
		
		
			public void clickJob2() {
				try {
					loginfo("clickJob2" + "execuation started");
					driver.findElement(ObjectRepository.Job2).click();
				} catch (Exception e) {
					// TODO: handle exception
				}}
		
			public void clickEmploymentStatus() {
				try {
					loginfo("clickEmploymentStatus" + "execuation started");
					driver.findElement(ObjectRepository.EmploymentStatus).click();
				} catch (Exception e) {
					// TODO: handle exception
				}}
		
		
			public void clickAdd2() {
				try {
					loginfo("clickAdd2" + "execuation started");
					driver.findElement(ObjectRepository.Add2).click();
				} catch (Exception e) {
					// TODO: handle exception
				}}
		
			public void enterEmploymentStatusName2(String name) {
				try {
					loginfo("enterEmploymentStatusName2" + "execuation started");
					driver.findElement(ObjectRepository.Name2).sendKeys(name);
				} catch (Exception e) {
					// TODO: handle exception
				}}
		
		
			public void clickSave2() {
				try {
					loginfo("clickSave2()" + "execuation started");
					driver.findElement(ObjectRepository.save2).click();
				} catch (Exception e) {
					// TODO: handle exception
				}}
		
		
			public void clickJob3() {
				try {
					loginfo("clickJob3" + "execuation started");
					driver.findElement(ObjectRepository.job3).click();
				} catch (Exception e) {
					// TODO: handle exception
				}}
			public void clickJobcategories() {
				try {
					loginfo(" clickJobcategories" + "execuation started");
					driver.findElement(ObjectRepository.JobCategories).click();
				} catch (Exception e) {
					// TODO: handle exception
				}}
		
			public void clickAdd3() {
				try {
					loginfo("clickAdd3" + "execuation started");
					driver.findElement(ObjectRepository.Add3).click();
				} catch (Exception e) {
					// TODO: handle exception
				}}
		
			public void enterobcategoriesName3(String name) {
				try {
					loginfo("enterobcategoriesName3" + "execuation started");
					driver.findElement(ObjectRepository.Name3).sendKeys(name);
				} catch (Exception e) {
					// TODO: handle exception
				}}
		
		
			public void clickSave3() {
				try {
					loginfo("clickSave3()" + "execuation started");
					driver.findElement(ObjectRepository.save3).click();
				} catch (Exception e) {
					// TODO: handle exception
				}}
		
		
			public void clickJob4() {
				try {
					loginfo("clickJob4" + "execuation started");
					driver.findElement(ObjectRepository.Job4).click();
				} catch (Exception e) {
					// TODO: handle exception
				}}
		
			public void clickWorkShift() {
				try {
					loginfo("clickWorkShift()" + "execuation started");
					driver.findElement(ObjectRepository.WorkShift).click();
				} catch (Exception e) {
					// TODO: handle exception
				}}
		
			public void clickAdd4() {
				try {
					loginfo("clickAdd4" + "execuation started");
					driver.findElement(ObjectRepository.Add4).click();
				} catch (Exception e) {
					// TODO: handle exception
				}}
		
			public void enterShiftName(String name) {
				try {
					loginfo("enterShiftName" + "execuation started");
					driver.findElement(ObjectRepository.ShiftName).sendKeys(name);
				} catch (Exception e) {
					// TODO: handle exception
				}}}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


