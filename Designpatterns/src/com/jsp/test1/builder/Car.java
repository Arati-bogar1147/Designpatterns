package com.jsp.test1.builder;

public class Car {
	String Carmodel;
	String CarName;
	String average;
	String CarNo;
	String milage;
	public Car(String carmodel,String carName, String average,String carNo,String milage) {
		super();
		Carmodel=carmodel;
		CarName=carName;
		this.average=average;
		CarNo=carNo;
		this.milage=milage;
	}
	@Override
	public String toString() {
		return "Car[Carmodel="+Carmodel+",CarName="+CarName +", average=" + average +", CarNo=" +CarNo +", milage=" + milage +")";
	}
	

}
