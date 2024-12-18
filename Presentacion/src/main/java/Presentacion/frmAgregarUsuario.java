package Presentacion;

import BO.UsuarioBO;
import DTO.UsuarioDTO;
import IBO.IArtistasBO;
import IBO.ICancionBO;
import IBO.IUsuarioBO;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *FrmAgregarUsuario esta clase sirve para interactuar con el usuario y agregar los datos 
 * necesarios para la crecion de su perfil, incluyendo las validaciones necesarias.
 * @author Equipo2
 */
public class frmAgregarUsuario extends javax.swing.JFrame {

    private final IArtistasBO boArtista = null;
    private final ICancionBO cancionBO = null;

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

        pnlRegistro = new javax.swing.JPanel();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlRegistro.setBackground(new java.awt.Color(204, 190, 255));
        pnlRegistro.setMinimumSize(new java.awt.Dimension(0, 0));
        pnlRegistro.setPreferredSize(new java.awt.Dimension(370, 540));
        pnlRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVolver.setBackground(new java.awt.Color(153, 153, 153));
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        pnlRegistro.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lblTituloRegistro.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        lblTituloRegistro.setText("Registro de Usuario");
        pnlRegistro.add(lblTituloRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        lblTituloNombreUsuario.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblTituloNombreUsuario.setText("Nombre Usuario");
        pnlRegistro.add(lblTituloNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 130, 30));
        pnlRegistro.add(txtNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 200, 35));

        txtCorreoElectronico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoElectronicoActionPerformed(evt);
            }
        });
        pnlRegistro.add(txtCorreoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 200, 35));

        txtContrsena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrsenaActionPerformed(evt);
            }
        });
        pnlRegistro.add(txtContrsena, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 200, 35));

        lblTituloCorreoElectronico.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblTituloCorreoElectronico.setText("CorreoElectronico");
        pnlRegistro.add(lblTituloCorreoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 200, 30));

        lblTituloanadirFoto.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblTituloanadirFoto.setText("Añadir foto perfil (Opcional)");
        pnlRegistro.add(lblTituloanadirFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 200, 30));

        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        pnlRegistro.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, 130, 40));

        lblLogoTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imegenes/Untitled (6).png"))); // NOI18N
        lblLogoTitulo.setText("jLabel9");
        pnlRegistro.add(lblLogoTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 90, 40));

        lblTituloLogo.setFont(new java.awt.Font("Segoe Print", 1, 10)); // NOI18N
        lblTituloLogo.setText("Music plux");
        pnlRegistro.add(lblTituloLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        lblTituloContrasena.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblTituloContrasena.setText("Contraseña");
        pnlRegistro.add(lblTituloContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, 30));

        btnAnadirFoto.setText("Añadir Foto");
        btnAnadirFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirFotoActionPerformed(evt);
            }
        });
        pnlRegistro.add(btnAnadirFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 110, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("*");
        pnlRegistro.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 10, 10));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("*");
        pnlRegistro.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 10, 10));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("*");
        pnlRegistro.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 10, 10));

        getContentPane().add(pnlRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private String rutaImagenSeleccionada = null;
    private static final String IMAGEN_USUARIO = "/imegenes/acceso.png";
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        try {
            // Crear instancia del BO
            IUsuarioBO usuarioBO = new UsuarioBO();

            // Obtener datos del formulario
            UsuarioDTO usuarioDTO = new UsuarioDTO();
            usuarioDTO.setNombre(txtNombreUsuario.getText());
            usuarioDTO.setEmail(txtCorreoElectronico.getText());
            usuarioDTO.setPassword(txtContrsena.getText());

            // Valida que los campos no esten vacios
            if (usuarioDTO.getNombre().isEmpty() || usuarioDTO.getEmail().isEmpty() || usuarioDTO.getPassword().isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.", "Error de Validación", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }
            // Valida que el correo contenga '@' y no tenga un formato invalido
            if (!usuarioDTO.getEmail().contains("@")) {
                javax.swing.JOptionPane.showMessageDialog(this, "El correo electrónico debe contener '@'.", "Error de Validación", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }
            // Valida formato del correo electrónico
            if (!usuarioDTO.getEmail().matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
                javax.swing.JOptionPane.showMessageDialog(this, "El correo electrónico no tiene un formato válido.", "Error de Validación", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }
            // Valida longitud de la contraseña
            if (usuarioDTO.getPassword().length() < 5 || usuarioDTO.getPassword().length() > 15) {
                javax.swing.JOptionPane.showMessageDialog(this, "La contraseña debe tener entre 5 y 15 caracteres.", "Error de Validación", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (rutaImagenSeleccionada != null) {
                usuarioDTO.setImagen(rutaImagenSeleccionada);
            } else {
                usuarioDTO.setImagen(IMAGEN_USUARIO);
            }

            // Registrar usuario
            usuarioBO.guardarUsuario(usuarioDTO);
            System.out.println("sss" + usuarioDTO.getNombre());

            // Mensaje de éxito
            javax.swing.JOptionPane.showMessageDialog(this, "Usuario registrado con éxito.");
        } catch (Exception e) {
            // Mostrar error
            javax.swing.JOptionPane.showMessageDialog(this, "Error al registrar usuario: " + e.getMessage());
        }
        frmInicioSesion ini = new frmInicioSesion();
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
        frmInicioSesion volver = new frmInicioSesion();
        volver.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnAnadirFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirFotoActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Seleccionar imagen de perfil");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Imágenes", "jpg", "png", "jpeg"));
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            rutaImagenSeleccionada = selectedFile.getAbsolutePath(); // obtiene la ruta de la imagen seleccionada 
            btnAnadirFoto.setText(selectedFile.getName()); // muestra el nombre de la imagen en el botón 
        }
    }//GEN-LAST:event_btnAnadirFotoActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblLogoTitulo;
    private javax.swing.JLabel lblTituloContrasena;
    private javax.swing.JLabel lblTituloCorreoElectronico;
    private javax.swing.JLabel lblTituloLogo;
    private javax.swing.JLabel lblTituloNombreUsuario;
    private javax.swing.JLabel lblTituloRegistro;
    private javax.swing.JLabel lblTituloanadirFoto;
    private javax.swing.JPanel pnlRegistro;
    private javax.swing.JTextField txtContrsena;
    private javax.swing.JTextField txtCorreoElectronico;
    private javax.swing.JTextField txtNombreUsuario;
    // End of variables declaration//GEN-END:variables
}
