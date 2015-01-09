/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goodgame;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author Justin
 */
public class PanDisp extends JPanel {

    public static PanGame pangame = new PanGame();
    public PanMain panmain = new PanMain();
    public PanScore panscore = new PanScore();
    public PanPrompt panprompt = new PanPrompt();
    public PanMM panmm = new PanMM();

    public PanDisp() {
        setLayout(new BorderLayout());
        add(panmm, BorderLayout.WEST);
        add(pangame, BorderLayout.CENTER);
        add(panprompt, BorderLayout.SOUTH);
        add(panscore, BorderLayout.EAST);
    }
}
