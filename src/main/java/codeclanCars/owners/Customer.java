package codeclanCars.owners;

import codeclanCars.cars.ElectricCar;
import codeclanCars.cars.ICar;

public class Customer extends CarOwner {
    public Customer(double balanceOfFunds) {
        super(balanceOfFunds);
    }

    public void buy(ICar car) {
        if (car.getValue() <= this.getBalanceOfFunds()) {
            this.setBalanceOfFunds(this.getBalanceOfFunds() - car.getValue());
            this.addToInventory(car);
        }
    }
}
