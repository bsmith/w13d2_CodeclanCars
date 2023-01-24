package codeclanCars.cars;

import codeclanCars.carParts.ElectricMotor;
import codeclanCars.carParts.Engine;
import codeclanCars.carParts.TyreSet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {
    ElectricMotor electricMotor;
    Engine engine;
    HybridCar hybridCar;

    @Before
    public void setUp() {
        electricMotor = new ElectricMotor(600, 1200.00);
        engine = new Engine(800, 1500.00);
        hybridCar = new HybridCar(electricMotor, engine, "Blue");
    }

    @Test
    public void hasValue() {
        assertEquals(1200.00 + 1500.00, hybridCar.getValue(), 0.00);
    }

    @Test
    public void hasHP() {
        assertEquals(800, hybridCar.getHP());
    }

    @Test
    public void canSetTyreSet() {
        hybridCar.setTyreSet(new TyreSet(900.00));
        assertEquals(1200.00 + 1500.00 + 900.00, hybridCar.getValue(), 0.00);
    }

    @Test
    public void hasColour() {
        assertEquals("Blue", hybridCar.getColour());
    }
}