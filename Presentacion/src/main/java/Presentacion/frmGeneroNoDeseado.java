package Presentacion;

/**
 *
 * @author equipo 2
 */
public class frmGeneroNoDeseado extends javax.swing.JFrame {

    private String sesion;

    /**
     * Creates new form frmGeneroNoDeseado
     */
    public frmGeneroNoDeseado(String sesion) {
        initComponents();
        this.sesion = sesion;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlGenNoDes = new javax.swing.JPanel();
        lblTituloGenNoDeseados = new javax.swing.JLabel();
        btnBanda = new javax.swing.JButton();
        btnReggaeton = new javax.swing.JButton();
        btnRock = new javax.swing.JButton();
        btnCountry = new javax.swing.JButton();
        btnPop = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        lblTituloLogo = new javax.swing.JLabel();
        lblLogoTitulo = new javax.swing.JLabel();
        btnNorteno = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Géneros no deseados");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlGenNoDes.setBackground(new java.awt.Color(204, 190, 255));
        pnlGenNoDes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloGenNoDeseados.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblTituloGenNoDeseados.setText(" Género no deseado");
        pnlGenNoDes.add(lblTituloGenNoDeseados, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 190, -1));

        btnBanda.setBackground(new java.awt.Color(224, 224, 224));
        btnBanda.setText("Banda");
        btnBanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBandaActionPerformed(evt);
            }
        });
        pnlGenNoDes.add(btnBanda, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 150, 30));

        btnReggaeton.setBackground(new java.awt.Color(224, 224, 224));
        btnReggaeton.setText("Reggaetón");
        btnReggaeton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReggaetonActionPerformed(evt);
            }
        });
        pnlGenNoDes.add(btnReggaeton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 150, 30));

        btnRock.setBackground(new java.awt.Color(224, 224, 224));
        btnRock.setText("Rock and Roll");
        btnRock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRockActionPerformed(evt);
            }
        });
        pnlGenNoDes.add(btnRock, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 150, 30));

        btnCountry.setBackground(new java.awt.Color(224, 224, 224));
        btnCountry.setText("Country");
        btnCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCountryActionPerformed(evt);
            }
        });
        pnlGenNoDes.add(btnCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 150, 30));

        btnPop.setBackground(new java.awt.Color(224, 224, 224));
        btnPop.setText("POP");
        btnPop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPopActionPerformed(evt);
            }
        });
        pnlGenNoDes.add(btnPop, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 150, 30));

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        pnlGenNoDes.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 90, 30));

        lblTituloLogo.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        lblTituloLogo.setText("Music plux");
        pnlGenNoDes.add(lblTituloLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));

        lblLogoTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imegenes/Untitled (3).png"))); // NOI18N
        lblLogoTitulo.setText("jLabel9");
        pnlGenNoDes.add(lblLogoTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 210, 80));

        btnNorteno.setBackground(new java.awt.Color(224, 224, 224));
        btnNorteno.setText("Norteño");
        btnNorteno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNortenoActionPerformed(evt);
            }
        });
        pnlGenNoDes.add(btnNorteno, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 150, 30));

        getContentPane().add(pnlGenNoDes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        frmMenu menu = new frmMenu(this.sesion);
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

    private void btnReggaetonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReggaetonActionPerformed
        frmSobrePuestoGeneroELimi el = new frmSobrePuestoGeneroELimi(this, rootPaneCheckingEnabled, this.sesion);
        el.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnReggaetonActionPerformed

    private void btnRockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRockActionPerformed
        frmSobrePuestoGeneroELimi el = new frmSobrePuestoGeneroELimi(this, rootPaneCheckingEnabled, this.sesion);
        el.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRockActionPerformed

    private void btnCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCountryActionPerformed
        frmSobrePuestoGeneroELimi el = new frmSobrePuestoGeneroELimi(this, rootPaneCheckingEnabled, this.sesion);
        el.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCountryActionPerformed

    private void btnNortenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNortenoActionPerformed
        frmSobrePuestoGeneroELimi el = new frmSobrePuestoGeneroELimi(this, rootPaneCheckingEnabled, this.sesion);
        el.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnNortenoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBanda;
    private javax.swing.JButton btnCountry;
    private javax.swing.JButton btnNorteno;
    private javax.swing.JButton btnPop;
    private javax.swing.JButton btnReggaeton;
    private javax.swing.JButton btnRock;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel lblLogoTitulo;
    private javax.swing.JLabel lblTituloGenNoDeseados;
    private javax.swing.JLabel lblTituloLogo;
    private javax.swing.JPanel pnlGenNoDes;
    // End of variables declaration//GEN-END:variables
}
