package proyectoweb;

public class PatologiaService {

	public static PatologiaDTO buscarPatologiasPorID(int id) {
		PatologiaDTO patoDTO = new PatologiaDTO();
		PatologiaDAO patoDAO = new PatologiaDAO();
		
		patoDTO.getIdPatologia();
		
		

		return patoDTO;
	}

	public static PatologiaDTO buscarPatologiasPorNombre(String nombre) {

		return null;
	}

}
