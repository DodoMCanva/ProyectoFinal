package Presentacion;

import Exceptions.ExceptionBO;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author equipo 2
 */
public class frmFavoritos extends javax.swing.JFrame {

    private String sesion;

    /**
     * Creates new form frmFavoritos
     */
    public frmFavoritos(String sesion) {
        initComponents();
        this.sesion = sesion;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFavoritos = new javax.swing.JPanel();
        lblTituloFavoritos = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        scllpAlbumes = new javax.swing.JScrollPane();
        tblAlbumes = new javax.swing.JTable();
        scllpCanciones = new javax.swing.JScrollPane();
        tblCanciones = new javax.swing.JTable();
        lblCanciones = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        scllpArtistas = new javax.swing.JScrollPane();
        tblArtistas = new javax.swing.JTable();
        lblArtistas = new javax.swing.JLabel();
        lblEstFavorito = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Favoritos");
        setPreferredSize(new java.awt.Dimension(680, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlFavoritos.setBackground(new java.awt.Color(204, 190, 255));
        pnlFavoritos.setMinimumSize(new java.awt.Dimension(680, 640));
        pnlFavoritos.setPreferredSize(new java.awt.Dimension(680, 640));
        pnlFavoritos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloFavoritos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTituloFavoritos.setText("Favoritos");
        pnlFavoritos.add(lblTituloFavoritos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 120, 40));

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblUsuario.setText("Usuario");
        pnlFavoritos.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));
        pnlFavoritos.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 400, 30));

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscar.setText("Buscar");
        pnlFavoritos.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, -1, 30));

        tblAlbumes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Imagen", "Nombre", "Género", "Ver", "Eliminar"
            }
        ));
        scllpAlbumes.setViewportView(tblAlbumes);

        pnlFavoritos.add(scllpAlbumes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 600, 100));

        tblCanciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Imagen", "Canción", "Género", "Álbum", "Eliminar"
            }
        ));
        scllpCanciones.setViewportView(tblCanciones);

        pnlFavoritos.add(scllpCanciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 600, 100));

        lblCanciones.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCanciones.setText("Canciones");
        pnlFavoritos.add(lblCanciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Álbumes");
        pnlFavoritos.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        tblArtistas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Imagen", "Nombre", "Género", "Ver", "Eliminar"
            }
        ));
        scllpArtistas.setViewportView(tblArtistas);

        pnlFavoritos.add(scllpArtistas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 600, 100));

        lblArtistas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblArtistas.setText("Artistas");
        pnlFavoritos.add(lblArtistas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 70, -1));

        lblEstFavorito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imegenes/estrella (2).png"))); // NOI18N
        pnlFavoritos.add(lblEstFavorito, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 30, 40));

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pnlFavoritos.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, -1, -1));

        getContentPane().add(pnlFavoritos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        frmMenu menu = null;
        try {
            menu = new frmMenu(this.sesion);
        } catch (ExceptionBO ex) {
            Logger.getLogger(frmFavoritos.class.getName()).log(Level.SEVERE, null, ex);
        }
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblArtistas;
    private javax.swing.JLabel lblCanciones;
    private javax.swing.JLabel lblEstFavorito;
    private javax.swing.JLabel lblTituloFavoritos;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlFavoritos;
    private javax.swing.JScrollPane scllpAlbumes;
    private javax.swing.JScrollPane scllpArtistas;
    private javax.swing.JScrollPane scllpCanciones;
    private javax.swing.JTable tblAlbumes;
    private javax.swing.JTable tblArtistas;
    private javax.swing.JTable tblCanciones;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
