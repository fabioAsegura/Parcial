package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.reporte;
import util.Dbutil;



public class DAO {

    private static Connection connection;

    public DAO() throws SQLException {
        connection = Dbutil.getConnection();
    }

    public boolean capturar(reporte obj) throws SQLException {
        boolean result = false;
        Connection connection = Dbutil.getConnection();
        String query = "update empleado set sueldo=?" +"where idEmpleado=?";
       
        PreparedStatement preparedStmt = null;
        try {
            preparedStmt = connection.prepareStatement(query);
             preparedStmt.setInt(1, obj.getSueldo());
            preparedStmt.setInt(2, obj.getIdEmpleado());
           
            result = preparedStmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}