package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class MysqlDBConexion {
    private static Connection con = null;
    
	public static Connection getConexion(){
            /*
            Connection cn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost/libreria","root","");
		} catch (Exception e) {
			e.printStackTrace();
                        throw  new RuntimeException("Error al crear la conexion",e);
		}
		return cn;
            */
            try {
                if (con == null) {
                    //con esto determinamos cuando finaliza el programa
                    Runtime.getRuntime().addShutdownHook(new MiShDwnHook());
                    
                    Class.forName("com.mysql.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost/cap4_3JAF","root","");
                    
                }
                
                return con;
                
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException("Error al crear la conexion",e);
            }  
	}
        
        static class MiShDwnHook extends Thread{
            //justo antes de finalizar el programa la JVM invocara
            //a este metodo donde podemos cerrar la conexion
            public void run(){
                try {
                    Connection con = MysqlDBConexion.getConexion();
                    con.close();
                } catch (Exception e) {
                    e.printStackTrace();
                    throw new RuntimeException(e);
                }
            }
        }
                    
}
