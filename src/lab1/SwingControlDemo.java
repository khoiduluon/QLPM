/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 *
 * @author ldbl
 */
public class SwingControlDemo {
    JFrame mainFrame;
    JLabel headerLabel;
    JLabel statusLabel;
    JPanel controlPanel;
    
public SwingControlDemo(){
    prepareGUI();
}

public static void main(String[] args){
    SwingControlDemo swingControlDemo = new SwingControlDemo();
    swingControlDemo.showCheckBoxDemo();
}

private void prepareGUI(){
    mainFrame = new JFrame("VD");
    mainFrame.setSize(400, 400);
    mainFrame.setLayout(new GridLayout(3, 1));
    mainFrame.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
        }
});
    headerLabel = new JLabel("",JLabel.CENTER);
    statusLabel = new JLabel("",JLabel.CENTER);
    
    statusLabel.setSize(350,100);
    
    controlPanel = new JPanel();
    controlPanel.setLayout(new FlowLayout());
    
    mainFrame.add(headerLabel);
    mainFrame.add(controlPanel);
    mainFrame.add(statusLabel);
    mainFrame.setVisible(true);
}

private void showCheckBoxDemo(){
    headerLabel.setText("Control in action");
    
    final JCheckBox chkApple = new JCheckBox("Apple");
    final JCheckBox chkManga = new JCheckBox("Mango");
    final JCheckBox chkPeer = new JCheckBox("Peer");
    
    chkApple.setMnemonic(KeyEvent.VK_C);
    chkManga.setMnemonic(KeyEvent.VK_M);
    chkPeer.setMnemonic(KeyEvent.VK_P);
    
    chkApple.addItemListener(new ItemListener() {
        @Override
        public void itemStateChanged(ItemEvent e) {
            statusLabel.setText("Apple CheckBox: " + (e.getStateChange()==1?"Checked":"unchecked"));
        }
    });
    
    chkManga.addItemListener(new ItemListener() {
        @Override
        public void itemStateChanged(ItemEvent e) {
            statusLabel.setText("Mango CheckBox: " + (e.getStateChange()==1?"Checked":"unchecked"));
        }
    });
    
    chkPeer.addItemListener(new ItemListener() {
        @Override
        public void itemStateChanged(ItemEvent e) {
            statusLabel.setText("Peer CheckBox: " + (e.getStateChange()==1?"Checked":"unchecked"));
        }
    });
    
    controlPanel.add(chkApple);
    controlPanel.add(chkManga);
    controlPanel.add(chkPeer);
    
    mainFrame.setVisible(true);
}
}
