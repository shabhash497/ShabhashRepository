package com.interfaces;

public interface TataCars {
    public abstract void GPS();
    public  abstract void makerear();
    public abstract void makeChildcare();
    int min =5;
    public default void interf1(){
    	System.out.println("Interface method ");
    
    	
    }
    public static void staticinterf1(){
    	System.out.println("static Interface method");
    }
    
}
