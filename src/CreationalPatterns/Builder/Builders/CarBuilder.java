package CreationalPatterns.Builder.Builders;

import CreationalPatterns.Builder.Products.Car;

public abstract class CarBuilder {
    Car car;

    public void createCar() {
        car = new Car();
    }

    public abstract void buildBrand();

    public abstract void buildTransmission();

    public abstract void buildPrice();

    public Car getCar() {
        return car;
    }
}
