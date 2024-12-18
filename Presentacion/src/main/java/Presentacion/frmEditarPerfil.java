package Presentacion;

import BO.UsuarioBO;
import DTO.UsuarioDTO;
import Exceptions.ExceptionBO;
import IBO.IUsuarioBO;
import java.awt.Image;
import java.io.File;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.mindrot.jbcrypt.BCrypt;

/**
 *frmEditarPerfil, esta pantalla le permite al usuario editar los datos que ingreso en la parte
 * del registro, pudiendo confirgurar nuevamente su perfil.
 * @author equipo 2
 */
public class frmEditarPerfil extends javax.swing.JFrame {

    private String sesion;
    private IUsuarioBO usuarioBO;
    private String rutaImagenSeleccionada = null;
    private static final String IMAGEN_POR_DEFECTO = "/imegenes/acceso.png"; // Ruta de la imagen predeterminada

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
            UsuarioDTO usuario = usuarioBO.buscar(sesion);
            txtNombreUsuario.setText(usuario.getNombre());
            txtCorreoElectronico.setText(usuario.getEmail());

            // Deja el campo de la contraseña vacío para que el usuario la ingrese si quiere cambiarla
            txtContrsena.setText("");

            String imagenPath = usuario.getImagen();
            if (imagenPath == null || imagenPath.isEmpty()) {
                imagenPath = IMAGEN_POR_DEFECTO; // Usar imagen por defecto
            }

