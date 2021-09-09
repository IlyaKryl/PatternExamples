package CreationalPatterns.Builder.Builders;

import CreationalPatterns.Builder.Products.Components.Transmission;

public class ToyotaCarBuilder extends CarBuilder {
    @Override
    public void buildBrand() {
        car.setBrand("Toyota");
    }

    @Override
    public void buildTransmission() {
        car.setTransmission(Transmission.SEMIAUTOMATIC);
    }

    @Override
    public void buildPrice() {
        car.setPrice(1896000);
    }
}
