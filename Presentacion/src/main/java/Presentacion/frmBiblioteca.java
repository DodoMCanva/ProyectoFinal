package Presentacion;

import BO.AlbumBO;
import BO.ArtistaBO;
import BO.CancionBO;
import BO.UsuarioBO;
import DTO.AlbumDTO;
import DTO.ArtistasDTO;
import DTO.CancionDTO;
import DTO.IntegranteDTO;
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
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import utilerias.ImageRenderer;
import utilerias.JButtonCellEditor;
import utilerias.JButtonRenderer;

/**
 * frmBiblioteca esta pantalla muestra al usuario los detalles tanto de Album,
 * Cancion, Artista y integrantes de ser un grupo con integrantes.
 *
 * @author Equipo 2
 */
public class frmBiblioteca extends javax.swing.JFrame {

    private IUsuarioBO usuBO = new UsuarioBO();
    private ICancionBO canBO = new CancionBO();
    private IArtistasBO artBO = new ArtistaBO();
    private IAlbumBO albBO = new AlbumBO();

    private ArtistasDTO Artista;

    //Fijas
    private List<CancionDTO> listaPCanciones;
    private List<AlbumDTO> listaPAlbumes;

    //Fijas
    private List<CancionDTO> listaCanciones;
    private List<IntegranteDTO> listaIntegrantes;
    private List<AlbumDTO> listaAlbumes;

    //Busqueda
    private List<CancionDTO> listaCancionesBuscadas;
    private List<IntegranteDTO> listaIntegrantesBuscados;
    private List<AlbumDTO> listaAlbumesBuscados;

    private boolean bc, ba;
    private String sesion, id, tipo;

    /**
     * Creates new form frmBiblioteca
     */
    public frmBiblioteca(String sesion, String id, String tipo) throws ExceptionBO {
        bc = false;
        ba = false;
        this.id = id;
        this.tipo = tipo;
        this.sesion = sesion;
        this.listaPCanciones = canBO.consultaGeneralCancion(usuBO.consultaRestringidos(sesion));
        this.listaPAlbumes = albBO.consultaGeneralAlbums(usuBO.consultaRestringidos(sesion));
        initComponents();
        formatearTablas();
        reiniciarTablasAlbumes();
        reiniciarTablasCancion();
        reiniciarTablasIntegrantes();
        inicializarUsuario();
        inicio();
    }

