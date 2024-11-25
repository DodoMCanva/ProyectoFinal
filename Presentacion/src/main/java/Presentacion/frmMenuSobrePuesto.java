/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/AWTForms/Dialog.java to edit this template
 */
package Presentacion;

import IBO.IArtistasBO;
import IBO.ICancionBO;

/**
 *
 * @author cesar
 */
public class frmMenuSobrePuesto extends java.awt.Dialog {

    private frmMenu menu;
    private final IArtistasBO boArtista = null;
    private final ICancionBO cancionBO = null;

    /**
     * Creates new form frmMenuSobrePuesto
     */
    public frmMenuSobrePuesto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        // Guardamos la referencia del frmMenu
        if (parent instanceof frmMenu) {
            this.menu = (frmMenu) parent;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnEditarPerfil = new javax.swing.JButton();
        btnFavoritos = new javax.swing.JButton();
        btnCerarSesion = new javax.swing.JButton();
        btnGeneroNOdeseado = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jPanel1.setMinimumSize(new java.awt.Dimension(158, 374));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEditarPerfil.setBackground(new java.awt.Color(153, 204, 255));
        btnEditarPerfil.setText("Editar Perfil");
        btnEditarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPerfilActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditarPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 110, 30));

        btnFavoritos.setBackground(new java.awt.Color(249, 212, 103));
        btnFavoritos.setText("Favoritos");
        btnFavoritos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFavoritosActionPerformed(evt);
            }
        });
        jPanel1.add(btnFavoritos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 90, 30));

        btnCerarSesion.setBackground(new java.awt.Color(255, 0, 0));
        btnCerarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerarSesion.setText("Cerrar Sesion");
        btnCerarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 110, 30));

        btnGeneroNOdeseado.setBackground(new java.awt.Color(204, 51, 0));
        btnGeneroNOdeseado.setForeground(new java.awt.Color(255, 255, 255));
        btnGeneroNOdeseado.setText("Genero NO deseado");
        btnGeneroNOdeseado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeneroNOdeseadoActionPerformed(evt);
            }
        });
        jPanel1.add(btnGeneroNOdeseado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog
     */
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
        frmEditarPerfil ini = new frmEditarPerfil();
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

        // Abre la pantalla de inicio de sesión
        frmFavoritos ini = new frmFavoritos();
        ini.setVisible(true);
    }//GEN-LAST:event_btnFavoritosActionPerformed

    private void btnGeneroNOdeseadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeneroNOdeseadoActionPerformed
        // Cierra el JDialog (frmMenuSobrePuesto)
        this.dispose();

        // Cierra el frmMenu
        if (menu != null) {
            menu.dispose();
        }

        // Abre la pantalla de inicio de sesión
        frmGeneroNoDeseado ini = new frmGeneroNoDeseado();
        ini.setVisible(true);
    }//GEN-LAST:event_btnGeneroNOdeseadoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmMenuSobrePuesto dialog = new frmMenuSobrePuesto(new java.awt.Frame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerarSesion;
    private javax.swing.JButton btnEditarPerfil;
    private javax.swing.JButton btnFavoritos;
    private javax.swing.JButton btnGeneroNOdeseado;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
