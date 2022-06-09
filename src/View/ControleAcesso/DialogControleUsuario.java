/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package View.ControleAcesso;

import dao.ConnectionFactory;
import dao.UsuarioDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.scripts.JO;

/**
 *
 * @author gusta
 */
public class DialogControleUsuario extends javax.swing.JDialog {

    private Connection conn;
    PreparedStatement pst = null;
    ResultSet rs = null;
//    private UsuarioDAO usuarioDAO;
//
//    public boolean getInserir() {
//        return inserirUsuario;
//    }

    /**
     * Creates new form DialogControleUsuario
     */
    public DialogControleUsuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
//        usuarioDAO = new UsuarioDAO();
        initComponents();
        conn = ConnectionFactory.getConnection();
    }

//Comeca aqui
    private void adicionarUsuario() {
        String sql = "insert into tb_adminstrador (login, senha, email, telefone) VALUES (?,?,?,?)";
        String sql2 = "select login from tb_adminstrador WHERE login = ?";

        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtLogin.getText());
            pst.setString(2, txtSenha.getText());
            pst.setString(3, txtEmail.getText());
            pst.setString(4, txtTelefone.getText());
            //validação dos campos obrigatórios   
            if ((txtLogin.getText().isEmpty()) || (txtSenha.getText().isEmpty())) {
                JOptionPane.showMessageDialog(this, "Preencha todos os campos!");
            } else {
                int adicionado = pst.executeUpdate();
                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Usuario Adicionado");
                    limpar();
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void consultarUsuario() {
        String sql = "select * from tb_adminstrador where id = ?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtUsuId.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                txtLogin.setText(rs.getString(2));
                txtSenha.setText(rs.getString(3));
                txtEmail.setText(rs.getString(4));
                txtTelefone.setText(rs.getString(5));
            } else {
                JOptionPane.showMessageDialog(null, "Usuário não cadastrado");
                limpar();
                botaoDefault();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void alterar() {
        String sql = "update tb_adminstrador set login=?,senha=?,email=?,telefone=? where id=?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtLogin.getText());
            pst.setString(2, txtSenha.getText());
            pst.setString(3, txtEmail.getText());
            pst.setString(4, txtTelefone.getText());
            pst.setString(5, txtUsuId.getText());
            if ((txtUsuId.getText().isEmpty()) || (txtLogin.getText().isEmpty()) || (txtSenha.getText().isEmpty())) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios");
            } else {
//a linha abaixo atualiza a tabela usuario com os dados do formulário
                //a etrutura abaixo é usada para confirmar a alteração dos dados na tabela
                int adicionado = pst.executeUpdate();
                //a linha abaixo serve de apoio ao entendimento da lógica
                //System.out.println(adicionado);
                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Dados do usuário alterados com sucesso");
//                    txtUsuId.setText(null);
                    limpar();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void remover() {
        //a estrutura abaixo confirma a remoção do usuário
        int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover este usuário ?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {
            String sql = "delete from tb_adminstrador where id=?";
            try {
                pst = conn.prepareStatement(sql);
                pst.setString(1, txtUsuId.getText());
                int apagado = pst.executeUpdate();
                if (apagado > 0) {
                    JOptionPane.showMessageDialog(null, "Usuário Removido com sucesso");
                    txtUsuId.setText(null);
                    txtLogin.setText(null);
                    txtSenha.setText(null);
                    txtEmail.setText(null);
                    txtTelefone.setText(null);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    private void limpar() {
        txtLogin.setText(null);
        txtSenha.setText(null);
        txtEmail.setText(null);
        txtTelefone.setText(null);
    }

    private void liberarCampos() {
        txtLogin.setEnabled(true);
        txtSenha.setEnabled(true);
        txtEmail.setEnabled(true);
        txtTelefone.setEnabled(true);
    }

    private void bloquearCampos() {
        txtLogin.setEnabled(false);
        txtSenha.setEnabled(false);
        txtEmail.setEnabled(false);
        txtTelefone.setEnabled(false);
    }

    private void botaoDefault() {
        btnAdd.setEnabled(true);
        btnSalvar.setEnabled(false);
        btnPesquisa.setEnabled(true);
        btnExcluir.setEnabled(false);

    }
// Termina aqui

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        txtLogin = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnPesquisa = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtUsuId = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 550));
        setMinimumSize(new java.awt.Dimension(1000, 550));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(243, 225, 182));
        jLabel2.setText("Cadastro de Usuário");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 20, 440, 70);

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(243, 225, 182));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Login");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 130, 70, 40);

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(243, 225, 182));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Senha");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 180, 70, 40);

        jLabel5.setFont(new java.awt.Font("Nirmala UI", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(243, 225, 182));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Email");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 230, 70, 40);

        jLabel6.setFont(new java.awt.Font("Nirmala UI", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(243, 225, 182));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Telefone");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 280, 100, 40);

        txtTelefone.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        txtTelefone.setEnabled(false);
        getContentPane().add(txtTelefone);
        txtTelefone.setBounds(140, 280, 440, 40);

        txtLogin.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        txtLogin.setEnabled(false);
        getContentPane().add(txtLogin);
        txtLogin.setBounds(140, 130, 440, 40);

        txtSenha.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        txtSenha.setEnabled(false);
        getContentPane().add(txtSenha);
        txtSenha.setBounds(140, 180, 440, 40);

        txtEmail.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        txtEmail.setEnabled(false);
        getContentPane().add(txtEmail);
        txtEmail.setBounds(140, 230, 440, 40);

        jPanel1.setLayout(null);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Ficha_Registro_CadastroUsuario.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(1, 1, 300, 300);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(620, 20, 300, 300);

        btnSair.setFont(new java.awt.Font("Nirmala UI", 1, 22)); // NOI18N
        btnSair.setForeground(new java.awt.Color(38, 50, 56));
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(400, 370, 180, 60);

        btnAdd.setFont(new java.awt.Font("Nirmala UI", 1, 22)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(38, 50, 56));
        btnAdd.setText("Novo");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd);
        btnAdd.setBounds(140, 370, 180, 60);

        btnSalvar.setFont(new java.awt.Font("Nirmala UI", 1, 22)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(38, 50, 56));
        btnSalvar.setText("Salvar");
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(140, 450, 180, 60);

        btnExcluir.setFont(new java.awt.Font("Nirmala UI", 1, 22)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(38, 50, 56));
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(400, 450, 180, 60);

        btnPesquisa.setFont(new java.awt.Font("Nirmala UI", 1, 22)); // NOI18N
        btnPesquisa.setForeground(new java.awt.Color(38, 50, 56));
        btnPesquisa.setText("Pesquisar");
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisa);
        btnPesquisa.setBounds(670, 420, 240, 60);

        jLabel8.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel8.setText("Id:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(620, 340, 40, 60);

        txtUsuId.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        txtUsuId.setDragEnabled(true);
        txtUsuId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuIdActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuId);
        txtUsuId.setBounds(670, 350, 240, 40);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        int confirma = JOptionPane.showConfirmDialog(this, "Deseja sair?", "SAIR", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {
            this.dispose();
        }

    }//GEN-LAST:event_btnSairActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        if (txtUsuId.getText().equals("")) {
            adicionarUsuario();
        } else {
            alterar();
            limpar();
        }
        txtUsuId.setEnabled(true);
        bloquearCampos();
        botaoDefault();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        remover();
        limpar();
        botaoDefault();
        bloquearCampos();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        btnPesquisa.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnAdd.setEnabled(false);
        liberarCampos();
        txtUsuId.setEnabled(false);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed
        // TODO add your handling code here:
        if (txtUsuId.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Nenhum Id selecionado", "ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            btnAdd.setEnabled(true);
        } else {
            btnSalvar.setEnabled(true);
            btnExcluir.setEnabled(true);
            btnAdd.setEnabled(false);
            liberarCampos();
            consultarUsuario();
        }


    }//GEN-LAST:event_btnPesquisaActionPerformed

    private void txtUsuIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuIdActionPerformed

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
            java.util.logging.Logger.getLogger(DialogControleUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogControleUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogControleUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogControleUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogControleUsuario dialog = new DialogControleUsuario(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisa;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtUsuId;
    // End of variables declaration//GEN-END:variables
}
