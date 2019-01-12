package com.spring.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	@Autowired
	private Tire tire;
	
	public void drive() {
		System.out.println("Car is driving! with tires of type: " + tire.getType());
		
	}

}
