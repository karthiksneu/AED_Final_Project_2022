/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.SystemAdmin;

import Business.EcoSystem;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author vinithiteshharsora
 */
public class ManageUserAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUserAccountJPanel
     */
    
      private JPanel workContainer;
    private EcoSystem business;
    public ManageUserAccountJPanel(JPanel workContainer, EcoSystem business) {
        initComponents();
        this.workContainer = workContainer;
        this.business = business;
        
        
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
        btnmangecdc = new javax.swing.JButton();
        btnmandist = new javax.swing.JButton();
        btnmanprov = new javax.swing.JButton();
        btnmandept = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 0, 153));

        jLabel1.setFont(new java.awt.Font("October Compressed Devanagari", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage User Account");

        btnmangecdc.setBackground(new java.awt.Color(0, 0, 0));
        btnmangecdc.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnmangecdc.setForeground(new java.awt.Color(255, 255, 255));
        btnmangecdc.setText("Manage CDC Admin");
        btnmangecdc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmangecdcActionPerformed(evt);
            }
        });

        btnmandist.setBackground(new java.awt.Color(0, 0, 0));
        btnmandist.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnmandist.setForeground(new java.awt.Color(255, 255, 255));
        btnmandist.setText("Manage Distributor Admin");
        btnmandist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmandistActionPerformed(evt);
            }
        });

        btnmanprov.setBackground(new java.awt.Color(0, 0, 0));
        btnmanprov.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnmanprov.setForeground(new java.awt.Color(255, 255, 255));
        btnmanprov.setText("Manage Provider Admin");
        btnmanprov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmanprovActionPerformed(evt);
            }
        });

        btnmandept.setBackground(new java.awt.Color(0, 0, 0));
        btnmandept.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnmandept.setForeground(new java.awt.Color(255, 255, 255));
        btnmandept.setText("Manage Local Health Admin");
        btnmandept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmandeptActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/ICONS/11122021icons/002.gif"))); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnmangecdc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnmandist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnmanprov, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnmandept, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1463, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnmangecdc, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnmandist)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnmandept)
                .addGap(12, 12, 12)
                .addComponent(btnmanprov)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnmanprovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmanprovActionPerformed
        // TODO add your handling code here:
        ManageProviderUserAccountJPanel panel = new ManageProviderUserAccountJPanel(workContainer, business);
        workContainer.add("ManageProviderUserAccountJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
    }//GEN-LAST:event_btnmanprovActionPerformed

    private void btnmandeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmandeptActionPerformed
        // TODO add your handling code here:
        ManageLHDUserAccount panel = new ManageLHDUserAccount(workContainer, business);
        workContainer.add("ManagePublicHealthDepartmentUserAccountJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
    }//GEN-LAST:event_btnmandeptActionPerformed

    private void btnmangecdcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmangecdcActionPerformed
        // TODO add your handling code here:
         ManageCDCUserAccountJPanel panel = new ManageCDCUserAccountJPanel(workContainer, business);
        workContainer.add("ManageCDCUserAccountJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
    }//GEN-LAST:event_btnmangecdcActionPerformed

    private void btnmandistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmandistActionPerformed
        // TODO add your handling code here:
        ManageDistributorUserAccountJPanel panel = new ManageDistributorUserAccountJPanel(workContainer, business);
        workContainer.add("ManageDistributorUserAccountJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
    }//GEN-LAST:event_btnmandistActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnmandept;
    private javax.swing.JButton btnmandist;
    private javax.swing.JButton btnmangecdc;
    private javax.swing.JButton btnmanprov;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
