/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package View;

import java.awt.Color;
import static javafx.scene.paint.Color.color;
import javax.swing.UIManager;

/**
 *
 * @author gusta
 */
public class InternalSimulacao extends javax.swing.JInternalFrame {

    private static InternalSimulacao instance;

    public static InternalSimulacao getInstance() {
        if (instance == null) {
            instance = new InternalSimulacao();
        }
        return instance;
    }

    /**
     * Creates new form InternalSimulacao
     */
    public InternalSimulacao() {
        initComponents();
        UIManager.put("Button.arc", 999);
        UIManager.put("Button.background", Color.decode("#7cbc9a"));
        this.btnCancelar.setBackground(Color.decode("#fa3419"));
        this.btnCancelar.setForeground(Color.decode("#f3e1b6"));
        UIManager.put("TextField.arc", 999);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txtRendaMPess = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNascPess = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNomePess = new javax.swing.JTextField();
        cbxConj = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        txtRendaMConj = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtNascConj = new javax.swing.JTextField();
        txtCpfConj = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtNomeConj = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        txtValorTotal = new javax.swing.JTextField();
        txtParcelas = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtPagMensal = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        txtValorFinanc = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtValorEntrada = new javax.swing.JTextField();
        txtValorImovel = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        brnEditar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setClosable(true);
        setIconifiable(true);
        setTitle("..:Simulação:..");
        setToolTipText("");
        getContentPane().setLayout(null);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 94, 105)), "Dados Pessoais", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nirmala UI Semilight", 1, 30), new java.awt.Color(124, 188, 154))); // NOI18N
        jPanel5.setLayout(null);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(35, 153, 142)), "Pessoa", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nirmala UI Semilight", 1, 20), new java.awt.Color(243, 225, 182))); // NOI18N
        jPanel4.setLayout(null);

        txtRendaMPess.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        txtRendaMPess.setEnabled(false);
        jPanel4.add(txtRendaMPess);
        txtRendaMPess.setBounds(190, 210, 250, 35);

        jLabel7.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Renda Mensal");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(20, 213, 160, 30);

        jLabel8.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Nascimento");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(20, 163, 160, 30);

        txtNascPess.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        txtNascPess.setEnabled(false);
        jPanel4.add(txtNascPess);
        txtNascPess.setBounds(190, 160, 250, 35);

        txtCpf.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        txtCpf.setEnabled(false);
        jPanel4.add(txtCpf);
        txtCpf.setBounds(190, 110, 250, 35);

        jLabel9.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("CPF");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(20, 113, 160, 30);

        jLabel10.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Nome");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(jLabel10);
        jLabel10.setBounds(20, 63, 160, 30);

        txtNomePess.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        txtNomePess.setEnabled(false);
        jPanel4.add(txtNomePess);
        txtNomePess.setBounds(190, 60, 250, 35);

        cbxConj.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        cbxConj.setText("Possui Conjuge   ");
        cbxConj.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbxConj.setEnabled(false);
        cbxConj.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cbxConj.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        cbxConj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxConjActionPerformed(evt);
            }
        });
        jPanel4.add(cbxConj);
        cbxConj.setBounds(16, 250, 190, 30);

        jPanel5.add(jPanel4);
        jPanel4.setBounds(60, 50, 450, 325);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(35, 153, 142), 1, true), "Conjugue", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nirmala UI Semilight", 1, 18), new java.awt.Color(243, 225, 182))); // NOI18N
        jPanel6.setLayout(null);

        txtRendaMConj.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        txtRendaMConj.setEnabled(false);
        jPanel6.add(txtRendaMConj);
        txtRendaMConj.setBounds(180, 210, 250, 35);

        jLabel11.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Renda Mensal");
        jPanel6.add(jLabel11);
        jLabel11.setBounds(10, 213, 160, 30);

        jLabel22.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Nascimento");
        jPanel6.add(jLabel22);
        jLabel22.setBounds(10, 163, 160, 30);

        txtNascConj.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        txtNascConj.setEnabled(false);
        jPanel6.add(txtNascConj);
        txtNascConj.setBounds(180, 160, 250, 35);

        txtCpfConj.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        txtCpfConj.setEnabled(false);
        jPanel6.add(txtCpfConj);
        txtCpfConj.setBounds(180, 110, 250, 35);

        jLabel23.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("CPF");
        jPanel6.add(jLabel23);
        jLabel23.setBounds(10, 110, 160, 30);

        jLabel24.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("Nome");
        jPanel6.add(jLabel24);
        jLabel24.setBounds(10, 63, 160, 30);

        txtNomeConj.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        txtNomeConj.setEnabled(false);
        jPanel6.add(txtNomeConj);
        txtNomeConj.setBounds(180, 60, 250, 35);

        jPanel5.add(jPanel6);
        jPanel6.setBounds(654, 50, 450, 325);

        jSeparator1.setForeground(new java.awt.Color(35, 153, 142));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel5.add(jSeparator1);
        jSeparator1.setBounds(583, 55, 20, 325);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(80, 30, 1160, 400);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Pessoais", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 30))); // NOI18N
        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(12, 13, 961, 0);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 94, 105)), "Dados Pessoais", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nirmala UI Semilight", 1, 30), new java.awt.Color(124, 188, 154))); // NOI18N
        jPanel2.setLayout(null);

        jSeparator3.setForeground(new java.awt.Color(35, 153, 142));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator3);
        jSeparator3.setBounds(580, 65, 12, 320);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(35, 153, 142)), "Pessoa", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nirmala UI Semilight", 1, 20), new java.awt.Color(243, 225, 182))); // NOI18N
        jPanel3.setLayout(null);

        txtValorTotal.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jPanel3.add(txtValorTotal);
        txtValorTotal.setBounds(180, 90, 250, 35);

        txtParcelas.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jPanel3.add(txtParcelas);
        txtParcelas.setBounds(180, 150, 250, 35);

        jLabel19.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Pagamento mensal");
        jPanel3.add(jLabel19);
        jLabel19.setBounds(15, 220, 160, 30);

        txtPagMensal.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        txtPagMensal.setEnabled(false);
        jPanel3.add(txtPagMensal);
        txtPagMensal.setBounds(180, 215, 250, 35);

        jLabel17.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Valor Total");
        jPanel3.add(jLabel17);
        jLabel17.setBounds(15, 95, 160, 30);

        jLabel18.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Parcelas");
        jPanel3.add(jLabel18);
        jLabel18.setBounds(15, 155, 160, 30);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(640, 60, 450, 325);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(35, 153, 142)), "Pessoa", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nirmala UI Semilight", 1, 20), new java.awt.Color(243, 225, 182))); // NOI18N
        jPanel7.setLayout(null);

        txtValorFinanc.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        txtValorFinanc.setEnabled(false);
        jPanel7.add(txtValorFinanc);
        txtValorFinanc.setBounds(180, 220, 250, 35);

        jLabel15.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Valor Financiado");
        jPanel7.add(jLabel15);
        jLabel15.setBounds(10, 225, 160, 30);

        jLabel14.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Valor da Entrada");
        jPanel7.add(jLabel14);
        jLabel14.setBounds(10, 165, 160, 30);

        txtValorEntrada.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jPanel7.add(txtValorEntrada);
        txtValorEntrada.setBounds(180, 160, 250, 35);

        txtValorImovel.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jPanel7.add(txtValorImovel);
        txtValorImovel.setBounds(180, 100, 250, 35);

        jLabel13.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Valor Imóvel");
        jPanel7.add(jLabel13);
        jLabel13.setBounds(10, 105, 160, 30);

        jPanel2.add(jPanel7);
        jPanel7.setBounds(70, 60, 450, 325);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(80, 440, 1160, 400);

        brnEditar.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 24)); // NOI18N
        brnEditar.setForeground(new java.awt.Color(51, 51, 51));
        brnEditar.setText("Editar");
        getContentPane().add(brnEditar);
        brnEditar.setBounds(580, 860, 175, 70);

        btnPesquisar.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 24)); // NOI18N
        btnPesquisar.setForeground(new java.awt.Color(51, 51, 51));
        btnPesquisar.setText("Pesquisar");
        getContentPane().add(btnPesquisar);
        btnPesquisar.setBounds(80, 860, 175, 70);

        btnImprimir.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 24)); // NOI18N
        btnImprimir.setForeground(new java.awt.Color(51, 51, 51));
        btnImprimir.setText("Imprimir");
        getContentPane().add(btnImprimir);
        btnImprimir.setBounds(820, 860, 175, 70);

        btnCancelar.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 24)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(51, 51, 51));
        btnCancelar.setText("Cancelar");
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(1065, 860, 175, 70);

        btnNovo.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 24)); // NOI18N
        btnNovo.setForeground(new java.awt.Color(51, 51, 51));
        btnNovo.setText("Novo");
        getContentPane().add(btnNovo);
        btnNovo.setBounds(330, 860, 175, 70);

        setBounds(0, 0, 1409, 984);
    }// </editor-fold>//GEN-END:initComponents

    private void cbxConjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxConjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxConjActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnEditar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JCheckBox cbxConj;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtCpfConj;
    private javax.swing.JTextField txtNascConj;
    private javax.swing.JTextField txtNascPess;
    private javax.swing.JTextField txtNomeConj;
    private javax.swing.JTextField txtNomePess;
    private javax.swing.JTextField txtPagMensal;
    private javax.swing.JTextField txtParcelas;
    private javax.swing.JTextField txtRendaMConj;
    private javax.swing.JTextField txtRendaMPess;
    private javax.swing.JTextField txtValorEntrada;
    private javax.swing.JTextField txtValorFinanc;
    private javax.swing.JTextField txtValorImovel;
    private javax.swing.JTextField txtValorTotal;
    // End of variables declaration//GEN-END:variables
}
