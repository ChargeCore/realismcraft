package com.realismcraft.RadioactivityAPI;

public class Radioactivity {

	
	public static float setIntensity(float x){
		float Intensity = x;
		return Intensity;
	}
	
	public static int setRange(int g){
		return g;
	}
	
	public static double setHalfLife(double j){
		return j;
	}
	
	public Radioactivity(float Intensity, int Range, double halfLife){
		setIntensity(Intensity);
		setRange(Range);
		setHalfLife(halfLife);
	}

}
