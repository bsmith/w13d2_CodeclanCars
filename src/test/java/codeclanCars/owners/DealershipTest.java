package codeclanCars.owners;

import codeclanCars.carParts.ElectricMotor;
import codeclanCars.carParts.Engine;
import codeclanCars.cars.ElectricCar;
import codeclanCars.cars.PetrolCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DealershipTest {
    Dealership dealership;
    ElectricCar expensiveCar;
    PetrolCar cheapCar;
    Customer brokeCustomer;
    Customer wealthyCustomer;

    @Before
    public void setUp() {
        dealership = new Dealership(20000.00, 3.0);
        expensiveCar = new ElectricCar(new ElectricMotor(700, 49999.99), "Green");
        cheapCar = new PetrolCar(new Engine(300, 19999.99), "Blue");
        brokeCustomer = new Customer(0.00);
        wealthyCustomer = new Customer(1000000.00);
    }

    @Test
    public void hasFunds() {
        assertEquals(20000.00, dealership.getBalanceOfFunds(), 0.00);
    }

    @Test
    public void hasEmptyInventory() {
        assertTrue(dealership.getInventory().isEmpty());
    }

    @Test
    public void cannotBuyCar() {
        dealership.buy(expensiveCar);
        assertTrue(dealership.getInventory().isEmpty());
        assertEquals(20000.00, dealership.getBalanceOfFunds(), 0.001);
    }

    @Test
    public void canBuyCar() {
        dealership.buy(cheapCar);
        assertEquals(1, dealership.getInventory().size());
        assertEquals(0.01, dealership.getBalanceOfFunds(), 0.001);
    }

    @Test
    public void canSellToCustomer() {
        dealership.buy(cheapCar);
        dealership.sell(wealthyCustomer, cheapCar);
        assertTrue(dealership.getInventory().isEmpty());
        assertEquals(20000.00 + 2*19999.99, dealership.getBalanceOfFunds(), 0.001);
        assertEquals(1, wealthyCustomer.getInventory().size());
        assertEquals(1000000.00 - 3*19999.99, wealthyCustomer.getBalanceOfFunds(), 0.001);
    }

    @Test
    public void cannotSellToCustomer() {
        dealership.buy(cheapCar);
        dealership.sell(brokeCustomer, cheapCar);
        assertEquals(1, dealership.getInventory().size());
        assertEquals(0.01, dealership.getBalanceOfFunds(), 0.001);
        assertEquals(0, brokeCustomer.getInventory().size());
        assertEquals(0.00, brokeCustomer.getBalanceOfFunds(), 0.001);
    }
}