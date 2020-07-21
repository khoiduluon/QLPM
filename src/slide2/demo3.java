/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide2;

import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;

/**
 *
 * @author ldbl
 */
public class demo3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("RadioButton");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        JPanel pgroup = new JPanel();
        pgroup.setBorder(new TitledBorder("Y kien"));
        pgroup.setLayout(new GridLayout(4,1));
        JRadioButton rdo1 =new JRadioButton("Lap trinh java rat de");
        JRadioButton rdo2 = new JRadioButton("Design GUi Java rat de");
        JRadioButton rdo3 = new JRadioButton("Viet web tren java rat de");
        JRadioButton rdo4 = new JRadioButton("tat ca deu kho");
        ButtonGroup group = new ButtonGroup();
        group.add(rdo1); group.add(rdo2); group.add(rdo3); group.add(rdo4);
        pgroup.add(rdo1); pgroup.add(rdo2); pgroup.add(rdo3); pgroup.add(rdo4);
        frame.add(pgroup);
        
    }
    
}
