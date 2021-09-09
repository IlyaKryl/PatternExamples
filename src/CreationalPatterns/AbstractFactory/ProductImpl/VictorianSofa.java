package CreationalPatterns.AbstractFactory.ProductImpl;

import CreationalPatterns.AbstractFactory.Product.Sofa;

public class VictorianSofa implements Sofa {
    @Override
    public void someSofaMethod() {
        System.out.println("Do something with victorian sofa");
    }
}
