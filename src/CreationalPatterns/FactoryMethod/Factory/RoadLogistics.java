package CreationalPatterns.FactoryMethod.Factory;

import CreationalPatterns.FactoryMethod.Product.Transport;
import CreationalPatterns.FactoryMethod.ProductImpl.Truck;

public class RoadLogistics extends Logistics {

    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
