/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import model.Cliente;

/**
 *
 * @author João
 */
public class ShowDataGUI extends javax.swing.JFrame {
    Cliente cliente;
    /**
     * Creates new form ShowDataGUI
     */
    public ShowDataGUI(Cliente cliente) {
        initComponents();
        this.cliente = cliente;
        jTextAreaName.setEditable(false);
        jTextAreaCPF.setEditable(false);
        jTextAreaRG.setEditable(false);
        jTextAreaName.setText(cliente.getNome());
        jTextAreaCPF.setText(cliente.getCpf());
        jTextAreaRG.setText(cliente.getRg());
    }
    
    public ShowDataGUI() {
        throw new UnsupportedOperationException("Not supported yet.");
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
        titlePanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        exitLabel = new javax.swing.JLabel();
        registerPanel = new javax.swing.JPanel();
        passwordLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        next = new javax.swing.JButton();
        Logout = new javax.swing.JButton();
        jScrollPaneCPF = new javax.swing.JScrollPane();
        jTextAreaCPF = new javax.swing.JTextArea();
        jScrollPaneName = new javax.swing.JScrollPane();
        jTextAreaName = new javax.swing.JTextArea();
        jScrollPaneRG = new javax.swing.JScrollPane();
        jTextAreaRG = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        titlePanel.setBackground(new java.awt.Color(74, 31, 61));
        titlePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(187, 187, 187));
        titleLabel.setText("Dados do Usuário");
        titlePanel.add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

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

        registerPanel.setBackground(new java.awt.Color(186, 79, 74));
        registerPanel.setToolTipText("fgdf");
        registerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        passwordLabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        passwordLabel.setText("CPF:");
        registerPanel.add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, 50));

        emailLabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        emailLabel.setText("Nome:");
        registerPanel.add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        nameLabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        nameLabel.setText("RG:");
        registerPanel.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        next.setBackground(new java.awt.Color(186, 79, 74));
        next.setForeground(new java.awt.Color(187, 187, 187));
        next.setText("Next");
        next.setBorder(null);
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        registerPanel.add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 70, 30));

        Logout.setBackground(new java.awt.Color(186, 79, 74));
        Logout.setForeground(new java.awt.Color(187, 187, 187));
        Logout.setText("Logout");
        Logout.setBorder(null);
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        registerPanel.add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 70, 30));

        jScrollPaneCPF.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPaneCPF.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPaneCPF.setWheelScrollingEnabled(false);

        jTextAreaCPF.setBackground(new java.awt.Color(186, 79, 74));
        jTextAreaCPF.setColumns(20);
        jTextAreaCPF.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextAreaCPF.setRows(4);
        jTextAreaCPF.setToolTipText("");
        jTextAreaCPF.setBorder(null);
        jScrollPaneCPF.setViewportView(jTextAreaCPF);
        jTextAreaCPF.getAccessibleContext().setAccessibleName("cpf");

        registerPanel.add(jScrollPaneCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 220, 30));

        jScrollPaneName.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPaneName.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPaneName.setWheelScrollingEnabled(false);

        jTextAreaName.setBackground(new java.awt.Color(186, 79, 74));
        jTextAreaName.setColumns(20);
        jTextAreaName.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextAreaName.setRows(5);
        jTextAreaName.setToolTipText("");
        jScrollPaneName.setViewportView(jTextAreaName);

        registerPanel.add(jScrollPaneName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 220, 30));

        jScrollPaneRG.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPaneRG.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPaneRG.setWheelScrollingEnabled(false);

        jTextAreaRG.setBackground(new java.awt.Color(186, 79, 74));
        jTextAreaRG.setColumns(20);
        jTextAreaRG.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextAreaRG.setRows(5);
        jTextAreaRG.setToolTipText("");
        jScrollPaneRG.setViewportView(jTextAreaRG);

        registerPanel.add(jScrollPaneRG, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 220, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
            .addComponent(registerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(registerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed

        ShowAccountDataGUI opt = new ShowAccountDataGUI(cliente);
        opt.setVisible(true);
        opt.pack();
        opt.setLocationRelativeTo(null);
        opt.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_nextActionPerformed

    private void exitLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitLabelMouseClicked

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        // TODO add your handling code here:
        LoginGUI reg = new LoginGUI();
        reg.setVisible(true);
        reg.pack();
        reg.setLocationRelativeTo(null);
        reg.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_LogoutActionPerformed

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
            java.util.logging.Logger.getLogger(ShowDataGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowDataGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowDataGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowDataGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowDataGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Logout;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPaneCPF;
    private javax.swing.JScrollPane jScrollPaneName;
    private javax.swing.JScrollPane jScrollPaneRG;
    private javax.swing.JTextArea jTextAreaCPF;
    private javax.swing.JTextArea jTextAreaName;
    private javax.swing.JTextArea jTextAreaRG;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton next;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPanel registerPanel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel titlePanel;
    // End of variables declaration//GEN-END:variables
}
