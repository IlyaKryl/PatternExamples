package CreationalPatterns.Builder.Builders;

import CreationalPatterns.Builder.Products.Components.Transmission;

public class MazdaCarBuilder extends CarBuilder {
    @Override
    public void buildBrand() {
        car.setBrand("Mazda");
    }

    @Override
    public void buildTransmission() {
        car.setTransmission(Transmission.AUTOMATIC);
    }

    @Override
    public void buildPrice() {
        car.setPrice(1730000);
    }
}
