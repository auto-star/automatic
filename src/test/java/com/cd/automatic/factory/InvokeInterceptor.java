package com.cd.automatic.factory;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class InvokeInterceptor implements MethodInterceptor  {
	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		// TODO Auto-generated method stub
		Object object = null;
		try
		{
			object=methodInvocation.proceed();
		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage(),e.getCause());
		}
		return object;
	}

}
