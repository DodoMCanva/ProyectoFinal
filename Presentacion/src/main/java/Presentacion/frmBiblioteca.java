
package Presentacion;

import Exceptions.ExceptionBO;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Equipo 2
 */
public class frmBiblioteca extends javax.swing.JFrame {
    private String sesion;
    /**
     * Creates new form frmBiblioteca
     */
    public frmBiblioteca(String sesion, String idAlbum, String idArtista, String idCancion) {
        initComponents();
        this.sesion = sesion;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBiblioteca = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        tdpBiblioteca = new javax.swing.JTabbedPane();
        pnlAlbumes = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblAlbumes = new javax.swing.JTable();
        txtBuscarAlbum = new javax.swing.JTextField();
        btnBuscarAlbum = new javax.swing.JButton();
        pnlArtistas = new javax.swing.JPanel();
        lblImagenArtista = new javax.swing.JLabel();
        lblGeneroArtista = new javax.swing.JLabel();
        lblNombreArtsiata = new javax.swing.JLabel();
        lblGenero = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtBuscarAlbum1 = new javax.swing.JTextField();
        btnBuscarAlbum1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblIntegrantes = new javax.swing.JTable();
        txtBuscarIntegrante = new javax.swing.JTextField();
        btnBuscarIntegrante = new javax.swing.JButton();
        pnlCanciones = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCanciones = new javax.swing.JTable();
        txtBuscarCancion = new javax.swing.JTextField();
        txtBuscarAlbum2 = new javax.swing.JTextField();
        btnBuscarAlbum2 = new javax.swing.JButton();
        btnBuscarCancion1 = new javax.swing.JButton();
        btnBuscarCancion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setPreferredSize(new java.awt.Dimension(1000, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBiblioteca.setBackground(new java.awt.Color(204, 190, 255));
        pnlBiblioteca.setPreferredSize(new java.awt.Dimension(850, 550));
        pnlBiblioteca.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblUsuario.setText("Usuario");
        pnlBiblioteca.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        tdpBiblioteca.setBackground(new java.awt.Color(204, 102, 255));
        tdpBiblioteca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        pnlAlbumes.setBackground(new java.awt.Color(255, 255, 255));
        pnlAlbumes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 153, 255), 2));

