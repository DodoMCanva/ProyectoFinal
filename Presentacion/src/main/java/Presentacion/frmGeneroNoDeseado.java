package Presentacion;

import BO.UsuarioBO;
import Exceptions.ExceptionBO;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author equipo 2
 */
public class frmGeneroNoDeseado extends javax.swing.JFrame {

    private String sesion;
    private List<String> lista = new ArrayList<>();
    private UsuarioBO usuBO = new UsuarioBO();

    /**
     * Creates new form frmGeneroNoDeseado
     */
    public frmGeneroNoDeseado(String sesion) {
        initComponents();
        this.sesion = sesion;
        try {
            this.lista = usuBO.consultaRestringidos(sesion);
        } catch (ExceptionBO e) {
        }
        for (String genero : lista) {
            switch (genero) {
                case "Pop":
                    
                    break;
                case "Soul":
                    
                    break;
                case "Funk":
                    
                    break;
                case "Electropop":
                    
                    break;
                case "R&B":
                    
                    break;
                case "Rap":
                    
                    break;
                case "Indie":
                    
                    break;
                case "Flamenco":
                    
                    break;
                case "Regional":
                    
                    break;
                case "Romantica":
                    
                    break;
                case "Rock":
                    
                    break;
                case "Grunge":
                    
                    break;
                case "Metal":
                    
                    break;
                case "Hard Rock":
                    
                    break;
                case "K-pop":
                    
                    break;
                case "Electronica":
                    
                    break;
                case "Banda":
                    
                    break;
                case "Balada":
                    
                    break;
            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlGenNoDes = new javax.swing.JPanel();
        lblTituloGenNoDeseados = new javax.swing.JLabel();
        btnBanda = new javax.swing.JButton();
        btnPop = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        lblTituloLogo = new javax.swing.JLabel();
        lblLogoTitulo = new javax.swing.JLabel();
        btnFunk = new javax.swing.JButton();
        btnRYB = new javax.swing.JButton();
        btnRap = new javax.swing.JButton();
        btnIndie = new javax.swing.JButton();
        btnFlamenco = new javax.swing.JButton();
        btnElectropop = new javax.swing.JButton();
        btnSoul = new javax.swing.JButton();
        btnRegional = new javax.swing.JButton();
        btnRomantica = new javax.swing.JButton();
        btnRock = new javax.swing.JButton();
        btnGrunge = new javax.swing.JButton();
        btnMetal = new javax.swing.JButton();
        btnHardRock = new javax.swing.JButton();
        btnKPOP = new javax.swing.JButton();
        btnMusicaClasica = new javax.swing.JButton();
        btnElectronica = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Géneros no deseados");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlGenNoDes.setBackground(new java.awt.Color(204, 190, 255));
        pnlGenNoDes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloGenNoDeseados.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblTituloGenNoDeseados.setText(" Género no deseado");
        pnlGenNoDes.add(lblTituloGenNoDeseados, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 190, -1));

        btnBanda.setText("Banda");
        btnBanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBandaActionPerformed(evt);
            }
        });
        pnlGenNoDes.add(btnBanda, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 90, 20));

        btnPop.setText("Pop");
        btnPop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPopActionPerformed(evt);
            }
        });
        pnlGenNoDes.add(btnPop, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 90, 20));

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        pnlGenNoDes.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 90, 30));

        lblTituloLogo.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        lblTituloLogo.setText("Music plux");
        pnlGenNoDes.add(lblTituloLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        lblLogoTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imegenes/Untitled (3).png"))); // NOI18N
        lblLogoTitulo.setText("jLabel9");
        pnlGenNoDes.add(lblLogoTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 80));

        btnFunk.setText("Funk");
        btnFunk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFunkActionPerformed(evt);
            }
        });
        pnlGenNoDes.add(btnFunk, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 90, 20));

        btnRYB.setText("R&B");
        btnRYB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRYBActionPerformed(evt);
            }
        });
        pnlGenNoDes.add(btnRYB, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 90, 20));

        btnRap.setText("Rap");
        btnRap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRapActionPerformed(evt);
            }
        });
        pnlGenNoDes.add(btnRap, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 90, 20));

        btnIndie.setText("Indie");
        btnIndie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIndieActionPerformed(evt);
            }
        });
        pnlGenNoDes.add(btnIndie, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 90, 20));

        btnFlamenco.setText("Flamenco");
        btnFlamenco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFlamencoActionPerformed(evt);
            }
        });
        pnlGenNoDes.add(btnFlamenco, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 90, 20));

        btnElectropop.setText("Electropop");
        btnElectropop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElectropopActionPerformed(evt);
            }
        });
        pnlGenNoDes.add(btnElectropop, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 90, 20));

        btnSoul.setText("Soul");
        btnSoul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSoulActionPerformed(evt);
            }
        });
        pnlGenNoDes.add(btnSoul, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 90, 20));

        btnRegional.setText("Regional");
        btnRegional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegionalActionPerformed(evt);
            }
        });
        pnlGenNoDes.add(btnRegional, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 90, 20));

        btnRomantica.setText("Romantica");
        btnRomantica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRomanticaActionPerformed(evt);
            }
        });
        pnlGenNoDes.add(btnRomantica, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 90, 20));

        btnRock.setText("Rock");
        btnRock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRockActionPerformed(evt);
            }
        });
        pnlGenNoDes.add(btnRock, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 90, 20));

        btnGrunge.setText("Grunge");
        btnGrunge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrungeActionPerformed(evt);
            }
        });
        pnlGenNoDes.add(btnGrunge, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 90, 20));

        btnMetal.setText("Metal");
        btnMetal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMetalActionPerformed(evt);
            }
        });
        pnlGenNoDes.add(btnMetal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 90, 20));

        btnHardRock.setText("Hard Rock");
        btnHardRock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHardRockActionPerformed(evt);
            }
        });
        pnlGenNoDes.add(btnHardRock, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 90, 20));

        btnKPOP.setText("K-pop");
        btnKPOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKPOPActionPerformed(evt);
            }
        });
        pnlGenNoDes.add(btnKPOP, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 90, 20));

        btnMusicaClasica.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        btnMusicaClasica.setText("Musica Clasica");
        btnMusicaClasica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMusicaClasicaActionPerformed(evt);
            }
        });
        pnlGenNoDes.add(btnMusicaClasica, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 90, 20));

        btnElectronica.setText("Electronica");
        btnElectronica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElectronicaActionPerformed(evt);
            }
        });
        pnlGenNoDes.add(btnElectronica, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 90, 20));

        getContentPane().add(pnlGenNoDes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        frmMenu menu = null;
        try {
            menu = new frmMenu(this.sesion);
        } catch (ExceptionBO ex) {
            Logger.getLogger(frmGeneroNoDeseado.class.getName()).log(Level.SEVERE, null, ex);
        }
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnPopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPopActionPerformed
        frmSobrePuestoGeneroELimi el = new frmSobrePuestoGeneroELimi(this, rootPaneCheckingEnabled, this.sesion);
        el.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPopActionPerformed

    private void btnBandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBandaActionPerformed
        frmSobrePuestoGeneroELimi el = new frmSobrePuestoGeneroELimi(this, rootPaneCheckingEnabled, this.sesion);
        el.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnBandaActionPerformed

    private void btnFunkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFunkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFunkActionPerformed

    private void btnRYBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRYBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRYBActionPerformed

    private void btnRapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRapActionPerformed

    private void btnIndieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIndieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIndieActionPerformed

    private void btnFlamencoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFlamencoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFlamencoActionPerformed

    private void btnElectropopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElectropopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnElectropopActionPerformed

    private void btnSoulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSoulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSoulActionPerformed

    private void btnRegionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegionalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegionalActionPerformed

    private void btnRomanticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRomanticaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRomanticaActionPerformed

    private void btnRockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRockActionPerformed

    private void btnGrungeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrungeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGrungeActionPerformed

    private void btnMetalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMetalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMetalActionPerformed

    private void btnHardRockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHardRockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHardRockActionPerformed

    private void btnKPOPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKPOPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnKPOPActionPerformed

    private void btnMusicaClasicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMusicaClasicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMusicaClasicaActionPerformed

    private void btnElectronicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElectronicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnElectronicaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBanda;
    private javax.swing.JButton btnElectronica;
    private javax.swing.JButton btnElectropop;
    private javax.swing.JButton btnFlamenco;
    private javax.swing.JButton btnFunk;
    private javax.swing.JButton btnGrunge;
    private javax.swing.JButton btnHardRock;
    private javax.swing.JButton btnIndie;
    private javax.swing.JButton btnKPOP;
    private javax.swing.JButton btnMetal;
    private javax.swing.JButton btnMusicaClasica;
    private javax.swing.JButton btnPop;
    private javax.swing.JButton btnRYB;
    private javax.swing.JButton btnRap;
    private javax.swing.JButton btnRegional;
    private javax.swing.JButton btnRock;
    private javax.swing.JButton btnRomantica;
    private javax.swing.JButton btnSoul;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel lblLogoTitulo;
    private javax.swing.JLabel lblTituloGenNoDeseados;
    private javax.swing.JLabel lblTituloLogo;
    private javax.swing.JPanel pnlGenNoDes;
    // End of variables declaration//GEN-END:variables
}
