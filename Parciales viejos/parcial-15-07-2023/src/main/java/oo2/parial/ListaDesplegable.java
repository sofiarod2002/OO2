package oo2.parial;

public class ListaDesplegable {
	private String style;
	
	public void setStyle (String newStyle) {
		this.style = newStyle;
	}
	
	public String print() {
		return "Lista desplegable" + style;
	}

}
