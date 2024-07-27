package org.lld.creational.prototype;

public abstract class Vehicle { // Abstract class having declartion of Clone() method
    // Class Variables
    protected int seats; 
    protected int tyres; 
    protected String color;
    protected String fuel; 

    public Vehicle() { // Default Constructor

    } 
	
    public Vehicle(Vehicle v) { // Parameterized Constructor
        if (v!= null){ // Checking passed object is null or not
            // Copying values from original object into the prototyped object
            this.seats = v.seats;
            this.tyres = v.tyres;
            this.color = v.color;
            this.fuel = v.fuel;
        }
    }
	
    public abstract Vehicle clone(); // Abstract Clone() method - Child classes implement this method 

    @Override
    public String toString() { // Overriding toString() method so that we can get desired print format
        return "Seats: " + this.seats + "\nTyres: " + this.tyres + "\nColor: " + this.color + "\nFuel: " + this.fuel + "\n";
    }
}