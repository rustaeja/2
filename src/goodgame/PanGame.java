/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goodgame;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Justin
 */
public class PanGame extends JPanel implements ActionListener {

    boolean isX = true;
    int arnN[] = new int[9];
    int nCount = 0;
    JButton btn[] = new JButton[9];
    String don;

    public PanGame() {
        setLayout(new GridLayout(3, 3));
        for (int i = 0; i < 9; i++) {
            btn[i] = new JButton();
            btn[i].setFont(new Font("ALGERIAN", Font.PLAIN, 50));
            btn[i].addActionListener(this);
            add(btn[i]);
        }
    }

    public void actionPerformed(ActionEvent evt) {
        int j = 0;
        for (int i = 0; i < 9; i++) {
            if (evt.getSource() == btn[i]) {
                j = i;
                System.out.print(i);
                break;
            }
        }
        if (isX) {
            isX = false;
            btn[j].setText("X");
            arnN[j] = 1;
            PanPrompt.lblTurn.setText("Player 1's Turn (X)");
        } else {
            isX = true;
            btn[j].setText("O");
            arnN[j] = 2;
            PanPrompt.lblTurn.setText("Player 2's Turn (O)");
        }
        btn[j].setEnabled(false);
        WinCheck.set(arnN);
        nCount++;
    }
}