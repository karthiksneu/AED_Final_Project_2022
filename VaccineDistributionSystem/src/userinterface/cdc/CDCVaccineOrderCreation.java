/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CDC;

import TheBusiness.Ecosystems;
import TheBusiness.NationalEnterprise.CenterOfDiseaseControl;
import TheBusiness.NationalEnterprise.Manufacturer;
import TheBusiness.OrderManagement.Order;
import TheBusiness.OrderManagement.OrderItem;
import TheBusiness.Organization.CDCOrganization;
import TheBusiness.Organization.ManufactureOrganization;
import TheBusiness.Organization.Organization;
import TheBusiness.UserAccountManagement.UserAccount;
import TheBusiness.VaccineManagement.VaccineDetails;
import TheBusiness.WorkOrderQueue.OrderVaccineWorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author karthik
 */
public class CDCVaccineOrderCreation extends javax.swing.JPanel {

    private JPanel workContainer;
    private CenterOfDiseaseControl cdc;
    private UserAccount userAccount;
    private CDCOrganization cdcOrg;
    private Ecosystems business;
    private ArrayList<OrderItem> cartOrder;
    private boolean isCheckout;

    public CDCVaccineOrderCreation(JPanel workContainer, CenterOfDiseaseControl cdc, Ecosystems business, CDCOrganization cdcOrg, UserAccount userAccount) {
        initComponents();
        this.workContainer = workContainer;
        this.userAccount = userAccount;
        this.cdc = cdc;
        this.business = business;
        populateManufacturerComboBox();
        this.isCheckout = false;
         cartOrder = new ArrayList<OrderItem>();
    
    }

    private void populateManufacturerComboBox() {
        combo1.removeAllItems();
        for (Manufacturer manufacturer : business.getManufacturerDirectory().getManufacturerDirectory()) {
            combo1.addItem(manufacturer);

        }
    }
    
    private void displayManufacturerVaccines(){
        
        int rowCount = tblmanuf.getRowCount();
        DefaultTableModel defaulttabelmodel = (DefaultTableModel)tblmanuf.getModel();

        for(int i=rowCount-1 ; i>=0; i--){
            defaulttabelmodel.removeRow(i);
        }

        Manufacturer manufacturer = (Manufacturer)combo1.getSelectedItem();
        if(manufacturer == null){
            return;
        }

        ManufactureOrganization manufacureOrg = null;
        for(Organization org : manufacturer.getOrganizationDirectory().getOrganizationList())
        {   if(org instanceof ManufactureOrganization)
        {   manufacureOrg = (ManufactureOrganization)org;
            for(VaccineDetails vaccine : manufacureOrg.getVaccineProductCatalog().getVaccineProductList())
            {Object[] row = new Object[6];
            row[0] = vaccine;
            row[1] = vaccine.getVaccineDefinition().getVaccineName();
            row[2] = vaccine.getManufacturerName();
            row[3] = vaccine.getVaccinePrice();
            row[4] = vaccine.getAvailablity();
            row[5] = vaccine.getManufactureDate();
            defaulttabelmodel.addRow(row);
            }
        }
        }
  
    }
    
    
    private void searchVaccineProducts(String vaccineCode){
        
        int rowCount = tblmanuf.getRowCount();
        DefaultTableModel defaulttabelmodel = (DefaultTableModel)tblmanuf.getModel();
        
        for(int i=rowCount-1 ; i>=0; i--){
            defaulttabelmodel.removeRow(i);
        }
        
        
        for(Manufacturer manufacturer: business.getManufacturerDirectory().getManufacturerDirectory())
        {
             ManufactureOrganization manufacureOrg = null;
        for(Organization org : manufacturer.getOrganizationDirectory().getOrganizationList())
        {   if(org instanceof ManufactureOrganization)
        {   manufacureOrg = (ManufactureOrganization)org;
            for(VaccineDetails vaccine : manufacureOrg.getVaccineProductCatalog().getVaccineProductList())
            {
                if(vaccineCode.equalsIgnoreCase(vaccine.getVaccineDefinition().getVaccineCode()))
                {
                    
                Object[] row = new Object[6];
            row[0] = vaccine;
            row[1] = vaccine.getVaccineDefinition().getVaccineName();
            row[2] = vaccine.getManufacturerName();      
            row[3] = vaccine.getVaccinePrice();
            row[4] = vaccine.getAvailablity();
            row[5] = vaccine.getManufactureDate();
            defaulttabelmodel.addRow(row);
                }
            }
        }
            
        }
            
            
        }
   
    }
    
    
    private void refreshCartTable(){
        
          int rowCount = tbcart.getRowCount();
        DefaultTableModel defaulttabelmodel = (DefaultTableModel)tbcart.getModel();
        
        for(int i=rowCount-1 ; i>=0; i--){
            defaulttabelmodel.removeRow(i);
        }
        
        
        for(OrderItem oi: cartOrder )
        {
            Object[] row = new Object[7];
            
                row[0] = oi.getVaccineDetails();
                row[1] = oi;
                row[2] = oi.getVaccineDetails().getManufacturerName();            
                row[3] = oi.getVaccineDetails().getVaccinePrice();
                row[4] = oi.getQuantity();
                row[5] = oi.getVaccineDetails().getManufactureDate();
                row[6] = oi.getVaccineDetails().getVaccinePrice()*oi.getQuantity();
                defaulttabelmodel.addRow(row);
   
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

        lblTitle = new javax.swing.JLabel();
        lblDropdown = new javax.swing.JLabel();
        combo1 = new javax.swing.JComboBox();
        lblManufactureVaccineCatalog = new javax.swing.JLabel();
        lblVaccineCode = new javax.swing.JLabel();
        txtVaccineCode = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblmanuf = new javax.swing.JTable();
        Separator1 = new javax.swing.JSeparator();
        lblCart = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbcart = new javax.swing.JTable();
        lblQuantity = new javax.swing.JLabel();
        addcount = new javax.swing.JSpinner();
        btnAddToCart = new javax.swing.JButton();
        txtQuantity = new javax.swing.JTextField();
        btnModify = new javax.swing.JButton();
        lblQuantity1 = new javax.swing.JLabel();
        btnCancelOrder = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnCheckOut = new javax.swing.JButton();
        lblTotalAmount = new javax.swing.JLabel();
        txtTotalAmount = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(37, 161, 142));

        lblTitle.setFont(new java.awt.Font("October Compressed Devanagari", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Create Vaccine Order");

        lblDropdown.setFont(new java.awt.Font("October Compressed Devanagari", 1, 18)); // NOI18N
        lblDropdown.setForeground(new java.awt.Color(255, 255, 255));
        lblDropdown.setText("Manufacturer:");

        combo1.setForeground(new java.awt.Color(0, 0, 102));
        combo1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo1ActionPerformed(evt);
            }
        });

