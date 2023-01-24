package codeclanCars.cars;

import codeclanCars.carParts.Engine;
import codeclanCars.carParts.TyreSet;

public class PetrolCar implements ICar {
    private Engine engine;
    private TyreSet tyreSet;
    private String colour;

    public PetrolCar(Engine engine, String colour) {
        this.engine = engine;
        this.tyreSet = null;
        this.colour = colour;
    }

    public double getValue() {
        if (tyreSet == null) {
            return engine.getValue();
        }
        return engine.getValue() + tyreSet.getValue();
    }

    public int getHP() {
        return engine.getHP();
    }

    public void setTyreSet(TyreSet tyreSet) {
        this.tyreSet = tyreSet;
    }

    public String getColour() {
        return this.colour;
    }
}
