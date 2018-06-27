package com.BingTranslationAuto.BingAutomation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class AppTest {
	
	App appObject = new App();	
	
 @Test (priority = 0)
 public void InputDrop() {
	 appObject.inputSelection();
 }

 @Test (priority = 1)
 public void OutputDrop() {
	 appObject.outputSelection();
 }
 
 @Test (priority = 2)
 public void sendText()
 {
	 appObject.sendtext();
 }
  
 @Test (priority = 3)
 public void checkTranslation() {
	Assert.assertFalse(appObject.translation());
 }
	
  @BeforeClass
  public void beforeClass() {
	  appObject.launchBrowser();
  }

  @AfterClass
  public void afterClass() {
	  appObject.closeBrowser();
  }


  
}
