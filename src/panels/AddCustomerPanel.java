/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels;

import Database.AddCustomerData;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import sedra.Colors;
import sedra.SedraUI;
import static sedra.SedraUI.height;
import static sedra.SedraUI.width;

/**
 *
 * @author mohammed
 */
public class AddCustomerPanel extends javax.swing.JPanel {

    /**
     * Creates new form LoginPanel
     */
    public AddCustomerPanel() {
        initComponents();
        setBounds(0, 0, 3 * width / 4, height);
        setSize(new Dimension(3 * width / 4, height));
        loginPane.setBounds(0, 0, 3 * width / 4, height);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPane = new javax.swing.JPanel();
        signupMailField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        signupButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        signupNameField = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        signupAddressField = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        signupPhonefield = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        signupTypeCombo = new javax.swing.JComboBox<>();

        loginPane.setBackground(Colors.PANELS_COLOR);
        loginPane.setForeground(new java.awt.Color(204, 204, 204));

        signupMailField.setBackground(Colors.FIELDS_COLOR);
        signupMailField.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        signupMailField.setForeground(Colors.LABELS_COLOR);
        signupMailField.setText("Email");
        signupMailField.setAlignmentX(5.0F);
        signupMailField.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        signupMailField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                signupMailFieldFocusGained(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(45, 33, 89));
        jSeparator1.setForeground(new java.awt.Color(45, 33, 89));

        jSeparator2.setBackground(new java.awt.Color(45, 33, 89));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-Email Filled_50.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-Name_50.png"))); // NOI18N

        signupButton.setBackground(Colors.SIDE_COLOR);
        signupButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        signupButton.setForeground(new java.awt.Color(204, 204, 204));
        signupButton.setText("Sign up");
        signupButton.setBorder(null);
        signupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupButtonActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(45, 33, 89));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel3.setForeground(Colors.LABELS_COLOR);
        jLabel3.setText("Add Customer");

        signupNameField.setBackground(Colors.FIELDS_COLOR);
        signupNameField.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        signupNameField.setForeground(Colors.LABELS_COLOR);
        signupNameField.setText("Name");
        signupNameField.setAlignmentX(5.0F);
        signupNameField.setBorder(null);
        signupNameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                signupNameFieldFocusGained(evt);
            }
        });

        jSeparator3.setBackground(new java.awt.Color(45, 33, 89));

        signupAddressField.setBackground(Colors.FIELDS_COLOR);
        signupAddressField.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        signupAddressField.setForeground(Colors.LABELS_COLOR);
        signupAddressField.setText("Address");
        signupAddressField.setAlignmentX(5.0F);
        signupAddressField.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        signupAddressField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                signupAddressFieldFocusGained(evt);
            }
        });

        jSeparator4.setBackground(new java.awt.Color(45, 33, 89));
        jSeparator4.setForeground(new java.awt.Color(45, 33, 89));

        signupPhonefield.setBackground(Colors.FIELDS_COLOR);
        signupPhonefield.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        signupPhonefield.setForeground(Colors.LABELS_COLOR);
        signupPhonefield.setText("Phone");
        signupPhonefield.setAlignmentX(5.0F);
        signupPhonefield.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        signupPhonefield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                signupPhonefieldFocusGained(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-Phone_50.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-Address_50.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-Type_50.png"))); // NOI18N

        signupTypeCombo.setBackground(Colors.FIELDS_COLOR);
        signupTypeCombo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        signupTypeCombo.setForeground(Colors.LABELS_COLOR);
        signupTypeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type", "Doctor", "Customer" }));

        javax.swing.GroupLayout loginPaneLayout = new javax.swing.GroupLayout(loginPane);
        loginPane.setLayout(loginPaneLayout);
        loginPaneLayout.setHorizontalGroup(
            loginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPaneLayout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addGroup(loginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(loginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(loginPaneLayout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(signupPhonefield, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPaneLayout.createSequentialGroup()
                            .addGroup(loginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(loginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator3)
                                .addComponent(jSeparator4)
                                .addComponent(signupAddressField)
                                .addComponent(signupButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(signupTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(loginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, loginPaneLayout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(loginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(loginPaneLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(signupNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(loginPaneLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(loginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator2)
                                    .addComponent(jSeparator1)
                                    .addComponent(signupMailField, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        loginPaneLayout.setVerticalGroup(
            loginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPaneLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(loginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signupNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(loginPaneLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(signupMailField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signupPhonefield, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(loginPaneLayout.createSequentialGroup()
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(signupAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(loginPaneLayout.createSequentialGroup()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(signupTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addGap(29, 29, 29)
                .addComponent(signupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void signupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupButtonActionPerformed
        // TODO add your handling code here:

        AddCustomerData addCustomerData = new AddCustomerData();
        addCustomerData.setUsername(signupNameField.getText().toLowerCase());
        addCustomerData.setEmail(signupMailField.getText().toLowerCase().replace("email", ""));
        addCustomerData.setPhone(signupPhonefield.getText().toLowerCase().replace("phone", ""));
        addCustomerData.setAddress(signupAddressField.getText().toLowerCase().replace("address", ""));
        addCustomerData.setType(signupTypeCombo.getSelectedItem().toString());
        addCustomerData.execute();
        Colors.setColor(SedraUI.homePane);
        Colors.resetColor(SedraUI.salesPane);
        Colors.resetColor(SedraUI.accountPane);
        Colors.resetColor(SedraUI.customerPane1);
        Colors.resetColor(SedraUI.loginPane);
        Colors.resetColor(SedraUI.updatePane);
        SedraUI.accountPanel.setVisible(false);
        SedraUI.addCustomerPanel.setVisible(false);
        SedraUI.loginPanel.setVisible(false);

        SedraUI.homePanel.setVisible(true);


    }//GEN-LAST:event_signupButtonActionPerformed

    private void signupMailFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_signupMailFieldFocusGained
        // TODO add your handling code here:
        signupMailField.setText("");
    }//GEN-LAST:event_signupMailFieldFocusGained

    private void signupNameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_signupNameFieldFocusGained
        // TODO add your handling code here:
        signupNameField.setText("");

    }//GEN-LAST:event_signupNameFieldFocusGained

    private void signupAddressFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_signupAddressFieldFocusGained
        // TODO add your handling code here:
        signupAddressField.setText("");

    }//GEN-LAST:event_signupAddressFieldFocusGained

    private void signupPhonefieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_signupPhonefieldFocusGained
        // TODO add your handling code here:
        signupPhonefield.setText("");
    }//GEN-LAST:event_signupPhonefieldFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPanel loginPane;
    private javax.swing.JTextField signupAddressField;
    private javax.swing.JButton signupButton;
    private javax.swing.JTextField signupMailField;
    private javax.swing.JTextField signupNameField;
    private javax.swing.JTextField signupPhonefield;
    private javax.swing.JComboBox<String> signupTypeCombo;
    // End of variables declaration//GEN-END:variables
}
