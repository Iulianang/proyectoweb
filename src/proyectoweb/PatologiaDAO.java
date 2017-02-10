package proyectoweb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jcraft.jsch.Session;
import com.jcraft.jsch.JSch;

public class PatologiaDAO {

	
	public static final String BUSCAR_PATOLOGIAS_POR_ID = "Select * From Patologias Where id_patol = '1'";
	
//TODO
	

	public static class Conexion {
		

			
			private final static String S_PATH_FILE_PRIVATE_KEY = "id_rsa.ppk"; //\\windows absolut path of our ssh private key locally saved
			private final static String S_PATH_FILE_KNOWN_HOSTS = "known_hosts";
			private final static String S_PASS_PHRASE = "mypassphrase";
			private final static int LOCAl_PORT = 3308; 
			private final static int REMOTE_PORT = 3306; 
			private final static int SSH_REMOTE_PORT = 22; 
			private final static String SSH_USER = "587fca0889f5cf057100004b";
			private final static String SSH_REMOTE_SERVER = "femxa-ebtm.rhcloud.com";
			private final static String MYSQL_REMOTE_SERVER = "127.11.220.2";
			private static Session sesion; //represents each ssh session
			private final static String cadena_conexion = "jdbc:mysql://localhost:3308/femxa";
			private final static String user = "adminGXjlxzG";
			private final static String password = "QBShkFDW_69e";
			
			private static void conectate_A_SSH () throws Throwable
			{
				JSch jsch = new JSch();
		        jsch.setKnownHosts(S_PATH_FILE_KNOWN_HOSTS);
		        jsch.addIdentity(S_PATH_FILE_PRIVATE_KEY, S_PASS_PHRASE.getBytes());

		        sesion = jsch.getSession(SSH_USER, SSH_REMOTE_SERVER, SSH_REMOTE_PORT);
		        sesion.connect(); //ssh connection established!

		        //by security policy, you must connect through a fowarded port          
		        sesion.setPortForwardingL(LOCAl_PORT, MYSQL_REMOTE_SERVER, REMOTE_PORT); 

			}
			
			private static void desconectate_D_SSH ()
			{
				sesion.disconnect();
			}

			public static void conexion(String consulta) throws Throwable{
				
				Connection conn = null;
				ResultSet rset = null;
				Statement stmt = null;
				
				try
				{
					conectate_A_SSH();
					
					DriverManager.registerDriver (new com.mysql.jdbc.Driver());
					conn = DriverManager.getConnection (cadena_conexion, user, password);
		  	        stmt = conn.createStatement();
					rset = stmt.executeQuery(BUSCAR_PATOLOGIAS_POR_ID);

					imprimir(rset);
					
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				finally 
				{
					if (rset != null) 	{ try { rset.close(); } catch (Exception e2) { e2.printStackTrace(); }}
					if (stmt != null)	{ try {	stmt.close(); } catch (Exception e2) { e2.printStackTrace(); }}
					if (conn != null) 	{ try { conn.close(); } catch (Exception e3) { e3.printStackTrace(); }}
				  	desconectate_D_SSH(); 
				}  
			}
			
			public static void imprimir(ResultSet rset) throws SQLException{
				int id = 0;
				PatologiaDTO pato = new PatologiaDTO();
				String nom_patol = null;
				String desc_patol = null;
				String trat_patol = null;
				String causa_patol = null;
				
				while (rset.next())
				{
					id = rset.getInt(1);
					pato.setIdPatologia(id);
					nom_patol = rset.getString(2);
					desc_patol = rset.getString(3);
					trat_patol = rset.getString(4);
					causa_patol = rset.getString(5);
					System.out.println("Id = "+id+" NombrePatologia: "+nom_patol+" Descripcion."+ desc_patol+" Tratamiento."+trat_patol+" Causa."+causa_patol);
					System.out.println(BUSCAR_PATOLOGIAS_POR_ID);
				}
			}
			
				
		
	}
	
	
	
	public PatologiaDAO buscarPatologiaPorID(int id){
		PatologiaDTO patologia = new PatologiaDTO();
		List<PatologiaDTO> lista_sintomas = null;
		
		String id_St = String.valueOf(id);
		String nombre_patologia = null;
			try {
				patologia = (PatologiaDTO) ejecutarConsultaSimple(BUSCAR_PATOLOGIAS_POR_ID);
				
				nombre_patologia = patologia.getNombre_patologia();
				
				lista_sintomas = ejecutarConsultaMultiple(Consultas.CONSULTA_SINTOMAS_POR_PATOLOGIA, nombre_patologia);
				
				patologia.setLista_sintomas(lista_sintomas);
				
			} catch (Throwable e) 
			{
				e.printStackTrace();
			}
		
		return patologia;
	}
	
}