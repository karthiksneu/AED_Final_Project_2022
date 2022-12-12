/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Clinic;

import TheBusiness.Ecosystems;
import TheBusiness.Enterprise.HospitalEnterprise;
import TheBusiness.NationalEnterprise.Manufacturer;
import TheBusiness.Network.StateNetwork;
import TheBusiness.OrderManagement.Order;
import TheBusiness.OrderManagement.OrderItem;
import TheBusiness.Organization.HospitalOrganization;
import TheBusiness.Organization.ManufactureOrganization;
import TheBusiness.Organization.Organization;
import TheBusiness.Organization.ClinicOrganization;
import TheBusiness.UserAccountManagement.UserAccount;
import TheBusiness.VaccineManagement.VaccineDetails;
import TheBusiness.WorkOrderQueue.ProviderOrderRequest;

import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author karthik
 */
public class ClinicPlaceOrders extends javax.swing.JPanel {

    private JPanel workContainer;

    private HospitalEnterprise hospital;
    private UserAccount userAccount;
    private ClinicOrganization clinicOrg;
    private Ecosystems business;
    private Order tempOrder;
    private ArrayList<OrderItem> cartOrder;
    private boolean isCheckout;
    private StateNetwork state;

    public ClinicPlaceOrders(JPanel workContainer, HospitalEnterprise hospital,ClinicOrganization clinicOrg,UserAccount userAccount , Ecosystems business, StateNetwork state) {
        initComponents();
        this.workContainer = workContainer;
        this.userAccount = userAccount;
        this.hospital = hospital;
        this.business = business;
        this.state = state;
        populateManufacturerComboBox();
        this.isCheckout = false;
        
         cartOrder = new ArrayList<OrderItem>();
         
         if(isCheckout == false){
             tempOrder = new Order();
         }
   
    }

    private void populateManufacturerComboBox() {
        cbmanu.removeAllItems();
        for (Manufacturer manufacturer : business.getManufacturerDirectory().getManufacturerDirectory()) {
            cbmanu.addItem(manufacturer);

        }
    }
    
