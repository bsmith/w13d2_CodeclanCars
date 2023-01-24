package codeclanCars.carParts;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricMotorTest {
    private ElectricMotor electricMotor;

    @Before
    public void setUp() {
        electricMotor = new ElectricMotor(/*hp*/ 100, /*value*/24999.99);
    }

    @Test
    public void hasHP() {
        assertEquals(100, electricMotor.getHP());
    }

    @Test
    public void hasValue() {
        assertEquals(24999.99, electricMotor.getValue(), 0.0);
    }
}