/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package View.Informacao;

import dao.ConnectionFactory;
import dao.UsuarioDAO;
import java.sql.*;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author gusta
 */
public class InternalInfoCadImoveis extends javax.swing.JInternalFrame {

    private static InternalInfoCadImoveis instance;
    private UsuarioDAO usuarioDAO;
    private Connection conn;

    public static InternalInfoCadImoveis getInstance() {
        if (instance == null) {
            instance = new InternalInfoCadImoveis();
        }
        return instance;
    }

    /**
     * Creates new form InternalInfoPessoas
     */
    public InternalInfoCadImoveis() {
        initComponents();
        conn = ConnectionFactory.getConnection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();

        setTitle("Imóveis Cadastrados");
        setMaximumSize(new java.awt.Dimension(580, 610));
        setMinimumSize(new java.awt.Dimension(580, 610));
        setPreferredSize(new java.awt.Dimension(580, 610));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(243, 225, 182));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Imóveis Cadastrados");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 40, 570, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Ficha_Cadastro_Imoveis.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(130, 110, 300, 300);

        jToggleButton1.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jToggleButton1.setText("Imprimir");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(130, 440, 300, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        int confirma = JOptionPane.showConfirmDialog(null, "Confirma impressão?", "ATENCÃO", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {
            try {
                JasperPrint print = JasperFillManager.fillReport("C:/Users/gusta/Documents/Relatorios/Lista_Todos_Imovel.jasper", null, conn);
                JasperViewer.viewReport(print, false);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
