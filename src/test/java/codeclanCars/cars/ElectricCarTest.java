package codeclanCars.cars;

import codeclanCars.carParts.ElectricMotor;
import codeclanCars.carParts.TyreSet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElectricCarTest {
    ElectricMotor electricMotor;
    ElectricCar electricCar;

    @Before
    public void setUp() {
        electricMotor = new ElectricMotor(600, 1200.00);
        electricCar = new ElectricCar(electricMotor, "Red");
    }

    @Test
    public void hasValue() {
        assertEquals(1200.00, electricCar.getValue(), 0.00);
    }

    @Test
    public void hasHP() {
        assertEquals(600, electricCar.getHP());
    }

    @Test
    public void canSetTyreSet() {
        electricCar.setTyreSet(new TyreSet(900.00));
        assertEquals(1200.00 + 900.00, electricCar.getValue(), 0.00);
    }

    @Test
    public void hasColour() {
        assertEquals("Red", electricCar.getColour());
    }
}