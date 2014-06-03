package com.realismcraft.ElectricityAPI;

public class ElectricityHandler {

	public static double elecCapac;
	
	public static void getNormalMaxCapac(int batNum){
		if(batNum == 1){
			elecCapac = 10;
		}else if(batNum == 2){
			elecCapac = 100;
		}else if(batNum == 3){
			elecCapac = 1000;
		}else if(batNum == 0){
			elecCapac = 0;
		}
		
		
	}

	public static void getRechargeableMaxCapac(int batNum){
		if(batNum == 1){
			elecCapac = 10;
		}else if(batNum == 2){
			elecCapac = 100;
		}else if(batNum == 3){
			elecCapac = 1000;
		}else if(batNum == 0){
			elecCapac = 0;
		}
		
		
	}
}
