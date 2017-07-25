package com.cd.automatic.factory;


import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.matcher.Matchers;

public class AopModule extends AbstractModule  {
	public static final Injector injector=Guice.createInjector(new AopModule());
	public static Injector getInjector()
	{
		return injector;
	}
	@Override
	protected void configure() {
		// TODO Auto-generated method stub
		bindInterceptor(Matchers.any(),Matchers.annotatedWith(MInterceptor.class),new InvokeInterceptor());
	}

}
