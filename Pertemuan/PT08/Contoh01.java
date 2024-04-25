package Pertemuan.PT08;

import javax.swing.*;

class Contoh01 {

    public static void main (String[] args) {

        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            System.out.println("error");
        }

        JFrame jf = new JFrame();
        jf.setSize(300, 300);
        jf.setVisible(true);
        jf.setTitle("My App");
        
    }

}