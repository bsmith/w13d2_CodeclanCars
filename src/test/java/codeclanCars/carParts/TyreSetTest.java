package codeclanCars.carParts;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TyreSetTest {
    private TyreSet tyreSet;

    @Before
    public void setUp() {
        tyreSet = new TyreSet(50.30);
    }

    @Test
    public void getValue() {
        assertEquals(50.30, tyreSet.getValue(), 0.00);
    }
}