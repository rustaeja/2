/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goodgame;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Justin
 */
public class PanGame extends JPanel implements ActionListener {

    JButton btn1 = new JButton();
    JButton btn2 = new JButton();
    JButton btn3 = new JButton();
    JButton btn4 = new JButton();
    JButton btn5 = new JButton();
    JButton btn6 = new JButton();
    JButton btn7 = new JButton();
    JButton btn8 = new JButton();
    JButton btn9 = new JButton();
    boolean isX=true;

    public PanGame() {
        setLayout(new GridLayout(3, 3));
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
        add(btn6);
        add(btn7);
        add(btn8);
        add(btn9);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);

    }

    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource() == btn1) {
            if (isX) {
                isX = false;
                btn1.setText("X");
            } else {
                isX = true;
                btn1.setText("O");
            }
        }
        if (evt.getSource() == btn2) {
            if (isX) {
                isX = false;
                btn2.setText("X");
            } else {
                isX = true;
                btn2.setText("O");
            }
        }
        if (evt.getSource() == btn3) {
            if (isX) {
                isX = false;
                btn3.setText("X");
            } else {
                isX = true;
                btn3.setText("O");
            }
        }
        if (evt.getSource() == btn4) {
            if (isX) {
                isX = false;
                btn4.setText("X");
            } else {
                isX = true;
                btn4.setText("O");
            }
        }
        if (evt.getSource() == btn5) {
            if (isX) {
                isX = false;
                btn5.setText("X");
            } else {
                isX = true;
                btn5.setText("O");
            }
        }
        if (evt.getSource() == btn6) {
            if (isX) {
                isX = false;
                btn6.setText("X");
            } else {
                isX = true;
                btn6.setText("O");
            }
        }
        if (evt.getSource() == btn7) {
            if (isX) {
                isX = false;
                btn7.setText("X");
            } else {
                isX = true;
                btn7.setText("O");
            }
        }
        if (evt.getSource() == btn8) {
            if (isX) {
                isX = false;
                btn8.setText("X");
            } else {
                isX = true;
                btn8.setText("O");
            }
        }
        if (evt.getSource() == btn9) {
            if (isX) {
                btn9.setText("X");
                isX = false;
            } else {
                btn9.setText("O");
                isX = true;
            }
        }
    }
}
