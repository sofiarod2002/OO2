package oo2.ejer24_B;

public class Purge extends ProcessStep {

	protected boolean basicExecute(MixingTankMock tank) {
		if (tank.upTo() == 0) 
			   return false;
		else {
			 tank.heatPower(0);
			 tank.mixerPower(0);
			 tank.purge();
			 tank.delay(4);
			 if (tank.upTo() != 0)
			   return false;
			 return true;
			}


    }

}