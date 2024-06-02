package oo2.ejer24_B;

public class LightMix extends ProcessStep {

	protected boolean basicExecute(MixingTankMock tank) {
		double temp = tank.temperature();
				tank.heatPower(100);
				tank.delay(2);
				if(tank.temperature()-temp == 10 ){
				   tank.mixerPower(5);
				   return true;
				}
				else 
				  return false;

    }

}