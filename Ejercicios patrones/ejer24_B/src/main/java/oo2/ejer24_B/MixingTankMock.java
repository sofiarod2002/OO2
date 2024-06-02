package oo2.ejer24_B;

public class MixingTankMock extends MixingTank{
	private Integer heatPower, mixerPower, volume;
	private double time;

	public MixingTankMock() {
		this.heatPower = 0;
		this.mixerPower = 0;
		this.volume = 0;
		this.time = 0;
	}

	@Override
	public boolean heatPower(Integer percentage) {
		if (percentage >= 0 && percentage <= 1000) {
			this.heatPower = percentage;
			return true;
		}else
			return false;
	}

	@Override
	public boolean mixerPower(Integer percentage) {
		if (percentage >= 0 && percentage <= 1000) {
			this.mixerPower = percentage;
			return true;
		}else
			return false;
	}

	@Override
	public boolean purge() {
		this.volume=0;
		return true;
	}

	@Override
	public double upTo() {
		return this.volume;
	}
	
	public void delay(double time) {
		this.time = time;
	}
	
	public double getDelay() {
		return this.time;
	}

	@Override
	public double temperature() {
        if (this.heatPower == 100) {
            return this.getDelay() * 5.0;
        } else if (this.heatPower == 75) {
            return this.getDelay() * 4.0;
        } else if (this.heatPower == 50) {
            return this.getDelay() * 2.0;
        } else if (this.heatPower == 25) {
            return this.getDelay() * 1.0;
        } else {
            return 0.0;
        }
    }

}
