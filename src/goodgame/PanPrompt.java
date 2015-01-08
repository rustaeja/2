/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package goodgame;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Justin
 */
public class PanPrompt extends JPanel{
    JLabel lblTurn = new JLabel();
    boolean isX;
    public PanPrompt(){
        lblTurn.setText("PLAYER 1'S TURN! (X)");
        add(lblTurn);
    }
}
