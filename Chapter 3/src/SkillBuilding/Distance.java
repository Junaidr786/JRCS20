package SkillBuilding;

	import java.text.DecimalFormat;
	import java.util.Scanner;

	public class Distance {
	
	/*

	Program: Distance.java          Last Date of this Revision: September 15, 2022

	Purpose: An application that outputs the total distance of a race track.

	Author: Junaid, 
	School: CHHS
	Course: CS20
	 //

	*/

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		DecimalFormat dc = new DecimalFormat("0.0");
		System.out.println("Enter the length of the first segment in km");
		double firstSegment = sc.nextDouble();
		System.out.println("Enter the length of the second segment in km");
		double secondSegment = sc.nextDouble();
		System.out.println("Enter the length of the third segment in km");
		double thirdSegment = sc.nextDouble();
		
		double totalDistance = firstSegment+secondSegment+thirdSegment;
		
		System.out.println("The total distance of the race is "+ dc.format(totalDistance)+"km");

	}
	
	/*
	 The total distance of the race is 28.6km
	 */

}
