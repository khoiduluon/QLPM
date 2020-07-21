/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide2;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author ldbl
 */
public class demo2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(200, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(2, 2));
        JCheckBox chk1 = new JCheckBox("C/C++");
        JCheckBox chk2 = new JCheckBox("C#");
        JCheckBox chk3 = new JCheckBox("PHP");
        JCheckBox chk4 = new JCheckBox("java");
        p.add(chk1); p.add(chk2); p.add(chk3); p.add(chk4);
        frame.add(p);
        
    }
}
