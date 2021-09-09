package CreationalPatterns.FactoryMethod;

import CreationalPatterns.FactoryMethod.Factory.Logistics;
import CreationalPatterns.FactoryMethod.Factory.RoadLogistics;
import CreationalPatterns.FactoryMethod.Factory.SeaLogistics;
import CreationalPatterns.FactoryMethod.Product.Transport;

public class Delivery {

    public static void main(String[] args) {
        Logistics logistics = createLogisticsByDeliveryMethod("RoAd");
        Transport transport = logistics.createTransport();
        transport.deliver();
    }

    static Logistics createLogisticsByDeliveryMethod(String deliveryMethod) {
        if (deliveryMethod.equalsIgnoreCase("road")) {
            return new RoadLogistics();
        } else if (deliveryMethod.equalsIgnoreCase("sea")) {
            return new SeaLogistics();
        } else {
            throw new RuntimeException("Error! " + deliveryMethod + "doesn't exist.");
        }
    }
}