            ImageIcon icon;
            if (new File(imagenPath).exists()) {
                icon = new ImageIcon(redimensionarImagen(imagenPath, lblPerfil.getWidth(), lblPerfil.getHeight()));
            } else {
                // La ruta es un recurso en el classpath
                URL imageUrl = getClass().getResource(imagenPath);
                if (imageUrl != null) {
                    icon = new ImageIcon(redimensionarImagen(imageUrl, lblPerfil.getWidth(), lblPerfil.getHeight()));
                } else {
                    System.out.println("No se pudo cargar la imagen: " + imagenPath);
                    imageUrl = getClass().getResource(IMAGEN_POR_DEFECTO);
                    if (imageUrl != null) {
                        icon = new ImageIcon(redimensionarImagen(imageUrl, lblPerfil.getWidth(), lblPerfil.getHeight()));
                    } else {
                        System.out.println("No se pudo cargar la imagen predeterminada: " + IMAGEN_POR_DEFECTO);
                        icon = null;
                    }
                }
            }
            if (icon != null) {
                lblPerfil.setIcon(icon);
            } else {
                lblPerfil.setText("Imagen no disponible"); // por si no se carga la imagen
            }
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
        lblTituloCorreoElectronico = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        lblLogoTitulo = new javax.swing.JLabel();
        lblTituloLogo = new javax.swing.JLabel();
        lblTituloContrasena = new javax.swing.JLabel();
        btnAnadirFoto = new javax.swing.JToggleButton();
        lblPerfil = new javax.swing.JLabel();
        txtContrsena = new javax.swing.JPasswordField();

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
        jPanel1.add(lblTituloRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        lblTituloNombreUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTituloNombreUsuario.setText("Nombre Usuario");
        jPanel1.add(lblTituloNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, 30));
        jPanel1.add(txtNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 220, 30));

        txtCorreoElectronico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoElectronicoActionPerformed(evt);
            }
        });
        jPanel1.add(txtCorreoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 220, 30));

        lblTituloCorreoElectronico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTituloCorreoElectronico.setText("Correo Electronico");
        jPanel1.add(lblTituloCorreoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, 30));

        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, 120, 40));

        lblLogoTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imegenes/Untitled (6).png"))); // NOI18N
        lblLogoTitulo.setText("jLabel9");
        jPanel1.add(lblLogoTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 90, 40));

        lblTituloLogo.setFont(new java.awt.Font("Segoe Print", 1, 10)); // NOI18N
        lblTituloLogo.setText("Music plux");
        jPanel1.add(lblTituloLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        lblTituloContrasena.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTituloContrasena.setText("Contraseña");
        jPanel1.add(lblTituloContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, -1, 30));

        btnAnadirFoto.setText("Cambiar Foto");
        btnAnadirFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirFotoActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnadirFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 110, 30));

        lblPerfil.setText("    ");
        lblPerfil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 153, 255)));
        jPanel1.add(lblPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 90, 90));

        txtContrsena.setText("jPasswordField1");
        jPanel1.add(txtContrsena, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 220, 30));

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

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            // Validaciones
            String nombre = txtNombreUsuario.getText();
            String email = txtCorreoElectronico.getText();
            String password = txtContrsena.getText();

            // Valida que los campos no esten vacios
            if (nombre.isEmpty() || email.isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "El nombre y el correo electrónico son obligatorios.", "Error de Validación", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Valida el formato del correo electronico
            if (!email.contains("@") || !email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
                javax.swing.JOptionPane.showMessageDialog(this, "El correo electrónico no tiene un formato válido.", "Error de Validación", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Validar longitud de la contraseña si se ha ingresado
            if (!password.isEmpty() && (password.length() < 5 || password.length() > 15)) {
                javax.swing.JOptionPane.showMessageDialog(this, "La contraseña debe tener entre 5 y 15 caracteres.", "Error de Validación", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }

            // información actual del usuario
            UsuarioDTO usuarioActual = usuarioBO.buscar(sesion);
            UsuarioDTO usuariodtoEdit = new UsuarioDTO();
            usuariodtoEdit.setNombre(nombre);
            usuariodtoEdit.setEmail(email);
            usuariodtoEdit.setId(sesion);

            // Verifica si el campo de la contraseña no está vacío
            if (!password.isEmpty()) {
                // Hashea la nueva contraseña solo si ha cambiado
                String hashedPassword = hashPassword(password);
                usuariodtoEdit.setPassword(hashedPassword);
            } else {
                // Usa la contraseña existente si el campo está vacío
                usuariodtoEdit.setPassword(usuarioActual.getPassword());
            }

            // Verifica si se ha seleccionado una nueva imagen
            if (rutaImagenSeleccionada != null) {
                usuariodtoEdit.setImagen(rutaImagenSeleccionada);
            } else {
                // Mantiene la imagen actual del usuario
                usuariodtoEdit.setImagen(usuarioActual.getImagen());
            }

            // Guarda los cambios del usuario
            usuarioBO.editarUsuario(usuariodtoEdit);

            // Mensaje de éxito
            javax.swing.JOptionPane.showMessageDialog(this, "Perfil actualizado con éxito.");

            // Redirigir al menú principal
            frmMenu menu = new frmMenu(sesion);
            menu.setVisible(true);
            this.dispose();
        } catch (ExceptionBO ex) {
            Logger.getLogger(frmEditarPerfil.class.getName()).log(Level.SEVERE, null, ex);
            javax.swing.JOptionPane.showMessageDialog(this, "Error al guardar los cambios: " + ex.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }

    }

// Método para hashear la contraseña (puedes usar una biblioteca como BCrypt)
    private String hashPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnAnadirFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirFotoActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Seleccionar imagen de perfil");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Imagenes", "jpg", "png", "jpeg"));

        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            rutaImagenSeleccionada = selectedFile.getAbsolutePath();
            System.out.println("Imagen seleccionada: " + rutaImagenSeleccionada);
            ImageIcon icon = new ImageIcon(redimensionarImagen(rutaImagenSeleccionada, lblPerfil.getWidth(), lblPerfil.getHeight()));
            lblPerfil.setIcon(icon); // Actualizar la imagen en el label
        }
    }//GEN-LAST:event_btnAnadirFotoActionPerformed

    private Image redimensionarImagen(String ruta, int width, int height) {
        ImageIcon icon = new ImageIcon(ruta);
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return newImg;
    }

    private Image redimensionarImagen(URL url, int width, int height) {
        ImageIcon icon = new ImageIcon(url);
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return newImg;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAnadirFoto;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLogoTitulo;
    private javax.swing.JLabel lblPerfil;
    private javax.swing.JLabel lblTituloContrasena;
    private javax.swing.JLabel lblTituloCorreoElectronico;
    private javax.swing.JLabel lblTituloLogo;
    private javax.swing.JLabel lblTituloNombreUsuario;
    private javax.swing.JLabel lblTituloRegistro;
    private javax.swing.JPasswordField txtContrsena;
    private javax.swing.JTextField txtCorreoElectronico;
    private javax.swing.JTextField txtNombreUsuario;
    // End of variables declaration//GEN-END:variables
}
