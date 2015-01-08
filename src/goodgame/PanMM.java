/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goodgame;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Justin
 */
public class PanMM extends JPanel {

    JButton btnMain = new JButton();

    public PanMM() {
        btnMain.setText("Back to main!");
        add(btnMain);
    }
}
