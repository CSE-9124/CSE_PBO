package Pertemuan.PT09;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class P09b2 {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            System.out.println("error :" + e.getMessage());
        }

        JFrame jf = new JFrame("My App");
        jf.setSize(300, 300);
        
        JTextField finput = new JTextField();
        finput.setBounds(5, 50, 100, 30);
        jf.add(finput);

        JLabel lblHalo = new JLabel();
        lblHalo.setFont(new Font("Arial", Font.BOLD, 20));
        lblHalo.setBounds(5, 110, 210, 30);
        jf.add(lblHalo);

        JButton btnClickMe = new JButton("Click Me");
        btnClickMe.setBounds(5, 5, 90, 30);
        btnClickMe.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = finput.getText();
                lblHalo.setText("Halo " + nama);
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
            
        });
        jf.add(btnClickMe);

        JButton btnReset = new JButton("Reset");
        btnReset.setBounds(100, 5, 90, 30);
        btnReset.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                lblHalo.setText("");
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }

        });
        jf.add(btnReset);

        jf.setLayout(null);
        jf.setVisible(true);
    }
}
