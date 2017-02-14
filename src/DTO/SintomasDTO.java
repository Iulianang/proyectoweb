package DTO;

import java.util.List;

public class SintomasDTO {

	private int id;
	private String descripcion;
	private List<SintomasDTO> lista_sintomas;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public List<SintomasDTO> getLista_sintomas() {
		return lista_sintomas;
	}
	public void setLista_sintomas(List<SintomasDTO> lista_sintomas) {
		this.lista_sintomas = lista_sintomas;
	}
	
	public SintomasDTO(int id, String descripcion, List<SintomasDTO> lista_sintomas) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.lista_sintomas = lista_sintomas;
	}
	
}
