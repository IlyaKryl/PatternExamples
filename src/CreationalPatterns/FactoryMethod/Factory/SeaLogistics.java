package CreationalPatterns.FactoryMethod.Factory;

import CreationalPatterns.FactoryMethod.Product.Transport;
import CreationalPatterns.FactoryMethod.ProductImpl.Ship;

public class SeaLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
