package Pertemuan.PT09;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class KalkulatorSederhana {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            System.out.println("error :" + e.getMessage());
        }

        JFrame jf = new JFrame("Kalkulator APP");
        jf.setSize(250, 300);

        JTextField tfA = new JTextField();
        tfA.setBounds(5, 5, 50, 30);
        jf.add(tfA);

        JTextField tfB = new JTextField();
        tfB.setBounds(5, 50, 50, 30);
        jf.add(tfB);

        JTextField tfHasil = new JTextField();
        tfHasil.setBounds(5, 120, 50, 30);
        tfHasil.setEditable(false);
        jf.add(tfHasil);

        JButton btnTambah = new JButton("+");
        btnTambah.setBounds(60, 5, 40, 30);
        btnTambah.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String txtA = tfA.getText();
                String txtB = tfB.getText();
                double A = Double.parseDouble(txtA);
                double B = Double.parseDouble(txtB);
                double C = A + B;
                tfHasil.setText(""+C);
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
            
        });
        jf.add(btnTambah);
        
        JButton btnKurang = new JButton("-");
        btnKurang.setBounds(100, 5, 40, 30);
        btnKurang.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String txtA = tfA.getText();
                String txtB = tfB.getText();
                double A = Double.parseDouble(txtA);
                double B = Double.parseDouble(txtB);
                double C = A - B;
                tfHasil.setText(""+C);
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
            
        });
        jf.add(btnKurang);
        
        JButton btnKali = new JButton("x");
        btnKali.setBounds(60, 50, 40, 30);
        btnKali.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String txtA = tfA.getText();
                String txtB = tfB.getText();
                double A = Double.parseDouble(txtA);
                double B = Double.parseDouble(txtB);
                double C = A * B;
                tfHasil.setText(""+C);
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
            
        });
        jf.add(btnKali);
        
        JButton btnBagi = new JButton("/");
        btnBagi.setBounds(100, 50, 40, 30);
        btnBagi.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String txtA = tfA.getText();
                String txtB = tfB.getText();
                double A = Double.parseDouble(txtA);
                double B = Double.parseDouble(txtB);
                double C = A / B;
                tfHasil.setText(""+C);
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
            
        });
        jf.add(btnBagi);

        JButton btnExit = new JButton("Exit");
        btnExit.setBounds(80, 120, 60, 30);
        btnExit.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }

        });
        jf.add(btnExit);

        jf.setLayout(null);
        jf.setVisible(true);
    }
}
