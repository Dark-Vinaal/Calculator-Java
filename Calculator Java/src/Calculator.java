import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {

    // Global Variables
    JLabel display;
    JButton clButton, delButton, expButton, dotButton, eqButton;
    JButton divButton, mulButton, subButton, addButton, modButton;
    JButton zeroButton, oneButton, twoButton, threeButton, fourButton, fiveButton, sixButton, sevenButton, eightButton,
            nineButton;

    boolean isOperatorClicked = false;
    String oldValue;
    String operator = "";

    public Calculator() {

        // Container
        JFrame jf = new JFrame("CALCULATOR");
        jf.setLayout(null);
        jf.setSize(600, 600);
        jf.setLocation(300, 100);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Display
        display = new JLabel("");
        display.setBounds(50, 50, 500, 50);
        display.setBackground(Color.GRAY);
        display.setOpaque(true);
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setForeground(Color.BLACK);
        display.setFont(new java.awt.Font("Consolas", java.awt.Font.BOLD, 36));
        jf.add(display);

        // Buttons
        // Row 1
        clButton = new JButton("CL");
        clButton.setBounds(50, 150, 80, 80);
        clButton.addActionListener(this);
        jf.add(clButton);

        delButton = new JButton("DEL");
        delButton.setBounds(140, 150, 80, 80);
        delButton.addActionListener(this);
        jf.add(delButton);

        expButton = new JButton("^");
        expButton.setBounds(230, 150, 80, 80);
        expButton.addActionListener(this);
        jf.add(expButton);

        divButton = new JButton("÷");
        divButton.setBounds(320, 150, 80, 80);
        divButton.addActionListener(this);
        jf.add(divButton);

        // Row 2
        sevenButton = new JButton("7");
        sevenButton.setBounds(50, 240, 80, 80);
        sevenButton.addActionListener(this);
        jf.add(sevenButton);

        eightButton = new JButton("8");
        eightButton.setBounds(140, 240, 80, 80);
        eightButton.addActionListener(this);
        jf.add(eightButton);

        nineButton = new JButton("9");
        nineButton.setBounds(230, 240, 80, 80);
        nineButton.addActionListener(this);
        jf.add(nineButton);

        mulButton = new JButton("×");
        mulButton.setBounds(320, 240, 80, 80);
        mulButton.addActionListener(this);
        jf.add(mulButton);

        // Row 3
        fourButton = new JButton("4");
        fourButton.setBounds(50, 330, 80, 80);
        fourButton.addActionListener(this);
        jf.add(fourButton);

        fiveButton = new JButton("5");
        fiveButton.setBounds(140, 330, 80, 80);
        fiveButton.addActionListener(this);
        jf.add(fiveButton);

        sixButton = new JButton("6");
        sixButton.setBounds(230, 330, 80, 80);
        sixButton.addActionListener(this);
        jf.add(sixButton);

        subButton = new JButton("-");
        subButton.setBounds(320, 330, 80, 80);
        subButton.addActionListener(this);
        jf.add(subButton);

        // Row 4
        oneButton = new JButton("1");
        oneButton.setBounds(50, 420, 80, 80);
        oneButton.addActionListener(this);
        jf.add(oneButton);

        twoButton = new JButton("2");
        twoButton.setBounds(140, 420, 80, 80);
        twoButton.addActionListener(this);
        jf.add(twoButton);

        threeButton = new JButton("3");
        threeButton.setBounds(230, 420, 80, 80);
        threeButton.addActionListener(this);
        jf.add(threeButton);

        addButton = new JButton("+");
        addButton.setBounds(320, 420, 80, 80);
        addButton.addActionListener(this);
        jf.add(addButton);

        // Row 5
        modButton = new JButton("%");
        modButton.setBounds(50, 510, 80, 80);
        modButton.addActionListener(this);
        jf.add(modButton);

        zeroButton = new JButton("0");
        zeroButton.setBounds(140, 510, 80, 80);
        zeroButton.addActionListener(this);
        jf.add(zeroButton);

        dotButton = new JButton(".");
        dotButton.setBounds(230, 510, 80, 80);
        dotButton.addActionListener(this);
        jf.add(dotButton);

        eqButton = new JButton("=");
        eqButton.setBounds(320, 510, 80, 80);
        eqButton.addActionListener(this);
        jf.add(eqButton);

    }

    public static void main(String[] args) {
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        // Buttons Functionality
        // --------------- NUMBERS ---------------

        if (e.getSource() == zeroButton) {
            if (isOperatorClicked) {
                display.setText("0");
                isOperatorClicked = false;
            } else {
                display.setText(display.getText() + "0");
            }
        } else if (e.getSource() == oneButton) {
            if (isOperatorClicked) {
                display.setText("1");
                isOperatorClicked = false;
            } else {
                display.setText(display.getText() + "1");
            }
        } else if (e.getSource() == twoButton) {
            if (isOperatorClicked) {
                display.setText("2");
                isOperatorClicked = false;
            } else {
                display.setText(display.getText() + "2");
            }
        } else if (e.getSource() == threeButton) {
            if (isOperatorClicked) {
                display.setText("3");
                isOperatorClicked = false;
            } else {
                display.setText(display.getText() + "3");
            }
        } else if (e.getSource() == fourButton) {
            if (isOperatorClicked) {
                display.setText("4");
                isOperatorClicked = false;
            } else {
                display.setText(display.getText() + "4");
            }
        } else if (e.getSource() == fiveButton) {
            if (isOperatorClicked) {
                display.setText("5");
                isOperatorClicked = false;
            } else {
                display.setText(display.getText() + "5");
            }
        } else if (e.getSource() == sixButton) {
            if (isOperatorClicked) {
                display.setText("6");
                isOperatorClicked = false;
            } else {
                display.setText(display.getText() + "6");
            }
        } else if (e.getSource() == sevenButton) {
            if (isOperatorClicked) {
                display.setText("7");
                isOperatorClicked = false;
            } else {
                display.setText(display.getText() + "7");
            }
        } else if (e.getSource() == eightButton) {
            if (isOperatorClicked) {
                display.setText("8");
                isOperatorClicked = false;
            } else {
                display.setText(display.getText() + "8");
            }
        } else if (e.getSource() == nineButton) {
            if (isOperatorClicked) {
                display.setText("9");
                isOperatorClicked = false;
            } else {
                display.setText(display.getText() + "9");
            }
        }

        // --------------- OPERATORS ---------------

        else if (e.getSource() == addButton) {
            isOperatorClicked = true;
            oldValue = display.getText();
            operator = "+";
        } else if (e.getSource() == subButton) {
            isOperatorClicked = true;
            oldValue = display.getText();
            operator = "-";
        } else if (e.getSource() == mulButton) {
            isOperatorClicked = true;
            oldValue = display.getText();
            operator = "*";
        } else if (e.getSource() == divButton) {
            isOperatorClicked = true;
            oldValue = display.getText();
            operator = "/";
        } else if (e.getSource() == modButton) {
            isOperatorClicked = true;
            oldValue = display.getText();
            operator = "%";
        } else if (e.getSource() == expButton) {
            isOperatorClicked = true;
            oldValue = display.getText();
            operator = "^";
        }

        // --------------- EQUALS BUTTON ---------------

        else if (e.getSource() == eqButton) {
            String newValue = display.getText();
            double oldVal = Double.parseDouble(oldValue);
            double newVal = Double.parseDouble(newValue);
            double result = 0;

            switch (operator) {
                case "+":
                    result = oldVal + newVal;
                    break;
                case "-":
                    result = oldVal - newVal;
                    break;
                case "*":
                    result = oldVal * newVal;
                    break;
                case "/":
                    result = newVal != 0 ? oldVal / newVal : Double.NaN;
                    break;
                case "%":
                    result = oldVal % newVal;
                    break;
                case "^":
                    result = Math.pow(oldVal, newVal);
                    break;
            }

            display.setText(String.valueOf(result));
            isOperatorClicked = false;
        }

        // --------------- UTILITY BUTTONS ---------------

        else if (e.getSource() == clButton) {
            display.setText("");
            oldValue = "";
            operator = "";
            isOperatorClicked = false;
        } else if (e.getSource() == delButton) {
            String text = display.getText();
            if (!text.isEmpty()) {
                display.setText(text.substring(0, text.length() - 1));
            }
        } else if (e.getSource() == dotButton) {
            if (!display.getText().contains(".")) {
                display.setText(display.getText() + ".");
            }
        }
    }
}
