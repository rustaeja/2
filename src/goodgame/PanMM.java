/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goodgame;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Justin
 */
public class PanMM extends JPanel implements ActionListener {

    JButton btnMain = new JButton();
    JButton btnreset = new JButton();

    public PanMM() {
        setLayout(new GridLayout(2,1));
        btnMain.setText("Back to main!");
        btnreset.setText("RESET! :D");
        add(btnMain);
        add(btnreset);
        btnreset.addActionListener(this);
    }

    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource() == btnreset) {
            PanDisp.pangame.reset();
        }
    }
}
