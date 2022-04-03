package Ventanas;
//LaceSoft - Life2Plants - 11 B - 2018 / 2019
//Hecho por: 
//Carlos Augusto Hernández Zamora
//Janiert Sebastián Salas Castillo
//Natalia Vásquez Mora
//Diego Fernando Victoria López

//Inicio importación de clases necesarias
import Clases.SqlRiegos;
import static java.lang.Integer.getInteger;
import java.util.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
//Fin importación de clases necesarias

public class Riego extends javax.swing.JFrame implements Runnable {

    String hora, minutos, segundos;
    Thread hilo = new Thread(this);
    int x;
    int y;
    String FechaIngresada;

    public Riego() {
        initComponents();
        this.setLocationRelativeTo(null);
        jLfechaA.setText(fechaActual());
        hilo.start();
        setVisible(true);
    }

    public static String fechaActual() {
        Date fechaActual = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatoFecha.format(fechaActual);
    }

    public void horaAtcual() {
        Calendar calendario = new GregorianCalendar();
        Date horaactual = new Date();
        calendario.setTime(horaactual);
        hora = calendario.get(Calendar.HOUR_OF_DAY) > 9 ? "" + calendario.get(Calendar.HOUR_OF_DAY) : "0" + calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE) > 9 ? "" + calendario.get(Calendar.MINUTE) : "0" + calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND) > 9 ? "" + calendario.get(Calendar.SECOND) : "0" + calendario.get(Calendar.SECOND);
    }

    public boolean validar_hora(String hora) {
        boolean b;
        char[] a = hora.toCharArray();
        String[] c = hora.split(":");
        if ((a[0] == ' ') || (a[1] == ' ') || (a[2] == ' ') || (a[3] == ' ') || (a[4] == ' ') || (getInteger(c[0]) > 24) || (getInteger(c[1]) > 59)) {
            b = false;
        } else {
            b = true;
        }
        return b;
    }

    @Override
    public void run() {
        Thread current = Thread.currentThread();
        while (current == hilo) {
            horaAtcual();
            jLhoraA.setText(hora + ":" + minutos + ":" + segundos);
        }
    }

    public void LimpiarDatos() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        BT_minimizar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Jb_Listo = new javax.swing.JButton();
        JDate_DiaInicio = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLfechaA = new javax.swing.JLabel();
        jLhoraA = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        JCb_Horas = new javax.swing.JComboBox<>();
        JCb_Minutos = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        JCbx_Planta = new javax.swing.JComboBox<>();
        JScroll_Descripcion = new javax.swing.JScrollPane();
        Jta_Descripcion = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        JCb_DuracionRiego = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 2, 3, new java.awt.Color(0, 0, 0)));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cerrar2.png"))); // NOI18N
        jButton1.setToolTipText("Cerrar");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        BT_minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Minimizar.png"))); // NOI18N
        BT_minimizar.setToolTipText("Minimizar");
        BT_minimizar.setBorderPainted(false);
        BT_minimizar.setContentAreaFilled(false);
        BT_minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_minimizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(712, Short.MAX_VALUE)
                .addComponent(BT_minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(BT_minimizar))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 70));

        jPanel1.setBackground(new java.awt.Color(132, 229, 125));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 48, -1, -1));

        jLabel2.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        jLabel2.setText("Programar Sistema de Riego ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 38, -1, -1));

        jLabel3.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel3.setText("Dia del riego:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, 34));

        jLabel5.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel5.setText("Minutos:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 110, -1, 30));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Volver.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 110, 80));

        jLabel7.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Volver");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 100, -1));

        Jb_Listo.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        Jb_Listo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/listo.png"))); // NOI18N
        Jb_Listo.setText("Listo");
        Jb_Listo.setBorderPainted(false);
        Jb_Listo.setContentAreaFilled(false);
        Jb_Listo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Jb_Listo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jb_ListoActionPerformed(evt);
            }
        });
        jPanel1.add(Jb_Listo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 340, -1, 60));

        JDate_DiaInicio.setBackground(new java.awt.Color(132, 229, 125));
        JDate_DiaInicio.setDateFormatString("dd/MM/yyyy");
        JDate_DiaInicio.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        JDate_DiaInicio.setMaxSelectableDate(new java.util.Date(4102466480000L));
        JDate_DiaInicio.setMinSelectableDate(new java.util.Date(1557295280000L));
        jPanel1.add(JDate_DiaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 230, 30));

        jLabel8.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel8.setText("Fecha Actual:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        jLabel9.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel9.setText("Hora Actual:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));

        jLfechaA.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLfechaA.setText("DD/MM/YYYY");
        jPanel1.add(jLfechaA, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, -1, -1));

        jLhoraA.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLhoraA.setText("00:00:00");
        jPanel1.add(jLhoraA, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, -1, -1));

        jLabel11.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel11.setText("Hora:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, -1, -1));

        JCb_Horas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24" }));
        jPanel1.add(JCb_Horas, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 60, 30));

        JCb_Minutos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        jPanel1.add(JCb_Minutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 110, 60, 30));

        jLabel14.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel14.setText("Seleccione la planta:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, 30));

        JCbx_Planta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione..." }));
        jPanel1.add(JCbx_Planta, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 190, 30));

        Jta_Descripcion.setColumns(10);
        Jta_Descripcion.setRows(5);
        JScroll_Descripcion.setViewportView(Jta_Descripcion);

        jPanel1.add(JScroll_Descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 320, -1));

        jLabel15.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel15.setText("Duración del riego:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, -1, 30));

        jLabel16.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel16.setText("Descripción:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, -1, 30));

        JCb_DuracionRiego.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "30 Segundos", "1 Minuto", "1,5 Minutos", "2 Minutos", "2,5 Minutos", "3 Minutos", "3,5 Minutos", "4 Minutos", "4,5 Minutos", "5 Minutos", "10 Minutos" }));
        jPanel1.add(JCb_DuracionRiego, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 260, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 66, 850, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void BT_minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_minimizarMouseClicked
        this.setState(Riego.ICONIFIED);
        this.BT_minimizar.setSelected(false);
    }//GEN-LAST:event_BT_minimizarMouseClicked

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        this.dispose();
        MenuAdministrador menu = new MenuAdministrador();
        menu.setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

    private void Jb_ListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb_ListoActionPerformed
        SimpleDateFormat DateFormat = new SimpleDateFormat("dd/MM/yyyy");
        FechaIngresada = DateFormat.format(JDate_DiaInicio.getDate());
        int opcion = SqlRiegos.GuardarRiego(FechaIngresada);
        if (opcion > 0) {
            JOptionPane.showMessageDialog(null, "El riego se ha programado éxitosamente");
            LimpiarDatos();
            SqlRiegos.ListarRiego("");
        } else {
            JOptionPane.showMessageDialog(null, "Error al guardar el riego");
            LimpiarDatos();
        }
    }//GEN-LAST:event_Jb_ListoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        SqlRiegos.TomarPlantas();
    }//GEN-LAST:event_formWindowOpened

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.out.print(SqlRiegos.TomarCantidadRiegos());
    }//GEN-LAST:event_jLabel1MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Riego().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_minimizar;
    public static javax.swing.JComboBox<String> JCb_DuracionRiego;
    public static javax.swing.JComboBox<String> JCb_Horas;
    public static javax.swing.JComboBox<String> JCb_Minutos;
    public static javax.swing.JComboBox<String> JCbx_Planta;
    private com.toedter.calendar.JDateChooser JDate_DiaInicio;
    private javax.swing.JScrollPane JScroll_Descripcion;
    private javax.swing.JButton Jb_Listo;
    public static javax.swing.JTextArea Jta_Descripcion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLfechaA;
    private javax.swing.JLabel jLhoraA;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
