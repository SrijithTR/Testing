package org.allvehicle;

import org.fourwheeler.FourWheeler;
import org.threewheeler.ThreeWheeler;
import org.twowheeler.TwoWheller;

public class Vehicle {

	private void VehicleNecessery() {
		System.out.println("vehicle is necessary for long travel");
	}
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.VehicleNecessery();
		
		TwoWheller tw = new TwoWheller();
		tw.bike();
		tw.cycle();
		
		ThreeWheeler th = new ThreeWheeler();
		th.Auto();
		
		FourWheeler fo = new FourWheeler();
		fo.car();
		fo.bus();
		fo.lorry();
	}
}
