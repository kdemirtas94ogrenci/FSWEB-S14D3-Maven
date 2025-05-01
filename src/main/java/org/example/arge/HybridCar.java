package org.example.arge;

public class HybridCar extends CarSkeleton {
    private double vgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String name, String description, double vgKmPerLitre, int batterySize, int cylinders) {
        super(name, description);
        this.vgKmPerLitre = vgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }

    public double getVgKmPerLitre() {
        return vgKmPerLitre;
    }

    @Override
    public String startEngine() {
        return super.startEngine();
    }

    @Override
    public String drive() {
        return super.drive();
    }

    public double getAvgKmPerLiter() {
        return vgKmPerLitre;
    }
}
