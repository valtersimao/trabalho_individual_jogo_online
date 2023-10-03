/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

/**
 *
 * @author Vartin
 */
public class JCadastros extends javax.swing.JPanel {

    /**
     * Creates new form JCadastros
     */
    public JCadastros() {
        initComponents();
        this.jButtonSla.setEnabled(false);
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
        jLabel1 = new javax.swing.JLabel();
        jButtonMinigame = new javax.swing.JButton();
        jButtonPlayer = new javax.swing.JButton();
        jButtonItem = new javax.swing.JButton();
        jButtonSla = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

        jLabel1.setFont(new java.awt.Font("BankGothic Md BT", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("CADASTROS");

        jButtonMinigame.setBackground(new java.awt.Color(255, 204, 51));
        jButtonMinigame.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
        jButtonMinigame.setForeground(new java.awt.Color(51, 0, 153));
        jButtonMinigame.setText("Minigame");
        jButtonMinigame.setMaximumSize(new java.awt.Dimension(115, 25));
        jButtonMinigame.setMinimumSize(new java.awt.Dimension(115, 25));
        jButtonMinigame.setPreferredSize(new java.awt.Dimension(115, 25));
        jButtonMinigame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMinigameActionPerformed(evt);
            }
        });

        jButtonPlayer.setBackground(new java.awt.Color(255, 204, 51));
        jButtonPlayer.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
        jButtonPlayer.setForeground(new java.awt.Color(51, 0, 153));
        jButtonPlayer.setText("Player");
        jButtonPlayer.setMaximumSize(new java.awt.Dimension(115, 25));
        jButtonPlayer.setMinimumSize(new java.awt.Dimension(115, 25));
        jButtonPlayer.setPreferredSize(new java.awt.Dimension(115, 25));
        jButtonPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPlayerActionPerformed(evt);
            }
        });

        jButtonItem.setBackground(new java.awt.Color(255, 204, 51));
        jButtonItem.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
        jButtonItem.setForeground(new java.awt.Color(51, 0, 153));
        jButtonItem.setText("Item");
        jButtonItem.setMaximumSize(new java.awt.Dimension(115, 25));
        jButtonItem.setMinimumSize(new java.awt.Dimension(115, 25));
        jButtonItem.setPreferredSize(new java.awt.Dimension(115, 25));
        jButtonItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonItemActionPerformed(evt);
            }
        });

        jButtonSla.setBackground(new java.awt.Color(255, 204, 51));
        jButtonSla.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
        jButtonSla.setForeground(new java.awt.Color(51, 0, 153));
        jButtonSla.setText("Undefined");
        jButtonSla.setMaximumSize(new java.awt.Dimension(115, 25));
        jButtonSla.setMinimumSize(new java.awt.Dimension(115, 25));
        jButtonSla.setPreferredSize(new java.awt.Dimension(115, 25));
        jButtonSla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSlaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMinigame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonItem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonMinigame, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonItem, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSla, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMinigameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinigameActionPerformed
        
    }//GEN-LAST:event_jButtonMinigameActionPerformed

    private void jButtonPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPlayerActionPerformed
        // TODO add your handling code here:
        FramePrincipal.trocaPainel("novoPlayer", new JCadastraJogador());
    }//GEN-LAST:event_jButtonPlayerActionPerformed

    private void jButtonItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonItemActionPerformed

    private void jButtonSlaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSlaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSlaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonItem;
    private javax.swing.JButton jButtonMinigame;
    private javax.swing.JButton jButtonPlayer;
    private javax.swing.JButton jButtonSla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
