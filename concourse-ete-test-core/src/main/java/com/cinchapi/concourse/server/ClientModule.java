package com.cinchapi.concourse.server;

import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;

public class ClientReflectorModule extends AbstractModule {
	protected void configure() {
		bindInterceptor(Matchers.any(), Matchers.annotatedWith(ClientMethod.class), new ClientMethodReflector());
	}
}