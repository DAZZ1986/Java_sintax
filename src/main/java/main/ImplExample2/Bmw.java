package main.ImplExample2;

public class Bmw extends Car implements DvsEngine {

    private int fuelLevel = 0;


    public Bmw(String model, int fuelLevel) {
        super(model);
        this.fuelLevel = fuelLevel;
    }



    @Override
    public int chargeByFuel() {
        return fuelLevel + 70;
    }
}
