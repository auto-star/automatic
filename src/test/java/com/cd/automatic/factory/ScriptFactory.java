package com.cd.automatic.factory;


public class ScriptFactory{
	public static <T> T createScript(Class<T> clazz) {
		return (T) AopModule.getInjector().getInstance(clazz);
	}

}
