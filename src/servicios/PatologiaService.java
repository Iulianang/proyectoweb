package servicios;

import DAO.PatologiaDAO;
import DTO.PatologiaDTO;

public class PatologiaService {

	
	public PatologiaDTO buscarPatologiaPorId (int id)
	{
		PatologiaDAO pdao = new PatologiaDAO();
		pdao.buscarPorId(id);
		return null; //patologia DTO
		
	}
}
