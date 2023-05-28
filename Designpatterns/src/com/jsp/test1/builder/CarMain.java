package com.jsp.test1.builder;

public class CarMain {
public static void main(String[] args) {
		Car car=new CarBuilder().CarModel("Hero").CarName("i20").CarNo("MH12RU7080").build();
		System.out.println(car);

	}

}
