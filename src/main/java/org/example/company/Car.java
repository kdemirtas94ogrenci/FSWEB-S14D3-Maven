package org.example.company;

public class Car {
    private boolean engine;

    private int cylinders;

    private String name;

    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
    }

    public int getCylinders() {
        return cylinders;
    }


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car{name='" + name + "', cylinders=" + cylinders + "}";
    }

    @Override
    public boolean equals(Object car) {
        return ((Car) car).name == name && ((Car) car).cylinders == cylinders;
    }


    public String startEngine() {
        String className = getClass().getSimpleName();
        System.out.println("[" + className + "] startEngine called");
        return "the car's engine is starting";
    }

    public String accelerate() {
        String className = getClass().getSimpleName();
        System.out.println("[" + className + "] accelerate called");
        return "the car is accelerating";
    }

    public String brake() {
        String className = getClass().getSimpleName();
        System.out.println("[" + className + "] brake called");
        return "the car is braking";
    }
}
