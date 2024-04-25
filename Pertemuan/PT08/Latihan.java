package Pertemuan.PT08;

import javax.swing.*;
// import javax.swing.JButton;
// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JTextField;
// import javax.swing.UIManager;
// import javax.swing.*;
import java.awt.Font;
    
public class Latihan {
        public static void main(String[] args) {
            try {
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            } catch (Exception e) {
                System.out.println("error :" + e.getMessage());
            }
    
            JFrame jf = new JFrame("Latihan");
            jf.setSize(400, 300);
    
            JLabel labelMenu = new JLabel("Aplikasi Kehadiran Mahasiswa");
            labelMenu.setFont(new Font("Calibri", Font.BOLD, 20));
            labelMenu.setBounds(60, 10, 255, 30);
            jf.add(labelMenu);
    
            JLabel labelNIM = new JLabel("NIM");
            labelNIM.setFont(new Font("Calibri", Font.BOLD, 20));
            labelNIM.setBounds(50, 50, 50, 30);
            jf.add(labelNIM);
    
            JTextField inputNIM = new JTextField();
            inputNIM.setBounds(100, 50, 240, 30);
            jf.add(inputNIM);
    
            JButton btnExit = new JButton();
            btnExit.setText("Check");
            btnExit.setBounds(150, 150, 80, 30);
            jf.add(btnExit);
    
            jf.setLayout(null);
            jf.setVisible(true);
        }
    
    }
