/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdrApp;

import internalPages.userPage;

/**
 *
 * @author KIAN VICTORILLO
 */
public class CitizenForm extends javax.swing.JFrame {

    /**
     * Creates new form CitizenForm
     */
    public CitizenForm() {
        initComponents();
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
        edit = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        add = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        delete = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        search1 = new javax.swing.JTextField();
        search2 = new javax.swing.JTextField();
        search4 = new javax.swing.JTextField();
        search5 = new javax.swing.JTextField();
        search6 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        maximize = new javax.swing.JLabel();
        close = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(110, 177, 214));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        edit.setBackground(new java.awt.Color(110, 177, 214));
        edit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setText("EDIT");

        javax.swing.GroupLayout editLayout = new javax.swing.GroupLayout(edit);
        edit.setLayout(editLayout);
        editLayout.setHorizontalGroup(
            editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        editLayout.setVerticalGroup(
            editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jPanel1.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 90, 40));

        add.setBackground(new java.awt.Color(110, 177, 214));
        add.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setText("ADD");

        javax.swing.GroupLayout addLayout = new javax.swing.GroupLayout(add);
        add.setLayout(addLayout);
        addLayout.setHorizontalGroup(
            addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        addLayout.setVerticalGroup(
            addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 40));

        delete.setBackground(new java.awt.Color(110, 177, 214));
        delete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setText("DELETE");

        javax.swing.GroupLayout deleteLayout = new javax.swing.GroupLayout(delete);
        delete.setLayout(deleteLayout);
        deleteLayout.setHorizontalGroup(
            deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel4)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        deleteLayout.setVerticalGroup(
            deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deleteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, 40));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setText("Citizens ID:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setText("First Name:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setText("Gender:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setText("Address:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setText("Contact Number:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setText("Status:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 50, -1));

        search1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        search1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        search1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        search1.setOpaque(false);
        search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search1ActionPerformed(evt);
            }
        });
        jPanel1.add(search1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 180, 30));

        search2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        search2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        search2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        search2.setOpaque(false);
        search2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search2ActionPerformed(evt);
            }
        });
        jPanel1.add(search2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 180, 30));

        search4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        search4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        search4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        search4.setOpaque(false);
        search4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search4ActionPerformed(evt);
            }
        });
        jPanel1.add(search4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 180, 30));

        search5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        search5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        search5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        search5.setOpaque(false);
        search5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search5ActionPerformed(evt);
            }
        });
        jPanel1.add(search5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 180, 30));

        search6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        search6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        search6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        search6.setOpaque(false);
        search6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search6ActionPerformed(evt);
            }
        });
        jPanel1.add(search6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 180, 30));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel11.setText("Last Name:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jRadioButton1.setBackground(new java.awt.Color(110, 177, 214));
        jRadioButton1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jRadioButton1.setText("FEMALE");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, -1, -1));

        jRadioButton2.setBackground(new java.awt.Color(110, 177, 214));
        jRadioButton2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jRadioButton2.setText("MALE");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

        jComboBox1.setBackground(new java.awt.Color(110, 177, 214));
        jComboBox1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Married", "Widowed", " " }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 180, -1));

        jPanel2.setBackground(new java.awt.Color(41, 50, 57));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Citizens Form");

        maximize.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        maximize.setForeground(new java.awt.Color(255, 255, 255));
        maximize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        maximize.setText("—");
        maximize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maximizeMouseClicked(evt);
            }
        });

        close.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        close.setForeground(new java.awt.Color(255, 255, 255));
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setText("x");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(maximize, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(close)
                    .addComponent(maximize))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search1ActionPerformed

    private void search2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search2ActionPerformed

    private void search4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search4ActionPerformed

    private void search5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search5ActionPerformed

    private void search6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search6ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void maximizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maximizeMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_maximizeMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        this.dispose();
        dashBoard dash = new dashBoard();
        dash.setVisible(true);
         userPage up = new userPage();
        dash.maindesktop.add(up).setVisible(true);
    }//GEN-LAST:event_closeMouseClicked

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
            java.util.logging.Logger.getLogger(CitizenForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CitizenForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CitizenForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CitizenForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CitizenForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel add;
    private javax.swing.JLabel close;
    private javax.swing.JPanel delete;
    private javax.swing.JPanel edit;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JLabel maximize;
    private javax.swing.JTextField search1;
    private javax.swing.JTextField search2;
    private javax.swing.JTextField search4;
    private javax.swing.JTextField search5;
    private javax.swing.JTextField search6;
    // End of variables declaration//GEN-END:variables
}
