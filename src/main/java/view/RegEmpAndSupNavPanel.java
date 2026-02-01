package view;

import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import javax.swing.JPanel;

import motorph.gui.*; // To be removed once all GUI are transferred to view package

public class RegEmpAndSupNavPanel extends JPanel {
    private CardLayout cardLayout; 
    private MainApplication mainApp; 
    private boolean isAdmin; 
    private JPanel mainPanel; 


    public void setMainApp(MainApplication mainApp, boolean isAdmin) {
        this.mainApp = mainApp;
        this.isAdmin = isAdmin;
        this.mainPanel = mainApp.getContentPanel();
        // Get the layout manager of the main content panel
        LayoutManager layout = this.mainPanel.getLayout();
        if (layout instanceof CardLayout) {
            this.cardLayout = (CardLayout) layout;
        } else {
             // Fallback if layout is not CardLayout
             this.cardLayout = new CardLayout();
             this.mainPanel.setLayout(this.cardLayout);
        }
        updateButtonVisibility(); // Show/hide buttons based on role
    }

    // Constructor for the NavigationPanel
    public RegEmpAndSupNavPanel() {
        initComponents(); 
        this.isAdmin = false; 
    }

    // Controls which buttons are visible based on role
    private void updateButtonVisibility() {
        dashboardButton.setVisible(true);
        employeesButton.setVisible(true);
        attendanceButton.setVisible(true);
        payrollButton.setVisible(true);
        logoutButton.setVisible(true);
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        dashboardButton = new javax.swing.JButton();
        employeesButton = new javax.swing.JButton();
        payrollButton = new javax.swing.JButton();
        attendanceButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        leaveButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        employeeManagementButton = new javax.swing.JButton();
        leaveManagementButton = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setPreferredSize(new java.awt.Dimension(160, 200));

        jPanel1.setBackground(new java.awt.Color(139, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setMinimumSize(new java.awt.Dimension(160, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(160, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashboardButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dashboardButton.setText("Dashboard");
        dashboardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardButtonActionPerformed(evt);
            }
        });
        jPanel1.add(dashboardButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 140, -1));

        employeesButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        employeesButton.setText("Profile");
        employeesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeesButtonActionPerformed(evt);
            }
        });
        jPanel1.add(employeesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 215, 140, -1));

        payrollButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        payrollButton.setText("Payroll");
        payrollButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payrollButtonActionPerformed(evt);
            }
        });
        jPanel1.add(payrollButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 285, 140, -1));

        attendanceButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        attendanceButton.setText("Attendance");
        attendanceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendanceButtonActionPerformed(evt);
            }
        });
        jPanel1.add(attendanceButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 140, -1));

        jPanel2.setBackground(new java.awt.Color(139, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setMinimumSize(new java.awt.Dimension(150, 95));
        jPanel2.setLayout(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/motorph_logo (6).png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 160, 150);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 150));

        logoutButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        jPanel1.add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 555, -1, -1));

        leaveButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        leaveButton.setText("Leave");
        jPanel1.add(leaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 140, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MANAGEMENT");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        employeeManagementButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        employeeManagementButton.setText("Employee");
        jPanel1.add(employeeManagementButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 140, -1));

        leaveManagementButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        leaveManagementButton.setText("Leave");
        jPanel1.add(leaveManagementButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 445, 140, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Action for Employees button
    private void employeesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeesButtonActionPerformed
        // Show the appropriate Employees panel based on role
        if (this.isAdmin && this.cardLayout != null && this.mainPanel != null) {
            this.cardLayout.show(this.mainPanel, MainApplication.ADMIN_EMPLOYEES);
        } else if (!this.isAdmin && this.cardLayout != null && this.mainPanel != null) {
            this.cardLayout.show(this.mainPanel, MainApplication.EMP_EMPLOYEES);
        }
    }//GEN-LAST:event_employeesButtonActionPerformed

    // Action for Logout button
    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        
        int response = JOptionPane.showConfirmDialog(
        this,
        "Are you sure you want to log out?",
        "Confirm Logout",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.QUESTION_MESSAGE
    );
        
        if (response == JOptionPane.YES_OPTION){
        JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        if (topFrame != null) {
            topFrame.dispose(); // Close the current window
        }
        }
    }//GEN-LAST:event_logoutButtonActionPerformed

    // Action for Dashboard button
    private void dashboardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardButtonActionPerformed
       // Show the appropriate Dashboard panel based on role
    if (mainApp != null) {
        mainApp.showPanel(isAdmin ? MainApplication.ADMIN_DASHBOARD : MainApplication.EMP_DASHBOARD);
    }
    }//GEN-LAST:event_dashboardButtonActionPerformed


    // Action for Attendance button
    private void attendanceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attendanceButtonActionPerformed
        // Show the appropriate Attendance panel based on role
       if (this.cardLayout != null && this.mainPanel != null) {
            this.cardLayout.show(this.mainPanel, this.isAdmin ? MainApplication.ADMIN_ATTENDANCE : MainApplication.EMP_ATTENDANCE);
        }
    }//GEN-LAST:event_attendanceButtonActionPerformed

    // Action for Payroll button
    private void payrollButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payrollButtonActionPerformed
        // Show the appropriate Payroll panel based on role
        if (this.cardLayout != null && this.mainPanel != null) {
            this.cardLayout.show(this.mainPanel, this.isAdmin ? MainApplication.ADMIN_PAYROLL : MainApplication.EMP_PAYROLL);
            System.out.println("Navigating to " + (this.isAdmin ? MainApplication.ADMIN_PAYROLL : MainApplication.EMP_PAYROLL) + " panel");
        } else {
            System.out.println("Error: cardLayout or mainPanel is null.");
        }
    }//GEN-LAST:event_payrollButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton attendanceButton;
    private javax.swing.JButton dashboardButton;
    private javax.swing.JButton employeeManagementButton;
    private javax.swing.JButton employeesButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton leaveButton;
    private javax.swing.JButton leaveManagementButton;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton payrollButton;
    // End of variables declaration//GEN-END:variables
}
