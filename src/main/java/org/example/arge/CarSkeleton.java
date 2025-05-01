package org.example.arge;



public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public CarSkeleton() {
        this.name = name;
        this.description = description;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }


    public String startEngine(){
        return getClass() + "Engine is starting.";
    }
    public String drive(){
        return getClass() +runEngine();
    }
    protected String runEngine(){
        return getClass() +"Engine is running.";
    }
}
