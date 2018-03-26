/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sedra;

import Database.Connect;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import panels.AccountPanel;
import panels.AddCustomerPanel;
import panels.HomePanel;
import panels.LoginPanel;
import panels.MafqoodPanel;
import panels.ManagePanel;
import panels.NewPanel;
import panels.ReceiptPanel;
import panels.UpdatePanel;

/**
 *
 * @author mohammed
 */
public class SedraUI extends javax.swing.JFrame {

    /**
     * Creates new form SedraUI
     */
    GridBagConstraints c;
    public static HomePanel homePanel;
    public static AccountPanel accountPanel;
    public static LoginPanel loginPanel;
    public static ManagePanel managePanel;
    public static AddCustomerPanel addCustomerPanel;
    public static ReceiptPanel receiptPanel;
    public static NewPanel newPanel;
    public static UpdatePanel updatePanel;

    GridBagLayout layout;
    public static int width;
    public static int height;
    private final MafqoodPanel mafqoodPanel;

    public SedraUI() throws SQLException {
        initComponents();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("images/logo.png")));
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        width = (int) screenSize.getWidth();
        height = (int) screenSize.getHeight() - 40;
        setSize(new Dimension(width, height));
        bg.setBounds(0, 0, width, height);
        sidePane.setBounds(0, 0, width / 4, height);
        mainPanel.setBounds((width / 4), exitLabel.getHeight(), width, height);
        mainPanel.setSize(new Dimension(3 * width / 4, height));
        bglabel.setBounds(0, exitLabel.getHeight(), width, height);
        bglabel.setSize(new Dimension(width, height));

        exitLabel.setBounds(width - exitLabel.getWidth(), 0, exitLabel.getWidth(), exitLabel.getHeight());
        layout = new GridBagLayout();
        homePanel = new HomePanel();
        accountPanel = new AccountPanel();
        managePanel = new ManagePanel();
        loginPanel = new LoginPanel();
        addCustomerPanel = new AddCustomerPanel();
        receiptPanel = new ReceiptPanel();
        newPanel = new NewPanel();
        updatePanel = new UpdatePanel();
        mafqoodPanel = new MafqoodPanel();

        mainPanel.add(managePanel);
        mainPanel.add(homePanel);
        mainPanel.add(accountPanel);
        mainPanel.add(loginPanel);
        mainPanel.add(addCustomerPanel);
        mainPanel.add(receiptPanel);
        mainPanel.add(newPanel);
        mainPanel.add(updatePanel);
        mainPanel.add(mafqoodPanel);

        Colors.resetColor(homePane);
        Colors.resetColor(salesPane);
        Colors.resetColor(accountPane);
        Colors.resetColor(customerPane1);
        Colors.resetColor(loginPane);
        Colors.resetColor(updatePane);
        Colors.resetColor(newPanel);
        Colors.resetColor(updatePanel);
        bg.setPreferredSize(new Dimension(width, height + 200));
        mafqoodPanel.setVisible(false);
        
        visibility(false, false, false, false, true, false, false, false, false);
        Connection conn = DriverManager.getConnection(Connect.URL, Connect.HOST_NAME, Connect.PASSWORD);
        Statement stmt = conn.createStatement(ResultSet.CONCUR_UPDATABLE, ResultSet.CONCUR_UPDATABLE);
        Statement stmt1 = conn.createStatement(ResultSet.CONCUR_UPDATABLE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = stmt.executeQuery("SELECT * FROM Store");
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String s0 = timestamp.toString().substring(0, 7);
        String s1, s2;
        int s3;
        while (rs.next()) {
            try {

                s1 = rs.getString("itemID");
                s2 = rs.getString("itemSize");
                s3 = rs.getInt("itemQuantity");
                stmt1.executeUpdate("INSERT INTO Report values ('" + s0 + "','" + s1 + "','" + s2 + "'," + s3 + ")");
            } catch (SQLException e) {
            }
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

        bg = new javax.swing.JPanel();
        sidePane = new javax.swing.JPanel();
        homePane = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        salesPane = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        accountPane = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        updatePane = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        customerPane1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        loginPane = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        loginLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        UpdateItem = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        NewPane = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        exitLabel = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        bglabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setSize(new Dimension(width, height)
        );
        getContentPane().setLayout(null);

        bg.setBackground(new java.awt.Color(255, 20, 147));
        bg.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bgMouseDragged(evt);
            }
        });
        bg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bgMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bgMouseReleased(evt);
            }
        });
        bg.setLayout(null);

        sidePane.setBackground(Colors.SIDE_COLOR);
        sidePane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        homePane.setBackground(new java.awt.Color(85, 65, 118));
        homePane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                homePaneMousePressed(evt);
            }
        });
        homePane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-Home_30.png"))); // NOI18N
        homePane.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 35, 48));

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Home");
        homePane.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 137, 48));

        sidePane.add(homePane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 400, 60));

        salesPane.setBackground(new java.awt.Color(64, 43, 100));
        salesPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                salesPaneMousePressed(evt);
            }
        });
        salesPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-Shopping Cart_30.png"))); // NOI18N
        salesPane.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 41, 48));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Sales");
        salesPane.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 137, 48));

        sidePane.add(salesPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 400, 50));

        accountPane.setBackground(new java.awt.Color(64, 43, 100));
        accountPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                accountPaneMousePressed(evt);
            }
        });
        accountPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-Bank Card Missing_30.png"))); // NOI18N
        accountPane.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 6, 41, 48));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Accounts");
        accountPane.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 6, 137, 48));

        sidePane.add(accountPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 400, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_1logo.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        sidePane.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 240, 110));

        updatePane.setBackground(new java.awt.Color(55, 37, 55));
        updatePane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                updatePaneMousePressed(evt);
            }
        });
        updatePane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-Combo Chart-30.png"))); // NOI18N
        updatePane.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 6, -1, 48));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Manage");
        updatePane.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 6, 137, 48));

        sidePane.add(updatePane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 400, -1));

        customerPane1.setBackground(new java.awt.Color(64, 43, 100));
        customerPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                customerPane1MousePressed(evt);
            }
        });
        customerPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-Add User Male Filled_30.png"))); // NOI18N
        customerPane1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 6, 41, 48));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Customers");
        customerPane1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 6, 137, 48));

        sidePane.add(customerPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 400, -1));

        loginPane.setBackground(new java.awt.Color(64, 43, 100));
        loginPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loginPaneMousePressed(evt);
            }
        });
        loginPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-Enter_30.png"))); // NOI18N
        loginPane.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 6, -1, 48));

        loginLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        loginLabel.setForeground(new java.awt.Color(204, 204, 204));
        loginLabel.setText("Login");
        loginPane.add(loginLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 6, 137, 48));

        sidePane.add(loginPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 400, -1));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        sidePane.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 270, 10));

        UpdateItem.setBackground(Colors.SIDE_COLOR);
        UpdateItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                UpdateItemMousePressed(evt);
            }
        });
        UpdateItem.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-Update-30.png"))); // NOI18N
        UpdateItem.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 6, -1, 48));

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Update Items");
        UpdateItem.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 6, 137, 48));

        sidePane.add(UpdateItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 400, -1));

        NewPane.setBackground(Colors.SIDE_COLOR);
        NewPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NewPaneMousePressed(evt);
            }
        });
        NewPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-Windows Phone Store-30.png"))); // NOI18N
        NewPane.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 6, -1, 48));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("New Item");
        NewPane.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 6, 137, 48));

        sidePane.add(NewPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 400, -1));

        bg.add(sidePane);
        sidePane.setBounds(0, 0, 320, 1000);

        exitLabel.setFont(new java.awt.Font("Bitstream Vera Sans Mono", 1, 24)); // NOI18N
        exitLabel.setForeground(new java.awt.Color(204, 204, 204));
        exitLabel.setText("X");
        exitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitLabelMousePressed(evt);
            }
        });
        bg.add(exitLabel);
        exitLabel.setBounds(1160, 0, 20, 30);

        mainPanel.setBackground(new java.awt.Color(252, 102, 111));
        mainPanel.setLayout(null);

        bglabel.setBackground(new java.awt.Color(255, 153, 153));
        bglabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pp.jpg"))); // NOI18N
        mainPanel.add(bglabel);
        bglabel.setBounds(6, 6, 860, 783);

        bg.add(mainPanel);
        mainPanel.setBounds(316, 30, 860, 0);

        getContentPane().add(bg);
        bg.setBounds(0, 0, 0, 611);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int xx;
    int yy;

    private void bgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMousePressed
        // TODO add your handling code here:
        //xx = evt.getX();
        //yy = evt.getY();
        //setOpacity((float) (0.8));
    }//GEN-LAST:event_bgMousePressed

    private void bgMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMouseDragged
        // TODO add your handling code here:
        //int x = evt.getXOnScreen();
        //int y = evt.getYOnScreen();
        //this.setLocation(x - xx, y - yy);

    }//GEN-LAST:event_bgMouseDragged

    private void bgMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMouseReleased
        // TODO add your handling code here:
       // setOpacity((float) (1));

    }//GEN-LAST:event_bgMouseReleased

    private void NewPaneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewPaneMousePressed
        // TODO add your handling code here:
        Colors.resetColor(homePane);
        Colors.resetColor(salesPane);
        Colors.resetColor(accountPane);
        Colors.resetColor(customerPane1);
        Colors.resetColor(loginPane);
        Colors.resetColor(updatePanel);
        Colors.resetColor(newPanel);
        Colors.resetColor(UpdateItem);
        Colors.resetColor(updatePane);
        Colors.setColor(NewPane);

        visibility(false, false, false, false, false, false, false, true, false);
    }//GEN-LAST:event_NewPaneMousePressed

    private void UpdateItemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateItemMousePressed
        // TODO add your handling code here:
        Colors.resetColor(homePane);
        Colors.resetColor(salesPane);
        Colors.resetColor(accountPane);
        Colors.resetColor(customerPane1);
        Colors.resetColor(loginPane);
        Colors.resetColor(updatePane);
        Colors.resetColor(newPanel);
        Colors.resetColor(NewPane);
        Colors.setColor(UpdateItem);

        visibility(false, false, false, false, false, false, false, false, true);
    }//GEN-LAST:event_UpdateItemMousePressed

    private void loginPaneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginPaneMousePressed
        // TODO add your handling code here:

        Colors.resetColor(homePane);
        Colors.resetColor(salesPane);
        Colors.resetColor(accountPane);
        Colors.resetColor(customerPane1);
        Colors.setColor(loginPane);
        Colors.resetColor(updatePane);
        Colors.resetColor(NewPane);
        Colors.resetColor(UpdateItem);

        visibility(false, false, false, false, true, false, false, false, false);

    }//GEN-LAST:event_loginPaneMousePressed

    private void customerPane1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerPane1MousePressed
        // TODO add your handling code here:

        Colors.resetColor(homePane);
        Colors.resetColor(salesPane);
        Colors.resetColor(accountPane);
        Colors.setColor(customerPane1);
        Colors.resetColor(loginPane);
        Colors.resetColor(updatePane);
        Colors.resetColor(NewPane);
        Colors.resetColor(UpdateItem);

        visibility(false, false, false, true, false, false, false, false, false);

    }//GEN-LAST:event_customerPane1MousePressed

    private void updatePaneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatePaneMousePressed
        // TODO add your handling code here:

        Colors.resetColor(homePane);
        Colors.resetColor(salesPane);
        Colors.resetColor(accountPane);
        Colors.resetColor(customerPane1);
        Colors.resetColor(loginPane);
        Colors.resetColor(updatePanel);
        Colors.resetColor(newPanel);
        Colors.resetColor(NewPane);
        Colors.resetColor(UpdateItem);

        Colors.setColor(updatePane);

        visibility(false, false, false, false, false, true, false, false, false);

    }//GEN-LAST:event_updatePaneMousePressed

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        // TODO add your handling code here:

        accountPanel.setVisible(false);
        addCustomerPanel.setVisible(false);
        loginPanel.setVisible(false);
        homePanel.setVisible(false);
        receiptPanel.setVisible(false);
        newPanel.setVisible(false);
        updatePanel.setVisible(false);
        bglabel.setVisible(true);
    }//GEN-LAST:event_jLabel3MousePressed

    private void accountPaneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountPaneMousePressed
        // TODO add your handling code here:

        Colors.resetColor(homePane);
        Colors.resetColor(salesPane);
        Colors.setColor(accountPane);
        Colors.resetColor(customerPane1);
        Colors.resetColor(loginPane);
        Colors.resetColor(updatePane);
        Colors.resetColor(NewPane);
        Colors.resetColor(UpdateItem);

        visibility(false, false, true, false, false, false, false, false, false);

    }//GEN-LAST:event_accountPaneMousePressed

    private void salesPaneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesPaneMousePressed
        // TODO add your handling code here:

        Colors.resetColor(homePane);
        Colors.setColor(salesPane);
        Colors.resetColor(accountPane);
        Colors.resetColor(customerPane1);
        Colors.resetColor(loginPane);
        Colors.resetColor(updatePane);
        Colors.resetColor(NewPane);
        Colors.resetColor(UpdateItem);

        visibility(false, true, false, false, false, false, false, false, false);
    }//GEN-LAST:event_salesPaneMousePressed

    private void homePaneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePaneMousePressed
        // TODO add your handling code here:

        Colors.setColor(homePane);
        Colors.resetColor(salesPane);
        Colors.resetColor(accountPane);
        Colors.resetColor(customerPane1);
        Colors.resetColor(loginPane);
        Colors.resetColor(updatePane);
        Colors.resetColor(NewPane);
        Colors.resetColor(UpdateItem);
        homePanel.reset();

        /*
        try {
            new HomePanel().reset();
        } catch (SQLException ex) {
            Logger.getLogger(SedraUI.class.getName()).log(Level.SEVERE, null, ex);
        }
         */
        visibility(true, false, false, false, false, false, false, false, false);

    }//GEN-LAST:event_homePaneMousePressed

    private void exitLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitLabelMousePressed

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
            java.util.logging.Logger.getLogger(SedraUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SedraUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SedraUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SedraUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new SedraUI().setVisible(true);
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Unable to Run .. contact support " + ex.getMessage());
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel NewPane;
    public static javax.swing.JPanel UpdateItem;
    public static javax.swing.JPanel accountPane;
    private javax.swing.JPanel bg;
    private static javax.swing.JLabel bglabel;
    public static javax.swing.JPanel customerPane1;
    public static javax.swing.JLabel exitLabel;
    public static javax.swing.JPanel homePane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JLabel loginLabel;
    public static javax.swing.JPanel loginPane;
    private javax.swing.JPanel mainPanel;
    public static javax.swing.JPanel salesPane;
    private javax.swing.JPanel sidePane;
    public static javax.swing.JPanel updatePane;
    // End of variables declaration//GEN-END:variables

    public static void visibility(boolean... args) {
        homePanel.setVisible(args[0]);
        receiptPanel.setVisible(args[1]);
        accountPanel.setVisible(args[2]);
        addCustomerPanel.setVisible(args[3]);
        loginPanel.setVisible(args[4]);
        managePanel.setVisible(args[5]);
        bglabel.setVisible(args[6]);

        newPanel.setVisible(args[7]);
        updatePanel.setVisible(args[8]);

    }

}