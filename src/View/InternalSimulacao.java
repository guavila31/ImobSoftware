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
    public InternalSimulacao(){
        initComponents();
        UIManager.put("Button.arc", 999);
        UIManager.put("Button.background", Color.decode("#7cbc9a"));
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txt_RendaFamiliar = new javax.swing.JTextField();
        lab_RendaFamiliar = new javax.swing.JLabel();
        lab_ValorEntrada = new javax.swing.JLabel();
        btn_Calcular = new javax.swing.JButton();
        lab_ValorImovel = new javax.swing.JLabel();
        lab_JursoAnual = new javax.swing.JLabel();
        txt_JurosAnual = new javax.swing.JTextField();
        lab_QtdeParcelas = new javax.swing.JLabel();
        txt_QtdeParcelas = new javax.swing.JTextField();
        txt_ValorEntrada = new javax.swing.JTextField();
        txt_ValorImovel = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        lab_ValorTotal = new javax.swing.JLabel();
        lab_ValorFinanciado = new javax.swing.JLabel();
        lab_JurosMensal = new javax.swing.JLabel();
        lab_CustoEfetivo = new javax.swing.JLabel();
        txt_CustoEfetivo = new javax.swing.JTextField();
        txt_ValorTotal = new javax.swing.JTextField();
        txt_ValorFinanciado = new javax.swing.JTextField();
        txt_JurosMensal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        lab_StatusSimulacao = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setClosable(true);
        setIconifiable(true);
        setTitle("..:Simulação:..");
        setToolTipText("");
        setAutoscrolls(true);
        setEnabled(false);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/pagamento-em-dinheiro.png"))); // NOI18N
        setMaximumSize(new java.awt.Dimension(1500, 900));
        setMinimumSize(new java.awt.Dimension(1500, 9004));
        setName(""); // NOI18N
        setNormalBounds(new java.awt.Rectangle(0, 0, 75, 0));
        setPreferredSize(new java.awt.Dimension(1500, 900));
        getContentPane().setLayout(null);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 94, 105)), "Simulação de Financiamento", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nirmala UI", 1, 30), new java.awt.Color(124, 188, 154))); // NOI18N
        jPanel5.setLayout(null);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(35, 153, 142)), "Infomações", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nirmala UI Semilight", 1, 20), new java.awt.Color(243, 225, 182))); // NOI18N
        jPanel4.setLayout(null);

        txt_RendaFamiliar.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jPanel4.add(txt_RendaFamiliar);
        txt_RendaFamiliar.setBounds(100, 90, 250, 35);

        lab_RendaFamiliar.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        lab_RendaFamiliar.setText("Renda familiar mensal");
        jPanel4.add(lab_RendaFamiliar);
        lab_RendaFamiliar.setBounds(100, 60, 220, 25);

        lab_ValorEntrada.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        lab_ValorEntrada.setText("Entrada");
        jPanel4.add(lab_ValorEntrada);
        lab_ValorEntrada.setBounds(100, 220, 140, 25);

        btn_Calcular.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        btn_Calcular.setText("Calcular");
        btn_Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CalcularActionPerformed(evt);
            }
        });
        jPanel4.add(btn_Calcular);
        btn_Calcular.setBounds(100, 470, 250, 50);

        lab_ValorImovel.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        lab_ValorImovel.setText("Valor do Imóvel");
        jPanel4.add(lab_ValorImovel);
        lab_ValorImovel.setBounds(100, 140, 140, 25);

        lab_JursoAnual.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        lab_JursoAnual.setText("Taxa de juros anual");
        jPanel4.add(lab_JursoAnual);
        lab_JursoAnual.setBounds(100, 300, 170, 25);

        txt_JurosAnual.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jPanel4.add(txt_JurosAnual);
        txt_JurosAnual.setBounds(100, 330, 250, 35);

        lab_QtdeParcelas.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        lab_QtdeParcelas.setText("Quantidade de parcelas");
        jPanel4.add(lab_QtdeParcelas);
        lab_QtdeParcelas.setBounds(100, 380, 190, 25);

        txt_QtdeParcelas.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jPanel4.add(txt_QtdeParcelas);
        txt_QtdeParcelas.setBounds(100, 410, 250, 35);

        txt_ValorEntrada.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jPanel4.add(txt_ValorEntrada);
        txt_ValorEntrada.setBounds(100, 250, 250, 35);

        txt_ValorImovel.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jPanel4.add(txt_ValorImovel);
        txt_ValorImovel.setBounds(100, 170, 250, 35);

        jPanel5.add(jPanel4);
        jPanel4.setBounds(60, 40, 450, 790);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(35, 153, 142), 1, true), "Resultado", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nirmala UI Semilight", 1, 18), new java.awt.Color(243, 225, 182))); // NOI18N
        jPanel6.setLayout(null);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(35, 153, 142), 1, true), "Resultado", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nirmala UI Semilight", 1, 18), new java.awt.Color(243, 225, 182))); // NOI18N
        jPanel7.setLayout(null);
        jPanel6.add(jPanel7);
        jPanel7.setBounds(670, -50, 450, 790);

        lab_ValorTotal.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        lab_ValorTotal.setText("Valor total pago");
        jPanel6.add(lab_ValorTotal);
        lab_ValorTotal.setBounds(100, 140, 180, 25);

        lab_ValorFinanciado.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        lab_ValorFinanciado.setText("Valor financiado");
        jPanel6.add(lab_ValorFinanciado);
        lab_ValorFinanciado.setBounds(100, 220, 200, 25);

        lab_JurosMensal.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        lab_JurosMensal.setText("Taxa de juros mensais");
        jPanel6.add(lab_JurosMensal);
        lab_JurosMensal.setBounds(100, 300, 200, 25);

        lab_CustoEfetivo.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        lab_CustoEfetivo.setText("Custo efetivo total");
        jPanel6.add(lab_CustoEfetivo);
        lab_CustoEfetivo.setBounds(100, 380, 160, 30);

        txt_CustoEfetivo.setEditable(false);
        txt_CustoEfetivo.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jPanel6.add(txt_CustoEfetivo);
        txt_CustoEfetivo.setBounds(100, 410, 250, 35);

        txt_ValorTotal.setEditable(false);
        txt_ValorTotal.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jPanel6.add(txt_ValorTotal);
        txt_ValorTotal.setBounds(100, 170, 250, 35);

        txt_ValorFinanciado.setEditable(false);
        txt_ValorFinanciado.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jPanel6.add(txt_ValorFinanciado);
        txt_ValorFinanciado.setBounds(100, 250, 250, 35);

        txt_JurosMensal.setEditable(false);
        txt_JurosMensal.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jPanel6.add(txt_JurosMensal);
        txt_JurosMensal.setBounds(100, 330, 250, 35);

        jLabel10.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel10.setText("Status simulação");
        jPanel6.add(jLabel10);
        jLabel10.setBounds(100, 60, 170, 25);

        lab_StatusSimulacao.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        lab_StatusSimulacao.setText("-");
        jPanel6.add(lab_StatusSimulacao);
        lab_StatusSimulacao.setBounds(100, 90, 250, 30);

        jPanel5.add(jPanel6);
        jPanel6.setBounds(660, 40, 450, 790);

        jSeparator1.setForeground(new java.awt.Color(35, 153, 142));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel5.add(jSeparator1);
        jSeparator1.setBounds(580, 55, 20, 770);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(170, 10, 1160, 850);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Pessoais", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 30))); // NOI18N
        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(12, 13, 961, 0);

        setBounds(0, 0, 1358, 984);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CalcularActionPerformed
        double rendaFamiliar = Double.parseDouble(txt_RendaFamiliar.getText());
        double valorImovel = Double.parseDouble(txt_ValorImovel.getText());
        double entrada = Double.parseDouble(txt_ValorEntrada.getText());
        double taxaJurosAnual = Double.parseDouble(txt_JurosAnual.getText());
        int qtdeParcelas = Integer.parseInt(txt_QtdeParcelas.getText());
        
        double taxaJurosMensal = taxaJurosAnual/1200;
        double valorFinanciado = valorImovel-entrada;
        double parcelaAmortizacao = valorFinanciado/qtdeParcelas;
        
        double saldoDevedor = valorFinanciado;
        double jurosTotal = 0;
        for(int i = 0; i<qtdeParcelas; i++){
            double jurosMensal = saldoDevedor*taxaJurosMensal;
            jurosTotal = jurosTotal+jurosMensal;
            saldoDevedor = saldoDevedor-parcelaAmortizacao;
        }
        
        double valorTotalPago = valorImovel+jurosTotal;
        float custoEfetivo = (float) (100*valorTotalPago/valorImovel);
        
        double maiorParcela = valorFinanciado*taxaJurosMensal+parcelaAmortizacao;
        if(rendaFamiliar < maiorParcela){
            lab_StatusSimulacao.setText("Renda mensal insulficiente");
        }
        else{
            lab_StatusSimulacao.setText("OK");
        }
        
        txt_ValorTotal.setText(String.valueOf(valorTotalPago));
        txt_ValorFinanciado.setText(String.valueOf(valorFinanciado));
        txt_JurosMensal.setText(String.valueOf(taxaJurosMensal*100)+" %");
        txt_CustoEfetivo.setText(String.valueOf(custoEfetivo)+" %");
    }//GEN-LAST:event_btn_CalcularActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Calcular;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lab_CustoEfetivo;
    private javax.swing.JLabel lab_JurosMensal;
    private javax.swing.JLabel lab_JursoAnual;
    private javax.swing.JLabel lab_QtdeParcelas;
    private javax.swing.JLabel lab_RendaFamiliar;
    private javax.swing.JLabel lab_StatusSimulacao;
    private javax.swing.JLabel lab_ValorEntrada;
    private javax.swing.JLabel lab_ValorFinanciado;
    private javax.swing.JLabel lab_ValorImovel;
    private javax.swing.JLabel lab_ValorTotal;
    private javax.swing.JTextField txt_CustoEfetivo;
    private javax.swing.JTextField txt_JurosAnual;
    private javax.swing.JTextField txt_JurosMensal;
    private javax.swing.JTextField txt_QtdeParcelas;
    private javax.swing.JTextField txt_RendaFamiliar;
    private javax.swing.JTextField txt_ValorEntrada;
    private javax.swing.JTextField txt_ValorFinanciado;
    private javax.swing.JTextField txt_ValorImovel;
    private javax.swing.JTextField txt_ValorTotal;
    // End of variables declaration//GEN-END:variables
}
