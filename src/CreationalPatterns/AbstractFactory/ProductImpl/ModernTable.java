package CreationalPatterns.AbstractFactory.ProductImpl;

import CreationalPatterns.AbstractFactory.Product.Table;

public class ModernTable implements Table {
    @Override
    public void someTableMethod() {
        System.out.println("Do something with modern table");
    }
}
