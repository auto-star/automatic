package com.cd.automatic.util;

import java.io.IOException;

public class AutoItScript {
	private static String autoItExecutablePath;
	private static String autoItUploadScriptPath;

//	private static void checkExecutablePath() {
//		String autoItPath = System.getProperty("user.dir") + File.separator + ConfigurationManager.THIRDPARTY_AUTOIT3_EXE;
//		File autoItExecutable = new File(autoItPath);
//		if (!(autoItExecutable.isFile())) {
//			throw new RuntimeException(String.format("Check autoit executable failed, cannot find file: %s", new Object[]{autoItPath}));
//		}
//
//		autoItExecutablePath = autoItPath;
//	}
	
//	private static void checkUploadScriptPath() {
//		String path = System.getProperty("user.dir") + File.separator + ConfigurationManager.THIRDPARTY_AUTOIT3_SCRIPT_UPLOADFILE;
//		File temp = new File(path);
//		if (!(temp.isFile())) {
//			throw new RuntimeException(String.format("Check upload script failed, cannot find file: %s", new Object[]{path}));
//		}
//
//		autoItUploadScriptPath = path;
//	}
	public static void main(String[] args) {
		AutoItScript auto=new AutoItScript();
		auto.waitToUploadFile("d:\\download.exe", "d:\\download.au3","http://tv.cctv.com/2017/06/04/VIDEJiwP7s6uQIomgcsnlIU4170604.shtml", "《新闻联播》_20170604_1900");
	}
	public void waitToUploadFile(String exePath,String au3Path,String url,String fileName) {
		try {
			String[] scriptcmd = {exePath,url,fileName};
			Runtime.getRuntime().exec(scriptcmd);
			Thread.sleep(500L);
		} catch (IOException e1) {
		} catch (InterruptedException e) {
		}
	}

//	static {
//		checkExecutablePath();
//		checkUploadScriptPath();
//	}
}
