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
public class FraMain extends JFrame implements ActionListener{

    PanDisp pandisp = new PanDisp();
    public PanMain panMain = new PanMain();
    public static boolean isHome=true;

    public FraMain() throws Exception {
        setSize(500, 500);
        add(panMain);
        panMain.btnGame.addActionListener(this);
        pandisp.panmm.btnMain.addActionListener(this);
    }
     public void actionPerformed(ActionEvent evt) {
         if(evt.getSource()==panMain.btnGame){
             isHome=false;
             System.out.println("clicked");
             remove(panMain);
             add(pandisp);
             repaint();
             revalidate();
         }
         if(evt.getSource()==pandisp.panmm.btnMain){
             isHome=true;
             remove(pandisp);
             add(panMain);
             repaint();
             revalidate();
         }
     }
}
