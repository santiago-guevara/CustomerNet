package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    // Atributos estáticos con los datos de conexión
    private static final String URL = "jdbc:mariadb://localhost:3307/customer_net_db";
    private static final String USUARIO = "root";
    private static final String CONTRASENA = "SantiDB";

    // Método que retorna la conexión
    public static Connection getConnection() {
        Connection conexion = null;

        try {
            // Intentamos establecer la conexión con la base de datos
            conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
            System.out.println("Conexion exitosa a la base de datos.");
        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos: " + e.getMessage());
        }
        return conexion;
    }
}
