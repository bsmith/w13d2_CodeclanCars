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

    public void spendMoney(double money) {
        this.balanceOfFunds -= money;
    }

    public void receiveMoney(double money) {
        this.balanceOfFunds += money;
    }

    public boolean canBuy(double price) {
        return price <= this.getBalanceOfFunds();
    }

    public ArrayList<ICar> getInventory() {
        return inventory;
    }

    public void addToInventory(ICar car) {
        this.inventory.add(car);
    }

    public void removeInventory(ICar car) {
        this.inventory.remove(car);
    }
}
