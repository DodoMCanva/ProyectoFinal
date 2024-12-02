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

    /**
     * Creates new form frmFavoritos
     */
    public frmFavoritos(String sesion) {
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
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Imagen", "Nombre", "Género", "Eliminar"
            }
        ));
        scllpAlbumes.setViewportView(tblAlbumes);

        pnlFavoritos.add(scllpAlbumes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 600, 100));

        tblCanciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Canción", "Genero", "Álbum", "Eliminar"
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
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Imagen", "Nombre", "Género", "Eliminar"
            }
        ));
        scllpArtistas.setViewportView(tblArtistas);

        pnlFavoritos.add(scllpArtistas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 600, 100));

        lblArtistas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblArtistas.setText("Artistas");
        pnlFavoritos.add(lblArtistas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 70, -1));

        btnVolver.setBackground(new java.awt.Color(153, 153, 153));
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        pnlFavoritos.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, -1, -1));

        getContentPane().add(pnlFavoritos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 640));

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

    public void formatearTablas() {
        TableColumnModel modeloColumnasCanciones = this.tblCanciones.getColumnModel();
        ActionListener onFavoritoCancionClickListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    usuBO.eliminarFavoritoCancion(sesion, listaFavoritasCanciones.get(tblCanciones.getSelectedRow()).getId());
                    reiniciarTablas();
                    cargarRegistrosCanciones();
                    cargarRegistrosArtistas();
                    cargarRegistrosAlbum();
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
                    usuBO.eliminarFavoritoArtista(sesion, listaFavoritosArtistas.get(tblArtistas.getSelectedRow()).getId());
                    reiniciarTablas();
                    cargarRegistrosCanciones();
                    cargarRegistrosArtistas();
                    cargarRegistrosAlbum();
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
                    usuBO.eliminarFavoritoCancion(sesion, listaFavoritosAlbumes.get(tblAlbumes.getSelectedRow()).getId());
                    reiniciarTablas();
                    cargarRegistrosCanciones();
                    cargarRegistrosArtistas();
                    cargarRegistrosAlbum();
                } catch (ExceptionBO ex) {
                    Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        modeloColumnasAlbums.getColumn(3).setCellRenderer(new JButtonRenderer("Eliminar"));
        modeloColumnasAlbums.getColumn(3).setCellEditor(new JButtonCellEditor("Eliminar", onFavoritoAlbumClickListener));

    }

    public void cargarBusquedasGeneralTabla(String busqueda) {

    }

    public void cargarRegistrosCanciones() {
        DefaultTableModel modeloTabla = (DefaultTableModel) tblCanciones.getModel();
        listaFavoritasCanciones.forEach(row -> {
            Object[] fila = new Object[4];
            fila[0] = row.getNombre();
            //Subconsulta con album para rellenar estos campos
            fila[1] = row.getNombre();
            fila[2] = row.getNombre();
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblArtistas;
    private javax.swing.JLabel lblCanciones;
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
