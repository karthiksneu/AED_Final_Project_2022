/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userinterface.SystemAdmin;

import TheBusiness.Ecosystems;
import TheBusiness.Disease.Disease;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author soham
 */
public class ManageDiseaseCatalog extends javax.swing.JPanel {

    /**
     * Creates new form ManageDiseaseCatalog
     */
    private JPanel workContainer;
    private Ecosystems business;
    
    public ManageDiseaseCatalog(JPanel workContainer, Ecosystems business) {
        initComponents();
        this.workContainer = workContainer;
        this.business = business;
        populateTable();
    }
    
     private void populateTable(){
        
        DefaultTableModel model = (DefaultTableModel) tbldislist.getModel();
        model.setRowCount(0);
        
        for(Disease disease : business.getDiseaseDirectory().getdiseaseDirectory())
        {
            Object[] row = new Object[3];
            row[0] = disease;
            row[1] = disease.getDiseaseName();
            row[2] = disease.getLastUpdatedTime();
            
            model.addRow(row);
        }
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbldislist = new javax.swing.JTable();
        btnaddis = new javax.swing.JButton();
        btnremovedis = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        btnref = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(70, 130, 180));

        jLabel1.setFont(new java.awt.Font("October Compressed Devanagari", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Disease Catalog");

        tbldislist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Disease Name", "Last Updated on"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbldislist.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbldislist);
        if (tbldislist.getColumnModel().getColumnCount() > 0) {
            tbldislist.getColumnModel().getColumn(0).setResizable(false);
            tbldislist.getColumnModel().getColumn(1).setResizable(false);
            tbldislist.getColumnModel().getColumn(2).setResizable(false);
        }

        btnaddis.setBackground(new java.awt.Color(0, 0, 0));
        btnaddis.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnaddis.setForeground(new java.awt.Color(255, 255, 255));
        btnaddis.setText("Add Disease");
        btnaddis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddisActionPerformed(evt);
            }
        });

        btnremovedis.setBackground(new java.awt.Color(0, 0, 0));
        btnremovedis.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnremovedis.setForeground(new java.awt.Color(255, 255, 255));
        btnremovedis.setText("Remove");
        btnremovedis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremovedisActionPerformed(evt);
            }
        });

        btnback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/ICONS/11122021icons/MicrosoftTeams-image (1).png"))); // NOI18N
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        btnref.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnref.setForeground(new java.awt.Color(255, 255, 255));
        btnref.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/ICONS/11122021icons/MicrosoftTeams-image (2).png"))); // NOI18N
        btnref.setText("Refresh");
        btnref.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/ICONS/11122021icons/dis1.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 894, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnremovedis)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnaddis))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnback)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnref)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(btnref)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnaddis)
                    .addComponent(btnremovedis))
                .addGap(26, 26, 26)
                .addComponent(btnback)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddisActionPerformed
        // TODO add your handling code here:

        AddDiseases panel = new AddDiseases(workContainer, business);
        workContainer.add("AddNewDiseaseInfoJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
    }//GEN-LAST:event_btnaddisActionPerformed

    private void btnremovedisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremovedisActionPerformed
        // TODO add your handling code here:

        int row = tbldislist.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a Disease from table");
            return;
        }

        Disease disease = (Disease)tbldislist.getValueAt(row, 0);
        business.getDiseaseDirectory().removeDisease(disease);
        populateTable();

    }//GEN-LAST:event_btnremovedisActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        workContainer.remove(this);
        CardLayout layout = (CardLayout) workContainer.getLayout();
        layout.previous(workContainer);
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnrefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_btnrefActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddis;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnref;
    private javax.swing.JButton btnremovedis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbldislist;
    // End of variables declaration//GEN-END:variables
}
