package CreationalPatterns.FactoryMethod.Factory;

import CreationalPatterns.FactoryMethod.Product.Transport;

public abstract class Logistics {

    public void someOperation() {
        Transport transport = createTransport();
        transport.deliver();
    }
    public abstract Transport createTransport();
}
