package Clases;

import Ventanas.MenuAdministrador;
import Ventanas.Riego;
import Ventanas.RiegoManual;
import com.panamahitek.ArduinoException;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import jssc.SerialPortException;
import rojerusan.RSNotifyShadowAnimated;

public class SqlRiegos {

    static Conexion ConexionRiego = new Conexion();
    static Connection connection = ConexionRiego.getConexion();
    static PreparedStatement ps;
    static String Sql, Fecha;
    public static int CantidadRiegos, Milisegundos, DuracionDelRiego;

    //static Riego ObjetoRiego = new Riego();
    public static void ListarFechasRiegos() throws ArduinoException {
        Sql = "SELECT * FROM asignación_riego";
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(Sql);
            String HoraRiegoBD, MinutoRiegoBD;
            int HoraActual, MinutoActual, OpcionRiego;
            Date FechaActual = new Date();
            SimpleDateFormat FormatoFechaActual = new SimpleDateFormat("dd/MM/yyyy");
            Fecha = FormatoFechaActual.format(FechaActual);
            Calendar Calendario = Calendar.getInstance();
            while (rs.next()) {
                HoraActual = Calendario.get(Calendar.HOUR_OF_DAY);
                MinutoActual = Calendario.get(Calendar.MINUTE);
                HoraRiegoBD = rs.getString("Hora_Inicio");
                MinutoRiegoBD = rs.getString("Minuto_Inicio");
                OpcionRiego = rs.getInt("Duracion_Riego");
                switch (OpcionRiego) {
                    case 1:
                        DuracionDelRiego = 30000;
                        break;
                    case 2:
                        DuracionDelRiego = 60000;
                        break;
                    case 3:
                        DuracionDelRiego = 90000;
                        break;
                    case 4:
                        DuracionDelRiego = 120000;
                        break;
                    case 5:
                        DuracionDelRiego = 150000;
                        break;
                    case 6:
                        DuracionDelRiego = 180000;
                        break;
                    case 7:
                        DuracionDelRiego = 210000;
                        break;
                    case 8:
                        DuracionDelRiego = 240000;
                        break;
                    case 9:
                        DuracionDelRiego = 270000;
                        break;
                    case 10:
                        DuracionDelRiego = 300000;
                        break;
                    case 11:
                        DuracionDelRiego = 600000;
                        break;
                }
                if (rs.getString("Fecha_Inicio").equals((Fecha))) {
                    if (Integer.parseInt(HoraRiegoBD) == HoraActual) {
                        if (Integer.parseInt(MinutoRiegoBD) == MinutoActual) {
                            System.out.println("Ejecutando riego");
                            do {
                                MultipleSensorH.LlamadaArduino2();
                                try {
                                MultipleSensorH.ino.sendData("2");
                                } catch (ArduinoException ex) {
                                Logger.getLogger(RiegoManual.class.getName()).log(Level.SEVERE, null, ex);
                                } catch (SerialPortException ex) {
                                Logger.getLogger(RiegoManual.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                MultipleSensorH.LlamadaArduino2();//Codigo Agregado
                                String dator = MultipleSensorH.dato;
                                if (dator.equals(">> EL SUELO ESTA SECO")) {
                                 try {
                                MultipleSensorH.ino.sendData("1");
                                System.out.println("1");
                                } catch (ArduinoException ex) {
                                Logger.getLogger(RiegoManual.class.getName()).log(Level.SEVERE, null, ex);
                                } catch (SerialPortException ex) {
                                 Logger.getLogger(RiegoManual.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                } else {
                                new rojerusan.RSNotifyShadowAnimated("!La humedad no es apta para un riego¡",
                                "!Este es un mensaje error!", 
                                3, 
                                RSNotifyShadowAnimated.PositionNotify.BottomLeft, 
                                RSNotifyShadowAnimated.AnimationNotify.LeftRight, 
                                RSNotifyShadowAnimated.TypeNotify.ERROR).setVisible(true);
                                }
                                Milisegundos += 100;
                                try {
                                    Thread.sleep(100);
                                } catch (InterruptedException e) {

                                }
                            } while (Milisegundos <= DuracionDelRiego);
                             System.out.println("se termino"); // agregar notificacion 
                             MultipleSensorH.ino.killArduinoConnection();
                             MultipleSensorH.LlamadaArduino2();
                             try {
                             MultipleSensorH.ino.sendData("0");
                             System.out.println("0");
                             } catch (ArduinoException ex) {
                             Logger.getLogger(MenuAdministrador.class.getName()).log(Level.SEVERE, null, ex);
                             } catch (SerialPortException ex) {
                              Logger.getLogger(MenuAdministrador.class.getName()).log(Level.SEVERE, null, ex);
                             }
                        }
                        
                    }
                }
            }
        } catch (SQLException e) {
            System.err.println("Error método ListarFechasRiegos - Clase SqlRiegos");
        }
    }

    public static int GuardarRiego(String Fecha) {
        CantidadRiegos = ((TomarCantidadRiegos()) + 1);
        int rsu = 0;
        Sql = "INSERT INTO asignación_riego (Codigo, Codigo_Usuario, Id_Planta, Descripcion, Fecha_Inicio, Hora_Inicio, Minuto_Inicio, Duracion_Riego) VALUES (?,?,?,?,?,?,?,?)";
        try {
            ps = connection.prepareStatement(Sql);
            ps.setInt(1, CantidadRiegos);
            ps.setInt(2, Integer.parseInt(SqlUsuarios.codigoUser));
            ps.setInt(3, Riego.JCbx_Planta.getSelectedIndex());
            ps.setString(4, Riego.Jta_Descripcion.getText());
            ps.setString(5, Fecha);
            ps.setString(6, Riego.JCb_Horas.getSelectedItem().toString());
            ps.setString(7, Riego.JCb_Minutos.getSelectedItem().toString());
            ps.setInt(8, Riego.JCb_DuracionRiego.getSelectedIndex());
            rsu = ps.executeUpdate();
        } catch (SQLException Error) {
            System.err.println("Error método GuardarRiego - SqlRiegos\nMensaje del error " + Error);
        }
        return rsu;
    }

    public static void TomarPlantas() { //Inicio método TomarPlantas
        Sql = "SELECT * FROM `planta`";
        try {
            ps = connection.prepareStatement(Sql);
            ResultSet Rs = ps.executeQuery();
            Riego.JCbx_Planta.removeAllItems();
            Riego.JCbx_Planta.addItem("Seleccione...");
            while (Rs.next()) {
                Riego.JCbx_Planta.addItem(Rs.getInt(1) + ". " + Rs.getString(2));
            }
        } catch (SQLException Error) {
            System.err.println("Error método TomarPlantas - SqlRiegos\nMensaje del error: " + Error);
        }
    } //Fin método TomarPlantas

    public static void ListarRiego(String dato) {
        DefaultTableModel modelo = (DefaultTableModel) MenuAdministrador.JTable_Riegos.getModel();
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        if (dato.equals("")) {
            Sql = "SELECT * FROM asignación_riego ORDER BY Codigo";
        } else {

            Sql = "SELECT * FROM asignación_riego WHERE (Codigo LIKE'" + dato + "%' OR "
                    + "Codigo_Usuario LIKE'" + dato + "%' OR Id_Planta LIKE'" + dato + "%') "
                    + "ORDER BY Codigo";
        }
        String datos[] = new String[8];
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(Sql);
            while (rs.next()) {
                datos[0] = rs.getString("Codigo");
                datos[1] = rs.getString("Codigo_Usuario");
                datos[2] = rs.getString("Id_Planta");
                datos[3] = rs.getString("Descripcion");
                datos[4] = rs.getString("Fecha_Inicio");
                datos[5] = rs.getString("Hora_Inicio");
                datos[6] = rs.getString("Minuto_Inicio");
                datos[7] = rs.getString("Duracion_Riego");
                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            System.err.println("" + ex);
        }
    }

    public static int eliminar(int codigo) {
        int rsu = 0;
        Sql = "DELETE FROM asignación_riego WHERE Codigo = ?";
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

    public static int TomarCantidadRiegos() {
        int CantidadRiegosBD = 0;
        Sql = "SELECT COUNT(*) FROM asignación_riego";
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(Sql);
            while (rs.next()) {
                CantidadRiegosBD = rs.getInt(1);
            }
        } catch (SQLException e) {
            System.err.println("Error en método TomarCantidadRiegos - SqlRiegos\nMensaje del error: " + e);
        }
        return CantidadRiegosBD;
    }

    public static void EjecucionRiego() {

    }
}
