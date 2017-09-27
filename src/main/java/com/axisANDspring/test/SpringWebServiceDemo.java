package com.axisANDspring.test;

import org.springframework.stereotype.Service;

@Service("springWebService")
public class SpringWebServiceDemo {

	public String springHello(String name) {

		return "hello " + name;
	}
}
