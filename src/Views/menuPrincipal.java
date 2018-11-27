/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;
import Cliente.menuCadCliente;
import javax.swing.JFrame;
/**
 *
 * @author Wellington
 */
public class menuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form menuPrincipal
     */
    public menuPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        pnlCli = new javax.swing.JPanel();
        headerCli = new javax.swing.JLabel();
        btnListaCli = new javax.swing.JButton();
        btnCadCli = new javax.swing.JButton();
        pnlCaixa = new javax.swing.JPanel();
        headerCaixa = new javax.swing.JLabel();
        btnAbreCaixa = new javax.swing.JButton();
        btnFechaCaixa = new javax.swing.JButton();
        pnlVendas = new javax.swing.JPanel();
        headerVendas = new javax.swing.JLabel();
        btnVenda = new javax.swing.JButton();
        btnRelatVenda = new javax.swing.JButton();
        pnlMed = new javax.swing.JPanel();
        headerMed = new javax.swing.JLabel();
        btnCadMed = new javax.swing.JButton();
        btnListaMed = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");
        setBackground(new java.awt.Color(29, 131, 72));
        setName("frame_Principal"); // NOI18N
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlPrincipal.setBackground(new java.awt.Color(29, 131, 72));
        pnlPrincipal.setPreferredSize(new java.awt.Dimension(850, 650));

        pnlCli.setBackground(new java.awt.Color(29, 131, 72));
        pnlCli.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(171, 235, 198), 2));

        headerCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/clientesHeader.fw.png"))); // NOI18N

        btnListaCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ListaCli.fw.png"))); // NOI18N
        btnListaCli.setToolTipText("");
        btnListaCli.setContentAreaFilled(false);
        btnListaCli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnCadCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cadCli.fw.png"))); // NOI18N
        btnCadCli.setToolTipText("");
        btnCadCli.setContentAreaFilled(false);
        btnCadCli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadCliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCliLayout = new javax.swing.GroupLayout(pnlCli);
        pnlCli.setLayout(pnlCliLayout);
        pnlCliLayout.setHorizontalGroup(
            pnlCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCliLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCadCli, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnListaCli, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(pnlCliLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(headerCli)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCliLayout.setVerticalGroup(
            pnlCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCliLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerCli)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnListaCli, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCadCli, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        pnlCaixa.setBackground(new java.awt.Color(29, 131, 72));
        pnlCaixa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(171, 235, 198), 2));
        pnlCaixa.setPreferredSize(new java.awt.Dimension(301, 184));

        headerCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/caixaHeader.fw.png"))); // NOI18N

        btnAbreCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/abrirCaixa.fw.png"))); // NOI18N
        btnAbreCaixa.setContentAreaFilled(false);
        btnAbreCaixa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnFechaCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fecharCaixa.fw.png"))); // NOI18N
        btnFechaCaixa.setContentAreaFilled(false);
        btnFechaCaixa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlCaixaLayout = new javax.swing.GroupLayout(pnlCaixa);
        pnlCaixa.setLayout(pnlCaixaLayout);
        pnlCaixaLayout.setHorizontalGroup(
            pnlCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCaixaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAbreCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(btnFechaCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCaixaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(headerCaixa)
                .addGap(81, 81, 81))
        );
        pnlCaixaLayout.setVerticalGroup(
            pnlCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCaixaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerCaixa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(pnlCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFechaCaixa)
                    .addComponent(btnAbreCaixa))
                .addContainerGap())
        );

        pnlVendas.setBackground(new java.awt.Color(29, 131, 72));
        pnlVendas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(171, 235, 198), 2));
        pnlVendas.setPreferredSize(new java.awt.Dimension(301, 184));

        headerVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/vendasHeader.fw.png"))); // NOI18N

        btnVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/efetuaVenda.fw.png"))); // NOI18N
        btnVenda.setContentAreaFilled(false);
        btnVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnRelatVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/relatorioVenda.fw.png"))); // NOI18N
        btnRelatVenda.setContentAreaFilled(false);
        btnRelatVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlVendasLayout = new javax.swing.GroupLayout(pnlVendas);
        pnlVendas.setLayout(pnlVendasLayout);
        pnlVendasLayout.setHorizontalGroup(
            pnlVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVendasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(headerVendas)
                .addGap(74, 74, 74))
            .addGroup(pnlVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(btnRelatVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlVendasLayout.setVerticalGroup(
            pnlVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerVendas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(pnlVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVenda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRelatVenda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlMed.setBackground(new java.awt.Color(29, 131, 72));
        pnlMed.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(171, 235, 198), 2));
        pnlMed.setPreferredSize(new java.awt.Dimension(301, 184));

        headerMed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/medicamentosHeader.fw.png"))); // NOI18N

        btnCadMed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cadMed.fw.png"))); // NOI18N
        btnCadMed.setContentAreaFilled(false);
        btnCadMed.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnListaMed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/listaMed.fw.png"))); // NOI18N
        btnListaMed.setContentAreaFilled(false);
        btnListaMed.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlMedLayout = new javax.swing.GroupLayout(pnlMed);
        pnlMed.setLayout(pnlMedLayout);
        pnlMedLayout.setHorizontalGroup(
            pnlMedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMedLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCadMed, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(btnListaMed, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMedLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(headerMed)
                .addGap(71, 71, 71))
        );
        pnlMedLayout.setVerticalGroup(
            pnlMedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMedLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerMed)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(pnlMedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCadMed, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnListaMed, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logo2_teste.fw.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Concert One", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("<HTML>\nROSEN<BR>\nFARMA\n</HTML>");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlCaixa, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                            .addComponent(pnlCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(71, 71, 71)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlMed, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(361, 361, 361)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                                .addComponent(logo)
                                .addGap(18, 18, 18)))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlMed, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(pnlVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(pnlCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        getContentPane().add(pnlPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 793, 634));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadCliActionPerformed
        // TODO add your handling code here:
        menuCadCliente cadCli = new menuCadCliente();
        this.setExtendedState(JFrame.ICONIFIED);
        cadCli.setVisible(true);     
    }//GEN-LAST:event_btnCadCliActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbreCaixa;
    private javax.swing.JButton btnCadCli;
    private javax.swing.JButton btnCadMed;
    private javax.swing.JButton btnFechaCaixa;
    private javax.swing.JButton btnListaCli;
    private javax.swing.JButton btnListaMed;
    private javax.swing.JButton btnRelatVenda;
    private javax.swing.JButton btnVenda;
    private javax.swing.JLabel headerCaixa;
    private javax.swing.JLabel headerCli;
    private javax.swing.JLabel headerMed;
    private javax.swing.JLabel headerVendas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel pnlCaixa;
    private javax.swing.JPanel pnlCli;
    private javax.swing.JPanel pnlMed;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlVendas;
    // End of variables declaration//GEN-END:variables
}