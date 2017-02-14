package proyectoweb;

import java.util.List;

public class PatologiaService {

	public static PatologiaDTO buscarPatologiasPorID(int id) {
		PatologiaDTO patoDTO = new PatologiaDTO();
		PatologiaDAO patoDAO = new PatologiaDAO();
		
		patoDTO.getIdPatologia();
		
		

		return patoDTO;
	}

//	public static PatologiaDTO buscarPatologiasPorNombre(String nombre) {
//			PatologiaDTO patologia = new PatologiaDTO();
//			List<PatologiaDTO> lista_patologias = null;
//			
//			String id_St = String.valueOf(id);
//			String nombre_patologia = null;
//				try {
//					patologia = (PatologiaDTO) PatologiaDAO.Conexion;
//					
//					nombre_patologia = patologia.getNombrePatologia();
//					
//					lista_patologias = ejecutarConsultaMultiple(PatologiaDAO.BUSCAR_PATOLOGIAS_POR_ID, nombre_patologia);
//					
//					patologia.setLista_patologias(lista_patologias);
//					
//					
//				} catch (Throwable e) 
//				{
//					e.printStackTrace();
//				}
//			
//			return patologia;
//		}
	

}
