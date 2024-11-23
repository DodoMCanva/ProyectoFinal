/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion;

import BO.UsuarioBO;
import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import IBO.IUsuarioBO;

/**
 *
 * @author cesar
 */
public class frmAgregarUsuario extends javax.swing.JFrame {

    /**
     * Creates new form JframeAgregarUsuario
     */
    public frmAgregarUsuario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        lblTituloRegistro = new javax.swing.JLabel();
        lblTituloNombreUsuario = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        txtCorreoElectronico = new javax.swing.JTextField();
        txtContrsena = new javax.swing.JTextField();
        lblTituloCorreoElectronico = new javax.swing.JLabel();
        lblTituloanadirFoto = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        lblLogoTitulo = new javax.swing.JLabel();
        lblTituloLogo = new javax.swing.JLabel();
        lblTituloContrasena = new javax.swing.JLabel();
        btnAnadirFoto = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 190, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVolver.setBackground(new java.awt.Color(153, 153, 153));
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lblTituloRegistro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTituloRegistro.setText("Registro de Usuario");
        jPanel1.add(lblTituloRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        lblTituloNombreUsuario.setText("Nombre Usuario");
        jPanel1.add(lblTituloNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));
        jPanel1.add(txtNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 140, -1));

        txtCorreoElectronico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoElectronicoActionPerformed(evt);
            }
        });
        jPanel1.add(txtCorreoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 140, -1));

        txtContrsena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrsenaActionPerformed(evt);
            }
        });
        jPanel1.add(txtContrsena, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 140, -1));

        lblTituloCorreoElectronico.setText("CorreoElectronico");
        jPanel1.add(lblTituloCorreoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        lblTituloanadirFoto.setText("Añadir foto perfil(opcional)");
        jPanel1.add(lblTituloanadirFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 120, 40));

        lblLogoTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imegenes/Untitled (6).png"))); // NOI18N
        lblLogoTitulo.setText("jLabel9");
        jPanel1.add(lblLogoTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 90, 40));

        lblTituloLogo.setFont(new java.awt.Font("Segoe Print", 1, 10)); // NOI18N
        lblTituloLogo.setText("Music plux");
        jPanel1.add(lblTituloLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        lblTituloContrasena.setText("Contraseña");
        jPanel1.add(lblTituloContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        btnAnadirFoto.setText("Añadir Foto");
        jPanel1.add(btnAnadirFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 110, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
 try {
        // Crear instancia del BO
        IUsuarioBO usuarioBO = new UsuarioBO(new UsuarioDAO());

        // Obtener datos del formulario
        UsuarioDTO usuarioDTO = new UsuarioDTO();
        usuarioDTO.setNombre(txtNombreUsuario.getText());
        usuarioDTO.setEmail(txtCorreoElectronico.getText());
        usuarioDTO.setPassword(txtContrsena.getText());
        //usuarioDTO.setImagen(txtImagen.getText()); // Suponiendo que tienes un campo para la URL de la imagen
        //usuarioDTO.setFavoritos(new FavoritosDTO(new ArrayList<>(), new ArrayList<>(), new ArrayList<>()));
        //usuarioDTO.setRestringidosGeneros(new ArrayList<>());

        // Registrar usuario
        usuarioBO.guardarUsuario(usuarioDTO);
        System.out.println("sss"+ usuarioDTO.getNombre());

        // Mensaje de éxito
        javax.swing.JOptionPane.showMessageDialog(this, "Usuario registrado con éxito.");
    } catch (Exception e) {
        // Mostrar error
        javax.swing.JOptionPane.showMessageDialog(this, "Error al registrar usuario: " + e.getMessage());
    }
        frmInicioSesion ini=new frmInicioSesion();
        ini.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtContrsenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContrsenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContrsenaActionPerformed

    private void txtCorreoElectronicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoElectronicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoElectronicoActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed

    }//GEN-LAST:event_btnVolverActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(frmAgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(frmAgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(frmAgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(frmAgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new frmAgregarUsuario().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAnadirFoto;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLogoTitulo;
    private javax.swing.JLabel lblTituloContrasena;
    private javax.swing.JLabel lblTituloCorreoElectronico;
    private javax.swing.JLabel lblTituloLogo;
    private javax.swing.JLabel lblTituloNombreUsuario;
    private javax.swing.JLabel lblTituloRegistro;
    private javax.swing.JLabel lblTituloanadirFoto;
    private javax.swing.JTextField txtContrsena;
    private javax.swing.JTextField txtCorreoElectronico;
    private javax.swing.JTextField txtNombreUsuario;
    // End of variables declaration//GEN-END:variables
}
