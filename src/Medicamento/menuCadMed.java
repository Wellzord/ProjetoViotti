/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Medicamento;

/**
 *
 * @author Wellington
 */
public class menuCadMed extends javax.swing.JFrame {

    /**
     * Creates new form menuCadMed
     */
    public menuCadMed() {
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

        jPanel1 = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        txtIdMed = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblValidade = new javax.swing.JLabel();
        lblFabricacao = new javax.swing.JLabel();
        lblPreco = new javax.swing.JLabel();
        txtValidade = new javax.swing.JFormattedTextField();
        txtFabricacao = new javax.swing.JFormattedTextField();
        txtPreco = new javax.swing.JFormattedTextField();
        cmbTarja = new javax.swing.JComboBox<>();
        lblTarja = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Medicamentos");
        setPreferredSize(new java.awt.Dimension(550, 399));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(29, 131, 72));
        jPanel1.setPreferredSize(new java.awt.Dimension(550, 399));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCodigo.setFont(new java.awt.Font("Open Sans", 1, 16)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(240, 240, 240));
        lblCodigo.setText("CÓDIGO:");
        jPanel1.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 113, -1, -1));

        txtIdMed.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jPanel1.add(txtIdMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 113, 65, -1));

        lblNome.setFont(new java.awt.Font("Open Sans", 1, 16)); // NOI18N
        lblNome.setForeground(new java.awt.Color(240, 240, 240));
        lblNome.setText("NOME:");
        jPanel1.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 157, -1, -1));

        txtNome.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 157, 399, -1));

        lblValidade.setFont(new java.awt.Font("Open Sans", 1, 16)); // NOI18N
        lblValidade.setForeground(new java.awt.Color(240, 240, 240));
        lblValidade.setText("VALIDADE:");
        jPanel1.add(lblValidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 201, -1, -1));

        lblFabricacao.setFont(new java.awt.Font("Open Sans", 1, 16)); // NOI18N
        lblFabricacao.setForeground(new java.awt.Color(240, 240, 240));
        lblFabricacao.setText("FABRICAÇÃO:");
        jPanel1.add(lblFabricacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 201, -1, -1));

        lblPreco.setFont(new java.awt.Font("Open Sans", 1, 16)); // NOI18N
        lblPreco.setForeground(new java.awt.Color(240, 240, 240));
        lblPreco.setText("PREÇO:");
        jPanel1.add(lblPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        try {
            txtValidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtValidade.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jPanel1.add(txtValidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 201, 133, -1));

        try {
            txtFabricacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFabricacao.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jPanel1.add(txtFabricacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 201, 147, -1));

        txtPreco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtPreco.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jPanel1.add(txtPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 150, -1));

        cmbTarja.setBackground(new java.awt.Color(29, 131, 72));
        cmbTarja.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        cmbTarja.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sem Tarja", "Amarela", "Vermelha", "Preta" }));
        jPanel1.add(cmbTarja, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 113, 140, -1));

        lblTarja.setFont(new java.awt.Font("Open Sans", 1, 16)); // NOI18N
        lblTarja.setForeground(new java.awt.Color(240, 240, 240));
        lblTarja.setText("TARJA:");
        jPanel1.add(lblTarja, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 113, -1, -1));

        lblTitulo.setFont(new java.awt.Font("Concert One", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(240, 240, 240));
        lblTitulo.setText("<HTML><CENTER>CADASTRO DE MEDICAMENTOS</CENTER></HTML>");
        lblTitulo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 530, 49));

        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cadastrar.fw.png"))); // NOI18N
        btnCadastrar.setContentAreaFilled(false);
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 146, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(menuCadMed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuCadMed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuCadMed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuCadMed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuCadMed().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JComboBox<String> cmbTarja;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblFabricacao;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblTarja;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblValidade;
    private javax.swing.JFormattedTextField txtFabricacao;
    private javax.swing.JTextField txtIdMed;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtPreco;
    private javax.swing.JFormattedTextField txtValidade;
    // End of variables declaration//GEN-END:variables
}