package oo2.ejer24_B;

public abstract class ProcessStep {
    private boolean result;

    public void execute(MixingTankMock tank) {
        if (this.basicExecute(tank))
        	this.setSuccess();
        else
        	this.setFailure();
    }

    abstract protected boolean basicExecute(MixingTankMock tank);

    public boolean isDone() {
        return this.result;
    }

    private void setSuccess() {
    	this.result = true;
    }

    private void setFailure() {
    	this.result = false;
    }

}