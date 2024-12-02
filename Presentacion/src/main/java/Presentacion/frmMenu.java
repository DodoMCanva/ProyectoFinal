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
import java.awt.Color;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import utilerias.ImageRenderer;
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

    private List<CancionDTO> listaCancionesBuscadas;
    private List<ArtistasDTO> listaArtistasBuscados;
    private List<AlbumDTO> listaAlbumesBuscados;

    boolean b = false;

    /**
     * Creates new form frmMenu
     *
     * @param sesion
     */
    public frmMenu(String sesion) throws ExceptionBO {

        System.out.println("SESION" + sesion);
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

        pnlMenu = new javax.swing.JPanel();
        btnDesplegable = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblArtistas = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCanciones = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblAlbumes = new javax.swing.JTable();
        pnlAlbumes = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pnlArtistas = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cboxFiltro = new javax.swing.JComboBox<>();
        pnlCanciones = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlMenu.setBackground(new java.awt.Color(204, 190, 255));
        pnlMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDesplegable.setBackground(new java.awt.Color(204, 190, 255));
        btnDesplegable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDesplegable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imegenes/menuSobre.png"))); // NOI18N
        btnDesplegable.setBorder(null);
        btnDesplegable.setBorderPainted(false);
        btnDesplegable.setContentAreaFilled(false);
        btnDesplegable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesplegableActionPerformed(evt);
            }
        });
        pnlMenu.add(btnDesplegable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 60));

        btnBuscar.setBackground(new java.awt.Color(153, 153, 153));
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        pnlMenu.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 70, 30));
        pnlMenu.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 300, 30));

        tblArtistas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 153, 255)));
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
        tblArtistas.setSelectionBackground(new java.awt.Color(204, 204, 255));
        tblArtistas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblArtistasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblArtistas);

        pnlMenu.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 110, 290, 460));

        tblCanciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 153, 255)));
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
        tblCanciones.setSelectionBackground(new java.awt.Color(204, 204, 255));
        tblCanciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblCancionesMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblCanciones);

        pnlMenu.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 290, 460));

        tblAlbumes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 153, 255)));
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
        tblAlbumes.setSelectionBackground(new java.awt.Color(204, 204, 255));
        tblAlbumes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAlbumesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblAlbumes);

        pnlMenu.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 290, 460));

        pnlAlbumes.setBackground(new java.awt.Color(204, 102, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Albumes");

        javax.swing.GroupLayout pnlAlbumesLayout = new javax.swing.GroupLayout(pnlAlbumes);
        pnlAlbumes.setLayout(pnlAlbumesLayout);
        pnlAlbumesLayout.setHorizontalGroup(
            pnlAlbumesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAlbumesLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel2)
                .addContainerGap(129, Short.MAX_VALUE))
        );
        pnlAlbumesLayout.setVerticalGroup(
            pnlAlbumesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAlbumesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pnlMenu.add(pnlAlbumes, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 290, -1));

        pnlArtistas.setBackground(new java.awt.Color(204, 102, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Artistas");

        javax.swing.GroupLayout pnlArtistasLayout = new javax.swing.GroupLayout(pnlArtistas);
        pnlArtistas.setLayout(pnlArtistasLayout);
        pnlArtistasLayout.setHorizontalGroup(
            pnlArtistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlArtistasLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jLabel3)
                .addContainerGap(130, Short.MAX_VALUE))
        );
        pnlArtistasLayout.setVerticalGroup(
            pnlArtistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlArtistasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pnlMenu.add(pnlArtistas, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, 290, 30));

        cboxFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Canciones", "Albums", "Artistas", " " }));
        cboxFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxFiltroActionPerformed(evt);
            }
        });
        pnlMenu.add(cboxFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 100, 30));

        pnlCanciones.setBackground(new java.awt.Color(204, 102, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Canciones");

        javax.swing.GroupLayout pnlCancionesLayout = new javax.swing.GroupLayout(pnlCanciones);
        pnlCanciones.setLayout(pnlCancionesLayout);
        pnlCancionesLayout.setHorizontalGroup(
            pnlCancionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCancionesLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel1)
                .addContainerGap(126, Short.MAX_VALUE))
        );
        pnlCancionesLayout.setVerticalGroup(
            pnlCancionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCancionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pnlMenu.add(pnlCanciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 290, 30));

        getContentPane().add(pnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDesplegableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesplegableActionPerformed
        // Pasamos la referencia del frmMenu al JDialog
        frmMenuSobrePuesto dialog = new frmMenuSobrePuesto(this, true, this.sesion);
        dialog.setVisible(true);

    }//GEN-LAST:event_btnDesplegableActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        reiniciarTablas();
        String filtro = cboxFiltro.getSelectedItem().toString();
        String busqueda = txtBuscar.getText();
        buscar(busqueda, filtro);


    }//GEN-LAST:event_btnBuscarActionPerformed

    private void cboxFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxFiltroActionPerformed

    }//GEN-LAST:event_cboxFiltroActionPerformed

    private void tblCancionesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCancionesMouseReleased
        if (tblCanciones.getSelectedColumn() != 2) {
            if (b) {
                frmBiblioteca b = new frmBiblioteca(sesion, "", "", listaCancionesBuscadas.get(tblCanciones.getSelectedRow()).getId());
                b.setVisible(true);
                this.dispose();
            } else {
                frmBiblioteca b = new frmBiblioteca(sesion, "", "", listaCanciones.get(tblCanciones.getSelectedRow()).getId());
                b.setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_tblCancionesMouseReleased

    private void tblAlbumesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAlbumesMouseClicked
        if (tblArtistas.getSelectedColumn() != 2) {
            if (b) {
                frmBiblioteca b = new frmBiblioteca(sesion, "", "", listaCancionesBuscadas.get(tblCanciones.getSelectedRow()).getId());
                b.setVisible(true);
                this.dispose();
            } else {
                frmBiblioteca b = new frmBiblioteca(sesion, "", "", listaCanciones.get(tblCanciones.getSelectedRow()).getId());
                b.setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_tblAlbumesMouseClicked

    private void tblArtistasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblArtistasMouseClicked
        if (tblAlbumes.getSelectedColumn() != 2) {
            if (b) {
                frmBiblioteca b = new frmBiblioteca(sesion, "", "", listaCancionesBuscadas.get(tblCanciones.getSelectedRow()).getId());
                b.setVisible(true);
                this.dispose();
            } else {
                frmBiblioteca b = new frmBiblioteca(sesion, "", "", listaCanciones.get(tblCanciones.getSelectedRow()).getId());
                b.setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_tblArtistasMouseClicked

    public void formatearTablas() {
        TableColumnModel modeloColumnasCanciones = this.tblCanciones.getColumnModel();
        ActionListener onFavoritoCancionClickListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    boolean a = false;
                    a = usuBO.eliminarFavoritoCancion(sesion, listaCanciones.get(tblCanciones.getSelectedRow()).getId());
                    if (a) {
                        usuBO.agregarCancionFavorito(sesion, listaCanciones.get(tblCanciones.getSelectedRow()).getId());

                    }
                } catch (ExceptionBO ex) {
                    Logger.getLogger(frmMenu.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        modeloColumnasCanciones.getColumn(2).setCellRenderer(new JButtonRenderer("Favorito"));
        modeloColumnasCanciones.getColumn(2).setCellEditor(new JButtonCellEditor("Favorito", onFavoritoCancionClickListener));

        TableColumnModel modeloColumnasArtistas = this.tblArtistas.getColumnModel();
        ActionListener onFavoritoArtistaClickListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    boolean a = false;
                    JButton sb = (JButton) e.getSource();
                    a = usuBO.eliminarFavoritoArtista(sesion, listaArtistas.get(tblArtistas.getSelectedRow()).getId());

                    if (a) {
                        usuBO.agregarArtistaFavorito(sesion, listaArtistas.get(tblArtistas.getSelectedRow()).getId());

                    }
                } catch (ExceptionBO ex) {
                    Logger.getLogger(frmMenu.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        modeloColumnasArtistas.getColumn(2).setCellRenderer(new JButtonRenderer("Favorito"));
        modeloColumnasArtistas.getColumn(2).setCellEditor(new JButtonCellEditor("Favorito", onFavoritoArtistaClickListener));

        TableColumnModel modeloColumnasAlbums = this.tblAlbumes.getColumnModel();
        ActionListener onFavoritoAlbumClickListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    boolean a = false;
                    a = usuBO.eliminarFavoritoAlbum(sesion, listaAlbumes.get(tblAlbumes.getSelectedRow()).getId());
                    if (a) {
                        usuBO.agregarAlbumFavorito(sesion, listaAlbumes.get(tblAlbumes.getSelectedRow()).getId());

                    }
                } catch (ExceptionBO ex) {
                    Logger.getLogger(frmMenu.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        modeloColumnasAlbums.getColumn(2).setCellRenderer(new JButtonRenderer("Favorito"));
        modeloColumnasAlbums.getColumn(2).setCellEditor(new JButtonCellEditor("Favorito", onFavoritoAlbumClickListener));

    }

    public void buscar(String busqueda, String filtro) {
        b = true;
        listaCancionesBuscadas = new ArrayList<>();
        listaArtistasBuscados = new ArrayList<>();
        listaAlbumesBuscados = new ArrayList<>();
        for (CancionDTO cancion : listaCanciones) {
            if (cancion.getNombre().contains(busqueda)) {
                listaCancionesBuscadas.add(cancion);
            }
        }
        for (ArtistasDTO artista : listaArtistas) {
            if (artista.getNombre().contains(busqueda)) {
                listaArtistasBuscados.add(artista);
            }
        }
        for (AlbumDTO album : listaAlbumes) {
            if (album.getNombre().contains(busqueda)) {
                listaAlbumesBuscados.add(album);
            }
        }
        switch (filtro) {
            case "Ninguno":
                if (!busqueda.isEmpty()) {
                    cargarRegistrosAlbumBusqueda();
                    cargarRegistrosArtistasBusqueda();
                    cargarRegistrosCancionesBusqueda();
                } else {
                    try {
                        frmMenu m = new frmMenu(sesion);
                        m.setVisible(true);
                        this.dispose();
                    } catch (ExceptionBO ex) {
                        Logger.getLogger(frmMenu.class
                                .getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;

            case "Canciones":
                if (!busqueda.isEmpty()) {
                    cargarRegistrosCancionesBusqueda();
                } else {
                    cargarRegistrosCanciones();
                }
                break;

            case "Albums":
                if (!busqueda.isEmpty()) {
                    cargarRegistrosAlbumBusqueda();
                } else {
                    cargarRegistrosAlbum();
                }
                break;

            case "Artistas":
                if (!busqueda.isEmpty()) {
                    cargarRegistrosArtistasBusqueda();
                } else {
                    cargarRegistrosArtistasBusqueda();
                }
                break;
            default:
                System.out.println("Error con el filtro");
        }
    }

    public void cargarRegistrosCancionesBusqueda() {
        DefaultTableModel modeloTabla = (DefaultTableModel) tblCanciones.getModel();
        listaCancionesBuscadas.forEach(row -> {
            Object[] fila = new Object[3];
            fila[0] = row.getDuracion();
            fila[1] = row.getNombre();
            fila[2] = "Favoritos";
            modeloTabla.addRow(fila);
        });
    }

    public void cargarRegistrosAlbumBusqueda() {
        DefaultTableModel modeloTabla = (DefaultTableModel) tblAlbumes.getModel();
        listaAlbumesBuscados.forEach(row -> {
            Object[] fila = new Object[3];
            fila[0] = row.getPortada(); // Ruta de la imagen
            fila[1] = row.getNombre();  // Nombre del álbum
            fila[2] = "Favoritos";      // Acción o categoría
            modeloTabla.addRow(fila);
        });
        tblAlbumes.getColumnModel().getColumn(0).setCellRenderer(new ImageRenderer()); // Renderizar imágenes
        tblAlbumes.setRowHeight(50); // Ajustar altura de las filas para mostrar imágenes correctamente
        modeloTabla.fireTableDataChanged(); // Asegúrate de que el modelo de la tabla esté actualizado
        tblAlbumes.repaint();
    }

    public void cargarRegistrosArtistasBusqueda() {
        DefaultTableModel modeloTabla = (DefaultTableModel) tblArtistas.getModel();
        listaArtistasBuscados.forEach(row -> {
            Object[] fila = new Object[3];
            fila[0] = row.getImagen(); // Ruta de la imagen
            fila[1] = row.getNombre(); // Nombre del artista
            fila[2] = "Favoritos";     // Categoría o acción
            modeloTabla.addRow(fila);
        });

        // Establecer el renderizador para la columna de imágenes
        tblArtistas.getColumnModel().getColumn(0).setCellRenderer(new ImageRenderer());
        tblArtistas.setRowHeight(50); // Ajustar altura de las filas para mostrar imágenes correctamente
        modeloTabla.fireTableDataChanged(); // Asegúrate de que el modelo de la tabla esté actualizado
        tblArtistas.repaint();
    }

    public void cargarRegistrosCanciones() {
        DefaultTableModel modeloTabla = (DefaultTableModel) tblCanciones.getModel();
        listaCanciones.forEach(row -> {
            Object[] fila = new Object[3];
            fila[0] = row.getDuracion();
            fila[1] = row.getNombre();
            fila[2] = "Favoritos";
            modeloTabla.addRow(fila);
        });
    }

    public void cargarRegistrosAlbum() {
        DefaultTableModel modeloTabla = (DefaultTableModel) tblAlbumes.getModel();
        listaAlbumes.forEach(row -> {
            Object[] fila = new Object[3];
            fila[0] = row.getPortada(); // Ruta de la imagen
            fila[1] = row.getNombre();  // Nombre del álbum
            fila[2] = "Favoritos";      // Acción o categoría
            modeloTabla.addRow(fila);
        });
        tblAlbumes.getColumnModel().getColumn(0).setCellRenderer(new ImageRenderer()); // Renderizar imágenes
        tblAlbumes.setRowHeight(50); // Ajustar altura de las filas para mostrar imágenes correctamente
        modeloTabla.fireTableDataChanged(); // Asegúrate de que el modelo de la tabla esté actualizado
        tblAlbumes.repaint();
    }

    public void cargarRegistrosArtistas() {
        DefaultTableModel modeloTabla = (DefaultTableModel) tblArtistas.getModel();
        listaArtistas.forEach(row -> {
            Object[] fila = new Object[3];
            fila[0] = row.getImagen(); // Ruta de la imagen
            fila[1] = row.getNombre(); // Nombre del artista
            fila[2] = "Favoritos";     // Categoría o acción
            modeloTabla.addRow(fila);
        });

        // Establecer el renderizador para la columna de imágenes
        tblArtistas.getColumnModel().getColumn(0).setCellRenderer(new ImageRenderer());
        tblArtistas.setRowHeight(50); // Ajustar altura de las filas para mostrar imágenes correctamente
        modeloTabla.fireTableDataChanged(); // Asegúrate de que el modelo de la tabla esté actualizado
        tblArtistas.repaint();
    }

    private void reiniciarTablas() {
        DefaultTableModel modeloTablaCan = (DefaultTableModel) this.tblCanciones.getModel();
        modeloTablaCan.setRowCount(0);
        DefaultTableModel modeloTablaAlb = (DefaultTableModel) this.tblAlbumes.getModel();
        modeloTablaAlb.setRowCount(0);
        DefaultTableModel modeloTablaArt = (DefaultTableModel) this.tblArtistas.getModel();
        modeloTablaArt.setRowCount(0);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnDesplegable;
    private javax.swing.JComboBox<String> cboxFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel pnlAlbumes;
    private javax.swing.JPanel pnlArtistas;
    private javax.swing.JPanel pnlCanciones;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JTable tblAlbumes;
    private javax.swing.JTable tblArtistas;
    private javax.swing.JTable tblCanciones;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
