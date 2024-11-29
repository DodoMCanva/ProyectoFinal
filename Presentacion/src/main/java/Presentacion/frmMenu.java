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
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import utilerias.JButtonCellEditor;
import utilerias.JButtonRenderer;

/**
 *
 * @author equipo 2
 */
public class frmMenu extends javax.swing.JFrame {

    private String sesion;
    private IUsuarioBO usuBO = new UsuarioBO();
    private ICancionBO canBO = new CancionBO();
    private IArtistasBO artBO = new ArtistaBO();
    private IAlbumBO albBO = new AlbumBO();
    

    private List<CancionDTO> listaCanciones;
    private List<ArtistasDTO> listaArtistas;
    private List<AlbumDTO> listaAlbumes;

    /**
     * Creates new form frmMenu
     *
     * @param sesion
     */
    public frmMenu(String sesion) throws ExceptionBO {
        
        System.out.println("SESION"+sesion);
        this.listaCanciones = canBO.consultaGeneralCancion(usuBO.consultaRestringidos(sesion));
        this.listaArtistas = artBO.consultaGeneralArtista(usuBO.consultaRestringidos(sesion));
        this.listaAlbumes = albBO.consultaGeneralAlbums(usuBO.consultaRestringidos(sesion));
        this.sesion = sesion;
        initComponents();
       formatearTablas();
       reiniciarTablas();
       cargarRegistrosCanciones();
       cargarRegistrosArtistas();
       cargarRegistrosAlbum();
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnDesplegable = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblArtistas = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCanciones = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblAlbumes = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cboxFiltro = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 500));

        jPanel1.setBackground(new java.awt.Color(204, 190, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDesplegable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDesplegable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imegenes/menu.png"))); // NOI18N
        btnDesplegable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesplegableActionPerformed(evt);
            }
        });
        jPanel1.add(btnDesplegable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 50));

        btnBuscar.setBackground(new java.awt.Color(153, 153, 153));
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 70, -1));
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 220, -1));

        tblArtistas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Imagen", "Nombre", "Favoritos"
            }
        ));
        jScrollPane1.setViewportView(tblArtistas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, 240, 310));

        tblCanciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Duracion", "Nombre", "Favoritos"
            }
        ));
        tblCanciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblCancionesMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblCanciones);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 250, 310));

        tblAlbumes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Imagen", "Nombre", "Favoritos"
            }
        ));
        jScrollPane3.setViewportView(tblAlbumes);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 240, 310));

        jPanel5.setBackground(new java.awt.Color(204, 102, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Albumes");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel2)
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 240, -1));

        jPanel4.setBackground(new java.awt.Color(204, 102, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Artistas");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(93, 93, 93))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, 240, -1));

        cboxFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Canciones", "Albums", "Artistas", " " }));
        cboxFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxFiltroActionPerformed(evt);
            }
        });
        jPanel1.add(cboxFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 100, -1));

        jPanel3.setBackground(new java.awt.Color(204, 102, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Canciones");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(85, 85, 85))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 250, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDesplegableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesplegableActionPerformed
        // Pasamos la referencia del frmMenu al JDialog
        frmMenuSobrePuesto dialog = new frmMenuSobrePuesto(this, true, this.sesion);
        dialog.setVisible(true);

    }//GEN-LAST:event_btnDesplegableActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String filtro = cboxFiltro.getSelectedItem().toString();
        switch (filtro) {
            case "Ninguno":
                String busqueda = txtBuscar.getText();
                if (!busqueda.isEmpty()) {
                    cargarBusquedasGeneralTabla(busqueda);
                } else {
                    this.dispose();
                    try {
                        //De preferencia cambiar por otro reseteo
                        frmMenu m = new frmMenu(sesion);
                        m.setVisible(true);
                    } catch (ExceptionBO ex) {
                        Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
            case "":
                break;
            default:
                throw new AssertionError();
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void cboxFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxFiltroActionPerformed

    }//GEN-LAST:event_cboxFiltroActionPerformed

    private void tblCancionesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCancionesMouseReleased
        if (tblCanciones.getSelectedColumn() != 2) {
            frmBiblioteca b = new frmBiblioteca(sesion);
        }
    }//GEN-LAST:event_tblCancionesMouseReleased

    public void formatearTablas() {
        TableColumnModel modeloColumnasCanciones = this.tblCanciones.getColumnModel();
        ActionListener onFavoritoCancionClickListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                List<String> ids = new ArrayList<>();
//                for (CancionDTO cancion : listaCanciones) {
//                    ids.add(cancion.getId());
//                }
//
//                try {
//                    for (int i = 0; i < ids.size(); i++) {
//                        if (usuBO.comprobarFavoritoCancion(ids.get(i))) {
//                            usuBO.eliminarFavoritoCancion(sesion, ids.get(i));
//                            break;
//                        }
//                    }
//                    usuBO.agregarCancionFavorito(sesion, ids.get(tblCanciones.getSelectedRow()));
//                } catch (ExceptionBO ex) {
//                    Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
//                }
            }
        };
        modeloColumnasCanciones.getColumn(2).setCellRenderer(new JButtonRenderer("Favorito"));
        modeloColumnasCanciones.getColumn(2).setCellEditor(new JButtonCellEditor("Favorito", onFavoritoCancionClickListener));

        TableColumnModel modeloColumnasArtistas = this.tblArtistas.getColumnModel();
        ActionListener onFavoritoArtistaClickListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };
        modeloColumnasArtistas.getColumn(2).setCellRenderer(new JButtonRenderer("Favorito"));
        modeloColumnasArtistas.getColumn(2).setCellEditor(new JButtonCellEditor("Favorito", onFavoritoArtistaClickListener));

        TableColumnModel modeloColumnasAlbums = this.tblAlbumes.getColumnModel();
        ActionListener onFavoritoAlbumClickListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };
        modeloColumnasAlbums.getColumn(2).setCellRenderer(new JButtonRenderer("Favorito"));
        modeloColumnasAlbums.getColumn(2).setCellEditor(new JButtonCellEditor("Favorito", onFavoritoAlbumClickListener));

    }

    public void cargarBusquedasGeneralTabla(String busqueda) {

    }


    public void cargarRegistrosCanciones() {
        //reiniciarTablas();
        DefaultTableModel modeloTabla = (DefaultTableModel) tblCanciones.getModel();
        listaCanciones.forEach(row -> {
            Object[] fila = new Object[3];
            fila[0] = row.getDuracion();
            fila[1] = row.getNombre();
            fila[2] = "favoritos";
            modeloTabla.addRow(fila);
        });
    }
    public void cargarRegistrosAlbum() {
        //reiniciarTablas();
        DefaultTableModel modeloTabla = (DefaultTableModel) tblAlbumes.getModel();
        listaAlbumes.forEach(row -> {
            Object[] fila = new Object[3];
            //implementar imagenes
            fila[0] = row.getPortada();
            fila[1] = row.getNombre();
            fila[2] = "favoritos";
            modeloTabla.addRow(fila);
        });
    }
    public void cargarRegistrosArtistas() {
    DefaultTableModel modeloTabla = (DefaultTableModel) tblArtistas.getModel();
    //tblArtistas.getColumnModel().getColumn(0).setCellRenderer(new ImageRenderer()); // Establecer el renderizador para la columna de imágenes
    listaArtistas.forEach(row -> {
        Object[] fila = new Object[3];
        fila[0] = row.getImagen(); // Ruta de la imagen
        fila[1] = row.getNombre();
        fila[2] = "favoritos";
        modeloTabla.addRow(fila);
    });
}


    private void reiniciarTablas() {
        DefaultTableModel modeloTablaCan = (DefaultTableModel) this.tblCanciones.getModel();
        modeloTablaCan.setRowCount(0);
        DefaultTableModel modeloTablaAlb = (DefaultTableModel) this.tblAlbumes.getModel();
        modeloTablaAlb.setRowCount(0);
        DefaultTableModel modeloTablaArt = (DefaultTableModel) this.tblArtistas.getModel();
        modeloTablaArt.setRowCount(0);
    }

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
//            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new frmMenu().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnDesplegable;
    private javax.swing.JComboBox<String> cboxFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblAlbumes;
    private javax.swing.JTable tblArtistas;
    private javax.swing.JTable tblCanciones;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
