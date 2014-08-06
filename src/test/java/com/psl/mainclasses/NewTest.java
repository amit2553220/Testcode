package com.psl.mainclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test (groups="smokeTest")
  public void TestMethod1() {
  
	  	System.out.println("in test method1");
  }
  @Test (groups="RegressionTest")
  public void TestMethod2() {
  
	  	System.out.println("in test method2");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
  }

  @BeforeClass
  public void beforeClass() {
	  
  }

  @AfterClass
  public void afterClass() {
	  
  }

  @BeforeTest
  public void beforeTest() {
	  
  }

  @AfterTest
  public void afterTest() {
	  
  }
  

  @BeforeSuite
  public void beforeSuite() {
	  
  }

  @AfterSuite
  public void afterSuite() {
	  
  }

}
