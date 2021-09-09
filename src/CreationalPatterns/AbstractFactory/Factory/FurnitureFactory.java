package CreationalPatterns.AbstractFactory.Factory;

import CreationalPatterns.AbstractFactory.Product.Chair;
import CreationalPatterns.AbstractFactory.Product.Sofa;
import CreationalPatterns.AbstractFactory.Product.Table;

public interface FurnitureFactory {
    Chair createChair();
    Table createTable();
    Sofa createSofa();
}
