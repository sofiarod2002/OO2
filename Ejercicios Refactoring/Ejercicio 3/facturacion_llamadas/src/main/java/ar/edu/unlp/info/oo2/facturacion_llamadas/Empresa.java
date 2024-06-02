package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;

public class Empresa {
	private List<Cliente> clientes = new ArrayList<Cliente>();
	private GestorNumerosDisponibles guiaNumeros = new GestorNumeroDisponibleUltimo();

	public boolean agregarNumeroTelefono(String numeroNuevo) {
		if (encontreNumero(numeroNuevo)) 
			return false;
		else {
			guiaNumeros.getLineas().add(numeroNuevo);
			return true;
		}
	}

	private boolean encontreNumero(String numero){
	    return guiaNumeros.getLineas().contains(numero);
	}
	
	public String obtenerNumeroLibre() {
		return guiaNumeros.obtenerNumero();
	}

	public Cliente registrarUsuario(Cliente cliente) {
		cliente.setNumeroTelefono(this.obtenerNumeroLibre());
		clientes.add(cliente);
		return cliente;
	}

	public Llamada registrarLlamada(Cliente origen, Llamada llamada) {
		origen.agregarLlamada(llamada);
		return llamada;
	}

	public double calcularMontoTotalLlamadas(Cliente cliente) {
		return cliente.calcularMontoTotalLlamadas();
	}

	public int cantidadDeUsuarios() {
		return clientes.size();
	}

	public boolean existeUsuario(Cliente persona) {
		return clientes.contains(persona);
	}

	public GestorNumerosDisponibles getGestorNumeros() {
		return this.guiaNumeros;
	}
	
	public void cambiarTipoGenerador(GestorNumerosDisponibles guiaNumerosNueva) {
		SortedSet<String> lineas = guiaNumeros.getLineas();
		this.guiaNumeros = guiaNumerosNueva;
		guiaNumeros.setLineas(lineas);
	}
}
