package DAO;

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
 
}