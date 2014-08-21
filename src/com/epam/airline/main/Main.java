package com.epam.airline.main;

import java.util.ArrayList;

import com.epam.airline.creators.HardCodeImport;
import com.epam.airline.logic.Logic;
import com.epam.airline.logic.RangeValue;
import com.epam.airline.plane.Airport;
import com.epam.airline.plane.FreighterPlane;
import com.epam.airline.plane.PassangerPlane;

public class Main {

	public static void main(String[] args) {
		
		
		Airport airport = Airport.getAirportInstance();
		HardCodeImport imp = new HardCodeImport();
		imp.create();
		ArrayList<PassangerPlane> passangers = airport.getPassangers();
		ArrayList<FreighterPlane> freighters = airport.getFreighters();
		ArrayList<String> fuel;
		ArrayList<RangeValue> rV ;
		Logic l = new Logic();
		fuel = l.findPlanesByFuel(passangers, freighters, 125, 150);
		
		
		
		
		for(PassangerPlane p : passangers){
			System.out.println(p.toString());
		}
		for(FreighterPlane f : freighters){
			System.out.println(f.toString());
		}
		System.out.println(" Total Seats = " + l.totalSeats(passangers));
		
		System.out.println(" Total Capasity = " +l.totalCapasity(freighters));
		
		
		System.out.println(" Fuel Consumption :");
		
		
		for(String s : fuel){
			System.out.println(" "+ s);
		}
		
	
		
		System.out.println("Sort by fly range:");
		rV = l.RangeSort(passangers, freighters);
		for(RangeValue j : rV ){
			System.out.println(" "+j.getName() + " " + j.getRange());
		}
		
	}
}
