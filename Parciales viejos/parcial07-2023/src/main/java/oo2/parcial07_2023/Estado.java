package oo2.parcial07_2023;


public abstract class Estado {
    private long horario;



    public Estado(long horario) {
		this.horario = horario;
	}
    
    public long getHorario() {
    	return this.horario;
    }
    
	public abstract Estado iniciar();
    public abstract Estado completar();
    public abstract double tiempoUtilizado();
}