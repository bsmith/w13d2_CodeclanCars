package codeclanCars.owners;

import codeclanCars.cars.ElectricCar;
import codeclanCars.cars.ICar;
import codeclanCars.cars.PetrolCar;

public class Dealership extends CarOwner {
    private double markup;

    public Dealership(double balanceOfFunds, double markup) {
        super(balanceOfFunds);
        this.markup = markup;
    }

    public void buy(ICar car) {
        if (this.canBuy(car.getValue())) {
            this.spendMoney(car.getValue());
            this.addToInventory(car);
        }
    }

    public void sell(Customer customer, ICar car) {
        double price = car.getValue() * markup;
        if (customer.buy(car, price)) {
            this.removeInventory(car);
            this.receiveMoney(price);
        }
    }
}
