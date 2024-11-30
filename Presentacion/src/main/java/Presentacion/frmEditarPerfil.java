package Presentacion;

import BO.UsuarioBO;
import DTO.UsuarioDTO;
import Exceptions.ExceptionBO;
import IBO.IUsuarioBO;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author equipo 2
 */
public class frmEditarPerfil extends javax.swing.JFrame {

    private String sesion;
    private IUsuarioBO usuarioBO;

    /**
     * Creates new form frmEditarPerfil
     */
    public frmEditarPerfil(String sesion) throws ExceptionBO {
        this.usuarioBO = new UsuarioBO();
        this.sesion = sesion;
        initComponents();
        inicializarCampos();
    }

    private void inicializarCampos() throws ExceptionBO {
        try {
            txtNombreUsuario.setText(usuarioBO.buscar(sesion).getNombre());
            txtCorreoElectronico.setText(usuarioBO.buscar(sesion).getEmail());
           // txtContrsena.setText(usuarioBO.buscar(sesion).getPassword());
        } catch (ExceptionBO e) {
            throw new ExceptionBO("Error al editar el usuario en la capa BO", e);
        }

    }

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
        btnGuardar = new javax.swing.JButton();
        lblLogoTitulo = new javax.swing.JLabel();
        lblTituloLogo = new javax.swing.JLabel();
        lblTituloContrasena = new javax.swing.JLabel();
        btnAnadirFoto = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 190, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(370, 540));
        jPanel1.setPreferredSize(new java.awt.Dimension(370, 540));
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
        lblTituloRegistro.setText("Editar Perfil");
        jPanel1.add(lblTituloRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        lblTituloNombreUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTituloNombreUsuario.setText("Nombre Usuario");
        jPanel1.add(lblTituloNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, 30));
        jPanel1.add(txtNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 220, 30));

        txtCorreoElectronico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoElectronicoActionPerformed(evt);
            }
        });
        jPanel1.add(txtCorreoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 220, 30));

        txtContrsena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrsenaActionPerformed(evt);
            }
        });
        jPanel1.add(txtContrsena, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 220, 30));

        lblTituloCorreoElectronico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTituloCorreoElectronico.setText("Correo Electronico");
        jPanel1.add(lblTituloCorreoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, 30));

        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 120, 40));

        lblLogoTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imegenes/Untitled (6).png"))); // NOI18N
        lblLogoTitulo.setText("jLabel9");
        jPanel1.add(lblLogoTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 90, 40));

        lblTituloLogo.setFont(new java.awt.Font("Segoe Print", 1, 10)); // NOI18N
        lblTituloLogo.setText("Music plux");
        jPanel1.add(lblTituloLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        lblTituloContrasena.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTituloContrasena.setText("Contraseña");
        jPanel1.add(lblTituloContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, -1, 30));

        btnAnadirFoto.setText("Cambiar Foto");
        btnAnadirFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirFotoActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnadirFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 110, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        frmMenu menu = null;
        try {
            menu = new frmMenu(this.sesion);
        } catch (ExceptionBO ex) {
            Logger.getLogger(frmEditarPerfil.class.getName()).log(Level.SEVERE, null, ex);
        }
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtCorreoElectronicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoElectronicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoElectronicoActionPerformed

    private void txtContrsenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContrsenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContrsenaActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        UsuarioDTO usuariodtoEdit = new UsuarioDTO(txtNombreUsuario.getText(), txtCorreoElectronico.getText(), txtContrsena.getText(), "");
        usuariodtoEdit.setId(sesion);
        try {
            usuarioBO.editarUsuario(usuariodtoEdit);
            frmMenu menu= new frmMenu(sesion);
            menu.setVisible(true);
            this.dispose();
            
        } catch (ExceptionBO ex) {
            Logger.getLogger(frmEditarPerfil.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnAnadirFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirFotoActionPerformed

    }//GEN-LAST:event_btnAnadirFotoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAnadirFoto;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLogoTitulo;
    private javax.swing.JLabel lblTituloContrasena;
    private javax.swing.JLabel lblTituloCorreoElectronico;
    private javax.swing.JLabel lblTituloLogo;
    private javax.swing.JLabel lblTituloNombreUsuario;
    private javax.swing.JLabel lblTituloRegistro;
    private javax.swing.JTextField txtContrsena;
    private javax.swing.JTextField txtCorreoElectronico;
    private javax.swing.JTextField txtNombreUsuario;
    // End of variables declaration//GEN-END:variables
}
