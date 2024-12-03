package Presentacion;

import BO.AlbumBO;
import BO.ArtistaBO;
import BO.CancionBO;
import BO.UsuarioBO;
import DTO.AlbumDTO;
import DTO.ArtistasDTO;
import DTO.CancionDTO;
import DTO.UsuarioDTO;
import Exceptions.ExceptionBO;
import IBO.IAlbumBO;
import IBO.IArtistasBO;
import IBO.ICancionBO;
import IBO.IUsuarioBO;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import utilerias.ImageRenderer;
import utilerias.JButtonCellEditor;
import utilerias.JButtonRenderer;

/**
 *
 * @author equipo 2
 */
public class frmFavoritos extends javax.swing.JFrame {

    private String sesion;
    private IUsuarioBO usuBO = new UsuarioBO();
    private ICancionBO canBO = new CancionBO();
    private IArtistasBO artBO = new ArtistaBO();
    private IAlbumBO albBO = new AlbumBO();

    private List<String> listaSCanciones;
    private List<String> listaSArtistas;
    private List<String> listaSAlbumes;

    //Totales
    private List<CancionDTO> listaTotalCanciones;
    private List<ArtistasDTO> listaTotalArtistas;
    private List<AlbumDTO> listaTotalAlbumes;
    //ListaaUSAR
    private List<CancionDTO> listaFavoritasCanciones = new ArrayList<>();
    private List<ArtistasDTO> listaFavoritosArtistas = new ArrayList<>();
    private List<AlbumDTO> listaFavoritosAlbumes = new ArrayList<>();
    private List<CancionDTO> listaCancionesBusqueda;
    private List<ArtistasDTO> listaArtistasBusqueda;
    private List<AlbumDTO> listaAlbumesBusqueda;

    boolean b;

