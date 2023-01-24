package codeclanCars.cars;

import codeclanCars.carParts.ElectricMotor;
import codeclanCars.carParts.Engine;
import codeclanCars.carParts.TyreSet;

public class HybridCar implements ICar {
    private ElectricMotor electricMotor;
    private Engine engine;
    private TyreSet tyreSet;
    private String colour;

    public HybridCar(ElectricMotor electricMotor, Engine engine, String colour) {
        this.electricMotor = electricMotor;
        this.engine = engine;
        this.tyreSet = null;
        this.colour = colour;
    }

    public double getValue() {
        if (tyreSet == null) {
            return electricMotor.getValue() + engine.getValue();
        }
        return electricMotor.getValue() + engine.getValue() + tyreSet.getValue();
    }

    public int getHP() {
        return Math.max(engine.getHP(), electricMotor.getHP());
    }

    public void setTyreSet(TyreSet tyreSet) {
        this.tyreSet = tyreSet;
    }

    public String getColour() {
        return this.colour;
    }
}
