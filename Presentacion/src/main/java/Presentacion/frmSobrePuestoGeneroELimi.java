package Presentacion;

import BO.AlbumBO;
import BO.ArtistaBO;
import BO.CancionBO;
import BO.UsuarioBO;
import DTO.AlbumDTO;
import DTO.ArtistasDTO;
import DTO.CancionDTO;
import Exceptions.ExceptionBO;
import IBO.IAlbumBO;
import IBO.IArtistasBO;
import IBO.ICancionBO;
import IBO.IUsuarioBO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import utilerias.ImageRenderer;
import utilerias.JButtonCellEditor;
import utilerias.JButtonRenderer;

/**
 *
 * @author equipo 2
 */
public class frmSobrePuestoGeneroELimi extends java.awt.Dialog {

    private String sesion;
    private String genero;
    private IUsuarioBO usuBO = new UsuarioBO();
    private ICancionBO canBO = new CancionBO();
    private IArtistasBO artBO = new ArtistaBO();
    private IAlbumBO albBO = new AlbumBO();

    private List<CancionDTO> listaTotalCanciones;
    private List<ArtistasDTO> listaTotalArtistas;
    private List<AlbumDTO> listaTotalAlbumes;

    private List<CancionDTO> listaFavoritasCanciones= new ArrayList<>();
    private List<ArtistasDTO> listaFavoritosArtistas=new ArrayList<>();
    private List<AlbumDTO> listaFavoritosAlbumes=new ArrayList<>();
    
    private List<String> listaStringFavoritasCanciones;
    private List<String> listaStringFavoritosArtistas;
    private List<String> listaStringFavoritosAlbumes;

    private List<CancionDTO> listaCandidatasCanciones= new ArrayList<>();
    private List<ArtistasDTO> listaCandidatosArtistas= new ArrayList<>();
    private List<AlbumDTO> listaCandidatosAlbumes= new ArrayList<>();

