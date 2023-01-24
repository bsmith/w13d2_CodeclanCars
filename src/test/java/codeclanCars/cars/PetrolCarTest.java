package codeclanCars.cars;

import codeclanCars.carParts.ElectricMotor;
import codeclanCars.carParts.Engine;
import codeclanCars.carParts.TyreSet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PetrolCarTest {
    Engine engine;
    PetrolCar petrolCar;

    @Before
    public void setUp() {
        engine = new Engine(600, 1200.00);
        petrolCar = new PetrolCar(engine, "Red");
    }

    @Test
    public void hasValue() {
        assertEquals(1200.00, petrolCar.getValue(), 0.00);
    }

    @Test
    public void hasHP() {
        assertEquals(600, petrolCar.getHP());
    }

    @Test
    public void canSetTyreSet() {
        petrolCar.setTyreSet(new TyreSet(900.00));
        assertEquals(1200.00 + 900.00, petrolCar.getValue(), 0.00);
    }

    @Test
    public void hasColour() {
        assertEquals("Red", petrolCar.getColour());
    }
}