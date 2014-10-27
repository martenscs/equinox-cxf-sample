package net.martenscs.cxf.rest;

import net.martenscs.cxf.service.impl.HelloService;

public class HelloRestServiceImpl implements HelloRestService {
	// Just like Spring. Please add Getters/Setters. Blueprint annotations are
	// still work in progress
	private HelloService helloService;

	public String handleGet(String name) {
		return helloService.sayHello(name);
	}

	/*
	 * Constructor
	 */
	public HelloRestServiceImpl() {
	}

	/*
	 * Getters and Setters
	 */
	public HelloService getHelloService() {
		return helloService;
	}

	public void setHelloService(HelloService helloService) {
		this.helloService = helloService;
	}
}