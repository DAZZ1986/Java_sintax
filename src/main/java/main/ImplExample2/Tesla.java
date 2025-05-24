package main.ImplExample2;

public class Tesla extends Car implements Electro {

    int battelyLvl;



    public Tesla(String model, int battelyLvl) {
        super(model);
        this.battelyLvl = battelyLvl;
    }



    @Override
    public int chargeByEnergy() {
        return battelyLvl + 300;
    }
}
