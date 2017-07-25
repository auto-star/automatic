package com.cd.automatic.testcase;

import org.testng.annotations.Test;

import com.cd.automatic.script.DownloadScript;

public class TestDownLoad  extends BaseCase{

	@Test
	public void getUrl() {
		DownloadScript downloadScript=scriptFactory.createScript(DownloadScript.class);
		downloadScript.getCurrentUrl();
	}
}
