/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goodgame;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author Justin
 */
public class PanMM extends JPanel implements ActionListener {

    JButton btnMain = new JButton();
    JButton btnreset = new JButton();
    public static JRadioButton rbTwo = new JRadioButton();
      public static JRadioButton rbAI = new JRadioButton();
    

    public PanMM() {
        ButtonGroup group = new ButtonGroup();
        group.add(rbTwo);
        group.add(rbAI);
        setLayout(new GridLayout(4,1));
        btnMain.setText("Back to main!");
        btnreset.setText("RESET! :D");
        add(btnMain);
        add(btnreset);
        rbTwo.setText("Two players");
        rbTwo.setSelected(true);
        rbAI.setText("One player.");
        add(rbTwo);
        add(rbAI);
        btnreset.addActionListener(this);
    }

    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource() == btnreset) {
            PanDisp.pangame.reset();
        }
    }
}
