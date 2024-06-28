package oo2.parial;

public class AdaptterListaDesplegable implements ComponenteFramework{
	private ListaDesplegable lista;

	@Override
	public void aplicarEstilo(ConfiguracionEstilo configuracion) {
		lista.setStyle(configuracion.getEstiloEtiqueta());
	}

	@Override
	public String imprimir() {
		return lista.print();
	}

}
