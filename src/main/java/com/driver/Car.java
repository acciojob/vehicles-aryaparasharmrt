package com.driver;

public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear = 1;
    private int seats;

    /*  assert car.getName() == "Tata";
//        assert car.getDoors() == 4;
//        assert car.getGears() == 4;
//        assert car.getWheels() == 4;
//        assert car.isManual();
//        assert car.getType() == "Sedan";
//        assert car.getCurrentGear() == 1;
        car.changeSpeed(20, 30);
        assert car.getCurrentSpeed() == 20;
        assert car.getCurrentDirection() == 30;
        car.changeGear(3);
        assert car.getCurrentGear() == 3;
*/

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        //Hint: Car extends Vehicle
        super(name);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.seats = seats;
    }

    public int getWheels(){
        return wheels;
    }

    public int getDoors(){
        return doors;
    }

    public int getGears(){
        return gears;
    }

    public int getCurrentGear(){
        return  currentGear;
    }

    public String getType() {
        return type;
    }

    public boolean isManual() {
        return isManual;
    }

    public int getSeats(){
        return seats;
    }

    public void changeGear(int newGear){
        currentGear = newGear;
        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){
        move(newSpeed, newDirection);
        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }
}
