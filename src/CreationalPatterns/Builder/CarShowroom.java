package CreationalPatterns.Builder;

import CreationalPatterns.Builder.Builders.MazdaCarBuilder;
import CreationalPatterns.Builder.Director.Director;
import CreationalPatterns.Builder.Products.Car;

public class CarShowroom {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new MazdaCarBuilder());
        Car car = director.buildCar();

        System.out.println(car);
    }
}