    public void inicio() throws ExceptionBO {
        List<String> listaSCanciones = new ArrayList<>();
        switch (tipo) {
            case "cancion":
                for (AlbumDTO album : listaPAlbumes) {
                    if (album.getCanciones().contains(id)) {
                        Artista = artBO.consulta(album.getArtista());
                    }
                }

                //Consultar Albumes de artista
                this.listaAlbumes = new ArrayList<>();
                if (Artista != null) {
                    for (AlbumDTO album : listaPAlbumes) {
                        if (album.getArtista().equals(Artista.getId())) {
                            listaAlbumes.add(album);
                        }
                    }
                }

                //consulta canciones por album
                this.listaCanciones = new ArrayList<>();
                if (!listaAlbumes.isEmpty()) {
                    listaSCanciones = listaAlbumes.get(0).getCanciones();
                    for (String cancion : listaSCanciones) {
                        listaCanciones.add(canBO.consulta(cancion));
                    }
                }

                //Consultar integrantes
                if (Artista != null) {
                    if (Artista.getIntegrantes() != null) {
                        listaIntegrantes = Artista.getIntegrantes();
                        tdpBiblioteca.setEnabledAt(2, true);
                    } else {
                        tdpBiblioteca.setEnabledAt(2, false);
                    }
                }

                cargaInicial();

                break;
            case "album":
                for (AlbumDTO album : listaPAlbumes) {
                    if (album.getId().equals(id)) {
                        //consultar artista por album
                        this.Artista = artBO.consulta(albBO.consulta(id).getArtista());
                    }
                }
                //Consultar canciones por album
                this.listaCanciones = new ArrayList<>();
                listaSCanciones = albBO.consulta(id).getCanciones();
                for (String cancion : listaSCanciones) {
                    listaCanciones.add(canBO.consulta(cancion));
                }

                //Consultar Albumes de artista
                this.listaAlbumes = new ArrayList<>();
                for (AlbumDTO album : listaPAlbumes) {
                    if (album.getArtista().equals(Artista.getId())) {
                        listaAlbumes.add(album);
                    }
                }

                //Consultar integrantes
                if (Artista.getIntegrantes() != null) {
                    listaIntegrantes = Artista.getIntegrantes();
                    tdpBiblioteca.setEnabledAt(2, true);
                } else {
                    tdpBiblioteca.setEnabledAt(2, false);
                }
                cargaInicial();

                break;
            case "artista":
                //consultar artista
                this.Artista = artBO.consulta(id);

                //consultar albumes de artista
                this.listaAlbumes = new ArrayList<>();
                for (AlbumDTO album : listaPAlbumes) {
                    if (album.getArtista().equals(id)) {
                        listaAlbumes.add(album);
                    }
                }

                //consulta canciones por album
                this.listaCanciones = new ArrayList<>();
                if (!listaAlbumes.isEmpty()) {
                    listaSCanciones = listaAlbumes.get(0).getCanciones();
                    for (String cancion : listaSCanciones) {
                        listaCanciones.add(canBO.consulta(cancion));
                    }
                }
                ;

                //Consultar integrantes
                if (Artista.getIntegrantes() != null) {
                    listaIntegrantes = Artista.getIntegrantes();
                    tdpBiblioteca.setEnabledAt(2, true);
                } else {
                    tdpBiblioteca.setEnabledAt(2, false);
                }
                cargaInicial();

                break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBiblioteca = new javax.swing.JPanel();
        lblNombreUsuario = new javax.swing.JLabel();
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
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblIntegrantes = new javax.swing.JTable();
        txtBuscarIntegrante = new javax.swing.JTextField();
        btnBuscarIntegrante = new javax.swing.JButton();
        pnlCanciones = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCanciones = new javax.swing.JTable();
        txtBuscarCancion = new javax.swing.JTextField();
        btnBuscarCancion = new javax.swing.JButton();
        btnBuscarCancion1 = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        lblImagenUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBiblioteca.setBackground(new java.awt.Color(204, 190, 255));
        pnlBiblioteca.setPreferredSize(new java.awt.Dimension(850, 550));
        pnlBiblioteca.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombreUsuario.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblNombreUsuario.setText("Usuario");
        pnlBiblioteca.add(lblNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        tdpBiblioteca.setBackground(new java.awt.Color(204, 102, 255));
        tdpBiblioteca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        pnlAlbumes.setBackground(new java.awt.Color(255, 255, 255));
        pnlAlbumes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 153, 255), 2));

