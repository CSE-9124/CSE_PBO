package Pertemuan.PT08;

import javax.swing.*;

public class Contoh02a {

    public static void main(String[] args) {
        

        JFrame jf = new JFrame("My App");
        jf.setSize(300, 300);
        
        JLabel labelNIM = new JLabel("NIM");
        labelNIM.setBounds(20, 10, 50, 30);
        jf.add(labelNIM);

        JLabel labelNama = new JLabel("Nama");
        labelNama.setBounds(20, 40, 50, 30);
        jf.add(labelNama);
        
        jf.setLayout(null);
        jf.setVisible(true);
    }
    
}
