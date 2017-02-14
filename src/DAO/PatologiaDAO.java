package DAO;

import DTO.PatologiaDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class PatologiaDAO {
	
	public static final String LISTAR_PATOLOGIAS
	= "SELECT nom_patol From Patologias Where id_patol IN (Select id_patol From Patologias Where id_patol)";
	

	public PatologiaDTO buscarPorId (int i)
	{
		PatologiaDTO patologia = null;
		Connection con = Pool.getConnection();
		Statement st = null;
		ResultSet rs = null;
		String nom_patol = null;
		String desc_patol = null;
		String trat_patol = null;
		String causa_patol = null;
		int id = 0;
		
		try {
			st = con.createStatement();
			rs = st.executeQuery(LISTAR_PATOLOGIAS);
			while(rs.next())
			{
				id = rs.getInt(1);
				nom_patol = rs.getString(2);
				desc_patol = rs.getString(3);
				trat_patol = rs.getString(4);
				causa_patol = rs.getString(5);
				//patologia = 
				//TODO
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return patologia;
	}
}
