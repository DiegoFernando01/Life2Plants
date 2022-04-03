package Ventanas;
//LaceSoft - Life2Plants - 11 B - 2018 / 2019
//Hecho por: 
//Carlos Augusto Hernández Zamora
//Janiert Sebastián Salas Castillo
//Natalia Vásquez Mora
//Diego Fernando Victoria López

import Animacion.Animacion;
import Clases.SqlPlanta;
import Clases.SqlUsuarios;
import static Ventanas.MenuAdministrador.jPanelPlanta;
import static Ventanas.MenuAdministrador.jPanelRiego;
import static Ventanas.MenuAdministrador.jPanelUsuarios;
import java.awt.Color;
import javax.swing.ImageIcon;

public class MenuUsuario extends javax.swing.JFrame {

    int x;
    int y;

    public MenuUsuario() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.white);
        setIconImage(new ImageIcon("src/Imagenes/logo_vista.png").getImage()); 
        String Código = "";
        SqlUsuarios.nombreCRUD(Código, this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBTcerrar = new javax.swing.JButton();
        jBTminimizar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jBTmenu = new javax.swing.JButton();
        jBTusuarios = new javax.swing.JButton();
        jBTriego = new javax.swing.JButton();
        jBTinformacion = new javax.swing.JButton();
        JBTriegoManual = new javax.swing.JButton();
        jBTvolver = new javax.swing.JButton();
        jLusuarios = new javax.swing.JLabel();
        jLriego = new javax.swing.JLabel();
        jLinformacion = new javax.swing.JLabel();
        jLvolver = new javax.swing.JLabel();
        jLriegoManual = new javax.swing.JLabel();
        jPanelPrincipal = new javax.swing.JPanel();
        jPanelUsuarios = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLContraseña = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLPrimerNombre = new javax.swing.JLabel();
        jLSegundoNombre = new javax.swing.JLabel();
        jLPrimerApellido = new javax.swing.JLabel();
        jLSegundoApellido = new javax.swing.JLabel();
        jLCódigo = new javax.swing.JLabel();
        jLCorreo = new javax.swing.JLabel();
        jLTelefono = new javax.swing.JLabel();
        jLDireccion = new javax.swing.JLabel();
        jPanelRiego = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jPanelPlanta = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTabla_Planta = new rojerusan.RSTableMetro();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
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

        jBTcerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cerrar2.png"))); // NOI18N
        jBTcerrar.setToolTipText("Cerrar");
        jBTcerrar.setBorderPainted(false);
        jBTcerrar.setContentAreaFilled(false);
        jBTcerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBTcerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBTcerrarMouseClicked(evt);
            }
        });

        jBTminimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Minimizar.png"))); // NOI18N
        jBTminimizar.setToolTipText("Minimizar");
        jBTminimizar.setBorderPainted(false);
        jBTminimizar.setContentAreaFilled(false);
        jBTminimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBTminimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBTminimizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(1106, Short.MAX_VALUE)
                .addComponent(jBTminimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBTcerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBTminimizar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBTcerrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBTmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Menu.png"))); // NOI18N
        jBTmenu.setBorderPainted(false);
        jBTmenu.setContentAreaFilled(false);
        jBTmenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBTmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBTmenuMouseClicked(evt);
            }
        });
        jPanel2.add(jBTmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 51, 41));

        jBTusuarios.setFont(new java.awt.Font("Agency FB", 1, 30)); // NOI18N
        jBTusuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/users.png"))); // NOI18N
        jBTusuarios.setText("USUARIOS");
        jBTusuarios.setBorderPainted(false);
        jBTusuarios.setContentAreaFilled(false);
        jBTusuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBTusuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBTusuariosMouseClicked(evt);
            }
        });
        jBTusuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTusuariosActionPerformed(evt);
            }
        });
        jPanel2.add(jBTusuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(-250, 70, 250, 70));

        jBTriego.setFont(new java.awt.Font("Agency FB", 1, 30)); // NOI18N
        jBTriego.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/planta.png"))); // NOI18N
        jBTriego.setText("RIEGO");
        jBTriego.setBorderPainted(false);
        jBTriego.setContentAreaFilled(false);
        jBTriego.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBTriego.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBTriegoMouseClicked(evt);
            }
        });
        jBTriego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTriegoActionPerformed(evt);
            }
        });
        jPanel2.add(jBTriego, new org.netbeans.lib.awtextra.AbsoluteConstraints(-250, 170, 250, 70));

        jBTinformacion.setFont(new java.awt.Font("Agency FB", 1, 30)); // NOI18N
        jBTinformacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Informacion.png"))); // NOI18N
        jBTinformacion.setText("INFORMACION");
        jBTinformacion.setBorderPainted(false);
        jBTinformacion.setContentAreaFilled(false);
        jBTinformacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBTinformacion.setPreferredSize(new java.awt.Dimension(250, 100));
        jBTinformacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBTinformacionMouseClicked(evt);
            }
        });
        jBTinformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTinformacionActionPerformed(evt);
            }
        });
        jPanel2.add(jBTinformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(-250, 270, 250, 70));

        JBTriegoManual.setFont(new java.awt.Font("Agency FB", 1, 30)); // NOI18N
        JBTriegoManual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/riegoManual.png"))); // NOI18N
        JBTriegoManual.setText("RIEGO MANUAL");
        JBTriegoManual.setContentAreaFilled(false);
        JBTriegoManual.setDefaultCapable(false);
        JBTriegoManual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBTriegoManualMouseClicked(evt);
            }
        });
        jPanel2.add(JBTriegoManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(-250, 370, 250, 70));

        jBTvolver.setFont(new java.awt.Font("Agency FB", 1, 30)); // NOI18N
        jBTvolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/z.png"))); // NOI18N
        jBTvolver.setText("CERRAR SESIÓN");
        jBTvolver.setBorderPainted(false);
        jBTvolver.setContentAreaFilled(false);
        jBTvolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBTvolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBTvolverMouseClicked(evt);
            }
        });
        jBTvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTvolverActionPerformed(evt);
            }
        });
        jPanel2.add(jBTvolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(-250, 470, 250, 70));

        jLusuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton1.png"))); // NOI18N
        jPanel2.add(jLusuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(-250, 70, -1, 70));

        jLriego.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton2.png"))); // NOI18N
        jPanel2.add(jLriego, new org.netbeans.lib.awtextra.AbsoluteConstraints(-250, 170, -1, 70));

        jLinformacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton3.png"))); // NOI18N
        jPanel2.add(jLinformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(-250, 270, -1, 70));

        jLvolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton4.png"))); // NOI18N
        jPanel2.add(jLvolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(-250, 470, -1, 70));

        jLriegoManual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton3.png"))); // NOI18N
        jPanel2.add(jLriegoManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(-250, 370, -1, 70));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 263, 560));

        jPanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        jPanelUsuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Agency FB", 0, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INFORMACIÓN DE USUARIO");
        jPanelUsuarios.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 16, 868, 30));

        jLabel5.setFont(new java.awt.Font("Agency FB", 0, 30)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Primer Apellido:");
        jPanelUsuarios.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 157, -1));

        jLabel6.setFont(new java.awt.Font("Agency FB", 0, 30)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Primer Nombre:");
        jPanelUsuarios.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 189, 157, -1));

        jLabel7.setFont(new java.awt.Font("Agency FB", 0, 30)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Segundo Nombre:");
        jPanelUsuarios.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 243, -1, -1));

        jLabel8.setFont(new java.awt.Font("Agency FB", 0, 30)); // NOI18N
        jLabel8.setText("Segundo Apellido:");
        jPanelUsuarios.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 157, -1));

        jLContraseña.setFont(new java.awt.Font("Agency FB", 0, 30)); // NOI18N
        jPanelUsuarios.add(jLContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, 211, 36));

        jLabel9.setFont(new java.awt.Font("Agency FB", 0, 30)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Código:");
        jPanelUsuarios.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 135, 157, -1));

        jLPrimerNombre.setFont(new java.awt.Font("Agency FB", 0, 30)); // NOI18N
        jPanelUsuarios.add(jLPrimerNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 189, 211, 35));

        jLSegundoNombre.setFont(new java.awt.Font("Agency FB", 0, 30)); // NOI18N
        jPanelUsuarios.add(jLSegundoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 243, 211, 36));

        jLPrimerApellido.setFont(new java.awt.Font("Agency FB", 0, 30)); // NOI18N
        jPanelUsuarios.add(jLPrimerApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, 211, 36));

        jLSegundoApellido.setFont(new java.awt.Font("Agency FB", 0, 30)); // NOI18N
        jPanelUsuarios.add(jLSegundoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 211, 36));

        jLCódigo.setFont(new java.awt.Font("Agency FB", 0, 30)); // NOI18N
        jPanelUsuarios.add(jLCódigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 135, 211, 36));

        jLCorreo.setFont(new java.awt.Font("Agency FB", 0, 30)); // NOI18N
        jPanelUsuarios.add(jLCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, 211, 36));

        jLTelefono.setFont(new java.awt.Font("Agency FB", 0, 30)); // NOI18N
        jPanelUsuarios.add(jLTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, 211, 36));

        jLDireccion.setFont(new java.awt.Font("Agency FB", 0, 30)); // NOI18N
        jPanelUsuarios.add(jLDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, 211, 36));

        jPanelPrincipal.add(jPanelUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 37, 880, 500));

        jPanelRiego.setBackground(new java.awt.Color(255, 255, 255));
        jPanelRiego.setPreferredSize(new java.awt.Dimension(880, 556));
        jPanelRiego.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Agency FB", 0, 30)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("RIEGOS RESGISTRADOS");
        jPanelRiego.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 868, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha2.png"))); // NOI18N
        jPanelRiego.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/REGAR.png"))); // NOI18N
        jButton1.setToolTipText("Riego");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanelRiego.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mesa.png"))); // NOI18N
        jPanelRiego.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 278, -1, -1));

        jPanelPrincipal.add(jPanelRiego, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 37, 880, 500));

        jPanelPlanta.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPlanta.setPreferredSize(new java.awt.Dimension(880, 556));
        jPanelPlanta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelPlantaMouseClicked(evt);
            }
        });

        jTabla_Planta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Descripcion", "Imagen"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTabla_Planta.setColorBackgoundHead(new java.awt.Color(50, 199, 39));
        jTabla_Planta.setColorFilasForeground1(new java.awt.Color(50, 199, 39));
        jTabla_Planta.setColorFilasForeground2(new java.awt.Color(50, 199, 39));
        jTabla_Planta.setColorSelBackgound(new java.awt.Color(50, 199, 39));
        jTabla_Planta.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jTabla_Planta);

        jLabel3.setFont(new java.awt.Font("Agency FB", 0, 30)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("INFORMACION DE PLANTAS");

        javax.swing.GroupLayout jPanelPlantaLayout = new javax.swing.GroupLayout(jPanelPlanta);
        jPanelPlanta.setLayout(jPanelPlantaLayout);
        jPanelPlantaLayout.setHorizontalGroup(
            jPanelPlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPlantaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 868, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelPlantaLayout.setVerticalGroup(
            jPanelPlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPlantaLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel3)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelPrincipal.add(jPanelPlanta, new org.netbeans.lib.awtextra.AbsoluteConstraints(2000, 37, 880, 500));

        getContentPane().add(jPanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 67, 950, 553));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jBTvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTvolverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBTvolverActionPerformed

    private void jBTusuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTusuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBTusuariosActionPerformed

    private void jBTriegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTriegoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBTriegoActionPerformed

    private void jBTinformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTinformacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBTinformacionActionPerformed

    private void jBTmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBTmenuMouseClicked
        int posicion = jBTmenu.getX();
        if (posicion > 10) {
            Animacion.mover_izquierda(200, 10, 10, 5, jBTmenu);
            Animacion.mover_izquierda(0, -250, 10, 5, jBTusuarios);
            Animacion.mover_izquierda(0, -250, 10, 5, jLusuarios);
            Animacion.mover_izquierda(0, -250, 10, 5, jBTriego);
            Animacion.mover_izquierda(0, -250, 10, 5, jLriego);
            Animacion.mover_izquierda(0, -250, 10, 5, jBTinformacion);
            Animacion.mover_izquierda(0, -250, 10, 5, jLinformacion);
            Animacion.mover_izquierda(0, -250, 10, 5, JBTriegoManual);
            Animacion.mover_izquierda(0, -250, 10, 5, jLriegoManual);
            Animacion.mover_izquierda(0, -250, 10, 5, jBTvolver);
            Animacion.mover_izquierda(0, -250, 10, 5, jLvolver);
        } else {
            Animacion.mover_derecha(10, 200, 10, 5, jBTmenu);
            Animacion.mover_derecha(-250, 0, 10, 5, jBTusuarios);
            Animacion.mover_derecha(-250, 0, 10, 5, jLusuarios);
            Animacion.mover_derecha(-250, 0, 10, 5, jBTriego);
            Animacion.mover_derecha(-250, 0, 10, 5, jLriego);
            Animacion.mover_derecha(-250, 0, 10, 5, jBTinformacion);
            Animacion.mover_derecha(-250, 0, 10, 5, jLinformacion);
            Animacion.mover_derecha(-250, 0, 10, 5, JBTriegoManual);
            Animacion.mover_derecha(-250, 0, 10, 5, jLriegoManual);
            Animacion.mover_derecha(-250, 0, 10, 5, jBTvolver);
            Animacion.mover_derecha(-250, 0, 10, 5, jLvolver);
        }
    }//GEN-LAST:event_jBTmenuMouseClicked

    private void jBTcerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBTcerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jBTcerrarMouseClicked

    private void jBTminimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBTminimizarMouseClicked
        this.setState(MenuUsuario.ICONIFIED);
        this.jBTminimizar.setSelected(false);
    }//GEN-LAST:event_jBTminimizarMouseClicked

    private void jBTusuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBTusuariosMouseClicked
        int posicion3 = jPanelPlanta.getX();
        int posicion2 = jPanelRiego.getX();
        if(posicion3==20){
        Animacion.mover_derecha(-2000,16, 8, 5, jPanelUsuarios);
        Animacion.mover_derecha(-1000,1000, 8, 5, jPanelRiego);
        Animacion.mover_derecha(16,2000, 8, 5, jPanelPlanta);
        }
        if(posicion2==20 || posicion2==15){
        Animacion.mover_derecha(-1000, 16, 8, 5, jPanelUsuarios);
        Animacion.mover_derecha(20, 2000, 8, 5, jPanelRiego);
        }

    }//GEN-LAST:event_jBTusuariosMouseClicked

    private void jBTriegoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBTriegoMouseClicked
        int posicion1 = jPanelUsuarios.getX();
        int posicion3 = jPanelPlanta.getX();
        if(posicion1==16 || posicion1==15){
        Animacion.mover_izquierda(16, -2000, 8, 5, jPanelUsuarios);
        Animacion.mover_izquierda(1000, 16, 8, 5, jPanelRiego);
        }
        if(posicion3==20){
        Animacion.mover_derecha(-1000, 16, 8, 5, jPanelRiego);
        Animacion.mover_derecha(posicion3, 1000, 8, 5, jPanelPlanta);
        }
    }//GEN-LAST:event_jBTriegoMouseClicked

    private void jPanelPlantaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelPlantaMouseClicked

    }//GEN-LAST:event_jPanelPlantaMouseClicked

    private void jBTinformacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBTinformacionMouseClicked
       SqlPlanta.ListarPlanta2("", jTabla_Planta);
        int posicion1 = jPanelUsuarios.getX();
        int posicion2 = jPanelRiego.getX();
        if(posicion1==16 || posicion1==15){
        Animacion.mover_izquierda(  16 ,-2000 , 8, 5, jPanelUsuarios);
        Animacion.mover_izquierda(1000, -1000 , 8, 5, jPanelRiego);
        Animacion.mover_izquierda(2000, 16, 8, 5, jPanelPlanta);
        }
        if(posicion2==20 || posicion2==15){
        Animacion.mover_izquierda(16, -1000, 8, 5, jPanelRiego);
        Animacion.mover_izquierda(1000, 16, 8, 5, jPanelPlanta);
        }
    }//GEN-LAST:event_jBTinformacionMouseClicked

    private void jBTvolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBTvolverMouseClicked
        this.dispose();
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_jBTvolverMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
    Riego riego = new Riego();
    riego.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void JBTriegoManualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBTriegoManualMouseClicked
        RiegoManual RM = new RiegoManual();
        RM.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_JBTriegoManualMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBTriegoManual;
    private javax.swing.JButton jBTcerrar;
    private javax.swing.JButton jBTinformacion;
    private javax.swing.JButton jBTmenu;
    private javax.swing.JButton jBTminimizar;
    private javax.swing.JButton jBTriego;
    private javax.swing.JButton jBTusuarios;
    private javax.swing.JButton jBTvolver;
    private javax.swing.JButton jButton1;
    public static javax.swing.JLabel jLContraseña;
    public static javax.swing.JLabel jLCorreo;
    public static javax.swing.JLabel jLCódigo;
    public static javax.swing.JLabel jLDireccion;
    public static javax.swing.JLabel jLPrimerApellido;
    public static javax.swing.JLabel jLPrimerNombre;
    public static javax.swing.JLabel jLSegundoApellido;
    public static javax.swing.JLabel jLSegundoNombre;
    public static javax.swing.JLabel jLTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLinformacion;
    private javax.swing.JLabel jLriego;
    private javax.swing.JLabel jLriegoManual;
    private javax.swing.JLabel jLusuarios;
    private javax.swing.JLabel jLvolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelPlanta;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPanel jPanelRiego;
    private javax.swing.JPanel jPanelUsuarios;
    private javax.swing.JScrollPane jScrollPane3;
    public static rojerusan.RSTableMetro jTabla_Planta;
    // End of variables declaration//GEN-END:variables
}
