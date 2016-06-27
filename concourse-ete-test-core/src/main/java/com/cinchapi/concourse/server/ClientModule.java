package com.cinchapi.concourse.server;

import com.cinchapi.concourse.Concourse;
import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;

public class ClientModule extends AbstractModule {
	protected void configure() {
		bindInterceptor(Matchers.subclassesOf(Concourse.class), Matchers.annotatedWith(ClientMethod.class), new ClientMethodReflector());
	}
}