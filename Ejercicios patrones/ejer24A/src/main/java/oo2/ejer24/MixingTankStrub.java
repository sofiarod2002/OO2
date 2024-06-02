package oo2.ejer24;

public class MixingTankStrub extends MixingTank {


    public boolean heatPower(Integer percentage) {
        return true;
    }


    public boolean mixerPower(Integer percentage) {
        return true;
    }


    public boolean purge() {
        return true;
    }


    public double upTo() {
        return 60.5;
    }


    public double temperature() {
        return 15.5;
    }


}