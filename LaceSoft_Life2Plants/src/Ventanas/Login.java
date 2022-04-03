package Ventanas;
//LaceSoft - Life2Plants - 11 B - 2018 / 2019
//Hecho por: 
//Carlos Augusto Hernández Zamora
//Janiert Sebastián Salas Castillo
//Natalia Vásquez Mora
//Diego Fernando Victoria López

import Clases.SqlUsuarios;
import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Login extends javax.swing.JFrame {

    int x;
    int y;
    public boolean mostrar = true;
    Icon error = new ImageIcon(getClass().getResource("/Imagenes/error.png"));
    String textoL = "<html><b>Solo se permite el ingreso de letras.</b></html>";
    JLabel label = new JLabel(textoL);
    String textoN = "<html><b>Solo se permite el ingreso de números.</b></html>";
    JLabel labelN = new JLabel(textoN);

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        AWTUtilities.setWindowOpaque(this, false);
        setIconImage(new ImageIcon("src/Imagenes/logo_vista.png").getImage());
    }
//Método para eliminar las letras.

    public void letras(KeyEvent ke) {
        char c = ke.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, labelN, "Error", JOptionPane.PLAIN_MESSAGE, error);
            ke.consume();
        }

    }

    //Método para limitar el número de caracteres ingresados.
    public void delimitar(KeyEvent e) {
        //Limita el número de digitos 
        if (jTFcodigo.getText().length() == 6) {
            getToolkit().beep();
            e.consume();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPassword = new javax.swing.JPasswordField();
        jTFpassword = new javax.swing.JTextField();
        jTFcodigo = new javax.swing.JTextField();
        jLregistrarse = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        BT_minimizar = new javax.swing.JButton();
        jLmensaje = new javax.swing.JLabel();
        BT_cerrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jCBtipo_Perfil = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CONTRASEÑA:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(160, 310, 100, 30);

        jPassword.setText("Ingrese su contraseña...");
        jPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordFocusLost(evt);
            }
        });
        jPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(jPassword);
        jPassword.setBounds(280, 310, 180, 30);

        jTFpassword.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jTFpassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jTFpassword);
        jTFpassword.setBounds(280, 310, 180, 30);

        jTFcodigo.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jTFcodigo.setText("Ingrese el codigo...");
        jTFcodigo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jTFcodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTFcodigoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFcodigoFocusLost(evt);
            }
        });
        jTFcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFcodigoActionPerformed(evt);
            }
        });
        jTFcodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFcodigoKeyTyped(evt);
            }
        });
        jPanel1.add(jTFcodigo);
        jTFcodigo.setBounds(290, 220, 170, 30);

        jLregistrarse.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLregistrarse.setText("Registrarse");
        jLregistrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLregistrarse.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLregistrarseMouseMoved(evt);
            }
        });
        jLregistrarse.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLregistrarseFocusGained(evt);
            }
        });
        jLregistrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLregistrarseMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLregistrarseMouseExited(evt);
            }
        });
        jPanel1.add(jLregistrarse);
        jLregistrarse.setBounds(320, 550, 90, 30);

        jLabel4.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("PERFIL:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(160, 380, 90, 30);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Visible.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(470, 300, 60, 40);

        jLabel5.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CÓDIGO:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(160, 220, 90, 30);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jButton1.setText("Ingresar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(310, 470, 100, 45);

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
        jPanel1.add(BT_minimizar);
        BT_minimizar.setBounds(530, 380, 62, 48);

        jLmensaje.setBackground(new java.awt.Color(255, 255, 255));
        jLmensaje.setForeground(new java.awt.Color(255, 0, 0));
        jLmensaje.setToolTipText("");
        jPanel1.add(jLmensaje);
        jLmensaje.setBounds(270, 440, 200, 20);

        BT_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cerrar2.png"))); // NOI18N
        BT_cerrar.setToolTipText("Cerrar");
        BT_cerrar.setBorderPainted(false);
        BT_cerrar.setContentAreaFilled(false);
        BT_cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_cerrarMouseClicked(evt);
            }
        });
        jPanel1.add(BT_cerrar);
        BT_cerrar.setBounds(530, 220, 62, 48);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(180, 530, 370, 20);

        jCBtipo_Perfil.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jCBtipo_Perfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione uno...", "Administrador", "Usuario" }));
        jCBtipo_Perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBtipo_PerfilActionPerformed(evt);
            }
        });
        jPanel1.add(jCBtipo_Perfil);
        jCBtipo_Perfil.setBounds(290, 380, 170, 40);

        jLabel3.setFont(new java.awt.Font("Agency FB", 0, 48)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("INGRESAR:");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jLabel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel3MouseDragged(evt);
            }
        });
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        jPanel1.add(jLabel3);
        jLabel3.setBounds(160, 130, 380, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Login.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 690, 650);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLregistrarseFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLregistrarseFocusGained
        JLabel label = new JLabel();
        label.setForeground(Color.blue);
    }//GEN-LAST:event_jLregistrarseFocusGained

    private void jLregistrarseMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLregistrarseMouseMoved
        this.jLregistrarse.setForeground(Color.BLUE);
    }//GEN-LAST:event_jLregistrarseMouseMoved

    private void jLregistrarseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLregistrarseMouseExited
        this.jLregistrarse.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLregistrarseMouseExited

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_jLabel3MouseDragged

    private void jLregistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLregistrarseMouseClicked
        Registro1 registro = new Registro1();
        registro.setVisible(true);
    }//GEN-LAST:event_jLregistrarseMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        int tipoPerfil = jCBtipo_Perfil.getSelectedIndex();
        String codigo = jTFcodigo.getText();
        String password = new String(jPassword.getPassword());
        if (codigo.equals("Ingrese el codigo...") || password.equals("Ingrese su contraseña...") || tipoPerfil == 0) {
            jLmensaje.setText("¡Ingresar usuario y/o contraseña!");
            this.jTFcodigo.requestFocus();
        } else {
            SqlUsuarios.ValidarUsuario(codigo, password, tipoPerfil, this);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void BT_minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_minimizarMouseClicked
        this.setState(Inicio.ICONIFIED);
        this.BT_minimizar.setSelected(false);
    }//GEN-LAST:event_BT_minimizarMouseClicked

    private void BT_cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_cerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_BT_cerrarMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        if (mostrar) {
            this.jTFpassword.setVisible(true);
            this.jPassword.setVisible(false);
            this.jTFpassword.setText(this.jPassword.getText());
            mostrar = false;
        } else {
            this.jTFpassword.setVisible(false);
            this.jPassword.setVisible(true);
            this.jPassword.setText(this.jTFpassword.getText());
            mostrar = true;
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jTFcodigoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFcodigoFocusGained
        String nombre = this.jTFcodigo.getText();
        if (nombre.equals("Ingrese el codigo...")) {
            this.jTFcodigo.setText("");
        }

    }//GEN-LAST:event_jTFcodigoFocusGained

    private void jTFcodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFcodigoFocusLost
        String nombre = this.jTFcodigo.getText();
        if (nombre.equals("")) {
            this.jTFcodigo.setText("Ingrese el codigo...");
        }

    }//GEN-LAST:event_jTFcodigoFocusLost

    private void jPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFocusGained
        String password = this.jPassword.getText();
        if (password.equals("Ingrese su contraseña...")) {
            this.jPassword.setText("");
        }
    }//GEN-LAST:event_jPasswordFocusGained

    private void jPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFocusLost
        String password = this.jPassword.getText();
        if (password.equals("")) {
            this.jPassword.setText("Ingrese su contraseña...");
        }
    }//GEN-LAST:event_jPasswordFocusLost

    private void jCBtipo_PerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBtipo_PerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBtipo_PerfilActionPerformed

    private void jTFcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFcodigoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordActionPerformed

    private void jTFcodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFcodigoKeyTyped
        letras(evt);
        delimitar(evt);
    }//GEN-LAST:event_jTFcodigoKeyTyped

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception e) {
                }
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_cerrar;
    private javax.swing.JButton BT_minimizar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jCBtipo_Perfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLmensaje;
    private javax.swing.JLabel jLregistrarse;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JPasswordField jPassword;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JTextField jTFcodigo;
    public static javax.swing.JTextField jTFpassword;
    // End of variables declaration//GEN-END:variables
}
