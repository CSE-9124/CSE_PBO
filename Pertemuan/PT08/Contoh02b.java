package Pertemuan.PT08;

import javax.swing.*;

public class Contoh02b {

    public static void main(String[] args) {
        
        JFrame jf = new JFrame("My App");
        jf.setSize(300, 300);
        
        JLabel labelNIM = new JLabel("NIM");
        labelNIM.setBounds(20, 10, 50, 30);
        jf.add(labelNIM);

        JTextField inputNIM = new JTextField();
        inputNIM.setBounds(70, 10, 100, 30);
        jf.add(inputNIM);
        
        jf.setLayout(null);
        jf.setVisible(true);
    }
    
}