    private void displayManufacturerVaccines(){
        
        int rowCount = tblvacc.getRowCount();
        DefaultTableModel defaulttabelmodel = (DefaultTableModel)tblvacc.getModel();
        
        for(int i=rowCount-1 ; i>=0; i--){
            defaulttabelmodel.removeRow(i);
        }
        
        
        //get Manufacturer from combo box
        Manufacturer manufacturer = (Manufacturer)cbmanu.getSelectedItem();
        if(manufacturer == null){
            return;
        }
        
        //populate the table
        ManufactureOrganization manufacureOrg = null;
        for(Organization org : manufacturer.getOrganizationDirectory().getOrganizationList())
        {   if(org instanceof ManufactureOrganization)
        {   manufacureOrg = (ManufactureOrganization)org;
            for(VaccineDetails vaccine : manufacureOrg.getVaccineProductCatalog().getVaccineProductList())
            {Object[] row = new Object[6];
            row[0] = vaccine;
            row[1] = vaccine.getVaccineDefinition().getVaccineName();
            row[2] = vaccine.getVaccineId();
            row[3] = vaccine.getBatchId();
            row[4] = vaccine.getVaccinePrice();
            row[5] = vaccine.getManufactureDate();
            defaulttabelmodel.addRow(row);
            }
        }
        }
   
    }
    
    
    private void searchVaccineProducts(String vaccineCode){
        
        int rowCount = tblvacc.getRowCount();
        DefaultTableModel defaulttabelmodel = (DefaultTableModel)tblvacc.getModel();
        
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
                row[2] = vaccine.getVaccineId();
                row[3] = vaccine.getBatchId();
                row[4] = vaccine.getVaccinePrice();
                row[5] = vaccine.getManufactureDate();
                
                defaulttabelmodel.addRow(row);
                }
            }
        }
            
        }
            
            
        }
        
   
    }
    
    
    private void refreshCartTable(){
        
          int rowCount = tblcart.getRowCount();
        DefaultTableModel defaulttabelmodel = (DefaultTableModel)tblcart.getModel();
        
        for(int i=rowCount-1 ; i>=0; i--){
            defaulttabelmodel.removeRow(i);
        }
        
        
        for(OrderItem oi: tempOrder.getItemList())
        {
            Object[] row = new Object[8];
            
                row[0] = oi.getVaccineDetails();
                row[1] = oi;
                row[2] = oi.getVaccineDetails().getVaccineId();
                row[3] = oi.getVaccineDetails().getBatchId();
                row[4] = oi.getVaccineDetails().getVaccinePrice();
                row[5] = oi.getQuantity();
                row[6] = oi.getVaccineDetails().getManufactureDate();
                row[7] = oi.getVaccineDetails().getVaccinePrice()*oi.getQuantity();
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblCreateVaccineOrder = new javax.swing.JLabel();
        lblManufacturer = new javax.swing.JLabel();
        cbmanu = new javax.swing.JComboBox();
        lblManufacturerVaccineCatalog = new javax.swing.JLabel();
        lblSearchVaccine = new javax.swing.JLabel();
        lblVaccineCode = new javax.swing.JLabel();
        txtVaccineCode = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblvacc = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        lblCart = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblcart = new javax.swing.JTable();
        lblQuantity = new javax.swing.JLabel();
        spvacccount = new javax.swing.JSpinner();
        btnAddToCart = new javax.swing.JButton();
        txtQuantity = new javax.swing.JTextField();
        btnModify = new javax.swing.JButton();
        lblQuantity1 = new javax.swing.JLabel();
        btnRemove = new javax.swing.JButton();
        btnCheckout = new javax.swing.JButton();
        lblTotalAmountOfOrder = new javax.swing.JLabel();
        txtTotalAmountOfOrder = new javax.swing.JTextField();
        lblSetContract = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cbordertype = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(0, 204, 204));

        lblCreateVaccineOrder.setFont(new java.awt.Font("October Compressed Devanagari", 1, 24)); // NOI18N
        lblCreateVaccineOrder.setForeground(new java.awt.Color(255, 255, 255));
        lblCreateVaccineOrder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreateVaccineOrder.setText("Create Vaccine Order");

        lblManufacturer.setFont(new java.awt.Font("October Compressed Devanagari", 1, 14)); // NOI18N
        lblManufacturer.setForeground(new java.awt.Color(255, 255, 255));
        lblManufacturer.setText("Manufacturer:");

        cbmanu.setForeground(new java.awt.Color(0, 0, 102));
        cbmanu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbmanu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmanuActionPerformed(evt);
            }
        });

        lblManufacturerVaccineCatalog.setFont(new java.awt.Font("October Compressed Devanagari", 1, 18)); // NOI18N
        lblManufacturerVaccineCatalog.setForeground(new java.awt.Color(255, 255, 255));
        lblManufacturerVaccineCatalog.setText("Manufacturer Vaccine Catalog:");

        lblSearchVaccine.setFont(new java.awt.Font("October Compressed Devanagari", 0, 13)); // NOI18N
        lblSearchVaccine.setForeground(new java.awt.Color(255, 255, 255));
        lblSearchVaccine.setText("Search Vaccine:");

        lblVaccineCode.setFont(new java.awt.Font("October Compressed Devanagari", 0, 13)); // NOI18N
        lblVaccineCode.setForeground(new java.awt.Color(255, 255, 255));
        lblVaccineCode.setText("Vaccine Code:");

        txtVaccineCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVaccineCodeActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(0, 0, 0));
        btnSearch.setFont(new java.awt.Font("October Compressed Devanagari", 1, 18)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tblvacc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine Code", "Vaccine Name", "Vaccine id", "Lot Number", "Price", "manufacture date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblvacc.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblvacc);

        lblCart.setFont(new java.awt.Font("October Compressed Devanagari", 1, 18)); // NOI18N
        lblCart.setForeground(new java.awt.Color(255, 255, 255));
        lblCart.setText("Cart:");

        tblcart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine Code", "Vaccine Name", "Vaccine id", "Lot Number", "Price", "Quantity", "manufacture date", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblcart);

        lblQuantity.setFont(new java.awt.Font("October Compressed Devanagari", 0, 13)); // NOI18N
        lblQuantity.setForeground(new java.awt.Color(255, 255, 255));
        lblQuantity.setText("Quantity:");

        btnAddToCart.setBackground(new java.awt.Color(0, 0, 0));
        btnAddToCart.setFont(new java.awt.Font("October Compressed Devanagari", 1, 18)); // NOI18N
        btnAddToCart.setForeground(new java.awt.Color(255, 255, 255));
        btnAddToCart.setText("Add to Cart");
        btnAddToCart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToCartActionPerformed(evt);
            }
        });

        btnModify.setBackground(new java.awt.Color(0, 0, 0));
        btnModify.setFont(new java.awt.Font("October Compressed Devanagari", 1, 18)); // NOI18N
        btnModify.setForeground(new java.awt.Color(255, 255, 255));
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

        btnRemove.setBackground(new java.awt.Color(0, 0, 0));
        btnRemove.setFont(new java.awt.Font("October Compressed Devanagari", 1, 18)); // NOI18N
        btnRemove.setForeground(new java.awt.Color(255, 255, 255));
        btnRemove.setText("Remove");
        btnRemove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnCheckout.setBackground(new java.awt.Color(0, 0, 0));
        btnCheckout.setFont(new java.awt.Font("October Compressed Devanagari", 1, 18)); // NOI18N
        btnCheckout.setForeground(new java.awt.Color(255, 255, 255));
        btnCheckout.setText("Check Out");
        btnCheckout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckoutActionPerformed(evt);
            }
        });

        lblTotalAmountOfOrder.setFont(new java.awt.Font("October Compressed Devanagari", 1, 14)); // NOI18N
        lblTotalAmountOfOrder.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalAmountOfOrder.setText("Total Amount of Order:");

        txtTotalAmountOfOrder.setEnabled(false);

        lblSetContract.setFont(new java.awt.Font("October Compressed Devanagari", 0, 13)); // NOI18N
        lblSetContract.setForeground(new java.awt.Color(255, 255, 255));
        lblSetContract.setText("Set Contract: ");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/ICONS/11122021icons/cart1_50x50.png"))); // NOI18N

        cbordertype.setBackground(new java.awt.Color(0, 0, 0));
        cbordertype.setForeground(new java.awt.Color(255, 255, 255));
        cbordertype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AsRequired", "Monthly", "Bi-Monthly" }));
        cbordertype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbordertypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(lblCreateVaccineOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRemove)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSetContract)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbordertype, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblQuantity)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spvacccount, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAddToCart, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblManufacturer)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbmanu, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblManufacturerVaccineCatalog))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSearchVaccine)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblVaccineCode)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtVaccineCode, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSearch))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCart)
                                .addGap(117, 117, 117)
                                .addComponent(lblQuantity1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnModify)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTotalAmountOfOrder)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTotalAmountOfOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 114, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCreateVaccineOrder)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblVaccineCode)
                            .addComponent(txtVaccineCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblManufacturer)
                            .addComponent(cbmanu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSearchVaccine))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblManufacturerVaccineCatalog)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(spvacccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAddToCart))
                    .addComponent(lblQuantity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModify)
                            .addComponent(lblQuantity1)
                            .addComponent(lblTotalAmountOfOrder)
                            .addComponent(txtTotalAmountOfOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblCart)
                        .addGap(3, 3, 3)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCheckout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbordertype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRemove)
                            .addComponent(lblSetContract))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToCartActionPerformed
        // TODO add your handling code here:
        int quantity = (Integer) spvacccount.getValue();

        int selectRow = tblvacc.getSelectedRow();
        if (selectRow < 0) {
            JOptionPane.showMessageDialog(null, "Kindly select a Vaccine First!");
            return;
        }
        VaccineDetails product = (VaccineDetails) tblvacc.getValueAt(selectRow, 0);
        
        
        //condition for -ve 
        if (quantity <= 0 ) {
            JOptionPane.showMessageDialog(null, "Incorrect Quantity, Please enter it again !");
            return;
        }
  
        boolean flag = true;
        ArrayList<OrderItem> orders = tempOrder.getItemList();
        for (OrderItem oi : orders) {
            if (oi.getVaccineDetails().equals(product)) {
                int oldQuantity = oi.getQuantity();
                int newQuantity = oldQuantity + quantity;
                oi.setQuantity(newQuantity);
                flag = false;
            }
        }
     
        if(flag){
        OrderItem orderItem = tempOrder.addNewOrderItem(quantity, product);
        }
         
        isCheckout = false;
        String msg = Integer.toString(quantity) + " " + product.getVaccineDefinition().getVaccineName() + " has added to cart!";
        JOptionPane.showMessageDialog(null, msg);
  
       displayManufacturerVaccines();
        refreshCartTable();
        calulateTotalAmountOfOrder();

    }//GEN-LAST:event_btnAddToCartActionPerformed
    
    private void calulateTotalAmountOfOrder(){
        
        if(tempOrder == null){
            return;
        }
        double totalAmount = 0;
        
        for(OrderItem oi: tempOrder.getItemList())
        {
            totalAmount = totalAmount + oi.getQuantity()*oi.getVaccineDetails().getVaccinePrice();
            
        }
        
        txtTotalAmountOfOrder.setText(String.valueOf(totalAmount));
        
        
    }
    
    
    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        // TODO add your handling code here:
        //
        int selectRow = tblcart.getSelectedRow();
        if (selectRow < 0) {
            JOptionPane.showMessageDialog(null, "Kindly select a vaccine first from cart!");
            return;
        }

        OrderItem orderItem = (OrderItem) tblcart.getValueAt(selectRow, 1);
        int oldQuantity = orderItem.getQuantity();
        int newQuantity = Integer.parseInt(txtQuantity.getText());
        
        
        orderItem.setQuantity(newQuantity);
        String msg = "The quantity of " + orderItem.getVaccineDetails().getVaccineDefinition().getVaccineName() + " has changed from " + oldQuantity + " to " + newQuantity;
        JOptionPane.showMessageDialog(null, msg);
        
        displayManufacturerVaccines();
        refreshCartTable();

    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
        int selectRow = tblcart.getSelectedRow();
        if (selectRow < 0) {
            JOptionPane.showMessageDialog(null, "Kindly select a Vaccine First!");
            return;
        }
        OrderItem oi = (OrderItem) tblcart.getValueAt(selectRow, 1);
       
        
        tempOrder.removeOrderItem(oi);
        

        displayManufacturerVaccines();
        refreshCartTable();

    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnCheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckoutActionPerformed
        // TODO add your handling code here:

        if (!tempOrder.getItemList().isEmpty()) 
            {   boolean adhoc = false;
                boolean bimonth = false;
                boolean monthly = false;
                String s = (String) cbordertype.getSelectedItem();
            
            if(s.equals("AsRequired"))
            {
                adhoc = true;
                bimonth = false;
                monthly = false;
            }
            if(s.equals("Monthly"))
            {
                adhoc = false;
                bimonth = false;
                monthly = true;
            }
            if(s.equals("Bi-Monthly"))
            {
                adhoc = false;
                bimonth = true;
                monthly = false;
            }
    
              
                Order o = hospital.getOrderCatalog().addNewOrder();
                o=tempOrder;
                
                ProviderOrderRequest workRequest = new ProviderOrderRequest();
                workRequest.setasReq(adhoc);
                workRequest.setHalfmonthContract(bimonth);
                workRequest.setfullMonthContract(monthly);
                workRequest.setVaccineOrder(tempOrder);
                workRequest.setSender(userAccount);
                workRequest.setStatus("New Order");
                workRequest.calculateDeliveryDate(workRequest);
                workRequest.setEnterprise(hospital);
                workRequest.setClinicOrganization(clinicOrg);
                workRequest.setClinicOrder(true);
                
                for(Organization org: hospital.getOrganizationDirectory().getOrganizationList())
                {
                    if(org instanceof HospitalOrganization)
                    {
                        HospitalOrganization hosOrg = (HospitalOrganization)org;
                        hosOrg.getWorkQueue().addWorkRequest(workRequest);
                    }
                }
  
                JOptionPane.showMessageDialog(null, "Order has been successfuly added!");
            
        }
        else
        {JOptionPane.showMessageDialog(null, "Cannot checkout due to error !");
        }
        
        isCheckout = true;
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(null, "Would you like to add another order ?", "Warning", dialogButton);

        //if yes
        if (dialogResult == JOptionPane.YES_OPTION) {
            tempOrder = new Order(); 

        }
       
        displayManufacturerVaccines();
        refreshCartTable();
        
        ClinicPlaceOrders panel = new ClinicPlaceOrders(workContainer, hospital,clinicOrg , userAccount, business, state);
        workContainer.add("PlaceVaccineOrderJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);        
        
        
    }//GEN-LAST:event_btnCheckoutActionPerformed

    private void cbmanuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmanuActionPerformed
        // TODO add your handling code here:

        displayManufacturerVaccines();
    }//GEN-LAST:event_cbmanuActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        
        String vaccineCode = txtVaccineCode.getText();
        searchVaccineProducts(vaccineCode);
        
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void cbordertypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbordertypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbordertypeActionPerformed

    private void txtVaccineCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVaccineCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVaccineCodeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToCart;
    private javax.swing.JButton btnCheckout;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSearch;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbmanu;
    private javax.swing.JComboBox cbordertype;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCart;
    private javax.swing.JLabel lblCreateVaccineOrder;
    private javax.swing.JLabel lblManufacturer;
    private javax.swing.JLabel lblManufacturerVaccineCatalog;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblQuantity1;
    private javax.swing.JLabel lblSearchVaccine;
    private javax.swing.JLabel lblSetContract;
    private javax.swing.JLabel lblTotalAmountOfOrder;
    private javax.swing.JLabel lblVaccineCode;
    private javax.swing.JSpinner spvacccount;
    private javax.swing.JTable tblcart;
    private javax.swing.JTable tblvacc;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtTotalAmountOfOrder;
    private javax.swing.JTextField txtVaccineCode;
    // End of variables declaration//GEN-END:variables
}
