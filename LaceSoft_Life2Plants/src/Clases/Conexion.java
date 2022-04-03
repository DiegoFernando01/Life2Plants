package Clases;
//LaceSoft - Life2Plants - 11 B - 2018 / 2019
//Hecho por: 
//Carlos Augusto Hernández Zamora
//Janiert Sebastián Salas Castillo
//Natalia Vásquez Mora
//Diego Fernando Victoria López

//Inicio importación de clases necesarias
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
//Fin importación de clases necesarias

public class Conexion { //Inicio clase Conexion

    //Inicio definición de variables globales
    private final String base = "lacesoftbd";
    private final String user = "root";
    private final String password = "";
    private final String url = "jdbc:mysql://localhost:3306/" + base;
    private Connection conn = null;
    //Fin definición de variables globales

    public Connection getConexion() { //Inicio método Connection
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection(url, user, password);
            JOptionPane.showMessageDialog(null, "Conexión éxitosa");
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Problemas en la conexión" + e);
        }
        return conn;
    } //Fin método Connection

} //Fin clase Conexion
