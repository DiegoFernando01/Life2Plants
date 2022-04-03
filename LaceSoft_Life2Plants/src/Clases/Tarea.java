package Clases;

import com.panamahitek.ArduinoException;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tarea extends TimerTask {

    @Override
    public void run() {
        System.err.println("Paso temporizador confirmado");
        try {
            SqlRiegos.ListarFechasRiegos();
        } catch (ArduinoException ex) {
            Logger.getLogger(Tarea.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
