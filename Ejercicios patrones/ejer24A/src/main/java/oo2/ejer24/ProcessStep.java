package oo2.ejer24;

public abstract class ProcessStep {
    private boolean result;

    public void execute(MixingTank tank) {
        if (this.basicExecute(tank))
        	this.setSuccess();
        else
        	this.setFailure();
    }

    abstract protected boolean basicExecute(MixingTank tank);

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