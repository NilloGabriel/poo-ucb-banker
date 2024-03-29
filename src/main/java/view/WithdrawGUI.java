/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import dao.GenericDAO;
import model.Cliente;

/**
 *
 * @author Xatuba Pox
 */
public class WithdrawGUI extends javax.swing.JFrame {

    /**
     * Creates new form WithdrawGUI
     */
    Cliente cliente;
    private final GenericDAO<Cliente> clienteDao;
    
    public WithdrawGUI(Cliente cliente) {
        initComponents();
        this.cliente = cliente;
        clienteDao = new GenericDAO<>();
    }

    private WithdrawGUI() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titlePanel = new javax.swing.JPanel();
        exitLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        withdrawButton = new javax.swing.JButton();
        withdrawLabel1 = new javax.swing.JLabel();
        withdrawValueField = new javax.swing.JFormattedTextField();
        separatorWithdrawValue = new javax.swing.JSeparator();
        accountButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        titlePanel.setBackground(new java.awt.Color(74, 31, 61));
        titlePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        exitLabel.setForeground(new java.awt.Color(250, 250, 250));
        exitLabel.setText("X");
        exitLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLabelMouseClicked(evt);
            }
        });
        titlePanel.add(exitLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(187, 187, 187));
        jLabel1.setText("Saque");
        titlePanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 60, 30));

        jPanel1.setBackground(new java.awt.Color(186, 79, 74));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        withdrawButton.setBackground(new java.awt.Color(186, 79, 74));
        withdrawButton.setForeground(new java.awt.Color(187, 187, 187));
        withdrawButton.setText("Sacar");
        withdrawButton.setBorder(null);
        withdrawButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawButtonActionPerformed(evt);
            }
        });
        jPanel1.add(withdrawButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 70, 30));

        withdrawLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        withdrawLabel1.setText("Qual valor deseja transferir?");
        jPanel1.add(withdrawLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        withdrawValueField.setBackground(new java.awt.Color(186, 79, 74));
        withdrawValueField.setBorder(null);
        withdrawValueField.setForeground(new java.awt.Color(187, 187, 187));
        withdrawValueField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        withdrawValueField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawValueFieldActionPerformed(evt);
            }
        });
        jPanel1.add(withdrawValueField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 200, 30));

        separatorWithdrawValue.setBackground(new java.awt.Color(204, 204, 204));
        separatorWithdrawValue.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(separatorWithdrawValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 200, 10));

        accountButton.setBackground(new java.awt.Color(186, 79, 74));
        accountButton.setForeground(new java.awt.Color(187, 187, 187));
        accountButton.setText("Conta");
        accountButton.setBorder(null);
        accountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountButtonActionPerformed(evt);
            }
        });
        jPanel1.add(accountButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 70, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitLabelMouseClicked

    private void withdrawButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawButtonActionPerformed
        if(withdrawValueField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Valor inválido!");
        } else {
            float valor = Float.parseFloat(withdrawValueField.getValue().toString());
            
            if(cliente.getPoupancaId() != null) {
                if(valor <= 0) {
                    JOptionPane.showMessageDialog(null, "Não pode ser efetuados saques com valor igual ou inferior a 0.");
                } else {
                    float saldoP = cliente.getPoupancaId().getSaldo();
                    
                    if (valor <= saldoP){
                        saldoP = saldoP - valor;

                        cliente.getPoupancaId().setSaldo(saldoP);
                        clienteDao.saveOrUpdate(cliente);
                        JOptionPane.showMessageDialog(null, "Saque de R$" + valor + " efetuado com sucesso!"); 
                    } else {
                        JOptionPane.showMessageDialog(null, "Saldo insuficiente");
                    }
                }
            } else {
                if(valor <= 0) {
                    JOptionPane.showMessageDialog(null, "Não pode ser efetuados saques com valor igual ou inferior a 0.");
                } else {
                    float saldoC = cliente.getCorrenteId().getSaldo();
                    
                    if (valor <= saldoC) {
                        saldoC = saldoC - valor;

                        cliente.getCorrenteId().setSaldo(saldoC);
                        clienteDao.saveOrUpdate(cliente);
                        JOptionPane.showMessageDialog(null, "Saque de R$" + valor + " efetuado com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Saldo insuficiente");
                    }
                }
            }
            
            ShowDetailsGUI opt = new ShowDetailsGUI(cliente);
            opt.setVisible(true);
            opt.pack();
            opt.setLocationRelativeTo(null);
            opt.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.dispose();
        }
    }//GEN-LAST:event_withdrawButtonActionPerformed

    private void withdrawValueFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawValueFieldActionPerformed
        
    }//GEN-LAST:event_withdrawValueFieldActionPerformed

    private void accountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountButtonActionPerformed
        ShowAccountDataGUI opt = new ShowAccountDataGUI(cliente);
        opt.setVisible(true);
        opt.pack();
        opt.setLocationRelativeTo(null);
        opt.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_accountButtonActionPerformed

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
            java.util.logging.Logger.getLogger(WithdrawGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WithdrawGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WithdrawGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WithdrawGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WithdrawGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accountButton;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator separatorWithdrawValue;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JButton withdrawButton;
    private javax.swing.JLabel withdrawLabel1;
    private javax.swing.JFormattedTextField withdrawValueField;
    // End of variables declaration//GEN-END:variables
}
