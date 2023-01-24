package codeclanCars.carParts;

public class Engine {
    private int hp;
    private double value;

    public Engine(int hp, double value) {
        this.hp = hp;
        this.value = value;
    }

    public int getHP() {
        return this.hp;
    }

    public void setHP(int hp) {
        this.hp = hp;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
