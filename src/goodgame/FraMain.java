/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package goodgame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author struj3903
 */
public class FraMain extends JFrame{

   PanDisp pandisp = new PanDisp();
    // public PanMain panMain = new PanMain();

    public FraMain() throws Exception {
       
        setSize(500, 500);
        add(pandisp);
    }
    }
