package codeclanCars.owners;

import codeclanCars.cars.ICar;

import java.util.ArrayList;

public abstract class CarOwner {
    private double balanceOfFunds;
    private ArrayList<ICar> inventory;

    public CarOwner(double balanceOfFunds) {
        this.balanceOfFunds = balanceOfFunds;
        this.inventory = new ArrayList<>();
    }

    public double getBalanceOfFunds() {
        return balanceOfFunds;
    }

    public void setBalanceOfFunds(double balanceOfFunds) {
        this.balanceOfFunds = balanceOfFunds;
    }

    public ArrayList<ICar> getInventory() {
        return inventory;
    }

    public void addToInventory(ICar car) {
        this.inventory.add(car);
    }
}
