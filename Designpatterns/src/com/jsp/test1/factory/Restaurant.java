package com.jsp.test1.factory;

import java.util.Scanner;

public class Restaurant {
	
	static Snacks Snacks;
	static boolean loop=true;
    public static void main(String[] args) {
    	while (loop) {
    		try {
    			factory().orderSnacks();
				
			} catch (NullPointerException e) {
				// TODO: handle exception
				System.out.println("No Mobile selected");
			}
			
		}
		

	}
    private static Snacks factory() {
    	System.out.println("please choose the menu"+"\n1.pizza \n2.Burger \n3.Sandwich \n4.Fries \n5.Momo");
    	
    	Scanner sc=new Scanner(System.in);
    	int choice=sc.nextInt();
    			
    	switch(choice){
    	case 1:
    			Snacks=new Pizza();
    			loop=false;
    			break;
    			
    	case 2:
			Snacks=new Burger();
			loop=false;
			break;
				
				
    	case 3:
			Snacks=new Sandwich();
			loop=false;
			break;
				
				
			
    	case 4:
			Snacks=new Fries();
			loop=false;
			break;
				
				
			
    	case 5:
			Snacks=new Momo();
			loop=false;
			break;
			
    	default:
			loop=false;
			break;
		}
		return Snacks;
			
				
				
    				
    				
    }

}
