package com.cinchapi.concourse.server;

import com.cinchapi.concourse.Concourse;
import com.google.inject.Inject;

public class GuiceClient {
	
	private Concourse client;
	
	@Inject
	public GuiceClient(Concourse client) {
		this.client = client;
	}
	
	public Concourse getClient() {
		return this.client;
	}

}
