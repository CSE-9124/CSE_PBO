package Pertemuan.PT10;

import java.awt.event.*;
import java.util.Stack;
import java.awt.Font;
import javax.swing.*;

public class Kalkulator1040 {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            System.out.println("error :" + e.getMessage());
        }

        // Frame
        JFrame jf = new JFrame("Kalkulator APP");
        jf.setSize(250, 300);

        // Judul
        JLabel label = new JLabel("Calculator");
        label.setBounds(50, 10, 150, 30);
        label.setFont(new Font("Calibri", Font.BOLD, 20));
        jf.add(label);

        // Field
        JTextField input = new JTextField();
        input.setBounds(10, 40, 150, 30);
        input.setHorizontalAlignment(SwingConstants.RIGHT);
        jf.add(input);

        JTextField output = new JTextField();
        output.setBounds(10, 70, 150, 20);
        output.setHorizontalAlignment(SwingConstants.RIGHT);
        jf.add(output);

        // Tombol Operasi
        JButton btnTambah = new JButton("+");
        btnTambah.setBounds(170, 100, 40, 30);
        btnTambah.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + "+");
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
            
        });
        jf.add(btnTambah);
        
        JButton btnKurang = new JButton("-");
        btnKurang.setBounds(170, 135, 40, 30);
        btnKurang.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + "-");
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
            
        });
        jf.add(btnKurang);
        
        JButton btnKali = new JButton("x");
        btnKali.setBounds(170, 170, 40, 30);
        btnKali.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + "x");
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
            
        });
        jf.add(btnKali);
        
        JButton btnBagi = new JButton(":");
        btnBagi.setBounds(170, 205, 40, 30);
        btnBagi.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + ":");
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
            
        });
        jf.add(btnBagi);

        // Tombol Angka
        JButton btnTujuh = new JButton("7");
        btnTujuh.setBounds(10, 100, 40, 30);
        btnTujuh.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + "7");
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
            
        });
        jf.add(btnTujuh);
        
        JButton btnDelapan = new JButton("8");
        btnDelapan.setBounds(55, 100, 40, 30);
        btnDelapan.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + "8");
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
            
        });
        jf.add(btnDelapan);

        JButton btnSembilan = new JButton("9");
        btnSembilan.setBounds(100, 100, 40, 30);
        btnSembilan.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + "9");
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
            
        });
        jf.add(btnSembilan);

        JButton btnEmpat = new JButton("4");
        btnEmpat.setBounds(10, 135, 40, 30);
        btnEmpat.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + "4");
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
            
        });
        jf.add(btnEmpat);

        JButton btnLima = new JButton("5");
        btnLima.setBounds(55, 135, 40, 30);
        btnLima.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + "5");
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
            
        });
        jf.add(btnLima);

        JButton btnEnam = new JButton("6");
        btnEnam.setBounds(100, 135, 40, 30);
        btnEnam.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + "6");
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
            
        });
        jf.add(btnEnam);

        JButton btnSatu = new JButton("1");
        btnSatu.setBounds(10, 170, 40, 30);
        btnSatu.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + "1");
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
            
        });
        jf.add(btnSatu);

        JButton btnDua = new JButton("2");
        btnDua.setBounds(55, 170, 40, 30);
        btnDua.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + "2");
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
            
        });
        jf.add(btnDua);

        JButton btnTiga = new JButton("3");
        btnTiga.setBounds(100, 170, 40, 30);
        btnTiga.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + "3");
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
            
        });
        jf.add(btnTiga);

        JButton btnC = new JButton();
        btnC.setText("C");
        btnC.setBounds(10, 205, 40, 30);
        btnC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText("");
                output.setText("");
            }
        });
        jf.add(btnC);

        JButton btn0 = new JButton();
        btn0.setText("0");
        btn0.setBounds(55, 205, 40, 30);
        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + "0");
            }
        });
        jf.add(btn0);

        JButton btnDot = new JButton();
        btnDot.setText(".");
        btnDot.setBounds(100, 205, 40, 30);
        btnDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + ".");
            }
        });
        jf.add(btnDot);

        // Result
        JButton btnSamadengan = new JButton("=");
        btnSamadengan.setBounds(170, 40, 40, 30);
        btnSamadengan.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String field = input.getText();
                    double result = evaluateExpression(field);
                    if (result == (int) result) {
                        output.setText(String.valueOf((int) result));
                    } else {
                        output.setText(String.valueOf(result));
                    }
                } catch (ArithmeticException ex) {
                    output.setText("Error : Ga boleh bagi 0");
                } catch (Exception ex) {
                    output.setText("Error");
                }
            }
            
        });
        jf.add(btnSamadengan);

        jf.setLayout(null);
        jf.setVisible(true);
    }

    private static double evaluateExpression(String expression) {
        return evaluatePostfix(convertToPostfix(expression));
    }

    private static String convertToPostfix(String infix) {
        StringBuilder output = new StringBuilder();
        Stack<Character> operatorStack = new Stack<>();
        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);
            if (Character.isDigit(ch) || ch == '.') {
                output.append(ch);
            } else if (isOperator(ch)) {
                output.append(' ');
                while (!operatorStack.isEmpty() && precedence(operatorStack.peek()) >= precedence(ch)) {
                    output.append(operatorStack.pop()).append(' ');
                }
                operatorStack.push(ch);
            }
        }
        while (!operatorStack.isEmpty()) {
            output.append(' ').append(operatorStack.pop());
        }
        return output.toString();
    }

    private static double evaluatePostfix(String postfix) {
        Stack<Double> operandStack = new Stack<>();
        String[] tokens = postfix.split("\\s+");
        for (String token : tokens) {
            if (token.isEmpty()) continue;
            if (isOperator(token.charAt(0)) && token.length() == 1) {
                double b = operandStack.pop();
                double a = operandStack.pop();
                switch (token.charAt(0)) {
                    case '+':
                        operandStack.push(a + b);
                        break;
                    case '-':
                        operandStack.push(a - b);
                        break;
                    case 'x':
                        operandStack.push(a * b);
                        break;
                    case ':':
                        if (b == 0) {
                            throw new ArithmeticException("Division by zero");
                        }
                        operandStack.push(a / b);
                        break;
                }
            } else {
                operandStack.push(Double.parseDouble(token));
            }
        }
        return operandStack.pop();
    }

    private static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == 'x' || ch == ':';
    }

    private static int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case 'x':
            case ':':
                return 2;
            default:
                return -1;
        }
    }
}
