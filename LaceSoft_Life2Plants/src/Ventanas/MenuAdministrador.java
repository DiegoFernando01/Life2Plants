package Ventanas;
//LaceSoft - Life2Plants - 11 B - 2018 / 2019
//Hecho por: 
//Carlos Augusto Hernández Zamora
//Janiert Sebastián Salas Castillo
//Natalia Vásquez Mora
//Diego Fernando Victoria López

import Animacion.Animacion;
import Clases.Conexion;
import Clases.SqlPlanta;
import Clases.SqlRiegos;
import Clases.SqlUsuarios;
import static Ventanas.Riego.fechaActual;
import com.sun.jndi.ldap.Connection;
import java.awt.Color;
import static java.lang.Integer.getInteger;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class MenuAdministrador extends javax.swing.JFrame{

    int x;
    int y;
    String ruta = null;
    String hora, minutos, segundos;
    
    
    public MenuAdministrador() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.white);
        System.err.println("Constructor MenuAdministrador abierto");
        SqlUsuarios.listarUsuario("");
        SqlRiegos.ListarRiego("");
        setIconImage(new ImageIcon("src/Imagenes/logo_vista.png").getImage());
        
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
        jBTplanta = new javax.swing.JButton();
        jBTvolver = new javax.swing.JButton();
        jLusuarios = new javax.swing.JLabel();
        jLriego = new javax.swing.JLabel();
        jLinformacion = new javax.swing.JLabel();
        jLvolver = new javax.swing.JLabel();
        BT_riegoManual = new javax.swing.JButton();
        LB_riegoManual = new javax.swing.JLabel();
        jPanelPrincipal = new javax.swing.JPanel();
        jPanelUsuarios = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuario = new rojerusan.RSTableMetro();
        jBTeditarUsuario = new javax.swing.JButton();
        jBTagregarUsuario = new javax.swing.JButton();
        jBTeliminarUsuario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTFbuscarr = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanelRiego = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTable_Riegos = new rojerusan.RSTableMetro();
        jBTagregarRiego = new javax.swing.JButton();
        jBTeliminarRiego = new javax.swing.JButton();
        jBTeditarRiego = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Jt_BuscarRiego = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanelPlanta = new javax.swing.JPanel();
        jBTagregarPlanta = new javax.swing.JButton();
        jBTeliminarPlanta = new javax.swing.JButton();
        jBTeditarPlanta = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTabla_Planta = new rojerusan.RSTableMetro();

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
        jBTmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTmenuActionPerformed(evt);
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

        jBTplanta.setFont(new java.awt.Font("Agency FB", 1, 30)); // NOI18N
        jBTplanta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Informacion.png"))); // NOI18N
        jBTplanta.setText("PLANTA");
        jBTplanta.setBorderPainted(false);
        jBTplanta.setContentAreaFilled(false);
        jBTplanta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBTplanta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBTplantaMouseClicked(evt);
            }
        });
        jBTplanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTplantaActionPerformed(evt);
            }
        });
        jPanel2.add(jBTplanta, new org.netbeans.lib.awtextra.AbsoluteConstraints(-250, 270, 250, 70));

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
        jPanel2.add(jLriego, new org.netbeans.lib.awtextra.AbsoluteConstraints(-250, 170, 250, 70));

        jLinformacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton3.png"))); // NOI18N
        jPanel2.add(jLinformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(-250, 270, 250, 70));

        jLvolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton4.png"))); // NOI18N
        jPanel2.add(jLvolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(-250, 470, 250, 70));

        BT_riegoManual.setFont(new java.awt.Font("Agency FB", 1, 30)); // NOI18N
        BT_riegoManual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/riegoManual.png"))); // NOI18N
        BT_riegoManual.setText("RIEGO MANUAL");
        BT_riegoManual.setBorderPainted(false);
        BT_riegoManual.setContentAreaFilled(false);
        BT_riegoManual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_riegoManual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_riegoManualMouseClicked(evt);
            }
        });
        BT_riegoManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_riegoManualActionPerformed(evt);
            }
        });
        jPanel2.add(BT_riegoManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(-250, 370, 250, 70));

        LB_riegoManual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton3.png"))); // NOI18N
        jPanel2.add(LB_riegoManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(-250, 370, 250, 70));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 263, 560));

        jPanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelUsuarios.setBackground(new java.awt.Color(255, 255, 255));

        tablaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Primer Nombre", "Segundo nombre", "Primer Apellido", "Segundo Apellido", "Correo", "Direccion", "Telefono", "PassWord", "Tipo Perfil"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaUsuario.setColorBackgoundHead(new java.awt.Color(50, 199, 39));
        tablaUsuario.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tablaUsuario.setColorFilasForeground1(new java.awt.Color(50, 199, 39));
        tablaUsuario.setColorFilasForeground2(new java.awt.Color(50, 199, 39));
        tablaUsuario.setColorSelBackgound(new java.awt.Color(50, 199, 39));
        tablaUsuario.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaUsuario);

        jBTeditarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        jBTeditarUsuario.setToolTipText("Editar Usuario");
        jBTeditarUsuario.setBorderPainted(false);
        jBTeditarUsuario.setContentAreaFilled(false);
        jBTeditarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBTeditarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBTeditarUsuarioMouseClicked(evt);
            }
        });

        jBTagregarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar.png"))); // NOI18N
        jBTagregarUsuario.setToolTipText("Agregar Usuario");
        jBTagregarUsuario.setBorderPainted(false);
        jBTagregarUsuario.setContentAreaFilled(false);
        jBTagregarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBTagregarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBTagregarUsuarioMouseClicked(evt);
            }
        });

        jBTeliminarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user_delete.png"))); // NOI18N
        jBTeliminarUsuario.setToolTipText("Eliminar Usuario");
        jBTeliminarUsuario.setBorderPainted(false);
        jBTeliminarUsuario.setContentAreaFilled(false);
        jBTeliminarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBTeliminarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBTeliminarUsuarioMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Agency FB", 0, 30)); // NOI18N
        jLabel1.setText("USUARIOS REGISTRADOS");

        jTFbuscarr.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jTFbuscarr.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTFbuscarrCaretUpdate(evt);
            }
        });
        jTFbuscarr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFbuscarrActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Agency FB", 0, 30)); // NOI18N
        jLabel4.setText("Buscar:");

        javax.swing.GroupLayout jPanelUsuariosLayout = new javax.swing.GroupLayout(jPanelUsuarios);
        jPanelUsuarios.setLayout(jPanelUsuariosLayout);
        jPanelUsuariosLayout.setHorizontalGroup(
            jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanelUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelUsuariosLayout.createSequentialGroup()
                        .addComponent(jBTagregarUsuario)
                        .addGap(18, 18, 18)
                        .addComponent(jBTeliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBTeditarUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jTFbuscarr, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93))
                    .addGroup(jPanelUsuariosLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanelUsuariosLayout.setVerticalGroup(
            jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelUsuariosLayout.createSequentialGroup()
                .addGroup(jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelUsuariosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTFbuscarr, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelUsuariosLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBTeliminarUsuario, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBTagregarUsuario, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBTeditarUsuario, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)))
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        jPanelPrincipal.add(jPanelUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 37, 880, 500));

        jPanelRiego.setBackground(new java.awt.Color(255, 255, 255));
        jPanelRiego.setPreferredSize(new java.awt.Dimension(880, 556));

        JTable_Riegos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Codigo Usuario", "ID Planta", "Descripcion", "Fecha Inicio", "Hora Inicio", "Minuto Inicio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTable_Riegos.setColorBackgoundHead(new java.awt.Color(50, 199, 39));
        JTable_Riegos.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        JTable_Riegos.setColorFilasForeground1(new java.awt.Color(50, 199, 39));
        JTable_Riegos.setColorFilasForeground2(new java.awt.Color(50, 199, 39));
        JTable_Riegos.setColorSelBackgound(new java.awt.Color(50, 199, 39));
        JTable_Riegos.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(JTable_Riegos);

        jBTagregarRiego.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AgregarRiego.png"))); // NOI18N
        jBTagregarRiego.setToolTipText("Agregar Riego");
        jBTagregarRiego.setBorderPainted(false);
        jBTagregarRiego.setContentAreaFilled(false);
        jBTagregarRiego.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBTagregarRiego.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBTagregarRiegoMouseClicked(evt);
            }
        });
        jBTagregarRiego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTagregarRiegoActionPerformed(evt);
            }
        });

        jBTeliminarRiego.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/EliminarRiego.png"))); // NOI18N
        jBTeliminarRiego.setToolTipText("Eliminar Riego");
        jBTeliminarRiego.setBorderPainted(false);
        jBTeliminarRiego.setContentAreaFilled(false);
        jBTeliminarRiego.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBTeliminarRiego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTeliminarRiegoActionPerformed(evt);
            }
        });

        jBTeditarRiego.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/EditarRiego.png"))); // NOI18N
        jBTeditarRiego.setToolTipText("Editar Riego");
        jBTeditarRiego.setBorderPainted(false);
        jBTeditarRiego.setContentAreaFilled(false);
        jBTeditarRiego.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBTeditarRiego.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBTeditarRiegoMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Agency FB", 0, 30)); // NOI18N
        jLabel2.setText("RIEGOS RESGISTRADOS");

        Jt_BuscarRiego.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        Jt_BuscarRiego.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Jt_BuscarRiegoKeyTyped(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Archivo.png"))); // NOI18N
        jButton2.setToolTipText("Generar Reporte");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelRiegoLayout = new javax.swing.GroupLayout(jPanelRiego);
        jPanelRiego.setLayout(jPanelRiegoLayout);
        jPanelRiegoLayout.setHorizontalGroup(
            jPanelRiegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRiegoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRiegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRiegoLayout.createSequentialGroup()
                        .addComponent(jBTagregarRiego)
                        .addGap(18, 18, 18)
                        .addComponent(jBTeliminarRiego)
                        .addGap(18, 18, 18)
                        .addComponent(jBTeditarRiego)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                        .addComponent(Jt_BuscarRiego, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jButton5))
                    .addGroup(jPanelRiegoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelRiegoLayout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())))
        );
        jPanelRiegoLayout.setVerticalGroup(
            jPanelRiegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRiegoLayout.createSequentialGroup()
                .addGroup(jPanelRiegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRiegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Jt_BuscarRiego, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton5))
                    .addGroup(jPanelRiegoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelRiegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBTeditarRiego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBTeliminarRiego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBTagregarRiego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelPrincipal.add(jPanelRiego, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 37, 880, 500));

        jPanelPlanta.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPlanta.setPreferredSize(new java.awt.Dimension(880, 556));

        jBTagregarPlanta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AgregarPlanta.png"))); // NOI18N
        jBTagregarPlanta.setToolTipText("Agregar Riego");
        jBTagregarPlanta.setBorderPainted(false);
        jBTagregarPlanta.setContentAreaFilled(false);
        jBTagregarPlanta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBTagregarPlanta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBTagregarPlantaMouseClicked(evt);
            }
        });
        jBTagregarPlanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTagregarPlantaActionPerformed(evt);
            }
        });

        jBTeliminarPlanta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/EliminarPlanta.png"))); // NOI18N
        jBTeliminarPlanta.setToolTipText("Eliminar Riego");
        jBTeliminarPlanta.setBorderPainted(false);
        jBTeliminarPlanta.setContentAreaFilled(false);
        jBTeliminarPlanta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBTeliminarPlanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTeliminarPlantaActionPerformed(evt);
            }
        });

        jBTeditarPlanta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/EditarPlanta.png"))); // NOI18N
        jBTeditarPlanta.setToolTipText("Editar Riego");
        jBTeditarPlanta.setBorderPainted(false);
        jBTeditarPlanta.setContentAreaFilled(false);
        jBTeditarPlanta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBTeditarPlanta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBTeditarPlantaMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Agency FB", 0, 30)); // NOI18N
        jLabel3.setText("INFORMACION DE PLANTAS");

        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);

        jTabla_Planta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Descripción", "Imagen"
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

        javax.swing.GroupLayout jPanelPlantaLayout = new javax.swing.GroupLayout(jPanelPlanta);
        jPanelPlanta.setLayout(jPanelPlantaLayout);
        jPanelPlantaLayout.setHorizontalGroup(
            jPanelPlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPlantaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPlantaLayout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addContainerGap())
                    .addGroup(jPanelPlantaLayout.createSequentialGroup()
                        .addGroup(jPanelPlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPlantaLayout.createSequentialGroup()
                                .addComponent(jBTagregarPlanta)
                                .addGap(18, 18, 18)
                                .addComponent(jBTeliminarPlanta)
                                .addGap(18, 18, 18)
                                .addComponent(jBTeditarPlanta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 204, Short.MAX_VALUE)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelPlantaLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(26, 26, 26)
                        .addComponent(jButton6))))
        );
        jPanelPlantaLayout.setVerticalGroup(
            jPanelPlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPlantaLayout.createSequentialGroup()
                .addGroup(jPanelPlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBTagregarPlanta)
                    .addComponent(jBTeliminarPlanta)
                    .addComponent(jBTeditarPlanta)
                    .addGroup(jPanelPlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton6)))
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
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

    private void jBTplantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTplantaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBTplantaActionPerformed

    private void jBTmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBTmenuMouseClicked
        int posicion = jBTmenu.getX();
        if (posicion > 10) {
            Animacion.mover_izquierda(200, 10, 10, 5, jBTmenu);
            Animacion.mover_izquierda(0, -250, 10, 5, jBTusuarios);
            Animacion.mover_izquierda(0, -250, 10, 5, jLusuarios);
            Animacion.mover_izquierda(0, -250, 10, 5, jBTriego);
            Animacion.mover_izquierda(0, -250, 10, 5, jLriego);
            Animacion.mover_izquierda(0, -250, 10, 5, jBTplanta);
            Animacion.mover_izquierda(0, -250, 10, 5, jLinformacion);
            Animacion.mover_izquierda(0, -250, 10, 5, jBTvolver);
            Animacion.mover_izquierda(0, -250, 10, 5, BT_riegoManual);
            Animacion.mover_izquierda(0, -250, 10, 5, LB_riegoManual);
            Animacion.mover_izquierda(0, -250, 10, 5, jLvolver);
        } else {
            Animacion.mover_derecha(10, 200, 10, 5, jBTmenu);
            Animacion.mover_derecha(-250, 0, 10, 5, jBTusuarios);
            Animacion.mover_derecha(-250, 0, 10, 5, jLusuarios);
            Animacion.mover_derecha(-250, 0, 10, 5, jBTriego);
            Animacion.mover_derecha(-250, 0, 10, 5, jLriego);
            Animacion.mover_derecha(-250, 0, 10, 5, jBTplanta);
            Animacion.mover_derecha(-250, 0, 10, 5, jLinformacion);
            Animacion.mover_derecha(-250, 0, 10, 5, BT_riegoManual);
            Animacion.mover_derecha(-250, 0, 10, 5, LB_riegoManual);
            Animacion.mover_derecha(-250, 0, 10, 5, jBTvolver);
            Animacion.mover_derecha(-250, 0, 10, 5, jLvolver);
        }
    }//GEN-LAST:event_jBTmenuMouseClicked

    private void jBTcerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBTcerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jBTcerrarMouseClicked

    private void jBTminimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBTminimizarMouseClicked
        this.setState(MenuAdministrador.ICONIFIED);
        this.jBTminimizar.setSelected(false);
    }//GEN-LAST:event_jBTminimizarMouseClicked

    private void jBTeliminarRiegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTeliminarRiegoActionPerformed
        if (MenuAdministrador.JTable_Riegos.getRowCount() < 1) {
            JOptionPane.showMessageDialog(this, "No hay asignacion de riego");
        } else {
            if (MenuAdministrador.JTable_Riegos.getSelectedRowCount() < 1) {
                JOptionPane.showMessageDialog(this, "Seleccione un registro");
            } else {
                int fila = MenuAdministrador.JTable_Riegos.getSelectedRow();

                if (MenuAdministrador.JTable_Riegos.getValueAt(fila, 0).toString().equals("111111")) {

                    JOptionPane.showMessageDialog(this, "No es posible eliminar esta asigancion de riego");
                } else {
                    int confirmar = JOptionPane.showConfirmDialog(this, "¿Esta seguro de eliminar esta asigancion de riego?");
                    if (confirmar == 0) {
                        int elimina = SqlRiegos.eliminar(Integer.parseInt(MenuAdministrador.JTable_Riegos.getValueAt(fila, 0).toString()));
                        if (elimina != 0) {
                            SqlRiegos.ListarRiego("");

                        }
                    }
                }

            }

        }
    }//GEN-LAST:event_jBTeliminarRiegoActionPerformed

    private void jBTagregarRiegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTagregarRiegoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBTagregarRiegoActionPerformed

    private void jBTagregarPlantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTagregarPlantaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBTagregarPlantaActionPerformed

    private void jBTeliminarPlantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTeliminarPlantaActionPerformed
        if (MenuAdministrador.jTabla_Planta.getRowCount() < 1) {
            JOptionPane.showMessageDialog(this, "No hay una planta");
        } else {
            if (MenuAdministrador.jTabla_Planta.getSelectedRowCount() < 1) {
                JOptionPane.showMessageDialog(this, "Seleccione un registro");
            } else {
                int fila = MenuAdministrador.jTabla_Planta.getSelectedRow();

                if (MenuAdministrador.jTabla_Planta.getValueAt(fila, 0).toString().equals("111111")) {

                    JOptionPane.showMessageDialog(this, "No es posible eliminar esta planta");
                } else {
                    int confirmar = JOptionPane.showConfirmDialog(this, "¿Esta seguro de eliminar esta planta?");
                    if (confirmar == 0) {
                        int elimina = SqlRiegos.eliminar(Integer.parseInt(MenuAdministrador.jTabla_Planta.getValueAt(fila, 0).toString()));
                        if (elimina != 0) {
                            SqlPlanta.ListarPlanta("", jTabla_Planta);

                        }
                    }
                }

            }

        }
    }//GEN-LAST:event_jBTeliminarPlantaActionPerformed

    private void jBTusuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBTusuariosMouseClicked
        SqlUsuarios.listarUsuario("");
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
        SqlRiegos.ListarRiego("");
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

    private void jBTplantaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBTplantaMouseClicked
        SqlPlanta planta = new SqlPlanta();
        planta.ListarPlanta("",jTabla_Planta);
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
        
    }//GEN-LAST:event_jBTplantaMouseClicked

    private void jBTvolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBTvolverMouseClicked
        this.dispose();
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_jBTvolverMouseClicked

    private void jBTagregarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBTagregarUsuarioMouseClicked
        Registro1 registro = new Registro1();
        registro.setVisible(true);
    }//GEN-LAST:event_jBTagregarUsuarioMouseClicked

    private void jBTeditarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBTeditarUsuarioMouseClicked
        EditarUsuario editar = new EditarUsuario();
        editar.setVisible(true);
    }//GEN-LAST:event_jBTeditarUsuarioMouseClicked

    private void jBTeliminarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBTeliminarUsuarioMouseClicked

        if (MenuAdministrador.tablaUsuario.getRowCount() < 1) {
            JOptionPane.showMessageDialog(this, "No hay usuarios");
        } else {
            if (MenuAdministrador.tablaUsuario.getSelectedRowCount() < 1) {
                JOptionPane.showMessageDialog(this, "Seleccione un registro");
            } else {
                int fila = MenuAdministrador.tablaUsuario.getSelectedRow();

                if (MenuAdministrador.tablaUsuario.getValueAt(fila, 0).toString().equals("111111")) {

                    JOptionPane.showMessageDialog(this, "No es posible eliminar este usuario");
                } else {
                    int confirmar = JOptionPane.showConfirmDialog(this, "¿Esta seguro de eliminar el usuario?");
                    if (confirmar == 0) {
                        int elimina = SqlUsuarios.eliminar(Integer.parseInt(MenuAdministrador.tablaUsuario.getValueAt(fila, 0).toString()));
                        if (elimina != 0) {
                            SqlUsuarios.listarUsuario("");

                        }
                    }
                }

            }

        }
    }//GEN-LAST:event_jBTeliminarUsuarioMouseClicked

    private void jBTagregarRiegoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBTagregarRiegoMouseClicked
        Riego riego = new Riego();
        riego.setVisible(true);
    }//GEN-LAST:event_jBTagregarRiegoMouseClicked

    private void jBTeditarRiegoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBTeditarRiegoMouseClicked
        EditarRiego editar = new EditarRiego();
        editar.setVisible(true);
    }//GEN-LAST:event_jBTeditarRiegoMouseClicked

    private void jBTagregarPlantaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBTagregarPlantaMouseClicked
        Planta planta = new Planta();
        planta.setVisible(true);
    }//GEN-LAST:event_jBTagregarPlantaMouseClicked

    private void jBTeditarPlantaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBTeditarPlantaMouseClicked
        EditarPlanta planta = new EditarPlanta();
        planta.setVisible(true);
    }//GEN-LAST:event_jBTeditarPlantaMouseClicked

    private void jTFbuscarrCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTFbuscarrCaretUpdate
        SqlUsuarios.listarUsuario(jTFbuscarr.getText());
    }//GEN-LAST:event_jTFbuscarrCaretUpdate

    private void jTFbuscarrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFbuscarrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFbuscarrActionPerformed

    private void jBTmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTmenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBTmenuActionPerformed

    private void BT_riegoManualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_riegoManualMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BT_riegoManualMouseClicked

    private void BT_riegoManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_riegoManualActionPerformed
        RiegoManual RM = new RiegoManual();
        RM.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BT_riegoManualActionPerformed

    private void Jt_BuscarRiegoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Jt_BuscarRiegoKeyTyped
        SqlRiegos.ListarRiego(Jt_BuscarRiego.getText());
    }//GEN-LAST:event_Jt_BuscarRiegoKeyTyped

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        try {
            Conexion con = new Conexion();
            java.sql.Connection conn = con.getConexion();
            
            JasperReport reporte = null;
            String path ="src\\Reportes\\Riegos.jasper";
            
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            
            JasperPrint jprint= JasperFillManager.fillReport(path,null,conn);
            
            JasperViewer view = new JasperViewer(jprint, false);
            
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            
            view.setVisible(true);
                    
        } catch (JRException ex) {
            Logger.getLogger(MenuAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2MouseClicked

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
            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_riegoManual;
    public static rojerusan.RSTableMetro JTable_Riegos;
    private javax.swing.JTextField Jt_BuscarRiego;
    private javax.swing.JLabel LB_riegoManual;
    private javax.swing.JButton jBTagregarPlanta;
    private javax.swing.JButton jBTagregarRiego;
    private javax.swing.JButton jBTagregarUsuario;
    private javax.swing.JButton jBTcerrar;
    private javax.swing.JButton jBTeditarPlanta;
    private javax.swing.JButton jBTeditarRiego;
    private javax.swing.JButton jBTeditarUsuario;
    private javax.swing.JButton jBTeliminarPlanta;
    private javax.swing.JButton jBTeliminarRiego;
    private javax.swing.JButton jBTeliminarUsuario;
    private javax.swing.JButton jBTmenu;
    private javax.swing.JButton jBTminimizar;
    private javax.swing.JButton jBTplanta;
    private javax.swing.JButton jBTriego;
    private javax.swing.JButton jBTusuarios;
    private javax.swing.JButton jBTvolver;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLinformacion;
    private javax.swing.JLabel jLriego;
    private javax.swing.JLabel jLusuarios;
    private javax.swing.JLabel jLvolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JPanel jPanelPlanta;
    private javax.swing.JPanel jPanelPrincipal;
    public static javax.swing.JPanel jPanelRiego;
    public static javax.swing.JPanel jPanelUsuarios;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JTextField jTFbuscarr;
    public static rojerusan.RSTableMetro jTabla_Planta;
    private javax.swing.JTextField jTextField3;
    public static rojerusan.RSTableMetro tablaUsuario;
    // End of variables declaration//GEN-END:variables
}
