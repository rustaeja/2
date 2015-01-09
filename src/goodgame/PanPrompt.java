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
public class PanPrompt extends JPanel {

    public static JLabel lblTurn = new JLabel();
    static boolean isX;

    static void set(boolean _isX) {
        isX = _isX;
    }

    public PanPrompt() {
       add(lblTurn);
    }
}
