package CreationalPatterns.Builder.Director;

import CreationalPatterns.Builder.Builders.CarBuilder;
import CreationalPatterns.Builder.Products.Car;

public class Director {
    CarBuilder builder;

    public void setBuilder(CarBuilder builder) {
        this.builder = builder;
    }

    public Car buildCar() {
        builder.createCar();
        builder.buildBrand();
        builder.buildTransmission();
        builder.buildPrice();

        Car car = builder.getCar();

        return car;
    }
}
