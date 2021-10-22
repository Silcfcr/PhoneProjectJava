package com.silvia.phones;

public class Galaxy extends Phone implements Ringables {
	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}
	
	//constructor 
	public Galaxy() {
		super("S9", 100, "Verizon", "Ring, Ring,Ring");
	}
	
	
	
	@Override
	public void ring() {
		System.out.println("I'm a Galaxy ringing, Ring,Ring,Ring");
	}
	@Override
	public void unlock() {
		System.out.println("Unlocking via facial recognition");
		
	}
	@Override 
	public void displayInfo() {
		System.out.println("Galaxy characteristics:");
		System.out.println("Version #: " + getVersionNumber());
		System.out.println("Battery %: " + getBatteryPercentage());
		System.out.println("Carrier: " + getCarrier());
		System.out.println("Ringtone: " + getRingTone());
		
	}
}