        tblAlbumes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 153, 255)));
        tblAlbumes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblAlbumes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Imagen", "Nombre", "Género", "Lanzamiento", "Favorito"
            }
        ));
        tblAlbumes.setGridColor(new java.awt.Color(204, 153, 255));
        tblAlbumes.setSelectionBackground(new java.awt.Color(204, 204, 255));
        tblAlbumes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAlbumesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblAlbumes);

        pnlAlbumes.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 750, 220));

        txtBuscarAlbum.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBuscarAlbum.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 153, 255), 2));
        pnlAlbumes.add(txtBuscarAlbum, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 400, 30));

        btnBuscarAlbum.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscarAlbum.setText("Buscar");
        btnBuscarAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAlbumActionPerformed(evt);
            }
        });
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
        btnBuscarIntegrante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarIntegranteActionPerformed(evt);
            }
        });
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

        btnBuscarCancion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscarCancion.setText("Buscar");
        btnBuscarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCancionActionPerformed(evt);
            }
        });
        pnlCanciones.add(btnBuscarCancion, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, -1, 30));

        btnBuscarCancion1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscarCancion1.setText("Buscar");
        pnlCanciones.add(btnBuscarCancion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, -1, 30));

        tdpBiblioteca.addTab("Canción", pnlCanciones);

        pnlBiblioteca.add(tdpBiblioteca, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 850, 420));

        btnVolver.setBackground(new java.awt.Color(153, 153, 153));
        btnVolver.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        pnlBiblioteca.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 20, 80, 30));

        lblImagenUsuario.setText("ImgUsuario");
        pnlBiblioteca.add(lblImagenUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 40, 40));

        getContentPane().add(pnlBiblioteca, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        frmMenu volver = null;
        try {
            volver = new frmMenu(this.sesion);
        } catch (ExceptionBO ex) {
            Logger.getLogger(frmBiblioteca.class.getName()).log(Level.SEVERE, null, ex);
        }
        volver.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnBuscarAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAlbumActionPerformed
        listaAlbumesBuscados = new ArrayList<>();
        if (!txtBuscarAlbum.getText().isEmpty()) {
            ba = true;
            for (AlbumDTO album : listaAlbumes) {
                if (album.getNombre().toLowerCase().contains(txtBuscarAlbum.getText().toLowerCase())
                        || album.getGenero().toLowerCase().contains(txtBuscarAlbum.getText().toLowerCase())) {
                    listaAlbumesBuscados.add(album);

                }
            }
            reiniciarTablasAlbumes();
            cargarBusquedaAlbum();
        } else {
            ba = false;
            reiniciarTablasAlbumes();
            cargarAlbumes();
        }
    }//GEN-LAST:event_btnBuscarAlbumActionPerformed

    private void btnBuscarIntegranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarIntegranteActionPerformed
        listaIntegrantesBuscados = new ArrayList<>();
        if (!txtBuscarIntegrante.getText().isEmpty()) {
            for (IntegranteDTO integrante : listaIntegrantes) {
                if (integrante.getNombre().toLowerCase().contains(txtBuscarIntegrante.getText().toLowerCase())
                        || integrante.getRol().toLowerCase().contains(txtBuscarIntegrante.getText().toLowerCase())) {
                    listaIntegrantesBuscados.add(integrante);

                }
            }
            reiniciarTablasIntegrantes();
            cargarIntegrantesBusqueda();
        } else {
            reiniciarTablasIntegrantes();
            cargarIntegrantes();
        }
    }//GEN-LAST:event_btnBuscarIntegranteActionPerformed

    private void btnBuscarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCancionActionPerformed
        listaCancionesBuscadas = new ArrayList<>();
        if (!txtBuscarCancion.getText().isEmpty()) {
            bc = true;
            for (CancionDTO cancion : listaCanciones) {
                if (cancion.getNombre().toLowerCase().contains(txtBuscarCancion.getText().toLowerCase())
                        || cancion.getGenero().toLowerCase().contains(txtBuscarCancion.getText().toLowerCase())) {
                    listaCancionesBuscadas.add(cancion);
                }
            }
            reiniciarTablasCancion();
            cargarBusquedaCanciones();
        } else {
            bc = false;
            reiniciarTablasCancion();
            cargarCanciones();
        }
    }//GEN-LAST:event_btnBuscarCancionActionPerformed

    private void tblAlbumesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAlbumesMouseClicked
        if (tblAlbumes.getSelectedColumn() != 4) {
            if (ba) {
                this.listaCanciones = new ArrayList<>();
                List<String> listaSCanciones = listaAlbumesBuscados.get(tblAlbumes.getSelectedRow()).getCanciones();
                for (String cancion : listaSCanciones) {
                    try {
                        listaCanciones.add(canBO.consulta(cancion));
                    } catch (ExceptionBO ex) {
                        Logger.getLogger(frmBiblioteca.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                reiniciarTablasCancion();
                cargarCanciones();
                tdpBiblioteca.setSelectedIndex(3);
            } else {
                this.listaCanciones = new ArrayList<>();
                List<String> listaSCanciones = listaAlbumes.get(tblAlbumes.getSelectedRow()).getCanciones();
                for (String cancion : listaSCanciones) {
                    try {
                        listaCanciones.add(canBO.consulta(cancion));
                    } catch (ExceptionBO ex) {
                        Logger.getLogger(frmBiblioteca.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                reiniciarTablasCancion();
                cargarCanciones();
                tdpBiblioteca.setSelectedIndex(3);
            }
        }

    }//GEN-LAST:event_tblAlbumesMouseClicked

    public void formatearTablas() {
        TableColumnModel modeloColumnasCanciones = this.tblCanciones.getColumnModel();
        ActionListener onFavoritoCancionClickListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    boolean a = false;
                    if (bc) {
                        a = usuBO.eliminarFavoritoCancion(sesion, listaCancionesBuscadas.get(tblCanciones.getSelectedRow()).getId());
                        if (a) {
                            usuBO.agregarCancionFavorito(sesion, listaCancionesBuscadas.get(tblCanciones.getSelectedRow()).getId());
                        }
                    } else {
                        a = usuBO.eliminarFavoritoCancion(sesion, listaCanciones.get(tblCanciones.getSelectedRow()).getId());
                        if (a) {
                            usuBO.agregarCancionFavorito(sesion, listaCanciones.get(tblCanciones.getSelectedRow()).getId());
                        }
                    }
                } catch (ExceptionBO ex) {
                    Logger.getLogger(frmMenu.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        modeloColumnasCanciones.getColumn(2).setCellRenderer(new JButtonRenderer("Favorito"));
        modeloColumnasCanciones.getColumn(2).setCellEditor(new JButtonCellEditor("Favorito", onFavoritoCancionClickListener));

        TableColumnModel modeloColumnasAlbums = this.tblAlbumes.getColumnModel();
        ActionListener onFavoritoAlbumClickListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    boolean a = false;
                    if (ba) {
                        a = usuBO.eliminarFavoritoAlbum(sesion, listaAlbumesBuscados.get(tblAlbumes.getSelectedRow()).getId());
                        if (a) {
                            usuBO.agregarAlbumFavorito(sesion, listaAlbumesBuscados.get(tblAlbumes.getSelectedRow()).getId());
                        }
                    } else {
                        a = usuBO.eliminarFavoritoAlbum(sesion, listaAlbumes.get(tblAlbumes.getSelectedRow()).getId());
                        if (a) {
                            usuBO.agregarAlbumFavorito(sesion, listaAlbumes.get(tblAlbumes.getSelectedRow()).getId());
                        }
                    }
                } catch (ExceptionBO ex) {
                    Logger.getLogger(frmMenu.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        modeloColumnasAlbums.getColumn(4).setCellRenderer(new JButtonRenderer("Favorito"));
        modeloColumnasAlbums.getColumn(4).setCellEditor(new JButtonCellEditor("Favorito", onFavoritoAlbumClickListener));

    }

    public void cargaInicial() {
        cargarAlbumes();
        if (listaIntegrantes != null) {
            cargarIntegrantes();
        }
        cargarCanciones();
        if (Artista != null) {
            cargarArtista();
        }

    }

    public void cargarArtista() {
        lblNombre.setText(Artista.getNombre());
        lblGenero.setText(Artista.getGenero());
        ImageIcon icon;
        if (new File(Artista.getImagen()).exists()) {
            icon = new ImageIcon(redimensionarImagen(Artista.getImagen(), lblImagenArtista.getWidth(), lblImagenArtista.getHeight()));
        } else {
            URL imageUrl = getClass().getResource(Artista.getImagen());
            if (imageUrl != null) {
                icon = new ImageIcon(redimensionarImagen(imageUrl, lblImagenArtista.getWidth(), lblImagenArtista.getHeight()));
            } else {
                imageUrl = getClass().getResource(Artista.getImagen());
                icon = new ImageIcon(redimensionarImagen(imageUrl, lblImagenArtista.getWidth(), lblImagenArtista.getHeight()));
            }
        }
        lblImagenArtista.setIcon(icon);
    }

    public void cargarBusquedaAlbum() {
        DefaultTableModel modeloTabla = (DefaultTableModel) tblAlbumes.getModel();
        listaAlbumesBuscados.forEach(row -> {
            Object[] fila = new Object[5];
            fila[0] = row.getPortada();
            fila[1] = row.getNombre();
            fila[2] = row.getGenero();
            fila[3] = row.getFechaLanzamiento();
            fila[4] = "Favoritos";
            modeloTabla.addRow(fila);
        });
        tblAlbumes.getColumnModel().getColumn(0).setCellRenderer(new ImageRenderer());
        tblAlbumes.setRowHeight(50);
        modeloTabla.fireTableDataChanged();
        tblAlbumes.repaint();
    }

    public void cargarAlbumes() {
        DefaultTableModel modeloTabla = (DefaultTableModel) tblAlbumes.getModel();
        listaAlbumes.forEach(row -> {
            Object[] fila = new Object[5];
            fila[0] = row.getPortada();
            fila[1] = row.getNombre();
            fila[2] = row.getGenero();
            fila[3] = row.getFechaLanzamiento();
            fila[4] = "Favoritos";
            modeloTabla.addRow(fila);
        });
        tblAlbumes.getColumnModel().getColumn(0).setCellRenderer(new ImageRenderer());
        tblAlbumes.setRowHeight(50);
        modeloTabla.fireTableDataChanged();
        tblAlbumes.repaint();
    }

    public void cargarBusquedaCanciones() {
        DefaultTableModel modeloTabla = (DefaultTableModel) tblCanciones.getModel();
        listaCancionesBuscadas.forEach(row -> {
            Object[] fila = new Object[3];
            fila[0] = row.getDuracion();
            fila[1] = row.getNombre();
            fila[2] = "Favoritos";
            modeloTabla.addRow(fila);
        });
    }

    public void cargarCanciones() {
        DefaultTableModel modeloTabla = (DefaultTableModel) tblCanciones.getModel();
        listaCanciones.forEach(row -> {
            Object[] fila = new Object[3];
            fila[0] = row.getDuracion();
            fila[1] = row.getNombre();
            fila[2] = "Favoritos";
            modeloTabla.addRow(fila);
        });
    }

    public void cargarIntegrantesBusqueda() {
        DefaultTableModel modeloTabla = (DefaultTableModel) tblIntegrantes.getModel();
        listaIntegrantesBuscados.forEach(row -> {
            Object[] fila = new Object[6];
            fila[0] = row.isEstado();
            fila[1] = row.getNombre();
            fila[2] = row.getRol();
            fila[3] = row.getIngreso();
            fila[4] = row.getSalida();
            fila[5] = row.getImagen();

            modeloTabla.addRow(fila);
        });

        tblIntegrantes.getColumnModel().getColumn(5).setCellRenderer(new ImageRenderer());
        tblIntegrantes.setRowHeight(50);
        modeloTabla.fireTableDataChanged();
        tblIntegrantes.repaint();
    }

    public void cargarIntegrantes() {
        DefaultTableModel modeloTabla = (DefaultTableModel) tblIntegrantes.getModel();
        listaIntegrantes.forEach(row -> {
            Object[] fila = new Object[6];
            fila[0] = row.isEstado();
            fila[1] = row.getNombre();
            fila[2] = row.getRol();
            fila[3] = row.getIngreso();
            fila[4] = row.getSalida();
            fila[5] = row.getImagen();
            System.out.println("IMAGEN" + row.getImagen());
            modeloTabla.addRow(fila);
        });

        tblIntegrantes.getColumnModel().getColumn(5).setCellRenderer(new ImageRenderer());
        tblIntegrantes.setRowHeight(50);
        modeloTabla.fireTableDataChanged();
        tblIntegrantes.repaint();
    }

    private void reiniciarTablasCancion() {
        DefaultTableModel modeloTablaCan = (DefaultTableModel) this.tblCanciones.getModel();
        modeloTablaCan.setRowCount(0);
    }

    private void reiniciarTablasAlbumes() {
        DefaultTableModel modeloTablaAlb = (DefaultTableModel) this.tblAlbumes.getModel();
        modeloTablaAlb.setRowCount(0);
    }

    private void reiniciarTablasIntegrantes() {
        DefaultTableModel modeloTablaArt = (DefaultTableModel) this.tblIntegrantes.getModel();
        modeloTablaArt.setRowCount(0);
    }

    private void inicializarUsuario() {
        try {
            UsuarioDTO usuario = usuBO.buscar(sesion);  // Obtén los datos del usuario
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
    private javax.swing.JButton btnBuscarAlbum;
    private javax.swing.JButton btnBuscarCancion;
    private javax.swing.JButton btnBuscarCancion1;
    private javax.swing.JButton btnBuscarIntegrante;
    private javax.swing.JButton btnVolver;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblGeneroArtista;
    private javax.swing.JLabel lblImagenArtista;
    private javax.swing.JLabel lblImagenUsuario;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreArtsiata;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JPanel pnlAlbumes;
    private javax.swing.JPanel pnlArtistas;
    private javax.swing.JPanel pnlBiblioteca;
    private javax.swing.JPanel pnlCanciones;
    private javax.swing.JTable tblAlbumes;
    private javax.swing.JTable tblCanciones;
    private javax.swing.JTable tblIntegrantes;
    private javax.swing.JTabbedPane tdpBiblioteca;
    private javax.swing.JTextField txtBuscarAlbum;
    private javax.swing.JTextField txtBuscarCancion;
    private javax.swing.JTextField txtBuscarIntegrante;
    // End of variables declaration//GEN-END:variables
}
