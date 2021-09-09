package CreationalPatterns.Builder.Products;

import CreationalPatterns.Builder.Products.Components.Transmission;

public class Car {
    private String brand;
    private Transmission transmission;
    private int price;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", transmission=" + transmission +
                ", price=" + price +
                '}';
    }
}
