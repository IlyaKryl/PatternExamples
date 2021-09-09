package CreationalPatterns.AbstractFactory.Factory;

import CreationalPatterns.AbstractFactory.Product.Chair;
import CreationalPatterns.AbstractFactory.Product.Sofa;
import CreationalPatterns.AbstractFactory.Product.Table;
import CreationalPatterns.AbstractFactory.ProductImpl.VictorianChair;
import CreationalPatterns.AbstractFactory.ProductImpl.VictorianSofa;
import CreationalPatterns.AbstractFactory.ProductImpl.VictorianTable;

public class VictorianFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Table createTable() {
        return new VictorianTable();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}
