package Presentacion;

import BO.UsuarioBO;
import DTO.UsuarioDTO;
import Exceptions.ExceptionBO;
import IBO.IArtistasBO;
import IBO.ICancionBO;
import IBO.IUsuarioBO;
import java.awt.Image;
import java.io.File;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author equipo 2
 */
public class frmMenuSobrePuesto extends java.awt.Dialog {

    private frmMenu menu;
    private final IArtistasBO boArtista = null;
    private final ICancionBO cancionBO = null;
    private String sesion;
    private IUsuarioBO usuarioBO;

    /**
     * Creates new form frmMenuSobrePuesto
     */
    public frmMenuSobrePuesto(java.awt.Frame parent, boolean modal, String sesion) {
        super(parent, modal);
        initComponents();
        // Guardamos la referencia del frmMenu
        if (parent instanceof frmMenu) {
            this.menu = (frmMenu) parent;
        }
        this.sesion = sesion;
        this.usuarioBO = new UsuarioBO();

        setSize(250, 638); // Ajusta el tamaño del diálogo según sea necesario 
        int x = parent.getX(); // Obtener la coordenada X del parent 
        int y = parent.getY(); // Obtener la coordenada Y del parent 
        setLocation(x, y);

        inicializarUsuario();
    }

    private void inicializarUsuario() {
        try {
            UsuarioDTO usuario = usuarioBO.buscar(sesion);  // Obtén los datos del usuario
            lblNombreUsuario.setText(usuario.getNombre());  // Establece el nombre del usuario

            // Cargar imagen del usuario
            String imagenPath = usuario.getImagen();
            if (imagenPath == null || imagenPath.isEmpty()) {
                imagenPath = "/imegenes/acceso.png";  // Usar imagen por defecto
            }

            ImageIcon icon;
            if (new File(imagenPath).exists()) {
                icon = new ImageIcon(redimensionarImagen(imagenPath, lblImagenUsuario.getWidth(), lblImagenUsuario.getHeight()));
            } else {
                // La ruta es un recurso en el classpath
                URL imageUrl = getClass().getResource(imagenPath);
                if (imageUrl != null) {
                    icon = new ImageIcon(redimensionarImagen(imageUrl, lblImagenUsuario.getWidth(), lblImagenUsuario.getHeight()));
                } else {
                    imageUrl = getClass().getResource("/imegenes/acceso.png");
                    icon = new ImageIcon(redimensionarImagen(imageUrl, lblImagenUsuario.getWidth(), lblImagenUsuario.getHeight()));
                }
            }
            lblImagenUsuario.setIcon(icon);
        } catch (ExceptionBO e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, "Error al cargar los datos del usuario: " + e.getMessage());
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMenu = new javax.swing.JPanel();
        btnEditarPerfil = new javax.swing.JButton();
        btnFavoritos = new javax.swing.JButton();
        btnCerarSesion = new javax.swing.JButton();
        btnGeneroNOdeseado = new javax.swing.JButton();
        lblImagenUsuario = new javax.swing.JLabel();
        lblNombreUsuario = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(250, 600));
        setPreferredSize(new java.awt.Dimension(250, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        pnlMenu.setBackground(new java.awt.Color(255, 255, 255));
        pnlMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 102, 255)));
        pnlMenu.setToolTipText("Menu Opciones");
        pnlMenu.setMinimumSize(new java.awt.Dimension(250, 600));
        pnlMenu.setPreferredSize(new java.awt.Dimension(250, 600));
        pnlMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEditarPerfil.setBackground(new java.awt.Color(153, 204, 255));
        btnEditarPerfil.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEditarPerfil.setText("Editar Perfil");
        btnEditarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPerfilActionPerformed(evt);
            }
        });
        pnlMenu.add(btnEditarPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 140, 35));

        btnFavoritos.setBackground(new java.awt.Color(249, 212, 103));
        btnFavoritos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnFavoritos.setText("Favoritos");
        btnFavoritos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFavoritosActionPerformed(evt);
            }
        });
        pnlMenu.add(btnFavoritos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 120, 35));

        btnCerarSesion.setBackground(new java.awt.Color(255, 0, 0));
        btnCerarSesion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCerarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerarSesion.setText("Cerrar Sesion");
        btnCerarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerarSesionActionPerformed(evt);
            }
        });
        pnlMenu.add(btnCerarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, 120, 35));

        btnGeneroNOdeseado.setBackground(new java.awt.Color(204, 51, 0));
        btnGeneroNOdeseado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnGeneroNOdeseado.setForeground(new java.awt.Color(255, 255, 255));
        btnGeneroNOdeseado.setText("Genero NO deseado");
        btnGeneroNOdeseado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeneroNOdeseadoActionPerformed(evt);
            }
        });
        pnlMenu.add(btnGeneroNOdeseado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 170, 35));

        lblImagenUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        pnlMenu.add(lblImagenUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 70, 70));

        lblNombreUsuario.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblNombreUsuario.setText("Usuario");
        pnlMenu.add(lblNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 110, 30));

        add(pnlMenu, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void btnEditarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPerfilActionPerformed
        // Cierra el JDialog (frmMenuSobrePuesto)

        this.dispose();

        // Cierra el frmMenu
        if (menu != null) {
            menu.dispose();
        }

        // Abre la pantalla de inicio de sesión
        frmEditarPerfil ini = null;
        try {
            ini = new frmEditarPerfil(sesion);
        } catch (ExceptionBO ex) {
            Logger.getLogger(frmMenuSobrePuesto.class.getName()).log(Level.SEVERE, null, ex);
        }
        ini.setVisible(true);
    }//GEN-LAST:event_btnEditarPerfilActionPerformed

    private void btnCerarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerarSesionActionPerformed
        // Cierra el JDialog (frmMenuSobrePuesto)
        this.dispose();

        // Cierra el frmMenu
        if (menu != null) {
            menu.dispose();
        }

        // Abre la pantalla de inicio de sesión
        frmInicioSesion ini = new frmInicioSesion();
        ini.setVisible(true);

    }//GEN-LAST:event_btnCerarSesionActionPerformed

    private void btnFavoritosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFavoritosActionPerformed
        // Cierra el JDialog (frmMenuSobrePuesto)
        this.dispose();

        // Cierra el frmMenu
        if (menu != null) {
            menu.dispose();
        }

        frmFavoritos ini = new frmFavoritos(this.sesion);
        ini.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnFavoritosActionPerformed

    private void btnGeneroNOdeseadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeneroNOdeseadoActionPerformed
        // Cierra el JDialog (frmMenuSobrePuesto)
        this.dispose();

        // Cierra el frmMenu
        if (menu != null) {
            menu.dispose();
        }

        // Abre la pantalla de inicio de sesión
        frmGeneroNoDeseado ini = new frmGeneroNoDeseado(this.sesion);
        ini.setVisible(true);
    }//GEN-LAST:event_btnGeneroNOdeseadoActionPerformed

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

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                frmMenuSobrePuesto dialog = new frmMenuSobrePuesto(new java.awt.Frame(), true, this.sesion);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerarSesion;
    private javax.swing.JButton btnEditarPerfil;
    private javax.swing.JButton btnFavoritos;
    private javax.swing.JButton btnGeneroNOdeseado;
    private javax.swing.JLabel lblImagenUsuario;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JPanel pnlMenu;
    // End of variables declaration//GEN-END:variables
}
