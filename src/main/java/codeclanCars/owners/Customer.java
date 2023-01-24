package codeclanCars.owners;

import codeclanCars.cars.ICar;

public class Customer extends CarOwner {
    public Customer(double balanceOfFunds) {
        super(balanceOfFunds);
    }

    public boolean buy(ICar car, double value) {
        if (value <= this.getBalanceOfFunds()) {
            this.setBalanceOfFunds(this.getBalanceOfFunds() - value);
            this.addToInventory(car);
            return true;
        }
        else {
            return false;
        }
    }
}
