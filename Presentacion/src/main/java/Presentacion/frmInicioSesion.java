package Presentacion;

import BO.ArranqueInicioBO;
import BO.UsuarioBO;
import DAO.UsuarioDAO;
import IBO.IArranqueInicio;
import IBO.IUsuarioBO;

/**
 *
 * @author Equipo 2
 */
public class frmInicioSesion extends javax.swing.JFrame {

    private IArranqueInicio arranqueInicio = new ArranqueInicioBO();

    public frmInicioSesion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanelInicioSesion = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        lblConstrasenaTitul = new javax.swing.JLabel();
        lblUsuarioTitul = new javax.swing.JLabel();
        btniniciarSesion = new javax.swing.JButton();
        btnResgistrarse = new javax.swing.JButton();
        lblTituloRegistrarse = new javax.swing.JLabel();
        btnCargarDatos = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        lblTituloLogo = new javax.swing.JLabel();
        txtContrasena = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio Sesión");

        JPanelInicioSesion.setBackground(new java.awt.Color(204, 190, 255));
        JPanelInicioSesion.setToolTipText("");
        JPanelInicioSesion.setMinimumSize(new java.awt.Dimension(0, 0));
        JPanelInicioSesion.setPreferredSize(new java.awt.Dimension(370, 540));
        JPanelInicioSesion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        JPanelInicioSesion.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 220, 35));

        lblConstrasenaTitul.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblConstrasenaTitul.setText("Contraseña");
        JPanelInicioSesion.add(lblConstrasenaTitul, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, -1));

        lblUsuarioTitul.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblUsuarioTitul.setText("Usuario");
        JPanelInicioSesion.add(lblUsuarioTitul, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, -1));

        btniniciarSesion.setBackground(new java.awt.Color(153, 153, 153));
        btniniciarSesion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btniniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btniniciarSesion.setText("Iniciar Sesión");
        btniniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btniniciarSesionActionPerformed(evt);
            }
        });
        JPanelInicioSesion.add(btniniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 120, 35));

        btnResgistrarse.setBackground(new java.awt.Color(153, 153, 153));
        btnResgistrarse.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnResgistrarse.setForeground(new java.awt.Color(255, 255, 255));
        btnResgistrarse.setText("Registrarse");
        btnResgistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResgistrarseActionPerformed(evt);
            }
        });
        JPanelInicioSesion.add(btnResgistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 440, 110, 35));

        lblTituloRegistrarse.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTituloRegistrarse.setText("Registrarse");
        JPanelInicioSesion.add(lblTituloRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 420, -1, -1));

        btnCargarDatos.setText("Insertar Datos");
        btnCargarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarDatosActionPerformed(evt);
            }
        });
        JPanelInicioSesion.add(btnCargarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 13, -1, 30));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imegenes/Untitled (3).png"))); // NOI18N
        lblLogo.setText("jLabel2");
        JPanelInicioSesion.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 220, 80));

        lblTituloLogo.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        lblTituloLogo.setText("Music plux");
        JPanelInicioSesion.add(lblTituloLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));
        JPanelInicioSesion.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 220, 35));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelInicioSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelInicioSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btniniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btniniciarSesionActionPerformed
        try {
            IUsuarioBO usuarioBO = new UsuarioBO();

            String nombre = txtUsuario.getText();
            String password = txtContrasena.getText();

            boolean exito = usuarioBO.iniciarSesion(nombre, password);
            String sesion = usuarioBO.buscarPorNombre(nombre).getId();
            if (exito) {
                javax.swing.JOptionPane.showMessageDialog(this, "Inicio de sesión exitoso.");
                frmMenu menu = new frmMenu(sesion);
                menu.setVisible(true);
                this.dispose();

            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos.");
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error al iniciar sesión: " + e.getMessage());

        }
    }//GEN-LAST:event_btniniciarSesionActionPerformed

    private void btnResgistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResgistrarseActionPerformed
        frmAgregarUsuario inii = new frmAgregarUsuario();
        inii.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnResgistrarseActionPerformed

    private void btnCargarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarDatosActionPerformed
        arranqueInicio.crearArtistas();
        arranqueInicio.crearCanciones();
        arranqueInicio.crearAlbums();
    }//GEN-LAST:event_btnCargarDatosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmInicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelInicioSesion;
    private javax.swing.JButton btnCargarDatos;
    private javax.swing.JButton btnResgistrarse;
    private javax.swing.JButton btniniciarSesion;
    private javax.swing.JLabel lblConstrasenaTitul;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblTituloLogo;
    private javax.swing.JLabel lblTituloRegistrarse;
    private javax.swing.JLabel lblUsuarioTitul;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
