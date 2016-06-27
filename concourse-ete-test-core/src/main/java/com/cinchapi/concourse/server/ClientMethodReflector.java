package com.cinchapi.concourse.server;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class ClientMethodReflector implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("RECEIVED: " + invocation.getMethod().getName());
		return invocation.proceed();
	}

}
