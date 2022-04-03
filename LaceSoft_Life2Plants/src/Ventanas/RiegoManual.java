package Ventanas;
//LaceSoft - Life2Plants - 11 B - 2018 / 2019
//Hecho por: 
//Carlos Augusto Hernández Zamora
//Janiert Sebastián Salas Castillo
//Natalia Vásquez Mora
//Diego Fernando Victoria López

import Clases.MultipleSensorH;
import com.panamahitek.ArduinoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import jssc.SerialPortException;
import rojerusan.RSNotifyShadowAnimated;

public class RiegoManual extends javax.swing.JFrame {

    int x;
    int y;

    public RiegoManual() {
        initComponents();
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BT_Salir = new javax.swing.JButton();
        BT_minimizar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        BT_Off = new rojerusan.RSButtonHover();
        BT_On = new rojerusan.RSButtonHover();
        LB_Img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        BT_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarPeque.png"))); // NOI18N
        BT_Salir.setToolTipText("Cerrar");
        BT_Salir.setBorderPainted(false);
        BT_Salir.setContentAreaFilled(false);
        BT_Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_SalirMouseClicked(evt);
            }
        });

        BT_minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/minimize.png"))); // NOI18N
        BT_minimizar.setToolTipText("Minimizar");
        BT_minimizar.setBorderPainted(false);
        BT_minimizar.setContentAreaFilled(false);
        BT_minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_minimizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(287, Short.MAX_VALUE)
                .addComponent(BT_minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BT_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BT_Salir)
            .addComponent(BT_minimizar)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));

        jPanel2.setBackground(new java.awt.Color(0, 102, 0));

        BT_Off.setText("Cerrar paso del agua");
        BT_Off.setToolTipText("Click aquí para detener el riego");
        BT_Off.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_OffActionPerformed(evt);
            }
        });

        BT_On.setText("Permitir paso del agua");
        BT_On.setToolTipText("Click aquí para empezar el riego");
        BT_On.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_OnActionPerformed(evt);
            }
        });

        LB_Img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aspersorOff.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BT_On, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LB_Img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BT_Off, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(BT_On, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(LB_Img)
                .addGap(37, 37, 37)
                .addComponent(BT_Off, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 400, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BT_SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_SalirMouseClicked
        this.dispose();
        MenuAdministrador menu = new MenuAdministrador();
        menu.setVisible(true);

    }//GEN-LAST:event_BT_SalirMouseClicked

    private void BT_minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_minimizarMouseClicked
        this.setState(Riego.ICONIFIED);
        this.BT_minimizar.setSelected(false);
    }//GEN-LAST:event_BT_minimizarMouseClicked

    private void BT_OnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_OnActionPerformed
        Icon On = new ImageIcon(getClass().getResource("/Imagenes/aspersorOn.png"));
        LB_Img.setIcon(On);
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
    }//GEN-LAST:event_BT_OnActionPerformed

    private void BT_OffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_OffActionPerformed
        Icon Off = new ImageIcon(getClass().getResource("/Imagenes/aspersorOff.png"));
        LB_Img.setIcon(Off);
        try {
            MultipleSensorH.ino.sendData("0");
        } catch (ArduinoException ex) {
            Logger.getLogger(RiegoManual.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SerialPortException ex) {
            Logger.getLogger(RiegoManual.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BT_OffActionPerformed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_jPanel1MouseDragged

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RiegoManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RiegoManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RiegoManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RiegoManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RiegoManual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonHover BT_Off;
    private rojerusan.RSButtonHover BT_On;
    private javax.swing.JButton BT_Salir;
    private javax.swing.JButton BT_minimizar;
    private javax.swing.JLabel LB_Img;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
