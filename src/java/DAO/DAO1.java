package DAO;

import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.reporte;
import util.Dbutil;



public class DAO1 {

    private static Connection connection;

    public DAO1() throws SQLException {
        connection = Dbutil.getConnection();
    }

    public void Actualizar(reporte obj) throws SQLException {
        Connection connection = Dbutil.getConnection();
        String query = "update empleado set sueldo=? where idEmpleado=?";
         PreparedStatement preparedStmt =DAO1.connection.prepareStatement(query);
        try {
          
           
             preparedStmt.setInt(1, obj.getSueldo());
            preparedStmt.setInt(2, obj.getIdEmpleado());
            preparedStmt.executeUpdate();
        } catch (SQLException e) {
			e.printStackTrace();
		}
        
    }
    public int getSueldoById(int userId) {
		int sueldo=0;
		try {
			PreparedStatement preparedStatement = connection.
					prepareStatement("select sueldo from empleado where idEmpleado=?");
			preparedStatement.setInt(1, userId);
			ResultSet rs = preparedStatement.executeQuery();
			
			if (rs.next()) {
				sueldo=rs.getInt("sueldo");
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return sueldo;
	}
        public int getDiasById(int userId) {
		int Dias=0;
		try {
			PreparedStatement preparedStatement = connection.
					prepareStatement("select DiasTrabajado from sueldo where idEmpleado=?");
			preparedStatement.setInt(1, userId);
			ResultSet rs = preparedStatement.executeQuery();
			
			if (rs.next()) {
				Dias=rs.getInt("DiasTrabajado");
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return Dias;
	}
 
}