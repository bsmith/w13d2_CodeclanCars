package codeclanCars.carParts;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {
    private Engine engine;

    @Before
    public void setUp() {
        engine = new Engine(/*hp*/ 100, /*value*/24999.99);
    }

    @Test
    public void hasHP() {
        assertEquals(100, engine.getHP());
    }

    @Test
    public void hasValue() {
        assertEquals(24999.99, engine.getValue(), 0.0);
    }
}