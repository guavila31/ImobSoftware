/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package View;

import com.formdev.flatlaf.ui.FlatTextBorder;
import java.awt.Color;
import javax.swing.UIManager;

/**
 *
 * @author gusta
 */
public class InternalRelatorio extends javax.swing.JInternalFrame {

    /**
     * Creates new form InternalRelatorio
     */
    private static InternalRelatorio instance;

    public static InternalRelatorio getInstance() {
        if (instance == null) {
            instance = new InternalRelatorio();
        }
        return instance;
    }

    public InternalRelatorio() {
        initComponents();
//        this.getContentPane().setBackground(Color.decode("#1d5e69"));
        UIManager.put("TextField.background", Color.decode("#263238"));

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
        jPanel3 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("..:Relatório:..");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/informacao-financeira.png"))); // NOI18N
        setMaximumSize(new java.awt.Dimension(1440, 884));
        setMinimumSize(new java.awt.Dimension(1440, 884));
        setPreferredSize(new java.awt.Dimension(1500, 900));
        setRequestFocusEnabled(false);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(null);
        jPanel1.add(jPanel3);
        jPanel3.setBounds(140, 390, 300, 300);

        jComboBox1.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "JANEIRO", "FEVEREIRO", "MARCO", "ABRIL", "MAIO", "JUNHO", "JULHO", "AGOSTO", "SETEMBRO", "OUTUBRO", "NOVEMBRO", "DEZEMBRO" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(30, 130, 160, 50);

        jComboBox2.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022" }));
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(210, 130, 160, 50);

        jLabel2.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 15)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Selecione o Mês:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 100, 160, 20);

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(243, 225, 182));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Selecione o Periodo:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(160, 40, 260, 40);

        jLabel4.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 15)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Selecione o Ano:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(210, 100, 160, 21);

        jLabel5.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 15)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Selecione o Banco:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(390, 100, 160, 21);

        jComboBox3.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Itau", "Santander", "Bradesco", "Nubank", "Inter", "Banco do Brasil" }));
        jPanel1.add(jComboBox3);
        jComboBox3.setBounds(390, 130, 160, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(60, 40, 580, 730);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Imob_300px.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 300, 300);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(940, 30, 300, 300);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("9.999,00");
        jTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 94, 105)), "Média Comissão", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 15), new java.awt.Color(243, 225, 182))); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(1260, 470, 165, 60);

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("999");
        jTextField2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 94, 105)), "Qtde. Contratos", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nirmala UI", 0, 15), new java.awt.Color(243, 225, 182))); // NOI18N
        getContentPane().add(jTextField2);
        jTextField2.setBounds(730, 380, 165, 60);

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("99");
        jTextField3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 94, 105)), "Qtde. Simulações", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 15), new java.awt.Color(243, 225, 182))); // NOI18N
        getContentPane().add(jTextField3);
        jTextField3.setBounds(1000, 380, 165, 60);

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("9");
        jTextField4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 94, 105)), "Média de Contratos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 15), new java.awt.Color(243, 225, 182))); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(1260, 380, 165, 60);

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("999.999,00");
        jTextField5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 94, 105)), "Total Comissão", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 15), new java.awt.Color(243, 225, 182))); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5);
        jTextField5.setBounds(730, 470, 165, 60);

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("99.999,00");
        jTextField6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 94, 105)), "Maior Comissão", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 15), new java.awt.Color(243, 225, 182))); // NOI18N
        getContentPane().add(jTextField6);
        jTextField6.setBounds(1000, 470, 165, 60);

        jTextField7.setEditable(false);
        jTextField7.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setText("999.999,00");
        jTextField7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 94, 105)), "Valor Financiado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 15), new java.awt.Color(243, 225, 182))); // NOI18N
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField7);
        jTextField7.setBounds(730, 560, 165, 60);

        jTextField8.setEditable(false);
        jTextField8.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setText("99.999,00");
        jTextField8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 94, 105)), "Maior Financiamento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 15), new java.awt.Color(243, 225, 182))); // NOI18N
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField8);
        jTextField8.setBounds(1000, 560, 165, 60);

        jTextField9.setEditable(false);
        jTextField9.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setText("9.999,00");
        jTextField9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 94, 105)), "Media Financiamento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 15), new java.awt.Color(243, 225, 182))); // NOI18N
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField9);
        jTextField9.setBounds(1260, 560, 165, 60);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BOTAO_IMPRIMIR_700x100.png"))); // NOI18N
        getContentPane().add(jButton1);
        jButton1.setBounds(740, 670, 700, 100);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}