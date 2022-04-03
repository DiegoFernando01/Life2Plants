package Ventanas;
//LaceSoft - Life2Plants - 11 B - 2018 / 2019
//Hecho por: 
//Carlos Augusto Hernández Zamora
//Janiert Sebastián Salas Castillo
//Natalia Vásquez Mora
//Diego Fernando Victoria López

public class EditarRiego extends javax.swing.JFrame { //Inicio calse EditarRiego

    //Inicio definición de variables globales
    int XMouse;
    int YMouse;
    //Fin definición de variables globales

    public EditarRiego() { //Inicio constructor clase EditarRiego
        initComponents();
        this.setLocationRelativeTo(null);
    } //Fin constructor clase EditarRiego

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanel_Superior = new javax.swing.JPanel();
        Jb_Volver = new javax.swing.JButton();
        Jb_Minimizar = new javax.swing.JButton();
        JPanel_Inferior = new javax.swing.JPanel();
        Jl_Flecha = new javax.swing.JLabel();
        Jl_SistemaRiego = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        Jl_SolicitudFechaInicio = new javax.swing.JLabel();
        Jl_SolicitudFechaFin = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        Jl_SolicitudHoraInicio = new javax.swing.JLabel();
        Jl_SolicitudHoraFin = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPanel_Superior.setBackground(new java.awt.Color(255, 255, 255));
        JPanel_Superior.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 2, 3, new java.awt.Color(0, 0, 0)));
        JPanel_Superior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                JPanel_SuperiorMouseDragged(evt);
            }
        });
        JPanel_Superior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JPanel_SuperiorMousePressed(evt);
            }
        });

        Jb_Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cerrar2.png"))); // NOI18N
        Jb_Volver.setToolTipText("Cerrar");
        Jb_Volver.setBorderPainted(false);
        Jb_Volver.setContentAreaFilled(false);
        Jb_Volver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Jb_Volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Jb_VolverMouseClicked(evt);
            }
        });

        Jb_Minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Minimizar.png"))); // NOI18N
        Jb_Minimizar.setToolTipText("Minimizar");
        Jb_Minimizar.setBorderPainted(false);
        Jb_Minimizar.setContentAreaFilled(false);
        Jb_Minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Jb_Minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Jb_MinimizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout JPanel_SuperiorLayout = new javax.swing.GroupLayout(JPanel_Superior);
        JPanel_Superior.setLayout(JPanel_SuperiorLayout);
        JPanel_SuperiorLayout.setHorizontalGroup(
            JPanel_SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel_SuperiorLayout.createSequentialGroup()
                .addContainerGap(712, Short.MAX_VALUE)
                .addComponent(Jb_Minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(Jb_Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        JPanel_SuperiorLayout.setVerticalGroup(
            JPanel_SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_SuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanel_SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jb_Volver)
                    .addComponent(Jb_Minimizar))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        getContentPane().add(JPanel_Superior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 70));

        JPanel_Inferior.setBackground(new java.awt.Color(132, 229, 125));
        JPanel_Inferior.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        JPanel_Inferior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Jl_Flecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha.png"))); // NOI18N
        JPanel_Inferior.add(Jl_Flecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 48, -1, -1));

        Jl_SistemaRiego.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        Jl_SistemaRiego.setForeground(new java.awt.Color(0, 0, 0));
        Jl_SistemaRiego.setText("Editar Sistema de Riego ");
        JPanel_Inferior.add(Jl_SistemaRiego, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 38, -1, -1));

        jDateChooser1.setBackground(new java.awt.Color(132, 229, 125));
        JPanel_Inferior.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 137, 225, 34));

        Jl_SolicitudFechaInicio.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        Jl_SolicitudFechaInicio.setForeground(new java.awt.Color(0, 0, 0));
        Jl_SolicitudFechaInicio.setText("Dia Inicio:");
        JPanel_Inferior.add(Jl_SolicitudFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 137, -1, 34));

        Jl_SolicitudFechaFin.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        Jl_SolicitudFechaFin.setForeground(new java.awt.Color(0, 0, 0));
        Jl_SolicitudFechaFin.setText("Dia Fin:");
        JPanel_Inferior.add(Jl_SolicitudFechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 253, -1, -1));

        jDateChooser2.setBackground(new java.awt.Color(132, 229, 125));
        JPanel_Inferior.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 253, 225, -1));

        Jl_SolicitudHoraInicio.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        Jl_SolicitudHoraInicio.setForeground(new java.awt.Color(0, 0, 0));
        Jl_SolicitudHoraInicio.setText("Hora Inicio:");
        JPanel_Inferior.add(Jl_SolicitudHoraInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 137, -1, -1));

        Jl_SolicitudHoraFin.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        Jl_SolicitudHoraFin.setForeground(new java.awt.Color(0, 0, 0));
        Jl_SolicitudHoraFin.setText("Hora Fin:");
        JPanel_Inferior.add(Jl_SolicitudHoraFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 253, -1, -1));

        jTextField1.setBackground(new java.awt.Color(132, 229, 125));
        jTextField1.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        JPanel_Inferior.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, 100, 29));

        jTextField2.setBackground(new java.awt.Color(132, 229, 125));
        jTextField2.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 0, 0));
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        JPanel_Inferior.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 254, 110, 30));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Volver.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JPanel_Inferior.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 120, 90));

        jLabel7.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Volver");
        JPanel_Inferior.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 100, -1));

        jButton3.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/listo.png"))); // NOI18N
        jButton3.setText("Listo");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JPanel_Inferior.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 328, -1, 60));

        getContentPane().add(JPanel_Inferior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 66, 850, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Jb_VolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jb_VolverMouseClicked
        this.dispose();
    }//GEN-LAST:event_Jb_VolverMouseClicked

    private void Jb_MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jb_MinimizarMouseClicked
        this.setState(EditarRiego.ICONIFIED);
        this.Jb_Minimizar.setSelected(false);
    }//GEN-LAST:event_Jb_MinimizarMouseClicked

    private void JPanel_SuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPanel_SuperiorMousePressed
        XMouse = evt.getX();
        YMouse = evt.getY();
    }//GEN-LAST:event_JPanel_SuperiorMousePressed

    private void JPanel_SuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPanel_SuperiorMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - XMouse, this.getLocation().y + evt.getY() - YMouse);
    }//GEN-LAST:event_JPanel_SuperiorMouseDragged

    public static void main(String args[]) { //Inicio lanzador clase EditarRiego
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
            java.util.logging.Logger.getLogger(EditarRiego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarRiego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarRiego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarRiego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarRiego().setVisible(true);
            }
        });
    } //Fin lanzador clase EditarRiego

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanel_Inferior;
    private javax.swing.JPanel JPanel_Superior;
    private javax.swing.JButton Jb_Minimizar;
    private javax.swing.JButton Jb_Volver;
    private javax.swing.JLabel Jl_Flecha;
    private javax.swing.JLabel Jl_SistemaRiego;
    private javax.swing.JLabel Jl_SolicitudFechaFin;
    private javax.swing.JLabel Jl_SolicitudFechaInicio;
    private javax.swing.JLabel Jl_SolicitudHoraFin;
    private javax.swing.JLabel Jl_SolicitudHoraInicio;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

} //Fin clase EditarRiego
