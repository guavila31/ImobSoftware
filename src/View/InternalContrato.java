
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package View;

import dao.ConnectionFactory;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.UIManager;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import javax.swing.JOptionPane;

/**
 *
 * @author gusta
 */
public class InternalContrato extends javax.swing.JInternalFrame {

    private Connection conn;
    PreparedStatement pst = null;
    ResultSet rs = null;
    private static InternalContrato instance;

    public static InternalContrato getInstance() {
        if (instance == null) {
            instance = new InternalContrato();
        }
        return instance;
    }

    /**
     * Creates new form InternalConsultaCategoria
     */
    /**
     * Creates new form InternalContrato
     */
    public InternalContrato() {
        initComponents();
        conn = ConnectionFactory.getConnection();
        UIManager.put("Table.alternateRowColor", Color.decode("#232c31"));
        //UIManager.put("Table.gridColor", Color.decode("#1d5e69"));
        UIManager.put("Button.arc", 0);
        UIManager.put("TextComponent.arc", 10);
        UIManager.put("TextField.background", Color.decode("#263238"));

    }

    private void pesquisar_comprador() {
        String sql = "select nome as Nome, cpf as CPF from tb_cadastropessoa where nome like ?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtPesqCom.getText() + "%");
            rs = pst.executeQuery();
            tblComprador.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void setar_campos_Comp() {
        int setar = tblComprador.getSelectedRow();
        txtNomeCom.setText(tblComprador.getModel().getValueAt(setar, 0).toString());
        txtCpfCom.setText(tblComprador.getModel().getValueAt(setar, 1).toString());

    }

    private void pesquisar_Vend() {

        String sql = "SELECT id as IdImovel, tb_cadastrovendedor.nome as NomeVendedor, bairro as Bairro, cidade as Cidade FROM tb_cadastroimovel INNER JOIN tb_cadastrovendedor on cpf = vendedor WHERE tb_cadastrovendedor.nome like ?";
//        String sql = "select nome as Nome, cpf as CPF from tb_cadastropessoa where nome like ?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtPesqVen.getText() + "%");
            rs = pst.executeQuery();
            tblImovel.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void setar_campos_Vend() {
        int setar = tblImovel.getSelectedRow();
        txtIdImovel.setText(tblImovel.getModel().getValueAt(setar, 0).toString());
        txtVend.setText(tblImovel.getModel().getValueAt(setar, 1).toString());
        txtValor.setEnabled(true);
    }

    private void pesquisar_Contrato() {

        String sql = "SELECT id as Id_Contrato, id_imovel as ID_Imovel,  nome_com as Comprador, cpf_com as CPF_Comprador, nome_vend as Vendedor, valor as Valor FROM tb_contrato WHERE nome_com like ?";
//        String sql = "select nome as Nome, cpf as CPF from tb_cadastropessoa where nome like ?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtPesqCon.getText() + "%");
            rs = pst.executeQuery();
            tblContrato.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void setar_campos_Contrato() {
        int setar = tblContrato.getSelectedRow();
        txtIdContrato.setText(tblContrato.getModel().getValueAt(setar, 0).toString());
        txtIdImovel.setText(tblContrato.getModel().getValueAt(setar, 1).toString());
        txtNomeCom.setText(tblContrato.getModel().getValueAt(setar, 2).toString());
        txtCpfCom.setText(tblContrato.getModel().getValueAt(setar, 3).toString());
        txtVend.setText(tblContrato.getModel().getValueAt(setar, 4).toString());
        txtValor.setText(tblContrato.getModel().getValueAt(setar, 5).toString());
        txtNomeCom.setEnabled(true);
        txtCpfCom.setEnabled(true);
        txtVend.setEnabled(true);
        txtValor.setEnabled(true);
    }

    private void adicionarContrato() {
        String sql = "insert into tb_contrato (nome_com, cpf_com, nome_vend, valor, id_imovel) VALUES (?,?,?,?,?)";

        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtNomeCom.getText());
            pst.setString(2, txtCpfCom.getText());
            pst.setString(3, txtVend.getText());
            pst.setString(4, txtValor.getText());
            pst.setString(5, txtIdImovel.getText());
            //validação dos campos obrigatórios   
            if ((txtNomeCom.getText().isEmpty()) || (txtCpfCom.getText().isEmpty()) || (txtVend.getText().isEmpty()) || (txtValor.getText().isEmpty()) || (txtIdImovel.getText().isEmpty())) {
                JOptionPane.showMessageDialog(this, "Preencha todos os campos!");
            } else {
                int adicionado = pst.executeUpdate();
                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Contrato Adicionado");
                    limpar();
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void alterarContrato() {
        String sql = "update tb_contrato set nome_com=?,cpf_com=?,nome_vend=?,valor=?,id=? where id=?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtNomeCom.getText());
            pst.setString(2, txtCpfCom.getText());
            pst.setString(3, txtVend.getText());
            pst.setString(4, txtValor.getText());
            pst.setString(5, txtIdImovel.getText());
            pst.setString(6, txtIdContrato.getText());
            if ((txtNomeCom.getText().isEmpty()) || (txtCpfCom.getText().isEmpty()) || (txtVend.getText().isEmpty()) || (txtValor.getText().isEmpty()) || (txtIdImovel.getText().isEmpty())) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios");
            } else {
//a linha abaixo atualiza a tabela usuario com os dados do formulário
                //a etrutura abaixo é usada para confirmar a alteração dos dados na tabela
                int adicionado = pst.executeUpdate();
                //a linha abaixo serve de apoio ao entendimento da lógica
                //System.out.println(adicionado);
                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Dados de Contrato alterados com sucesso");
//                    txtUsuId.setText(null);
                    limpar();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void removerContrato() {
        //a estrutura abaixo confirma a remoção do usuário
        int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover este Contrato?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {
            String sql = "delete from tb_contrato where id=?";
            try {
                pst = conn.prepareStatement(sql);
                pst.setString(1, txtIdContrato.getText());
                int apagado = pst.executeUpdate();
                if (apagado > 0) {
                    JOptionPane.showMessageDialog(null, "Contrato Removido com sucesso");
                    limpar();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    private void limpar() {
        txtNomeCom.setText(null);
        txtCpfCom.setText(null);
        txtVend.setText(null);
        txtValor.setText(null);
        txtIdImovel.setText(null);
        txtIdContrato.setText(null);
    }

    private void limparTudo() {
        txtNomeCom.setText(null);
        txtCpfCom.setText(null);
        txtVend.setText(null);
        txtValor.setText(null);
        txtIdImovel.setText(null);
        txtPesqCom.setText(null);
        txtPesqVen.setText(null);

        txtNomeCom.setEnabled(false);
        txtCpfCom.setEnabled(false);
        txtVend.setEnabled(false);
        txtValor.setEnabled(false);
        txtIdImovel.setEnabled(false);

        btnSalvar.setEnabled(true);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnImprimir.setEnabled(false);
        btnLimpar.setEnabled(true);
        tblComprador.setEnabled(true);
        tblImovel.setEnabled(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtNomeCom = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCpfCom = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        txtPesqCom = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtIdImovel = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblImovel = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblComprador = new javax.swing.JTable();
        txtVend = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPesqVen = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        txtIdContrato = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblContrato = new javax.swing.JTable();
        txtPesqCon = new javax.swing.JTextField();
        btnAlterar = new javax.swing.JToggleButton();
        btnExcluir = new javax.swing.JToggleButton();
        btnLimpar = new javax.swing.JToggleButton();
        btnSalvar = new javax.swing.JToggleButton();
        btnImprimir = new javax.swing.JToggleButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setIconifiable(true);
        setTitle("..:Contrato:..");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/contrato_1.png"))); // NOI18N
        setMaximumSize(new java.awt.Dimension(1050, 700));
        setMinimumSize(new java.awt.Dimension(1050, 700));
        setPreferredSize(new java.awt.Dimension(1050, 700));
        setRequestFocusEnabled(false);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisar Contratos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nirmala UI", 1, 24), new java.awt.Color(243, 225, 182))); // NOI18N
        jPanel3.setLayout(null);

        txtNomeCom.setEnabled(false);
        jPanel3.add(txtNomeCom);
        txtNomeCom.setBounds(80, 100, 350, 30);

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jLabel2.setText("Nome");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(30, 100, 50, 30);

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jLabel3.setText("CPF");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(40, 140, 40, 30);

        txtCpfCom.setEnabled(false);
        jPanel3.add(txtCpfCom);
        txtCpfCom.setBounds(80, 140, 350, 30);
        jPanel3.add(jSeparator1);
        jSeparator1.setBounds(30, 190, 910, 10);

        jLabel5.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        jLabel5.setText("Selecione o Imóvel");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(80, 210, 170, 30);

        jLabel6.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Vendedor");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(10, 260, 70, 30);

        jLabel7.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jLabel7.setText("Valor");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(40, 310, 40, 30);

        txtValor.setEnabled(false);
        jPanel3.add(txtValor);
        txtValor.setBounds(80, 310, 180, 30);

        txtPesqCom.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar Comprador"));
        txtPesqCom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesqComKeyReleased(evt);
            }
        });
        jPanel3.add(txtPesqCom);
        txtPesqCom.setBounds(450, 30, 490, 50);

        jLabel8.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        jLabel8.setText("ID Imóvel");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(300, 310, 80, 30);

        txtIdImovel.setEnabled(false);
        jPanel3.add(txtIdImovel);
        txtIdImovel.setBounds(380, 310, 50, 30);

        tblImovel = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tblImovel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Vendedor", "Bairro", "Cidade"
            }
        ));
        tblImovel.getTableHeader().setReorderingAllowed(false);
        tblImovel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblImovelMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblImovel);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(450, 250, 490, 100);

        tblComprador = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tblComprador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nome", "CPF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblComprador.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblComprador.setAutoscrolls(false);
        tblComprador.setFocusable(false);
        tblComprador.getTableHeader().setResizingAllowed(false);
        tblComprador.getTableHeader().setReorderingAllowed(false);
        tblComprador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCompradorMouseClicked(evt);
            }
        });
        tblComprador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblCompradorKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(tblComprador);

        jPanel3.add(jScrollPane3);
        jScrollPane3.setBounds(450, 80, 490, 100);

        txtVend.setEnabled(false);
        jPanel3.add(txtVend);
        txtVend.setBounds(80, 260, 350, 30);

        jLabel9.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        jLabel9.setText("Selecione o Comprador");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(80, 42, 170, 30);

        txtPesqVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar Imóvel"));
        txtPesqVen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesqVenActionPerformed(evt);
            }
        });
        txtPesqVen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesqVenKeyReleased(evt);
            }
        });
        jPanel3.add(txtPesqVen);
        txtPesqVen.setBounds(450, 200, 490, 50);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(20, 10, 970, 360);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisar Contratos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nirmala UI", 1, 24), new java.awt.Color(243, 225, 182))); // NOI18N
        jPanel4.setLayout(null);

        txtIdContrato.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        txtIdContrato.setBorder(javax.swing.BorderFactory.createTitledBorder("ID Contrato"));
        txtIdContrato.setEnabled(false);
        txtIdContrato.setMargin(new java.awt.Insets(2, 6, 2, 2));
        txtIdContrato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdContratoKeyReleased(evt);
            }
        });
        jPanel4.add(txtIdContrato);
        txtIdContrato.setBounds(600, 25, 90, 50);

        tblContrato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "CPF", "Comprador", "Compra"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblContrato.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblContrato.setCellSelectionEnabled(true);
        tblContrato.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblContrato.setFillsViewportHeight(true);
        tblContrato.getTableHeader().setResizingAllowed(false);
        tblContrato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblContratoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblContrato);

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(20, 90, 670, 140);

        txtPesqCon.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        txtPesqCon.setMargin(new java.awt.Insets(2, 6, 2, 2));
        txtPesqCon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesqConKeyReleased(evt);
            }
        });
        jPanel4.add(txtPesqCon);
        txtPesqCon.setBounds(20, 40, 560, 35);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(20, 370, 710, 250);

        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAlterar);
        btnAlterar.setBounds(750, 430, 240, 40);

        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(btnExcluir);
        btnExcluir.setBounds(750, 480, 240, 40);

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpar);
        btnLimpar.setBounds(750, 580, 240, 40);

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalvar);
        btnSalvar.setBounds(750, 380, 240, 40);

        btnImprimir.setText("Imprimir");
        btnImprimir.setEnabled(false);
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        jPanel1.add(btnImprimir);
        btnImprimir.setBounds(750, 530, 240, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 20, 1010, 630);

        pack();
    }// </editor-fold>                        

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
        alterarContrato();
        limparTudo();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        removerContrato();
        limpar();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
        int confirma = JOptionPane.showConfirmDialog(this, "Deseja Limpar tudo?", "Atencao", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {
            limparTudo();
        }
    }//GEN-LAST:event_btnLimparActionPerformed

    private void tblCompradorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblCompradorKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_tblCompradorKeyReleased

    private void txtPesqComKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesqComKeyReleased
        // TODO add your handling code here:
        pesquisar_comprador();
    }//GEN-LAST:event_txtPesqComKeyReleased

    private void tblCompradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCompradorMouseClicked
        // TODO add your handling code here:
        setar_campos_Comp();
    }//GEN-LAST:event_tblCompradorMouseClicked

    private void txtPesqVenKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesqVenKeyReleased
        // TODO add your handling code here:
        pesquisar_Vend();
    }//GEN-LAST:event_txtPesqVenKeyReleased

    private void tblImovelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblImovelMouseClicked
        // TODO add your handling code here:
        setar_campos_Vend();
    }//GEN-LAST:event_tblImovelMouseClicked

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        adicionarContrato();
        limpar();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtPesqVenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesqVenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesqVenActionPerformed

    private void txtIdContratoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdContratoKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_txtIdContratoKeyReleased

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void tblContratoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblContratoMouseClicked
        // TODO add your handling code here:
        tblComprador.setEnabled(false);
        tblImovel.setEnabled(false);
        btnSalvar.setEnabled(false);
        btnAlterar.setEnabled(true);
        btnExcluir.setEnabled(true);
        btnImprimir.setEnabled(true);
        btnLimpar.setEnabled(true);
        txtPesqCom.setText(null);
        txtPesqVen.setText(null);
        setar_campos_Contrato();
    }//GEN-LAST:event_tblContratoMouseClicked

    private void txtPesqConKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesqConKeyReleased
        // TODO add your handling code here:
        pesquisar_Contrato();
    }//GEN-LAST:event_txtPesqConKeyReleased


    // Variables declaration - do not modify                     
    private javax.swing.JToggleButton btnAlterar;
    private javax.swing.JToggleButton btnExcluir;
    private javax.swing.JToggleButton btnImprimir;
    private javax.swing.JToggleButton btnLimpar;
    private javax.swing.JToggleButton btnSalvar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblComprador;
    private javax.swing.JTable tblContrato;
    private javax.swing.JTable tblImovel;
    private javax.swing.JTextField txtCpfCom;
    private javax.swing.JTextField txtIdContrato;
    private javax.swing.JTextField txtIdImovel;
    private javax.swing.JTextField txtNomeCom;
    private javax.swing.JTextField txtPesqCom;
    private javax.swing.JTextField txtPesqCon;
    private javax.swing.JTextField txtPesqVen;
    private javax.swing.JTextField txtValor;
    private javax.swing.JTextField txtVend;
    // End of variables declaration                   
}

