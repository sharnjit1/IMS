package inventorymanagementsystem;

import java.awt.Point;
import javax.swing.BoxLayout;
import javax.swing.JOptionPane;


/**
 *
 * @author Mike & Nate
 * Most of this was done with NetBeans' Java GUI editor.
 * Icons used are from https://www.iconfinder.com/search/?q=iconset:linecons-free-vector-icons-pack
 * We'll need to include credit as specified by the Creative Commons license on that page if we use
 *  these in the final product.
 * The search icon was resized to 16x16 pixels.
 */
public class IMSGUI extends javax.swing.JFrame {
    /**
     * Creates new form IMSGUI
     */
    private IMSController controller;
    public IMSGUI() {
        initComponents();
        updateCategoriesFromDB();
    }
    public void updateCategoriesFromDB(){
        inventoryList.setListData(IMSController.db.getCategoryList("category", "Inventory").toArray());
        vendorList.setListData(IMSController.db.getCategoryList("name","Vendors").toArray());
        salesList.setListData(new Object[0]);
    }
    /**
     * This method allows us to choose the controller to display.
     * 
     * It clears the controllerDisplay JPanel, makes sure it's using the
     * correct layout, and then adds the controller to it.
     * 
     * @param newController The controller to display
     */
    public void setController(IMSController newController){
        controller = null;
        controller = newController;
        controllerDisplay.removeAll();
        controllerDisplay.setLayout(new BoxLayout(controllerDisplay,BoxLayout.X_AXIS));
        controllerDisplay.add(newController);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logMenu = new javax.swing.JDialog();
        userField = new java.awt.TextField();
        passwordField = new java.awt.TextField();
        logOKButton = new javax.swing.JButton();
        logCancelButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        userDisplay = new javax.swing.JLabel();
        categoryPane = new javax.swing.JTabbedPane();
        inventoryPane = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        inventoryList = new javax.swing.JList();
        vendorPane = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        vendorList = new javax.swing.JList();
        salesPane = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        salesList = new javax.swing.JList();
        controllerDisplay = new javax.swing.JPanel();
        logInButton = new javax.swing.JButton();

        logMenu.setAlwaysOnTop(true);

        userField.setForeground(java.awt.Color.BLACK);
        userField.setName("usernameField"); // NOI18N

        passwordField.setEchoChar('\u2022');
        passwordField.setForeground(java.awt.Color.BLACK);
        passwordField.setName("passwordField"); // NOI18N

        logOKButton.setText("OK");
        logOKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOKButtonActionPerformed(evt);
            }
        });

        logCancelButton.setText("Cancel");
        logCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logCancelButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("User name:");

        jLabel4.setText("Password:");

        javax.swing.GroupLayout logMenuLayout = new javax.swing.GroupLayout(logMenu.getContentPane());
        logMenu.getContentPane().setLayout(logMenuLayout);
        logMenuLayout.setHorizontalGroup(
            logMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(logMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(logOKButton)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(logMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logMenuLayout.createSequentialGroup()
                        .addGap(0, 72, Short.MAX_VALUE)
                        .addComponent(logCancelButton))
                    .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        logMenuLayout.setVerticalGroup(
            logMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(logMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(logMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(logMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logOKButton)
                    .addComponent(logCancelButton))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventorymanagementsystem/Images/TOESLogo.png"))); // NOI18N

        jTextField1.setText("Search");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventorymanagementsystem/Images/search.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        userDisplay.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        userDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userDisplay.setText("Please Log in!");

        categoryPane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                categoryPaneStateChanged(evt);
            }
        });

        inventoryList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Error loading database..." };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        inventoryList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        inventoryList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                inventoryListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(inventoryList);

        javax.swing.GroupLayout inventoryPaneLayout = new javax.swing.GroupLayout(inventoryPane);
        inventoryPane.setLayout(inventoryPaneLayout);
        inventoryPaneLayout.setHorizontalGroup(
            inventoryPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 168, Short.MAX_VALUE)
            .addGroup(inventoryPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(inventoryPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        inventoryPaneLayout.setVerticalGroup(
            inventoryPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 297, Short.MAX_VALUE)
            .addGroup(inventoryPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(inventoryPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        categoryPane.addTab("Inventory", inventoryPane);

        vendorList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Error loading database..." };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        vendorList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                vendorListValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(vendorList);

        javax.swing.GroupLayout vendorPaneLayout = new javax.swing.GroupLayout(vendorPane);
        vendorPane.setLayout(vendorPaneLayout);
        vendorPaneLayout.setHorizontalGroup(
            vendorPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 168, Short.MAX_VALUE)
            .addGroup(vendorPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(vendorPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        vendorPaneLayout.setVerticalGroup(
            vendorPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 297, Short.MAX_VALUE)
            .addGroup(vendorPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(vendorPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        categoryPane.addTab("Vendors", vendorPane);

        salesList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Error loading database..." };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(salesList);

        javax.swing.GroupLayout salesPaneLayout = new javax.swing.GroupLayout(salesPane);
        salesPane.setLayout(salesPaneLayout);
        salesPaneLayout.setHorizontalGroup(
            salesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 168, Short.MAX_VALUE)
            .addGroup(salesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(salesPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        salesPaneLayout.setVerticalGroup(
            salesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 297, Short.MAX_VALUE)
            .addGroup(salesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(salesPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        categoryPane.addTab("Royalties", salesPane);

        javax.swing.GroupLayout controllerDisplayLayout = new javax.swing.GroupLayout(controllerDisplay);
        controllerDisplay.setLayout(controllerDisplayLayout);
        controllerDisplayLayout.setHorizontalGroup(
            controllerDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 647, Short.MAX_VALUE)
        );
        controllerDisplayLayout.setVerticalGroup(
            controllerDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        logInButton.setText("Log in");
        logInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(categoryPane))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(logInButton))
                    .addComponent(controllerDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(categoryPane))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userDisplay)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(logInButton))
                        .addGap(18, 18, 18)
                        .addComponent(controllerDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        controllerDisplay.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void logOKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOKButtonActionPerformed
        if (passwordField.getText().equals(IMSController.db.checkCredentials(userField.getText()))) {
            logIn(userField.getText());
            logMenu.setVisible(false);
        } else {
            logMenu.setVisible(false);
            JOptionPane.showMessageDialog(this, "Invalid login!", "Error", JOptionPane.OK_OPTION);
            logMenu.setVisible(true);
        }
    }//GEN-LAST:event_logOKButtonActionPerformed

    private void logCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logCancelButtonActionPerformed
        logMenu.setVisible(false);
    }//GEN-LAST:event_logCancelButtonActionPerformed

    private void inventoryListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_inventoryListValueChanged
        try{
            //this.setController(InventoryManagementSystem.getInventoryController());
            this.setController(new InventoryController(controllerDisplay));
            controller.filterByCategory(inventoryList.getSelectedValue().toString());
            vendorList.clearSelection();
        }catch(NullPointerException npe){
            // It was set to null by a different function.
            // Nothing has been selected, so we won't show anything.
        }
    }//GEN-LAST:event_inventoryListValueChanged

    private void vendorListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_vendorListValueChanged
        try{
            //this.setController(InventoryManagementSystem.getVendorController());
            this.setController(new VendorController(controllerDisplay));
            controller.filterByCategory(vendorList.getSelectedValue().toString());
            inventoryList.clearSelection();
        }catch(NullPointerException npe){
            // It was set to null by a different function.
            // Nothing has been selected, so we won't show anything.
        }
    }//GEN-LAST:event_vendorListValueChanged

    private void categoryPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_categoryPaneStateChanged
        if(categoryPane.getSelectedComponent()==salesPane){
            inventoryList.clearSelection();
            vendorList.clearSelection();
            this.setController(new RoyaltiesController(controllerDisplay));
            controller.filterByCategory("name");
        }
    }//GEN-LAST:event_categoryPaneStateChanged

    private void logInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInButtonActionPerformed
        // TODO add your handling code here:
         if(IMSController.loggedIn){
            logOut();
        }else{
            Point p = this.getRootPane().getLocationOnScreen();
            passwordField.setText(null);
            logMenu.getRootPane().setDefaultButton(logOKButton);
            logMenu.setLocation(p.x+this.getRootPane().getWidth()/2-logMenu.getWidth()/2, p.y+this.getRootPane().getHeight()/2-logMenu.getHeight()/2);
            logMenu.pack();
            logMenu.setVisible(true);
        }
    }//GEN-LAST:event_logInButtonActionPerformed

    private void logIn(String user){
        IMSController.logIn(user);
        logInButton.setText("Log out");
        userDisplay.setText("Hello, "+IMSController.activeUser+"!");
    }
    
    private void logOut(){
        IMSController.logOut();
        logInButton.setText("Log in");
        userDisplay.setText("Please Log in!");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane categoryPane;
    private javax.swing.JPanel controllerDisplay;
    private javax.swing.JList inventoryList;
    private javax.swing.JPanel inventoryPane;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton logCancelButton;
    private javax.swing.JButton logInButton;
    private javax.swing.JDialog logMenu;
    private javax.swing.JButton logOKButton;
    private java.awt.TextField passwordField;
    private javax.swing.JList salesList;
    private javax.swing.JPanel salesPane;
    private javax.swing.JLabel userDisplay;
    private java.awt.TextField userField;
    private javax.swing.JList vendorList;
    private javax.swing.JPanel vendorPane;
    // End of variables declaration//GEN-END:variables
}
