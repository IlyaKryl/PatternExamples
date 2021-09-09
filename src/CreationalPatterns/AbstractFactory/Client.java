package CreationalPatterns.AbstractFactory;

import CreationalPatterns.AbstractFactory.Factory.FurnitureFactory;
import CreationalPatterns.AbstractFactory.Product.Chair;
import CreationalPatterns.AbstractFactory.Product.Sofa;
import CreationalPatterns.AbstractFactory.Product.Table;

public class Client {
    private FurnitureFactory factory;
    private Chair chair;
    private Table table;
    private Sofa sofa;

    public Client(FurnitureFactory factory) {
        this.factory = factory;
    }

    public void someOperationWithChair() {
        chair = factory.createChair();
        chair.someChairMethod();
    }

    public void someOperationWithTable() {
        table = factory.createTable();
        table.someTableMethod();
    }

    public void someOperationWithSofa() {
        sofa = factory.createSofa();
        sofa.someSofaMethod();
    }
}
