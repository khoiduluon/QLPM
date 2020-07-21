package lab4;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.FileDialog;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FileChooser extends javax.swing.JFrame {

    String filename;

    public FileChooser() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInput = new javax.swing.JTextArea();
        txtFpoly = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnFile = new javax.swing.JMenu();
        mnNew = new javax.swing.JMenuItem();
        mnOpen = new javax.swing.JMenuItem();
        mnSave = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnRed = new javax.swing.JMenuItem();
        mnGreen = new javax.swing.JMenuItem();
        mnBlue = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnTextColor = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnAbout = new javax.swing.JMenuItem();
        mnExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-new-view-60.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-account-60.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-exit-60.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        txtInput.setColumns(20);
        txtInput.setRows(5);
        jScrollPane1.setViewportView(txtInput);

        txtFpoly.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFpoly.setText("Fpoly - Java 3");
        txtFpoly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFpolyActionPerformed(evt);
            }
        });

        mnFile.setText("File");

        mnNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        mnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-new-view-24.png"))); // NOI18N
        mnNew.setText("New");
        mnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnNewActionPerformed(evt);
            }
        });
        mnFile.add(mnNew);

        mnOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        mnOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-open-envelope-24.png"))); // NOI18N
        mnOpen.setText("Open");
        mnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnOpenActionPerformed(evt);
            }
        });
        mnFile.add(mnOpen);

        mnSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        mnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-save-close-24.png"))); // NOI18N
        mnSave.setText("Save");
        mnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSaveActionPerformed(evt);
            }
        });
        mnFile.add(mnSave);

        jMenuBar1.add(mnFile);

        jMenu2.setText("Color");

        mnRed.setText("Red");
        mnRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnRedActionPerformed(evt);
            }
        });
        jMenu2.add(mnRed);

        mnGreen.setText("Green");
        mnGreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnGreenActionPerformed(evt);
            }
        });
        jMenu2.add(mnGreen);

        mnBlue.setText("Blue");
        mnBlue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnBlueActionPerformed(evt);
            }
        });
        jMenu2.add(mnBlue);
        jMenu2.add(jSeparator1);

        mnTextColor.setText("Text color");
        mnTextColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnTextColorActionPerformed(evt);
            }
        });
        jMenu2.add(mnTextColor);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("System");

        mnAbout.setText("About us");
        mnAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAboutActionPerformed(evt);
            }
        });
        jMenu3.add(mnAbout);

        mnExit.setText("Exit");
        mnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnExitActionPerformed(evt);
            }
        });
        jMenu3.add(mnExit);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addComponent(txtFpoly)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(txtFpoly, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFpolyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFpolyActionPerformed

    }//GEN-LAST:event_txtFpolyActionPerformed

    private void mnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnNewActionPerformed
        txtInput.setText("");
        setTitle(filename);
    }//GEN-LAST:event_mnNewActionPerformed

    private void mnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnExitActionPerformed

    private void mnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnOpenActionPerformed
        OpenFile();
    }//GEN-LAST:event_mnOpenActionPerformed

    private void mnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSaveActionPerformed
        SaveFile();
    }//GEN-LAST:event_mnSaveActionPerformed

    private void mnRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnRedActionPerformed
        txtFpoly.setBackground(Color.red);
    }//GEN-LAST:event_mnRedActionPerformed

    private void mnGreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnGreenActionPerformed
        txtFpoly.setBackground(Color.green);
    }//GEN-LAST:event_mnGreenActionPerformed

    private void mnBlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnBlueActionPerformed
        txtFpoly.setBackground(Color.blue);
    }//GEN-LAST:event_mnBlueActionPerformed

    private void mnTextColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnTextColorActionPerformed
        Color color = JColorChooser.showDialog(null, "chon mau chu", Color.white);
        txtFpoly.setForeground(color);
    }//GEN-LAST:event_mnTextColorActionPerformed

    private void mnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAboutActionPerformed
        showInfo();
    }//GEN-LAST:event_mnAboutActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        txtInput.setText("");
        setTitle(filename);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        showInfo();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FileChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FileChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FileChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FileChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FileChooser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem mnAbout;
    private javax.swing.JMenuItem mnBlue;
    private javax.swing.JMenuItem mnExit;
    private javax.swing.JMenu mnFile;
    private javax.swing.JMenuItem mnGreen;
    private javax.swing.JMenuItem mnNew;
    private javax.swing.JMenuItem mnOpen;
    private javax.swing.JMenuItem mnRed;
    private javax.swing.JMenuItem mnSave;
    private javax.swing.JMenuItem mnTextColor;
    private javax.swing.JTextField txtFpoly;
    private javax.swing.JTextArea txtInput;
    // End of variables declaration//GEN-END:variables
    void OpenFile() {
        FileDialog filedialog = new FileDialog(FileChooser.this, "Open File", FileDialog.LOAD);
        filedialog.setVisible(true);

        if (filedialog.getFile() != null) {
            filename = filedialog.getDirectory() + filedialog.getFile();
            setTitle(filename);
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            StringBuilder sb = new StringBuilder();
            String line = null;
            while ((line = reader.readLine()) != null) {
                sb.append(line + "\n");
                txtInput.setText(sb.toString());
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void SaveFile() {
        FileDialog filedialog = new FileDialog(FileChooser.this, "Save File", FileDialog.SAVE);
        filedialog.setVisible(true);

        if (filedialog.getFile() != null) {
            filename = filedialog.getDirectory() + filedialog.getFile();
            setTitle(filename);
        }
        try {
            FileWriter writer = new FileWriter(filename);
            writer.write(txtInput.getText());
            setTitle(filename);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void showInfo() {
        String str = "About me\n\n";
        str = str + "TacGia: Trung\n";
        str = str + "Last Update: 07-11-2020\n";
        str = str + "Education: Fpoly";
        JOptionPane.showMessageDialog(null, str, "Infomation", JOptionPane.INFORMATION_MESSAGE);
    }
}
