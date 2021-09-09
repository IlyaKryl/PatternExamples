package CreationalPatterns.AbstractFactory.ProductImpl;

import CreationalPatterns.AbstractFactory.Product.Sofa;

public class ModernSofa implements Sofa {
    @Override
    public void someSofaMethod() {
        System.out.println("Do something with modern sofa");
    }
}
