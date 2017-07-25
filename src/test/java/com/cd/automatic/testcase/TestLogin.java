package com.cd.automatic.testcase;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.cd.automatic.script.Login;

public class TestLogin extends BaseCase{
	@Test
	public void login() {
		
		Login login=scriptFactory.createScript(Login.class);
		login.test();
		String title=login.login();
		Assert.assertEquals(title, "1","1");
	}

}