    public frmSobrePuestoGeneroELimi(java.awt.Frame parent, boolean modal, String sesion, String genero) {
        super(parent, modal);
        this.genero = genero;
        this.sesion = sesion;
        initComponents();
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                System.out.println("Intento de cerrar bloqueado.");
            }
        });
        establecerCandidatos();
        cargarRegistrosCanciones();
        cargarRegistrosArtistas();
        cargarRegistrosAlbum();

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnOK = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblArtistas = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCanciones = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblAlbumes = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 190, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnOK.setBackground(new java.awt.Color(153, 153, 153));
        btnOK.setForeground(new java.awt.Color(255, 255, 255));
        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });
        jPanel1.add(btnOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 90, 30));

        btnCancelar.setBackground(new java.awt.Color(153, 153, 153));
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 90, 30));

        tblArtistas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Imagen", "Nombre"
            }
        ));
        jScrollPane1.setViewportView(tblArtistas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 170, 260));

        tblCanciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Cancion", "Duracion"
            }
        ));
        jScrollPane2.setViewportView(tblCanciones);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 170, 260));

        tblAlbumes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Imagen", "Nombre"
            }
        ));
        jScrollPane3.setViewportView(tblAlbumes);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 170, 260));

        jPanel3.setBackground(new java.awt.Color(204, 102, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Canciones");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(54, 54, 54))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 170, 30));

        jPanel5.setBackground(new java.awt.Color(204, 102, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Albumes");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel2)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 170, -1));

        jPanel4.setBackground(new java.awt.Color(204, 102, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Artistas");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel3)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Generos a Eliminar");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        frmGeneroNoDeseado gen = new frmGeneroNoDeseado(this.sesion);
        gen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        ejecutar();
        frmGeneroNoDeseado gene = new frmGeneroNoDeseado(this.sesion);
        gene.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnOKActionPerformed

    public void establecerCandidatos() {
        try {
            this.listaTotalCanciones = canBO.consultaGeneralCancion(usuBO.consultaRestringidos(sesion));
            this.listaTotalArtistas = artBO.consultaGeneralArtista(usuBO.consultaRestringidos(sesion));
            this.listaTotalAlbumes = albBO.consultaGeneralAlbums(usuBO.consultaRestringidos(sesion));

            listaStringFavoritasCanciones = usuBO.buscar(sesion).getFavoritos().getCanciones();
            listaStringFavoritosArtistas = usuBO.buscar(sesion).getFavoritos().getArtistas();
            listaStringFavoritosAlbumes = usuBO.buscar(sesion).getFavoritos().getAlbums();

            
            for (CancionDTO cancion : listaTotalCanciones) {
                if (listaStringFavoritasCanciones.contains(cancion.getId())) {
                    listaFavoritasCanciones.add(cancion);
                }
            }
            
            for (ArtistasDTO artista : listaTotalArtistas) {
                if (listaStringFavoritosArtistas.contains(artista.getId())) {
                    listaFavoritosArtistas.add(artista);
                }
            }

            for (AlbumDTO album : listaTotalAlbumes) {
                if (listaStringFavoritosAlbumes.contains(album.getId())) {
                    listaFavoritosAlbumes.add(album);
                }
            }
            
            for (CancionDTO cancion : listaFavoritasCanciones) {
                if (listaStringFavoritasCanciones.contains(cancion.getId())) {
                    listaCandidatasCanciones.add(cancion);
                }
            }
            
            for (ArtistasDTO artista : listaFavoritosArtistas) {
                if (artista.getGenero().equals(genero)) {
                    listaCandidatosArtistas.add(artista);
                }
            }
            
            for (AlbumDTO album : listaFavoritosAlbumes) {
                if (album.getGenero().equals("genero")) {
                    listaCandidatosAlbumes.add(album);
                }
            }

        } catch (ExceptionBO e) {
            System.out.println("Error" + e.toString());
        }
    }

    public void ejecutar() {
        try {
            usuBO.restringirGenero(sesion, genero);
            for (CancionDTO dto : listaCandidatasCanciones) {
                usuBO.eliminarFavoritoCancion(sesion, dto.getId());
            }
            for (ArtistasDTO dto : listaCandidatosArtistas) {
                usuBO.eliminarFavoritoArtista(sesion, dto.getId());
            }
            for (AlbumDTO dto : listaCandidatosAlbumes) {
                usuBO.eliminarFavoritoAlbum(sesion, dto.getId());
            }
        } catch (ExceptionBO ex) {
            Logger.getLogger(frmSobrePuestoGeneroELimi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void cargarRegistrosCanciones() {
        DefaultTableModel modeloTabla = (DefaultTableModel) tblCanciones.getModel();
        listaCandidatasCanciones.forEach(row -> {
            Object[] fila = new Object[2];
            fila[0] = row.getNombre();
            fila[1] = row.getNombre();
            modeloTabla.addRow(fila);
        });
    }

    public void cargarRegistrosAlbum() {
        DefaultTableModel modeloTabla = (DefaultTableModel) tblAlbumes.getModel();
        listaCandidatosAlbumes.forEach(row -> {
            Object[] fila = new Object[2];
            fila[0] = row.getPortada();
            fila[1] = row.getNombre();
            modeloTabla.addRow(fila);
        });
        tblAlbumes.getColumnModel().getColumn(0).setCellRenderer(new ImageRenderer());
        tblAlbumes.setRowHeight(50);
        modeloTabla.fireTableDataChanged();
        tblAlbumes.repaint();
    }

    public void cargarRegistrosArtistas() {
        DefaultTableModel modeloTabla = (DefaultTableModel) tblArtistas.getModel();
        listaCandidatosArtistas.forEach(row -> {
            Object[] fila = new Object[2];
            fila[0] = row.getImagen();
            fila[1] = row.getNombre();
            modeloTabla.addRow(fila);
        });

        tblArtistas.getColumnModel().getColumn(0).setCellRenderer(new ImageRenderer());
        tblArtistas.setRowHeight(50);
        modeloTabla.fireTableDataChanged();
        tblArtistas.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblAlbumes;
    private javax.swing.JTable tblArtistas;
    private javax.swing.JTable tblCanciones;
    // End of variables declaration//GEN-END:variables
}
