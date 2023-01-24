package codeclanCars;

import codeclanCars.cars.ICar;
import codeclanCars.owners.Customer;
import codeclanCars.owners.Dealership;

public class Manager {
    private final Dealership dealership;

    public Manager(Dealership dealership) {
        this.dealership = dealership;
    }

    public boolean buy(ICar car) {
        return false;
    }

    public boolean sell(ICar car, Customer customer) {
        return false;
    }
}
