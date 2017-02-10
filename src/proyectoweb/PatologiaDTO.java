package proyectoweb;
import java.util.List;


public class PatologiaDTO {
	

		
		private int idPatologia;
		private String nombrePatologia;
		private String descPatologia;
		private String tratPatologia;
		private String causaPatologia;
		private List<PatologiaDTO> lista_patologias;
		
		
		public List<PatologiaDTO> getLista_patologias() {
			return lista_patologias;
		}
		public void setLista_patologias(List<PatologiaDTO> lista_patologias) {
			this.lista_patologias = lista_patologias;
		}
		public int getIdPatologia() {
			return idPatologia;
		}
		public void setIdPatologia(int idPatologia) {
			this.idPatologia = idPatologia;
		}
		public String getNombrePatologia() {
			return nombrePatologia;
		}
		public void setNombrePatologia(String nombrePatologia) {
			this.nombrePatologia = nombrePatologia;
		}
		public String getDescPatologia() {
			return descPatologia;
		}
		public void setDescPatologia(String descPatologia) {
			this.descPatologia = descPatologia;
		}
		public String getTratPatologia() {
			return tratPatologia;
		}
		public void setTratPatologia(String tratPatologia) {
			this.tratPatologia = tratPatologia;
		}
		public String getCausaPatologia() {
			return causaPatologia;
		}
		public void setCausaPatologia(String causaPatologia) {
			this.causaPatologia = causaPatologia;
		}
		

	}
