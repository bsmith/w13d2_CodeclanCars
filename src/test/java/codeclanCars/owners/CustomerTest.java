package codeclanCars.owners;

import codeclanCars.carParts.ElectricMotor;
import codeclanCars.carParts.Engine;
import codeclanCars.cars.ElectricCar;
import codeclanCars.cars.PetrolCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {
    Customer customer;
    ElectricCar expensiveCar;
    PetrolCar cheapCar;

    @Before
    public void setUp() {
        customer = new Customer(30000.00);
        expensiveCar = new ElectricCar(new ElectricMotor(700, 49999.99), "Green");
        cheapCar = new PetrolCar(new Engine(300, 19999.99), "Blue");
    }

    @Test
    public void hasFunds() {
        assertEquals(30000.00, customer.getBalanceOfFunds(), 0.00);
    }

    @Test
    public void hasEmptyInventory() {
        assertTrue(customer.getInventory().isEmpty());
    }

    @Test
    public void cannotBuyCar() {
        assertFalse(customer.buy(expensiveCar, expensiveCar.getValue()));
        assertTrue(customer.getInventory().isEmpty());
        assertEquals(30000.00, customer.getBalanceOfFunds(), 0.00);
    }

    @Test
    public void canBuyCar() {
        assertTrue(customer.buy(cheapCar, cheapCar.getValue()));
        assertEquals(1, customer.getInventory().size());
        assertEquals(10000.01, customer.getBalanceOfFunds(), 0.001);
    }
}