package Clases;
//LaceSoft - Life2Plants - 11 B - 2018 / 2019
//Hecho por: 
//Carlos Augusto Hernández Zamora
//Janiert Sebastián Salas Castillo
//Natalia Vásquez Mora
//Diego Fernando Victoria López

//Inicio importación de clases necesarias
//import Ventanas.EditarUsuario;
import Ventanas.MenuAdministrador;
import Ventanas.MenuUsuario;
import Paneles.Registro;
import Paneles.Registro2;
import Ventanas.EditarUsuario;
import Ventanas.Registro1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//Fin importación de clases necesarias

public class SqlUsuarios { //Inicio clase SqlUsuarios

    //Inicio definición de variables globales
    static Conexion conexion = new Conexion();
    static Connection connection = conexion.getConexion();
    static PreparedStatement ps;
    static String codigoUser = "1", passWord = "", pNombre = "", sNombre = "", pApellido = "", sApellido = "", Correo = "",  PassWord = "", Direccion = "";
    static int tipo_perfil = 0, Telefono = 0;
    //Fin definición de variables globales

    public static void ValidarUsuario(String codigo, String password, int tipoPerfil, JFrame Login) { //Inicio método ValidarUsuario

        try {
            String sql = "SELECT * FROM usuario WHERE Código =?";
            ps = connection.prepareStatement(sql);
            ps.setString(1, codigo);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                codigoUser = rs.getString(1);
                pNombre = rs.getString(2);
                sNombre = rs.getString(3);
                pApellido = rs.getString(4);
                sApellido = rs.getString(5);
                passWord = rs.getString(9);
                tipo_perfil = rs.getInt(10);
            }
            if (codigoUser.equals(codigo) && passWord.equals(password) && tipo_perfil == tipoPerfil) {

                switch (tipo_perfil) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "BIENVENIDO Al SISTEMA: " + pNombre + " " + sNombre + " " + pApellido + " " + sApellido, "Mensaje", JOptionPane.PLAIN_MESSAGE, null);
                        Login.dispose();
                        MenuAdministrador principal = new MenuAdministrador();
                        principal.setVisible(true);
                        break;

                    case 2:

                        JOptionPane.showMessageDialog(null, "BIENVENIDO Al SISTEMA: " + pNombre + " " + sNombre + " " + pApellido + " " + sApellido, "Mensaje", JOptionPane.PLAIN_MESSAGE, null);
                        Login.dispose();
                        MenuUsuario usuario = new MenuUsuario();
                        usuario.setVisible(true);
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "El perfil no esta habilitado por el momento", "Mensaje", JOptionPane.PLAIN_MESSAGE, null);
                        break;
                }
            } else {
                JOptionPane.showMessageDialog(null, "USUARIO NO ENCONTRADO", "Mensaje", JOptionPane.ERROR_MESSAGE, null);
            }
        } catch (Exception ex) {
            System.err.print(ex);
        }
    }

    public static boolean verficarUsuario(String codigo) {
        boolean existe = false;
        String user = "";
        String sql = "SELECT * FROM usuario WHERE Código=?";

        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, Registro2.TF_Código.getText());
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                user = rs.getString(1);
            }

            if (user.equals(codigo)) {
                existe = true;
            }

        } catch (SQLException e) {
            Logger.getLogger(sql);
            JOptionPane.showMessageDialog(null, "Error al hacer la consulta", "Error", 0);
        }

        return existe;

    }

    public static void listarUsuario(String dato) {
        System.err.println("Método listar usaruio abierto");
        DefaultTableModel modelo = (DefaultTableModel) MenuAdministrador.tablaUsuario.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql;
        if (dato.equals("")) {
            sql = "SELECT * FROM usuario ORDER BY Código";
        } else {
            sql = "SELECT * FROM usuario WHERE (Código LIKE'" + dato + "%' OR "
                    + "Primer_Nombre LIKE'" + dato + "%' OR Primer_Apellido LIKE'" + dato + "%' OR "
                    + "Tipo_Perfil LIKE'" + dato + "%') "
                    + "ORDER BY Código";
        }
        String datos[] = new String[10];
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String perfil;

            while (rs.next()) {

                if (rs.getString("Tipo_Perfil").equals("1")) {
                    perfil = "Administrador";
                } else if (rs.getString("Tipo_Perfil").equals("2")) {
                    perfil = "Usuario";
                }

                datos[0] = rs.getString("Código");
                datos[1] = rs.getString("Primer_Nombre");
                datos[2] = rs.getString("Segundo_Nombre");
                datos[3] = rs.getString("Primer_Apellido");
                datos[4] = rs.getString("Segundo_Apellido");
                datos[5] = rs.getString("Correo");
                datos[6] = rs.getString("Dirección");
                datos[7] = rs.getString("Teléfono");
                datos[8] = rs.getString("Password");
                datos[9] = rs.getString("Tipo_Perfil");
                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static int guardarUsuario() {
        int rsu = 0;
        String sql = "INSERT INTO usuario(Código, Primer_Nombre, Segundo_Nombre, Primer_Apellido, Segundo_Apellido, Correo, Dirección, Teléfono, Password, Tipo_Perfil) "
                + "VALUES(?,?,?,?,?,?,?,?,?,?)";
        try {

            ps = connection.prepareStatement(sql);
            ps.setString(1, Registro2.TF_Código.getText());
            ps.setString(2, Registro.TF_PNombre.getText());
            ps.setString(3, Registro.TF_SApellido.getText());
            ps.setString(4, Registro.TF_PApellido.getText());
            ps.setString(5, Registro.TF_SApellido.getText());
            ps.setString(6, Registro2.TF_Correo.getText());
            ps.setString(7, Registro.TF_Dire.getText());
            ps.setString(8, Registro.TF_Telefono.getText());
            ps.setString(9, Registro2.TF_Contra.getText());
            ps.setInt(10, Registro2.CB_Perfil.getSelectedIndex());

            rsu = ps.executeUpdate();

        } catch (Exception e) {
            System.err.println(e);
        }
        return rsu;
    }

    public static int eliminar(int codigo) {
        int rsu = 0;
        String sql = "DELETE FROM usuario WHERE Código = ?";

        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, codigo);
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        System.out.println(sql);
        return rsu;

    }

    public static int modificar() {
        int rsu = 0;
        String sql = "UPDATE usuario SET "
                + "Código=?, "
                + "Primer_Nombre=?, "
                + "Segundo_Nombre=?, "
                + "Primer_Apellido=?, "
                + "Segundo_apellido=?, "
                + "Correo=?, "
                + "Dirección=?, "
                + "Teléfono=?, "
                + "Password=?, "
                + "Tipo_Perfil=? "
                + "WHERE Código=?";
        try {

            ps = connection.prepareStatement(sql);
            ps.setString(1, EditarUsuario.jTFcodigo.getText());
            ps.setString(2, EditarUsuario.jTFPnombre.getText());
            ps.setString(3, EditarUsuario.jTFSnombre.getText());
            ps.setString(4, EditarUsuario.jTFPapellido.getText());
            ps.setString(5, EditarUsuario.jTFSapellido.getText());
            ps.setString(6, EditarUsuario.jTFcorreo.getText());
            ps.setString(7, EditarUsuario.jTFdireccion.getText());
            ps.setString(8, EditarUsuario.jTFtelefono.getText());
            ps.setString(9, EditarUsuario.jTFpassword.getText());
            ps.setInt(10, EditarUsuario.jCBperfil.getSelectedIndex());
            ps.setString(11, EditarUsuario.jTFcodigo.getText());
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
            System.err.println(ex);
        }

        return rsu;
    }

    public static void buscarUsuario() {
        try {           //Crear una ventana para poder editar el usuario

            String sql = "SELECT * FROM usuario WHERE Código=?";
            connection = conexion.getConexion();
            ps = connection.prepareStatement(sql);
            ps.setString(1, EditarUsuario.jTFcodigo.getText());
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                EditarUsuario.jTFcodigo.setText(rs.getString("Código"));
                EditarUsuario.jTFPnombre.setText(rs.getString("Primer_Nombre"));
                EditarUsuario.jTFSnombre.setText(rs.getString("Segundo_Nombre"));
                EditarUsuario.jTFPapellido.setText(rs.getString("Primer_Apellido"));
                EditarUsuario.jTFSapellido.setText(rs.getString("Segundo_Apellido"));
                EditarUsuario.jTFcorreo.setText(rs.getString("Correo"));
                EditarUsuario.jTFdireccion.setText(rs.getString("Dirección"));
                EditarUsuario.jTFtelefono.setText(rs.getString("Teléfono"));
                EditarUsuario.jTFpassword.setText(rs.getString("Password"));
                EditarUsuario.jCBperfil.setSelectedIndex(Integer.parseInt(rs.getString("Tipo_Perfil")));
            }

        } catch (SQLException ex) {
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public static void nombreCRUD(String Código, JFrame Login) {
        try {
            String sql = "SELECT * FROM usuario WHERE Código =?";
            ps = connection.prepareStatement(sql);
            ps.setString(1, Código);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                codigoUser = rs.getString(1);
                pNombre = rs.getString(2);
                sNombre = rs.getString(3);
                pApellido = rs.getString(4);
                sApellido = rs.getString(5);
                Correo = rs.getString(6);
                Direccion = rs.getString(7);
                Telefono = rs.getInt(8);
                PassWord = rs.getString(9);
            }

            MenuUsuario.jLCódigo.setText(codigoUser);
            MenuUsuario.jLPrimerNombre.setText(pNombre);
            MenuUsuario.jLSegundoNombre.setText(sNombre);
            MenuUsuario.jLPrimerApellido.setText(pApellido);
            MenuUsuario.jLSegundoApellido.setText(sApellido);
            

        } catch (SQLException ex) {
            System.err.print(ex);
        }
    }

} //Fin clase SqlUsuarios
