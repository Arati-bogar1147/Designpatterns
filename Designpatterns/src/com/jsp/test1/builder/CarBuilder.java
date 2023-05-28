package com.jsp.test1.builder;

public class CarBuilder {
	String CarModel;
	String CarName;
	String average;
	String CarNo;
	String milage;
	public CarBuilder CarModel(String CarModel)
	{
		this.CarModel=CarModel;
		return this;
	}
	
	public CarBuilder CarName(String CarName)
	{
		this.CarName=CarName;
		return this;
	}
	
	public CarBuilder average(String average)
	{
		this.average=average;
		return this;
	}
	
	public CarBuilder CarNo(String CarNo)
	{
		this.CarNo=CarNo;
		return this;
	}
	
	public CarBuilder milage(String milage)
	{
		this.milage=milage;
		return this;
	}
	
	public Car build()
	{
		Car car=new Car(this.CarModel,this.CarName,this.average,this.CarNo,this.milage);
		return car;
	}
	

}
