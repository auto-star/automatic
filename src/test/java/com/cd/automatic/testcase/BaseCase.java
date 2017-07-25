package com.cd.automatic.testcase;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.cd.automatic.factory.ScriptFactory;
import com.cd.automatic.script.BaseScript;

public class BaseCase {
	protected WebDriver driver;
	protected ScriptFactory scriptFactory;
	@BeforeClass
	public void setUpBeforeClass() throws Exception {
		BaseScript baseScript=new BaseScript();
		baseScript.init();
		scriptFactory=new ScriptFactory();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}

	

}
