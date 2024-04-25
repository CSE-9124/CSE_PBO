package Pertemuan.PT08;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class Contoh03a {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            System.out.println("error :" + e.getMessage());
        }

        JFrame jf = new JFrame("My App");
        jf.setSize(300, 300);
        
        JLabel labelNIM = new JLabel("NIM");
        labelNIM.setBounds(20, 10, 50, 30);
        jf.add(labelNIM);

        JTextField inputNIM = new JTextField();
        inputNIM.setBounds(70, 10, 200, 30);
        jf.add(inputNIM);

        JLabel labelNama = new JLabel("Nama");
        labelNama.setBounds(20, 70, 50, 30);
        jf.add(labelNama);

        JTextField inputNama = new JTextField();
        inputNama.setBounds(70, 70, 200, 30);
        jf.add(inputNama);

        JButton btnExit = new JButton();
        btnExit.setText("Exit");
        btnExit.setBounds(180, 180, 80, 30);
        jf.add(btnExit);
        
        jf.setLayout(null);
        jf.setVisible(true);
    }
    
}
