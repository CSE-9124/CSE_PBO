package Pertemuan.PT09;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.UIManager;

public class P09b1 {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            System.out.println("error :" + e.getMessage());
        }

        JFrame jf = new JFrame("My App");
        jf.setSize(300, 300);

        JButton btnExit = new JButton("Exit");
        btnExit.setBounds(180, 180, 80, 30);
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