        lblManufactureVaccineCatalog.setFont(new java.awt.Font("October Compressed Devanagari", 1, 18)); // NOI18N
        lblManufactureVaccineCatalog.setForeground(new java.awt.Color(255, 255, 255));
        lblManufactureVaccineCatalog.setText("Manufacturer Vaccine Catalog:");

        lblVaccineCode.setFont(new java.awt.Font("October Compressed Devanagari", 0, 13)); // NOI18N
        lblVaccineCode.setForeground(new java.awt.Color(255, 255, 255));
        lblVaccineCode.setText("Vaccine Code:");

        btnSearch.setBackground(new java.awt.Color(0, 0, 0));
        btnSearch.setFont(new java.awt.Font("October Compressed Devanagari", 1, 18)); // NOI18N
        btnSearch.setForeground(java.awt.Color.white);
        btnSearch.setText("Search");
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tblmanuf.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine Code", "Vaccine Name", "Brand", "Price", "Availability", "manufacture date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblmanuf);

        lblCart.setFont(new java.awt.Font("October Compressed Devanagari", 1, 18)); // NOI18N
        lblCart.setForeground(new java.awt.Color(255, 255, 255));
        lblCart.setText("Cart:");

        tbcart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine Code", "Vaccine Name", "Brand", "Price", "Quantity", "manufacture date", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbcart);

        lblQuantity.setFont(new java.awt.Font("October Compressed Devanagari", 0, 13)); // NOI18N
        lblQuantity.setForeground(new java.awt.Color(255, 255, 255));
        lblQuantity.setText("Quantity:");

        btnAddToCart.setBackground(new java.awt.Color(0, 0, 0));
        btnAddToCart.setFont(new java.awt.Font("October Compressed Devanagari", 1, 18)); // NOI18N
        btnAddToCart.setForeground(java.awt.Color.white);
        btnAddToCart.setText("Add to Cart");
        btnAddToCart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToCartActionPerformed(evt);
            }
        });

        btnModify.setBackground(new java.awt.Color(0, 0, 0));
        btnModify.setFont(new java.awt.Font("October Compressed Devanagari", 1, 18)); // NOI18N
        btnModify.setForeground(java.awt.Color.white);
        btnModify.setText("Modify");
        btnModify.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        lblQuantity1.setFont(new java.awt.Font("October Compressed Devanagari", 0, 13)); // NOI18N
        lblQuantity1.setForeground(new java.awt.Color(255, 255, 255));
        lblQuantity1.setText("Quantity:");

        btnCancelOrder.setBackground(new java.awt.Color(0, 0, 0));
        btnCancelOrder.setFont(new java.awt.Font("October Compressed Devanagari", 1, 18)); // NOI18N
        btnCancelOrder.setForeground(java.awt.Color.white);
        btnCancelOrder.setText("Cancel Order");
        btnCancelOrder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelOrderActionPerformed(evt);
            }
        });

        btnRemove.setBackground(new java.awt.Color(0, 0, 0));
        btnRemove.setFont(new java.awt.Font("October Compressed Devanagari", 1, 18)); // NOI18N
        btnRemove.setForeground(java.awt.Color.white);
        btnRemove.setText("Remove");
        btnRemove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnCheckOut.setBackground(new java.awt.Color(0, 0, 0));
        btnCheckOut.setFont(new java.awt.Font("October Compressed Devanagari", 1, 18)); // NOI18N
        btnCheckOut.setForeground(java.awt.Color.white);
        btnCheckOut.setText("Check Out");
        btnCheckOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckOutActionPerformed(evt);
            }
        });

        lblTotalAmount.setFont(new java.awt.Font("October Compressed Devanagari", 1, 18)); // NOI18N
        lblTotalAmount.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalAmount.setText("Total Amount:");

        txtTotalAmount.setEnabled(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/ICONS/11122021icons/cart1_50x50.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Separator1)
                            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCart)
                                .addGap(32, 32, 32)
                                .addComponent(lblQuantity1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnModify)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTotalAmount)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnRemove)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelOrder)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(lblQuantity)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(addcount, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAddToCart, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblDropdown)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(combo1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblVaccineCode)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtVaccineCode, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 176, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(252, 252, 252)
                                .addComponent(lblManufactureVaccineCatalog))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDropdown)
                    .addComponent(combo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVaccineCode)
                    .addComponent(txtVaccineCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblManufactureVaccineCatalog)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantity)
                    .addComponent(addcount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddToCart))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Separator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnModify)
                                .addComponent(lblQuantity1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblTotalAmount)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblCart)
                        .addGap(1, 1, 1)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCheckOut)
                    .addComponent(btnRemove)
                    .addComponent(btnCancelOrder))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToCartActionPerformed
        // TODO add your handling code here:
        int quantity = (Integer) addcount.getValue();

        int selectRow = tblmanuf.getSelectedRow();
        if (selectRow < 0) {
            JOptionPane.showMessageDialog(null, "Kindly first select a vaccine!");
            return;
        }
        VaccineDetails product = (VaccineDetails) tblmanuf.getValueAt(selectRow, 0);

        if (quantity <= 0 || quantity > product.getAvailablity()) {
            JOptionPane.showMessageDialog(null, "Incorect Quantity, Please enter it again !");
            return;
        }
 
        boolean flag = true;
       
        ArrayList<OrderItem> orders = cartOrder;
        for (OrderItem oi : orders) {
            if (oi.getVaccineDetails().equals(product)) {
                int oldQuantity = oi.getQuantity();
                int newQuantity = oldQuantity + quantity;
                oi.setQuantity(newQuantity);
                flag = false;
            }
        }
           
        
        if(flag==true)
        {OrderItem orderItem = new OrderItem();
        orderItem.setVaccineDetails(product);
        orderItem.setQuantity(quantity);
        cartOrder.add(orderItem);
        
        }
   
        String msg = Integer.toString(quantity) + " " + product.getVaccineDefinition().getVaccineName() + " has added to cart!";
        JOptionPane.showMessageDialog(null, msg);
        
        product.setAvailablity(product.getAvailablity()-quantity);
        
       displayManufacturerVaccines();
        refreshCartTable();
        calulateTotalAmountOfOrder();

    }//GEN-LAST:event_btnAddToCartActionPerformed
    
    private void calulateTotalAmountOfOrder(){
        
        if(cartOrder == null){
            return;
        }
        double totalAmount = 0;
        
        for(OrderItem oi: cartOrder)
        {
            totalAmount = totalAmount + oi.getQuantity()*oi.getVaccineDetails().getVaccinePrice();
            
        }
        
        txtTotalAmount.setText(String.valueOf(totalAmount));
      
    }
    
    
    
    
    
    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        // TODO add your handling code here:
        //
        int selectRow = tbcart.getSelectedRow();
        if (selectRow < 0) {
            JOptionPane.showMessageDialog(null, "Kindly first select a vaccine from the cart !");
            return;
        }
      
        OrderItem orderItem = (OrderItem) tbcart.getValueAt(selectRow, 1);
        
        int oldQuantity = orderItem.getQuantity();
        int oldAvail = orderItem.getVaccineDetails().getAvailablity();

        int newQuantity = Integer.parseInt(txtQuantity.getText());

        if (newQuantity <= 0 || newQuantity > oldQuantity + oldAvail) {
            JOptionPane.showMessageDialog(null, "Incorect Quantity, Please enter it again");
            return;
        }
        orderItem.setQuantity(newQuantity);
        String msg = "The quantity of " + orderItem.getVaccineDetails().getVaccineDefinition().getVaccineName() + " has changed from " + oldQuantity + " to " + newQuantity;
        JOptionPane.showMessageDialog(null, msg);
        orderItem.getVaccineDetails().setAvailablity(oldAvail + oldQuantity - newQuantity);

        displayManufacturerVaccines();
        refreshCartTable();

    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnCancelOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelOrderActionPerformed
        // TODO add your handling code here:
       
        if (!isCheckout) {

            for (OrderItem oi : cartOrder) {
                VaccineDetails product = oi.getVaccineDetails();
                int oldAvail = product.getAvailablity();
                int orderedQuantity = oi.getQuantity();
                int newAvail = oldAvail + orderedQuantity;
                product.setAvailablity(newAvail);
            }
            

            JOptionPane.showMessageDialog(null, "Order has not been checked out properly hence previous order will be canceled!");

        } else {
            JOptionPane.showMessageDialog(null, "Order has been checked out successfully, Thank you!");
        }
        workContainer.remove(this);
        CardLayout layout = (CardLayout) workContainer.getLayout();
        layout.previous(workContainer);

    }//GEN-LAST:event_btnCancelOrderActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
        int selectRow = tbcart.getSelectedRow();
        if (selectRow < 0) {
            JOptionPane.showMessageDialog(null, "Kindly first select a vaccine from the cart !");
            return;
        }
        OrderItem oi = (OrderItem) tbcart.getValueAt(selectRow, 1);
        int oldQuantity = oi.getVaccineDetails().getAvailablity();
        int orderedQuantity = oi.getQuantity();
        int newQuantity = orderedQuantity + oldQuantity;
        oi.getVaccineDetails().setAvailablity(newQuantity);
        cartOrder.remove(oi);
        
        displayManufacturerVaccines();
        refreshCartTable();

    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckOutActionPerformed
        // TODO add your handling code here:
        if (cartOrder != null) 
            {
     
                Order cdcOrder = new Order();
                
                for(OrderItem oi: cartOrder)
                {
                    cdcOrder.getItemList().add(oi);
                }
                
                for(OrderItem oi: cartOrder)
                {
                    String manufacturer = oi.getVaccineDetails().getManufacturerName();
                    for(Manufacturer manuf : business.getManufacturerDirectory().getManufacturerDirectory())
                    {
                        if(manufacturer.equalsIgnoreCase(String.valueOf(manuf)))
                        {   
                          
                                OrderVaccineWorkRequest vaccineWorkRequest = new OrderVaccineWorkRequest();
                                vaccineWorkRequest.setSender(userAccount);
                                vaccineWorkRequest.setStatus("NewOrder");
                                Order order = new Order();
                                order.addNewOrderItem(oi.getQuantity(), oi.getVaccineDetails());
                                vaccineWorkRequest.setVaccineOrder(order);
                               
                            for(Organization org:manuf.getOrganizationDirectory().getOrganizationList() )
                            {
                                if(org instanceof ManufactureOrganization)
                                {
                                    org.getWorkQueue().addWorkRequest(vaccineWorkRequest);
                                }
                            }
                        }
                    }
                }
                
                JOptionPane.showMessageDialog(null, "Your order has been successfuly added!");
                
                CDCVaccineOrderCreation panel = new CDCVaccineOrderCreation(workContainer, cdc, business, cdcOrg,userAccount);
        workContainer.add("CreateVaccineOrderJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
            
        }
        else
        {JOptionPane.showMessageDialog(null, "Cannot Checkout due to error !");
        }
        displayManufacturerVaccines();
        refreshCartTable();
                
        
    }//GEN-LAST:event_btnCheckOutActionPerformed

    private void combo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo1ActionPerformed
        // TODO add your handling code here:
        displayManufacturerVaccines();
    }//GEN-LAST:event_combo1ActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        
        String vaccineCode = txtVaccineCode.getText();
        searchVaccineProducts(vaccineCode);
        
        
    }//GEN-LAST:event_btnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator Separator1;
    private javax.swing.JSpinner addcount;
    private javax.swing.JButton btnAddToCart;
    private javax.swing.JButton btnCancelOrder;
    private javax.swing.JButton btnCheckOut;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox combo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCart;
    private javax.swing.JLabel lblDropdown;
    private javax.swing.JLabel lblManufactureVaccineCatalog;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblQuantity1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTotalAmount;
    private javax.swing.JLabel lblVaccineCode;
    private javax.swing.JTable tbcart;
    private javax.swing.JTable tblmanuf;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtTotalAmount;
    private javax.swing.JTextField txtVaccineCode;
    // End of variables declaration//GEN-END:variables
}
