package com.drillbit.testCases;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.drillbit.pageObjects.*;

public class TC_ChangePwd_002 extends BaseClass
{
 @Test (enabled = true)
 public void changepwd() throws InterruptedException {
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.manage().window().maximize();
	 LoginPage lp = new LoginPage(driver);
	 lp.setUserName(username);
	 lp.setPassword(password);
	 lp.clickSubmit();
	 
	 Thread.sleep(3000);
	 
	 Changepwd cp = new Changepwd(driver);
	 cp.dropDown();
	 Thread.sleep(3000);
	 cp.changepwd();
	 
	 cp.oldpassword("Casio@27");
	 
	 cp.newPassword("Classmate@27");
	 
	 cp.confirmPassword("Classmate@27");
	 
	 cp.chanpd();
 }

}
//WebDriverWait wait = new WebDriverWait(driver, 10); // Maximum wait time of 10 seconds

//WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("myElementId")));