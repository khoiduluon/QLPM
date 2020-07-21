/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author ldbl
 */
public class demo1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My frame");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        ImageIcon icon1 = new ImageIcon("/home/ldbl/Insync/trungthps13251@fpt.edu.vn/Google Drive/lab/java3/image/icons8-new-view-24.png");
        ImageIcon icon2 = new ImageIcon("/home/ldbl/Insync/trungthps13251@fpt.edu.vn/Google Drive/lab/java3/image/icons8-open-envelope-24.png");
        ImageIcon icon3 = new ImageIcon("/home/ldbl/Insync/trungthps13251@fpt.edu.vn/Google Drive/lab/java3/image/icons8-exit-24.png");
        JPanel p = new JPanel();
        JButton b1 = new JButton("Click New",icon1);
        JButton b2 = new JButton("Click Open",icon2);
        JButton b3 = new JButton("Click Exit",icon3);
       // b1.setPreferredSize(new Dimension(170,26));
        b1.setPressedIcon(icon2);
        b1.setRolloverIcon(icon3);
        b2.setRolloverIcon(icon1);
        b3.setRolloverIcon(icon2);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "U choose New");
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "U choose Open");
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "U choose Exit");
            }
        });
        p.add(b1); p.add(b2); p.add(b3);
        p.setBorder(new TitledBorder(new LineBorder(Color.BLACK),"Demo1"));
        frame.add(p);
        
        
    }
}
