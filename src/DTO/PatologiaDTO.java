package DTO;
import java.util.List;


public class PatologiaDTO {
		
		private int id;
		private String nombre;
		private String descipcion;
		private String tratamiento;
		private String causa;
		private List<PatologiaDTO> lista_patologias;
		
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getDescipcion() {
			return descipcion;
		}
		public void setDescipcion(String descipcion) {
			this.descipcion = descipcion;
		}
		public String getTratamiento() {
			return tratamiento;
		}
		public void setTratamiento(String tratamiento) {
			this.tratamiento = tratamiento;
		}
		public String getCausa() {
			return causa;
		}
		public void setCausa(String causa) {
			this.causa = causa;
		}
		public List<PatologiaDTO> getLista_patologias() {
			return lista_patologias;
		}
		public void setLista_patologias(List<PatologiaDTO> lista_patologias) {
			this.lista_patologias = lista_patologias;
		}
		public PatologiaDTO(int id, String nombre, String descipcion, String tratamiento, String causa,
				List<PatologiaDTO> lista_patologias) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.descipcion = descipcion;
			this.tratamiento = tratamiento;
			this.causa = causa;
			this.lista_patologias = lista_patologias;
		}
		

	}