    /**
     * Creates new form frmFavoritos
     */
    public frmFavoritos(String sesion) {
        b = false;
        String n = null;
        try {
            n = (usuBO.buscar(sesion).getNombre());

            this.listaTotalCanciones = canBO.consultaGeneralCancion(usuBO.consultaRestringidos(sesion));
            this.listaTotalArtistas = artBO.consultaGeneralArtista(usuBO.consultaRestringidos(sesion));
            this.listaTotalAlbumes = albBO.consultaGeneralAlbums(usuBO.consultaRestringidos(sesion));

            listaSCanciones = usuBO.buscar(sesion).getFavoritos().getCanciones();
            listaSArtistas = usuBO.buscar(sesion).getFavoritos().getArtistas();
            listaSAlbumes = usuBO.buscar(sesion).getFavoritos().getAlbums();

            for (CancionDTO cancion : listaTotalCanciones) {
                if (listaSCanciones.contains(cancion.getId())) {
                    listaFavoritasCanciones.add(cancion);
                }
            }

            for (ArtistasDTO artista : listaTotalArtistas) {
                if (listaSArtistas.contains(artista.getId())) {
                    listaFavoritosArtistas.add(artista);
                }
            }

            for (AlbumDTO album : listaTotalAlbumes) {
                if (listaSAlbumes.contains(album.getId())) {
                    listaFavoritosAlbumes.add(album);
                }
            }

        } catch (ExceptionBO e) {
            JOptionPane.showMessageDialog(null, "Error en favoritos" + e);
        }
        this.sesion = sesion;
        initComponents();
        lblUsuario.setText(n);
        formatearTablas();
        reiniciarTablas();
        cargarRegistrosCanciones();
        cargarRegistrosArtistas();
        cargarRegistrosAlbum();
        cargarImagenUsuario();
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
        btnVolver = new javax.swing.JButton();
        lblEstrellaFav = new javax.swing.JLabel();
        lblImagenUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Favoritos");
        setMinimumSize(new java.awt.Dimension(720, 810));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlFavoritos.setBackground(new java.awt.Color(204, 190, 255));
        pnlFavoritos.setMinimumSize(new java.awt.Dimension(720, 810));
        pnlFavoritos.setPreferredSize(new java.awt.Dimension(720, 810));
        pnlFavoritos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloFavoritos.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblTituloFavoritos.setText("Favoritos");
        pnlFavoritos.add(lblTituloFavoritos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 90, 30));

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblUsuario.setText("Usuario");
        pnlFavoritos.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));
        pnlFavoritos.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 400, 30));

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        pnlFavoritos.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, -1, 30));

        tblAlbumes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Imagen", "Nombre", "Género", "Eliminar"
            }
        ));
        tblAlbumes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAlbumesMouseClicked(evt);
            }
        });
        scllpAlbumes.setViewportView(tblAlbumes);

        pnlFavoritos.add(scllpAlbumes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 640, 190));

        tblCanciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Canción", "Genero", "Duracion", "Eliminar"
            }
        ));
        tblCanciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCancionesMouseClicked(evt);
            }
        });
        scllpCanciones.setViewportView(tblCanciones);

        pnlFavoritos.add(scllpCanciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 640, 150));

        lblCanciones.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblCanciones.setText("Canciones");
        pnlFavoritos.add(lblCanciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 122, -1, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setText("Álbumes");
        pnlFavoritos.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, 30));

        tblArtistas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Imagen", "Nombre", "Género", "Eliminar"
            }
        ));
        tblArtistas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblArtistasMouseClicked(evt);
            }
        });
        scllpArtistas.setViewportView(tblArtistas);

        pnlFavoritos.add(scllpArtistas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, 640, 190));

        lblArtistas.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblArtistas.setText("Artistas");
        pnlFavoritos.add(lblArtistas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 70, 30));

        btnVolver.setBackground(new java.awt.Color(153, 153, 153));
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        pnlFavoritos.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, -1, -1));

        lblEstrellaFav.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imegenes/estrella.png"))); // NOI18N
        pnlFavoritos.add(lblEstrellaFav, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 30, 30));

        lblImagenUsuario.setText("ImgUsuario");
        pnlFavoritos.add(lblImagenUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 40, 40));

        getContentPane().add(pnlFavoritos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 810));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        frmMenu menu = null;
        try {
            menu = new frmMenu(this.sesion);
        } catch (ExceptionBO ex) {
            Logger.getLogger(frmFavoritos.class.getName()).log(Level.SEVERE, null, ex);
        }
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        b = true;
        reiniciarTablas();
        String busqueda = txtBuscar.getText();
        buscar(busqueda);

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tblCancionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCancionesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCancionesMouseClicked

    private void tblAlbumesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAlbumesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblAlbumesMouseClicked

    private void tblArtistasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblArtistasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblArtistasMouseClicked

    public void formatearTablas() {
        TableColumnModel modeloColumnasCanciones = this.tblCanciones.getColumnModel();
        ActionListener onFavoritoCancionClickListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (b) {
                        usuBO.eliminarFavoritoCancion(sesion, listaCancionesBusqueda.get(tblCanciones.getSelectedRow()).getId());
                    } else {
                        usuBO.eliminarFavoritoCancion(sesion, listaFavoritasCanciones.get(tblCanciones.getSelectedRow()).getId());
                    }
                    desaparecer();
                } catch (ExceptionBO ex) {
                    Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        modeloColumnasCanciones.getColumn(3).setCellRenderer(new JButtonRenderer("Eliminar"));
        modeloColumnasCanciones.getColumn(3).setCellEditor(new JButtonCellEditor("Eliminar", onFavoritoCancionClickListener));

        TableColumnModel modeloColumnasArtistas = this.tblArtistas.getColumnModel();
        ActionListener onFavoritoArtistaClickListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (b) {

                    }
                    usuBO.eliminarFavoritoArtista(sesion, listaFavoritosArtistas.get(tblArtistas.getSelectedRow()).getId());
                    desaparecer();
                } catch (ExceptionBO ex) {
                    Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        modeloColumnasArtistas.getColumn(3).setCellRenderer(new JButtonRenderer("Eliminar"));
        modeloColumnasArtistas.getColumn(3).setCellEditor(new JButtonCellEditor("Eliminar", onFavoritoArtistaClickListener));

        TableColumnModel modeloColumnasAlbums = this.tblAlbumes.getColumnModel();
        ActionListener onFavoritoAlbumClickListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (b) {
                        usuBO.eliminarFavoritoAlbum(sesion, listaAlbumesBusqueda.get(tblAlbumes.getSelectedRow()).getId());
                        desaparecer();
                    } else {
                        usuBO.eliminarFavoritoAlbum(sesion, listaFavoritosAlbumes.get(tblAlbumes.getSelectedRow()).getId());
                        desaparecer();
                    }
                } catch (ExceptionBO ex) {
                    Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        modeloColumnasAlbums.getColumn(3).setCellRenderer(new JButtonRenderer("Eliminar"));
        modeloColumnasAlbums.getColumn(3).setCellEditor(new JButtonCellEditor("Eliminar", onFavoritoAlbumClickListener));

    }

    public void buscar(String busqueda) {
        listaCancionesBusqueda = new ArrayList<>();
        listaArtistasBusqueda = new ArrayList<>();
        listaAlbumesBusqueda = new ArrayList<>();

        // Convertir el término de búsqueda a minúsculas
        String busquedaMinusculas = busqueda.toLowerCase();

        for (CancionDTO cancion : listaFavoritasCanciones) {
            // Convertir el nombre de la canción a minúsculas antes de comparar
            if (cancion.getNombre().toLowerCase().contains(busquedaMinusculas)|| cancion.getGenero().contains(busqueda)) {
                listaCancionesBusqueda.add(cancion);
            }
        }
        for (ArtistasDTO artista : listaFavoritosArtistas) {
            // Convertir el nombre del artista a minúsculas antes de comparar
            if (artista.getNombre().toLowerCase().contains(busquedaMinusculas)|| artista.getGenero().contains(busqueda)) {
                listaArtistasBusqueda.add(artista);
            }
        }
        for (AlbumDTO album : listaFavoritosAlbumes) {
            // Convertir el nombre del álbum a minúsculas antes de comparar
            if (album.getNombre().toLowerCase().contains(busquedaMinusculas)|| album.getGenero().contains(busqueda)) {
                listaAlbumesBusqueda.add(album);
            }
        }
        if (!busqueda.isEmpty()) {
            cargarRegistrosAlbumBusqueda();
            cargarRegistrosArtistasBusqueda();
            cargarRegistrosCancionesBusqueda();
        } else {
            frmFavoritos m = new frmFavoritos(sesion);
            m.setVisible(true);
            this.dispose();
        }
    }

    public void cargarRegistrosCancionesBusqueda() {
        DefaultTableModel modeloTabla = (DefaultTableModel) tblCanciones.getModel();
        listaCancionesBusqueda.forEach(row -> {
            Object[] fila = new Object[4];
            fila[0] = row.getNombre();
            fila[1] = row.getGenero();
            //Ajustar
            fila[2] = row.getNombre();
            fila[3] = "Eliminar";
            modeloTabla.addRow(fila);
        });
    }

    public void cargarRegistrosAlbumBusqueda() {
        DefaultTableModel modeloTabla = (DefaultTableModel) tblAlbumes.getModel();
        listaAlbumesBusqueda.forEach(row -> {
            Object[] fila = new Object[4];
            fila[0] = row.getPortada();
            fila[1] = row.getNombre();
            fila[2] = row.getGenero();
            fila[3] = "Eliminar";
            modeloTabla.addRow(fila);
        });
        tblAlbumes.getColumnModel().getColumn(0).setCellRenderer(new ImageRenderer()); // Renderizar imágenes
        tblAlbumes.setRowHeight(50); // Ajustar altura de las filas para mostrar imágenes correctamente
        modeloTabla.fireTableDataChanged(); // Asegúrate de que el modelo de la tabla esté actualizado
        tblAlbumes.repaint();
    }

    public void cargarRegistrosArtistasBusqueda() {
        DefaultTableModel modeloTabla = (DefaultTableModel) tblArtistas.getModel();
        listaArtistasBusqueda.forEach(row -> {
            Object[] fila = new Object[4];
            fila[0] = row.getImagen();
            fila[1] = row.getNombre();
            fila[2] = row.getGenero();
            fila[3] = "Eliminar";
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
        listaFavoritasCanciones.forEach(row -> {
            Object[] fila = new Object[4];
            fila[0] = row.getNombre();
            fila[1] = row.getGenero();
            fila[2] = row.getDuracion();
            fila[3] = "Eliminar";
            modeloTabla.addRow(fila);
        });
    }

    public void cargarRegistrosAlbum() {
        DefaultTableModel modeloTabla = (DefaultTableModel) tblAlbumes.getModel();
        listaFavoritosAlbumes.forEach(row -> {
            Object[] fila = new Object[4];
            fila[0] = row.getPortada();
            fila[1] = row.getNombre();
            fila[2] = row.getGenero();
            fila[3] = "Eliminar";
            modeloTabla.addRow(fila);
        });

        tblAlbumes.getColumnModel().getColumn(0).setCellRenderer(new ImageRenderer());
        tblAlbumes.setRowHeight(50);
        modeloTabla.fireTableDataChanged();
        tblAlbumes.repaint();

    }

    public void cargarRegistrosArtistas() {
        DefaultTableModel modeloTabla = (DefaultTableModel) tblArtistas.getModel();
        listaFavoritosArtistas.forEach(row -> {
            Object[] fila = new Object[4];
            fila[0] = row.getImagen();
            fila[1] = row.getNombre();
            fila[2] = row.getGenero();
            fila[3] = "Eliminar";
            modeloTabla.addRow(fila);
        });

        tblArtistas.getColumnModel().getColumn(0).setCellRenderer(new ImageRenderer());
        tblArtistas.setRowHeight(50);
        modeloTabla.fireTableDataChanged();
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

    public void desaparecer() {
        frmFavoritos fm = new frmFavoritos(sesion);
        fm.setVisible(true);
        this.dispose();
    }

    private void cargarImagenUsuario() {
        try {
            UsuarioDTO usuario = usuBO.buscar(sesion);
            String imagenPath = usuario.getImagen();
            if (imagenPath == null || imagenPath.isEmpty()) {
                imagenPath = "/imagenes/perfil.png"; // Ruta de imagen por defecto
            }

            ImageIcon icon;
            if (new File(imagenPath).exists()) {
                icon = new ImageIcon(redimensionarImagen(imagenPath, lblImagenUsuario.getWidth(), lblImagenUsuario.getHeight()));
            } else {
                URL imageUrl = getClass().getResource(imagenPath);
                if (imageUrl != null) {
                    icon = new ImageIcon(redimensionarImagen(imageUrl, lblImagenUsuario.getWidth(), lblImagenUsuario.getHeight()));
                } else {
                    imageUrl = getClass().getResource("/imagenes/perfil.png");
                    icon = new ImageIcon(redimensionarImagen(imageUrl, lblImagenUsuario.getWidth(), lblImagenUsuario.getHeight()));
                }
            }
            lblImagenUsuario.setIcon(icon);
        } catch (ExceptionBO e) {
            JOptionPane.showMessageDialog(null, "Error al cargar la imagen del usuario: " + e);
        }
    }

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
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblArtistas;
    private javax.swing.JLabel lblCanciones;
    private javax.swing.JLabel lblEstrellaFav;
    private javax.swing.JLabel lblImagenUsuario;
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
