package CreationalPatterns.AbstractFactory.ProductImpl;

import CreationalPatterns.AbstractFactory.Product.Table;

public class VictorianTable implements Table {
    @Override
    public void someTableMethod() {
        System.out.println("Do something with victorian table");
    }
}
