package lab2;

public class Calculator extends javax.swing.JFrame {

    long a = 0;
    String pheptoan = "";

    public Calculator() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnSo1 = new javax.swing.JButton();
        btnSo2 = new javax.swing.JButton();
        btnSo3 = new javax.swing.JButton();
        btnChia = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        btnSo4 = new javax.swing.JButton();
        btnSo5 = new javax.swing.JButton();
        btnSo6 = new javax.swing.JButton();
        btnNhan = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        btnSo7 = new javax.swing.JButton();
        btnSo8 = new javax.swing.JButton();
        btnSo9 = new javax.swing.JButton();
        btnTru = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        btnSo0 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        btnCong = new javax.swing.JButton();
        btnBang = new javax.swing.JButton();
        txtKQ = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Casio");

        jPanel2.setLayout(new java.awt.GridLayout(4, 5));

        btnSo1.setText("1");
        btnSo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnSo1);

        btnSo2.setText("2");
        btnSo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo2ActionPerformed(evt);
            }
        });
        jPanel2.add(btnSo2);

        btnSo3.setText("3");
        btnSo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo3ActionPerformed(evt);
            }
        });
        jPanel2.add(btnSo3);

        btnChia.setText("/");
        btnChia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChiaActionPerformed(evt);
            }
        });
        jPanel2.add(btnChia);

        jButton6.setText("sqrt");
        jPanel2.add(jButton6);

        btnSo4.setText("4");
        btnSo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo4ActionPerformed(evt);
            }
        });
        jPanel2.add(btnSo4);

        btnSo5.setText("5");
        btnSo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo5ActionPerformed(evt);
            }
        });
        jPanel2.add(btnSo5);

        btnSo6.setText("6");
        btnSo6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo6ActionPerformed(evt);
            }
        });
        jPanel2.add(btnSo6);

        btnNhan.setText("*");
        btnNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanActionPerformed(evt);
            }
        });
        jPanel2.add(btnNhan);

        jButton16.setText("%");
        jPanel2.add(jButton16);

        btnSo7.setText("7");
        btnSo7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo7ActionPerformed(evt);
            }
        });
        jPanel2.add(btnSo7);

        btnSo8.setText("8");
        btnSo8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo8ActionPerformed(evt);
            }
        });
        jPanel2.add(btnSo8);

        btnSo9.setText("9");
        btnSo9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo9ActionPerformed(evt);
            }
        });
        jPanel2.add(btnSo9);

        btnTru.setText("-");
        btnTru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTruActionPerformed(evt);
            }
        });
        jPanel2.add(btnTru);

        jButton10.setText("1/x");
        jPanel2.add(jButton10);

        btnSo0.setText("0");
        btnSo0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo0ActionPerformed(evt);
            }
        });
        jPanel2.add(btnSo0);

        jButton2.setText("+/-");
        jPanel2.add(jButton2);

        jButton7.setText("C");
        jPanel2.add(jButton7);

        btnCong.setText("+");
        btnCong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCongActionPerformed(evt);
            }
        });
        jPanel2.add(btnCong);

        btnBang.setText("=");
        btnBang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBangActionPerformed(evt);
            }
        });
        jPanel2.add(btnBang);

        txtKQ.setText("0");
        txtKQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKQActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtKQ)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(7, 7, 7)
                .addComponent(txtKQ, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTruActionPerformed
        a = Long.parseLong(txtKQ.getText());
        pheptoan = "-";
        txtKQ.setText("0");
    }//GEN-LAST:event_btnTruActionPerformed

    private void btnSo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo1ActionPerformed
        String giatri = txtKQ.getText();
        if (giatri.length() < 12) {
            if (giatri.equals("0")) {
                giatri = "";
                long so = Long.parseLong(giatri + btnSo1.getText());
                txtKQ.setText(String.valueOf(so));
            }
        }
    }//GEN-LAST:event_btnSo1ActionPerformed

    private void txtKQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKQActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKQActionPerformed

    private void btnSo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo2ActionPerformed
        String giatri = txtKQ.getText();
        if (giatri.length() < 12) {
            if (giatri.equals("0")) {
                giatri = "";
                long so = Long.parseLong(giatri + btnSo2.getText());
                txtKQ.setText(String.valueOf(so));
            }
        }
    }//GEN-LAST:event_btnSo2ActionPerformed

    private void btnSo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo3ActionPerformed
        String giatri = txtKQ.getText();
        if (giatri.length() < 12) {
            if (giatri.equals("0")) {
                giatri = "";
                long so = Long.parseLong(giatri + btnSo3.getText());
                txtKQ.setText(String.valueOf(so));
            }
        }
    }//GEN-LAST:event_btnSo3ActionPerformed

    private void btnSo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo4ActionPerformed
        String giatri = txtKQ.getText();
        if (giatri.length() < 12) {
            if (giatri.equals("0")) {
                giatri = "";
                long so = Long.parseLong(giatri + btnSo4.getText());
                txtKQ.setText(String.valueOf(so));
            }
        }
    }//GEN-LAST:event_btnSo4ActionPerformed

    private void btnSo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo5ActionPerformed
        String giatri = txtKQ.getText();
        if (giatri.length() < 12) {
            if (giatri.equals("0")) {
                giatri = "";
                long so = Long.parseLong(giatri + btnSo5.getText());
                txtKQ.setText(String.valueOf(so));
            }
        }
    }//GEN-LAST:event_btnSo5ActionPerformed

    private void btnSo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo6ActionPerformed
        String giatri = txtKQ.getText();
        if (giatri.length() < 12) {
            if (giatri.equals("0")) {
                giatri = "";
                long so = Long.parseLong(giatri + btnSo6.getText());
                txtKQ.setText(String.valueOf(so));
            }
        }
    }//GEN-LAST:event_btnSo6ActionPerformed

    private void btnSo7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo7ActionPerformed
        String giatri = txtKQ.getText();
        if (giatri.length() < 12) {
            if (giatri.equals("0")) {
                giatri = "";
                long so = Long.parseLong(giatri + btnSo7.getText());
                txtKQ.setText(String.valueOf(so));
            }
        }
    }//GEN-LAST:event_btnSo7ActionPerformed

    private void btnSo8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo8ActionPerformed
        String giatri = txtKQ.getText();
        if (giatri.length() < 12) {
            if (giatri.equals("0")) {
                giatri = "";
                long so = Long.parseLong(giatri + btnSo8.getText());
                txtKQ.setText(String.valueOf(so));
            }
        }
    }//GEN-LAST:event_btnSo8ActionPerformed

    private void btnSo9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo9ActionPerformed
        String giatri = txtKQ.getText();
        if (giatri.length() < 12) {
            if (giatri.equals("0")) {
                giatri = "";
                long so = Long.parseLong(giatri + btnSo9.getText());
                txtKQ.setText(String.valueOf(so));
            }
        }
    }//GEN-LAST:event_btnSo9ActionPerformed

    private void btnSo0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo0ActionPerformed
        String giatri = txtKQ.getText();
        if (giatri.length() < 12) {
            if (giatri.equals("0")) {
                giatri = "";
                long so = Long.parseLong(giatri + btnSo0.getText());
                txtKQ.setText(String.valueOf(so));
            }
        }
    }//GEN-LAST:event_btnSo0ActionPerformed

    private void btnChiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChiaActionPerformed
        a = Long.parseLong(txtKQ.getText());
        if (a != 0) {
            pheptoan = "/";
            txtKQ.setText("0");
        }
    }//GEN-LAST:event_btnChiaActionPerformed

    private void btnNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanActionPerformed
        a = Long.parseLong(txtKQ.getText());
        pheptoan = "*";
        txtKQ.setText("0");
    }//GEN-LAST:event_btnNhanActionPerformed

    private void btnCongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCongActionPerformed
        a = Long.parseLong(txtKQ.getText());
        pheptoan = "+";
        txtKQ.setText("0");
    }//GEN-LAST:event_btnCongActionPerformed

    private void btnBangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBangActionPerformed
        long kq = 0;
        long b = Long.parseLong(txtKQ.getText());
        if (pheptoan.length() > 0) {
            if (pheptoan.equals("+")) {
                kq = a + b;
                txtKQ.setText(String.valueOf(kq));
            } else if (pheptoan.equals("-")) {
                kq = a - b;
                txtKQ.setText(String.valueOf(kq));
            } else if (pheptoan.equals("*")){
                kq = a * b;
                txtKQ.setText(String.valueOf(kq));
            } else {
                kq = a / b;
                txtKQ.setText(String.valueOf(kq));
            }
            pheptoan="";
            a=0;
        }
    }//GEN-LAST:event_btnBangActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBang;
    private javax.swing.JButton btnChia;
    private javax.swing.JButton btnCong;
    private javax.swing.JButton btnNhan;
    private javax.swing.JButton btnSo0;
    private javax.swing.JButton btnSo1;
    private javax.swing.JButton btnSo2;
    private javax.swing.JButton btnSo3;
    private javax.swing.JButton btnSo4;
    private javax.swing.JButton btnSo5;
    private javax.swing.JButton btnSo6;
    private javax.swing.JButton btnSo7;
    private javax.swing.JButton btnSo8;
    private javax.swing.JButton btnSo9;
    private javax.swing.JButton btnTru;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtKQ;
    // End of variables declaration//GEN-END:variables
}
