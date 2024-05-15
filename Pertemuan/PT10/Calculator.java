package Pertemuan.PT10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class Calculator implements ActionListener {

    public static void main(String[] args) {

        // Theme
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            System.out.println("error :" + e.getMessage());
        }

        // Frame
        JFrame jf = new JFrame("Calculator Sederhana");
        jf.setSize(300, 300);
        
        // Label
        JLabel label = new JLabel("Kalkulator");
        label.setBounds(10,10,150,30);
        label.setFont(new Font("Calibri", Font.BOLD, 20));
        jf.add(label);

        // JTextField inputan
        JTextField inputan = new JTextField();
        inputan.setBounds(10, 40, 220, 20);
        jf.add(inputan);

        // JTextField outputan 
        JTextField outputan = new JTextField();
        outputan.setBounds(10, 60, 220, 20);
        jf.add(outputan);


        // Nomor
        JButton btnC = new JButton();
        btnC.setText("C");
        btnC.setBounds(10, 210, 70, 30);
        btnC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputan.setText("");
                outputan.setText("");
            }
        });
        jf.add(btnC);

        JButton btn0 = new JButton();
        btn0.setText("0");
        btn0.setBounds(85, 210, 70, 30);
        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputan.setText(inputan.getText() + "0");
            }
        });
        jf.add(btn0);

        JButton btnDot = new JButton();
        btnDot.setText(".");
        btnDot.setBounds(160, 210, 70, 30);
        btnDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputan.setText(inputan.getText() + ".");

            }
        });
        jf.add(btnDot);

        JButton btn1 = new JButton();
        btn1.setText("1");
        btn1.setBounds(10, 170, 70, 30);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputan.setText(inputan.getText() + "1");
            }
        });
        jf.add(btn1);

        JButton btn2 = new JButton();
        btn2.setText("2");
        btn2.setBounds(85, 170, 70, 30);
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputan.setText(inputan.getText() + "2");
            }
        });
        jf.add(btn2);

        JButton btn3 = new JButton();
        btn3.setText("3");
        btn3.setBounds(160, 170, 70, 30);
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputan.setText(inputan.getText() + "3");
            }
        });
        jf.add(btn3);

        JButton btn4 = new JButton();
        btn4.setText("4");
        btn4.setBounds(10, 130, 70, 30);
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputan.setText(inputan.getText() + "4");
            }
        });
        jf.add(btn4);

        JButton btn5 = new JButton();
        btn5.setText("5");
        btn5.setBounds(85, 130, 70, 30);
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputan.setText(inputan.getText() + "5");
            }
        });
        jf.add(btn5);

        JButton btn6 = new JButton();
        btn6.setText("6");
        btn6.setBounds(160, 130, 70, 30);
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputan.setText(inputan.getText() + "6");
            }
        });
        jf.add(btn6);


        JButton btn7 = new JButton();
        btn7.setText("7");
        btn7.setBounds(10, 90, 70, 30);
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputan.setText(inputan.getText() + "7");
            }
        });
        jf.add(btn7);

        JButton btn8 = new JButton();
        btn8.setText("8");
        btn8.setBounds(85, 90, 70, 30);
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputan.setText(inputan.getText() + "8");
            }
        });
        jf.add(btn8);

        JButton btn9 = new JButton();
        btn9.setText("9");
        btn9.setBounds(160, 90, 70, 30);
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputan.setText(inputan.getText() + "9");
            }
        });
        jf.add(btn9);

        // Operation
        // Penjumlahan
        JButton btnAdd = new JButton();
        btnAdd.setText("+");
        btnAdd.setBounds(240, 90, 40, 30);
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputan.setText(inputan.getText() + "+");
            }
        });
        jf.add(btnAdd);

        // Pengurangan
        JButton btnSubs = new JButton();
        btnSubs.setText("-");
        btnSubs.setBounds(240, 130, 40, 30);
        btnSubs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputan.setText(inputan.getText() + "-");
            }
        });
        jf.add(btnSubs);

        // Perkalian
        JButton btnMulti = new JButton();
        btnMulti.setText("x");
        btnMulti.setBounds(240, 170, 40, 30);
        btnMulti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputan.setText(inputan.getText() + "x");
            }
        });
        jf.add(btnMulti);

        // Pembagian
        JButton btnDivide = new JButton();
        btnDivide.setText(":");
        btnDivide.setBounds(240, 210, 40, 30);
        btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputan.setText(inputan.getText() + ":");
            }
        });
        jf.add(btnDivide);

        
        // Result
        JButton btnRes = new JButton("=");
        btnRes.setBounds(240, 40, 40, 40);
        btnRes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String input = inputan.getText();
                    double result = evaluateExpression(input);
                    if (result == (int) result) {
                        outputan.setText(String.valueOf((int) result));
                    } else {
                        outputan.setText(String.valueOf(result));
                    }
                } catch (ArithmeticException ex) {
                    outputan.setText("Ga boleh bagi 0");
                } catch (Exception ex) {
                    outputan.setText("Error");
                }
            }
        });
        jf.add(btnRes);

        // Operation End
        
        jf.setLayout(null);
        jf.setVisible(true);
    }
    private static double evaluateExpression(String expression) {
        String[] tokens = expression.split("(?<=[-+:x*/])|(?=[-+:*x/])");
        double result = Double.parseDouble(tokens[0]);
        for (int i = 1; i < tokens.length; i += 2) {
            String operator = tokens[i];
            double operand = Double.parseDouble(tokens[i + 1]);
            switch (operator) {
                case "+":
                    result += operand;
                    break;
                case "-":
                    result -= operand;
                    break;
                case "x":
                    result *= operand;
                    break;
                case ":":
                    if (operand == 0) {
                        throw new ArithmeticException("Division by zero");
                    }
                    result /= operand;
                    break;
            }
        }
        return result;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}