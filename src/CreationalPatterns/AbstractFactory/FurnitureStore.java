package CreationalPatterns.AbstractFactory;

import CreationalPatterns.AbstractFactory.Factory.FurnitureFactory;
import CreationalPatterns.AbstractFactory.Factory.ModernFurnitureFactory;
import CreationalPatterns.AbstractFactory.Factory.VictorianFurnitureFactory;

public class FurnitureStore {
    public static void main(String[] args) {
        Client client = new Client(createFactoryByFurnitureStyle("Modern"));
        client.someOperationWithChair();
        client.someOperationWithTable();
        client.someOperationWithSofa();
    }

    static FurnitureFactory createFactoryByFurnitureStyle(String furnitureStyle) {
        if (furnitureStyle.equalsIgnoreCase("Modern")) {
            return new ModernFurnitureFactory();
        } else if (furnitureStyle.equalsIgnoreCase("Victorian")) {
            return new VictorianFurnitureFactory();
        } else {
            throw new RuntimeException("Error! Unknown furniture style.");
        }
    }
}
