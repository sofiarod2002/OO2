package oo2.ejer24;

public class LightMix extends ProcessStep {

	protected boolean basicExecute(MixingTank tank) {
        return (tank.heatPower(20) && tank.mixerPower(5));
    }

}