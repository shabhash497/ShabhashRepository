package com.interfaces;

public class TataNano implements TataCars {  
	
		

	@Override
	public void GPS() {
		System.out.println(("tata nano implements gps"));
		
	}

	@Override
	public void makerear() {
		System.out.println(("tata nano implements makerea"));
		
	}

	@Override
	public void makeChildcare() {
		System.out.println("tata nano implements childacare");
		
	}
	public  void interf1(){
    	System.out.println("Interface method overriddinf");
    }
	public static void nanomethod(){
		System.out.println("nano cars method");
	}
	public static void main(String[] args){
		TataNano tn1= new TataNano();
		tn1.GPS();
		tn1.makerear();
		tn1.makeChildcare();
		tn1.interf1();
		tn1.nanomethod();
		
	}

	}
