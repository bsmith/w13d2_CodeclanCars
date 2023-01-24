package codeclanCars.cars;

import codeclanCars.carParts.ElectricMotor;
import codeclanCars.carParts.TyreSet;

public class ElectricCar implements ICar {
    private ElectricMotor electricMotor;
    private TyreSet tyreSet;
    private String colour;

    public ElectricCar(ElectricMotor electricMotor, String colour) {
        this.electricMotor = electricMotor;
        this.tyreSet = null;
        this.colour = colour;
    }

    public double getValue() {
        if (tyreSet == null) {
            return electricMotor.getValue();
        }
        return electricMotor.getValue() + tyreSet.getValue();
    }

    public int getHP() {
        return electricMotor.getHP();
    }

    public void setTyreSet(TyreSet tyreSet) {
        this.tyreSet = tyreSet;
    }

    public String getColour() {
        return this.colour;
    }
}
