package ar.edu.unlp.info.oo2.biblioteca;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.util.List;

public class JSONAdapter extends VoorheesExporter {
	 JSONArray jsonArray = new JSONArray();
	
	public String exportar (List<Socio> socios) {
		socios.forEach(socio -> {
			 JSONObject jsonObject = new JSONObject();
			 jsonObject = putInObject(jsonObject, socio);
			 jsonArray.add(jsonObject);
		});
		return jsonArray.toJSONString();
	}
	
	private JSONObject putInObject(JSONObject jO, Socio socio) {
		jO.put("nombre", socio.getNombre());
        jO.put("email", socio.getEmail());
        jO.put("legajo", socio.getLegajo());
		return jO;
	}
}
