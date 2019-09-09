package com.dev.spring.core.beans;

public class V8 implements Engine {

	@Override
	public void start() {
		System.out.println("V8 started");
	}

	@Override
	public void stop() {
		System.out.println("V8 stopped");
	}

}