package CreationalPatterns.AbstractFactory.ProductImpl;

import CreationalPatterns.AbstractFactory.Product.Chair;

public class ModernChair implements Chair {
    @Override
    public void someChairMethod() {
        System.out.println("Do something with modern chair");
    }
}
