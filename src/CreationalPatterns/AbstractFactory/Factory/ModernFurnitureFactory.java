package CreationalPatterns.AbstractFactory.Factory;

import CreationalPatterns.AbstractFactory.Product.Chair;
import CreationalPatterns.AbstractFactory.Product.Sofa;
import CreationalPatterns.AbstractFactory.Product.Table;
import CreationalPatterns.AbstractFactory.ProductImpl.ModernChair;
import CreationalPatterns.AbstractFactory.ProductImpl.ModernSofa;
import CreationalPatterns.AbstractFactory.ProductImpl.ModernTable;

public class ModernFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
