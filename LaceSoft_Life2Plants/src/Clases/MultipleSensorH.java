package Clases;

import Ventanas.Inicio;
import com.panamahitek.ArduinoException;
import com.panamahitek.PanamaHitek_MultiMessage;
import jssc.SerialPortEvent;
import jssc.SerialPortEventListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import jssc.SerialPortException;
import com.panamahitek.PanamaHitek_Arduino;
import java.util.Calendar;
import java.util.Timer;
import javax.swing.JOptionPane;
import rojerusan.RSNotifyAnimated;
import rojerusan.RSNotifyFade;
import rojerusan.RSNotifyShadowAnimated;
import rojerusan.RSNotifyShadowFade;

public class MultipleSensorH {

    public static PanamaHitek_Arduino ino = new PanamaHitek_Arduino();
    public static PanamaHitek_Arduino inoconexion = new PanamaHitek_Arduino();
    public static PanamaHitek_MultiMessage multi = new PanamaHitek_MultiMessage(5, ino);
    public static String dato = "";
    public static SerialPortEventListener listener = new SerialPortEventListener() {
        @Override
        public void serialEvent(SerialPortEvent spe) {
            try {
                if (ino.isMessageAvailable()) {
                    dato = ino.printMessage();
                    System.out.println(dato);
                }
            } catch (SerialPortException | ArduinoException ex) {
                Logger.getLogger(MultipleSensorH.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    };

    public static void main(String[] args) {
        LlamadaArduino();//Codigo Agregado        
        InicioCronometro();
    }

    public static void InicioCronometro() {
        Tarea Inicio = new Tarea();
        Timer Temporizador = new Timer();
        Temporizador.scheduleAtFixedRate(Inicio, 0, 60000);
    }

    public static void LlamadaArduino() {
        try {
            ino.arduinoRXTX("COM3", 115200, listener);
           new rojerusan.RSNotifyShadowAnimated("!Hecho¡",
           "!Conexion exitosa con el arduino!", 
           3, 
           RSNotifyShadowAnimated.PositionNotify.BottomLeft, 
           RSNotifyShadowAnimated.AnimationNotify.LeftRight, 
           RSNotifyShadowAnimated.TypeNotify.SUCCESS).setVisible(true); 
            Inicio inicio = new Inicio();
            inicio.setVisible(true);
            
        } catch (ArduinoException ex) {
        new rojerusan.RSNotifyShadowAnimated("!Error¡",
        "!No se ha podido conectar al arduino!", 
        3, 
        RSNotifyShadowAnimated.PositionNotify.BottomLeft, 
        RSNotifyShadowAnimated.AnimationNotify.LeftRight, 
        RSNotifyShadowAnimated.TypeNotify.ERROR).setVisible(true);
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
        }
    }

    public static void LlamadaArduino2() {
        try {
            ino.arduinoRXTX("COM3", 115200, listener);
            JOptionPane.showMessageDialog(null, "La conexion con el arduino ha sido exitosa", "Conexion Exitosa", 1);
        } catch (ArduinoException ex) {
           
        }
    }
    
    public static void salir(){
    System.exit(0);
   }
}