        tblAlbumes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 153, 255)));
        tblAlbumes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblAlbumes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Imagen", "Nombre", "Género", "Lanamiento", "Artista"
            }
        ));
        tblAlbumes.setGridColor(new java.awt.Color(204, 153, 255));
        tblAlbumes.setSelectionBackground(new java.awt.Color(204, 204, 255));
        jScrollPane3.setViewportView(tblAlbumes);

        pnlAlbumes.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 750, 220));

        txtBuscarAlbum.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBuscarAlbum.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 153, 255), 2));
        pnlAlbumes.add(txtBuscarAlbum, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 400, 30));

        btnBuscarAlbum.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscarAlbum.setText("Buscar");
        pnlAlbumes.add(btnBuscarAlbum, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, -1, 30));

        tdpBiblioteca.addTab("Álbum", pnlAlbumes);

        pnlArtistas.setBackground(new java.awt.Color(255, 255, 255));
        pnlArtistas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImagenArtista.setText("Imagen artista");
        lblImagenArtista.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 153, 255)));
        pnlArtistas.add(lblImagenArtista, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 180, 220));

        lblGeneroArtista.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblGeneroArtista.setText("Género:");
        pnlArtistas.add(lblGeneroArtista, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, -1, 30));

        lblNombreArtsiata.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNombreArtsiata.setText("Nombre:");
        pnlArtistas.add(lblNombreArtsiata, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, -1, 30));

        lblGenero.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblGenero.setText("genero");
        pnlArtistas.add(lblGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, -1, 30));

        lblNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNombre.setText("nombre");
        pnlArtistas.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, -1, 30));

        txtBuscarAlbum1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBuscarAlbum1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 153, 255), 2));
        pnlArtistas.add(txtBuscarAlbum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 400, 30));

        btnBuscarAlbum1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscarAlbum1.setText("Buscar");
        pnlArtistas.add(btnBuscarAlbum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, 30));

        tdpBiblioteca.addTab("Artista", pnlArtistas);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 153, 255), 2));

        tblIntegrantes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 153, 255)));
        tblIntegrantes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblIntegrantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Estado", "Nombre", "Rol", "Ingreso", "Salida", "Imagen"
            }
        ));
        tblIntegrantes.setGridColor(new java.awt.Color(204, 153, 255));
        tblIntegrantes.setSelectionBackground(new java.awt.Color(204, 204, 255));
        jScrollPane5.setViewportView(tblIntegrantes);

        jPanel5.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 750, 220));

        txtBuscarIntegrante.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBuscarIntegrante.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 153, 255), 2));
        jPanel5.add(txtBuscarIntegrante, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 400, 30));

        btnBuscarIntegrante.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscarIntegrante.setText("Buscar");
        jPanel5.add(btnBuscarIntegrante, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, -1, 30));

        tdpBiblioteca.addTab("Integrantes", jPanel5);

        pnlCanciones.setBackground(new java.awt.Color(255, 255, 255));
        pnlCanciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 153, 255)));
        pnlCanciones.setForeground(new java.awt.Color(204, 153, 255));
        pnlCanciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 153, 255), 2));

        tblCanciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 153, 255)));
        tblCanciones.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblCanciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Duración", "Favorito"
            }
        ));
        tblCanciones.setGridColor(new java.awt.Color(204, 153, 255));
        tblCanciones.setSelectionBackground(new java.awt.Color(204, 204, 255));
        jScrollPane1.setViewportView(tblCanciones);

        pnlCanciones.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 740, 220));

        txtBuscarCancion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBuscarCancion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 153, 255), 2));
        pnlCanciones.add(txtBuscarCancion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 400, 30));

        txtBuscarAlbum2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBuscarAlbum2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 153, 255), 2));
        pnlCanciones.add(txtBuscarAlbum2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 400, 30));

        btnBuscarAlbum2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscarAlbum2.setText("Buscar");
        pnlCanciones.add(btnBuscarAlbum2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, -1, 30));

        btnBuscarCancion1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscarCancion1.setText("Buscar");
        pnlCanciones.add(btnBuscarCancion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, -1, 30));

        tdpBiblioteca.addTab("Canción", pnlCanciones);

        pnlBiblioteca.add(tdpBiblioteca, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 850, 420));

        btnBuscarCancion.setBackground(new java.awt.Color(153, 153, 153));
        btnBuscarCancion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscarCancion.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarCancion.setText("Volver");
        btnBuscarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCancionActionPerformed(evt);
            }
        });
        pnlBiblioteca.add(btnBuscarCancion, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 20, 80, 30));

        getContentPane().add(pnlBiblioteca, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCancionActionPerformed
        frmMenu volver = null;
        try {
            volver = new frmMenu(this.sesion);
        } catch (ExceptionBO ex) {
            Logger.getLogger(frmBiblioteca.class.getName()).log(Level.SEVERE, null, ex);
        }
        volver.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBuscarCancionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarAlbum;
    private javax.swing.JButton btnBuscarAlbum1;
    private javax.swing.JButton btnBuscarAlbum2;
    private javax.swing.JButton btnBuscarCancion;
    private javax.swing.JButton btnBuscarCancion1;
    private javax.swing.JButton btnBuscarIntegrante;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblGeneroArtista;
    private javax.swing.JLabel lblImagenArtista;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreArtsiata;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlAlbumes;
    private javax.swing.JPanel pnlArtistas;
    private javax.swing.JPanel pnlBiblioteca;
    private javax.swing.JPanel pnlCanciones;
    private javax.swing.JTable tblAlbumes;
    private javax.swing.JTable tblCanciones;
    private javax.swing.JTable tblIntegrantes;
    private javax.swing.JTabbedPane tdpBiblioteca;
    private javax.swing.JTextField txtBuscarAlbum;
    private javax.swing.JTextField txtBuscarAlbum1;
    private javax.swing.JTextField txtBuscarAlbum2;
    private javax.swing.JTextField txtBuscarCancion;
    private javax.swing.JTextField txtBuscarIntegrante;
    // End of variables declaration//GEN-END:variables
}
