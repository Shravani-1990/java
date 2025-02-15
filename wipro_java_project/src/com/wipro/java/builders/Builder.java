package com.wipro.java.builders;

import com.wipro.java.cars.CarType;
import com.wipro.java.components.Engine;
import com.wipro.java.components.GPSNavigator;
import com.wipro.java.components.Transmission;
import com.wipro.java.components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
