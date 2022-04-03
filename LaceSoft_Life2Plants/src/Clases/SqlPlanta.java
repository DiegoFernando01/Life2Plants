
package Clases;

import static Clases.SqlRiegos.Sql;
import static Clases.SqlRiegos.connection;
import static Clases.SqlUsuarios.ps;
import Ventanas.EditarPlanta;
import Ventanas.MenuAdministrador;
import Ventanas.MenuUsuario;
import Ventanas.Planta;
import com.mysql.jdbc.PreparedStatement;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import rojerusan.RSNotifyShadowAnimated;
import rojerusan.RSTableMetro;

public class SqlPlanta {
    static Conexion ConexionRiego = new Conexion();
    static Connection connection = ConexionRiego.getConexion();
    static java.sql.PreparedStatement ps;
    
    public static void ListarPlanta(String dato, JTable tabla) {
        tabla.setDefaultRenderer(Object.class, new TablaImagen());
        DefaultTableModel modelo = (DefaultTableModel) MenuAdministrador.jTabla_Planta.getModel();
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql;
        if (dato.equals("")) {
            sql = "SELECT * FROM planta ORDER BY Código";
        } else {

            sql = "SELECT * FROM planta WHERE (Código LIKE'" + dato + "%' OR "
                    + "Nombre LIKE'" + dato + "%' OR Decripción LIKE'" + dato + "%') "
                    + "ORDER BY Código";
        }
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Object datos[] = new Object[4];
                datos[0] = rs.getString("Código");
                datos[1] = rs.getString("Nombre");
                datos[2] = rs.getString("Descripción");
                Blob blob = rs.getBlob("Imagen");
                if(blob != null){
                    try {
                        byte [] data = blob.getBytes(1, (int)blob.length());
                        BufferedImage img = null;
                        try {
                        img = ImageIO.read(new ByteArrayInputStream(data));
                        } catch (Exception e) {
                        System.out.println("Hola");
                        }
                        ImageIcon icono = new ImageIcon(img);
                        datos[3] = new JLabel(icono);
                    } catch (Exception e) {
                        datos[3] = "No Imagen";
                    }
                }
                else{
                datos[3] = "No Imagen";
                }
                modelo.addRow(datos);
            }
            tabla.setModel(modelo);
            tabla.setRowHeight(100);
            
        } catch (SQLException ex) {
            System.err.println("" + ex);
        }
    }
    public static void ListarPlanta2(String dato, JTable tabla) {
        tabla.setDefaultRenderer(Object.class, new TablaImagen());
        DefaultTableModel modelo = (DefaultTableModel) MenuUsuario.jTabla_Planta.getModel();
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql;
        if (dato.equals("")) {
            sql = "SELECT * FROM planta ORDER BY Código";
        } else {

            sql = "SELECT * FROM planta WHERE (Código LIKE'" + dato + "%' OR "
                    + "Nombre LIKE'" + dato + "%' OR Decripción LIKE'" + dato + "%') "
                    + "ORDER BY Código";
        }
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Object datos[] = new Object[5];
                datos[0] = rs.getString("Código");
                datos[4] = rs.getString("Ruta");
                datos[1] = rs.getString("Nombre");
                datos[2] = rs.getString("Descripción");
                Blob blob = rs.getBlob("Imagen");
                if(blob != null){
                    try {
                        byte [] data = blob.getBytes(1, (int)blob.length());
                        BufferedImage img = null;
                        try {
                        img = ImageIO.read(new ByteArrayInputStream(data));
                        } catch (Exception e) {
                        System.out.println("Hola");
                        }
                        ImageIcon icono = new ImageIcon(img);
                        datos[3] = new JLabel(icono);
                    } catch (Exception e) {
                        datos[3] = "No Imagen";
                    }
                }
                else{
                datos[3] = "No Imagen";
                }
                modelo.addRow(datos);
            }
            tabla.setModel(modelo);
            tabla.setRowHeight(100);
            
        } catch (SQLException ex) {
            System.err.println("" + ex);
        }
    }
    private String jTFnombrePlanta;
    
    public void guardar_imagen(String ruta, String nombre, String descripcion){
    
        String insert = "insert into planta (Nombre, Descripción, Imagen, Ruta) values (?,?,?,?)";
        FileInputStream fi = null;
        try {
            File file = new File(ruta);
            fi = new FileInputStream(file);
            
            ps = connection.prepareStatement(insert);
            ps.setString(1,nombre);
            ps.setString(2,descripcion);
            ps.setBinaryStream(3,fi);
            ps.setString(4,ruta);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al guardar");
        }
    }

    public void guardar(){
    SqlPlanta conn = new SqlPlanta();
    String nombre = Planta.jTFnombrePlanta.getText();
    String url = Planta.jLurl.getText();
    String descripcion = Planta.jTAdescripcion.getText();
    
    if(descripcion.trim().length() !=0 && nombre.trim().length() !=0 ){
    conn.guardar_imagen(url, nombre, descripcion);
    }
    else{
        JOptionPane.showMessageDialog(null,"No dejar campos vacios","ERROR",0);
    }
    }
    
    public static void buscar(){
    Conexion con = new Conexion();
    java.sql.Connection conn = con.getConexion();
    String codigo = EditarPlanta.jTFcodigo.getText();
        try {
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery("SELECT Código, Nombre, Descripción, Imagen, Ruta FROM planta WHERE Código='"+codigo+ "'");
            if(rs.next()){
            EditarPlanta.jTFcodigo.setText(rs.getString(1));
            EditarPlanta.jTFnombrePlanta.setText(rs.getString(2));
            EditarPlanta.jTAdescripcion.setText(rs.getString(3));
            
            Image i = null;
            Blob blob2 = rs.getBlob("Imagen");
            i=javax.imageio.ImageIO.read(blob2.getBinaryStream());
            ImageIcon image = new ImageIcon(i);
            EditarPlanta.jLimagenS.setIcon(image);
            EditarPlanta.jLurl.setText(rs.getString(5));            
            }
            else{
            new rojerusan.RSNotifyShadowAnimated("!Error¡",
            "!La planta "+codigo+" no existe!", 
            3, 
            RSNotifyShadowAnimated.PositionNotify.BottomLeft, 
            RSNotifyShadowAnimated.AnimationNotify.LeftRight, 
            RSNotifyShadowAnimated.TypeNotify.ERROR).setVisible(true);
            }
        } catch (Exception e) {
        }
    }
    
    public static int eliminar(int codigo){
     int rsu = 0;
        Sql = "DELETE FROM planta WHERE Código = ?";
        try {
            ps = connection.prepareStatement(Sql);
            ps.setInt(1, codigo);
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        System.out.println(Sql);
        return rsu;
    }
    
    public static void modificar(){
   Connection conectar = null;
   try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/lacesoftbd","root","");
            
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Problemas en la conexión" + e);
        }
        try {
            String sql = "UPDATE planta SET "
                + "Código=?, "
                + "Nombre=?, "
                + "Descripción=?, "
                + "Imagen=?, "
                + "Ruta=? "
                + "WHERE Código='"+EditarPlanta.jTFcodigo.getText()+"'";
                java.sql.PreparedStatement pst = conectar.prepareStatement(sql);
                pst.setString(1, EditarPlanta.jTFcodigo.getText());
                pst.setString(2, EditarPlanta.jTFnombrePlanta.getText());
                pst.setString(3, EditarPlanta.jTAdescripcion.getText());
                FileInputStream archivoFoto;
                archivoFoto = new FileInputStream(EditarPlanta.jLurl.getText());
                pst.setBinaryStream(4, archivoFoto);
                pst.setString(5, EditarPlanta.jLurl.getText());
                System.out.println("0");
                int n = pst.executeUpdate();
                System.out.println("el error n");
                if(n>0){
                 new rojerusan.RSNotifyShadowAnimated("!Hecho¡",
                 "!Los datos se han modifiado con exito!", 
                 3, 
                 RSNotifyShadowAnimated.PositionNotify.BottomLeft, 
                 RSNotifyShadowAnimated.AnimationNotify.LeftRight, 
                 RSNotifyShadowAnimated.TypeNotify.SUCCESS).setVisible(true); 
                }
                else{
                new rojerusan.RSNotifyShadowAnimated("!Error¡",
                "!Ha ocurrido un error, los datos no se han modificado!", 
                3, 
                RSNotifyShadowAnimated.PositionNotify.BottomLeft, 
                RSNotifyShadowAnimated.AnimationNotify.LeftRight, 
                RSNotifyShadowAnimated.TypeNotify.ERROR).setVisible(true);
                }
        } catch (SQLException ex) {
            Logger.getLogger(SqlPlanta.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SqlPlanta.class.getName()).log(Level.SEVERE, null, ex);
        }
 
    
    }
    
    
   
}
