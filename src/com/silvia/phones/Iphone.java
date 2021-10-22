package com.silvia.phones;

public class Iphone extends Phone implements Ringables {
	public Iphone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}
	
	public Iphone() {
		super("12",100,"AT&T","Zing Zing");
	}
	
	@Override
	public void ring() {
		System.out.println("I'm an iphone ringing, zing, zing, zing");
	}
	@Override
	public void unlock() {
		System.out.println("Unlocking via finger print");
		
	}
	@Override 
	public void displayInfo() {
		System.out.println("Iphone characteristics:");
		System.out.println("Version #: " + getVersionNumber());
		System.out.println("Battery %: " + getBatteryPercentage());
		System.out.println("Carrier: " + getCarrier());
		System.out.println("Ringtone: " + getRingTone());
		
	}
	

}