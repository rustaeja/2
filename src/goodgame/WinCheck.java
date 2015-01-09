/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goodgame;

/**
 *
 * @author Justin
 */
class WinCheck {

   static int arnNs[] = new int[9];

    static void set(int[] _arnN) {
        arnNs = _arnN;
    }
   static void print(){
        for(int i=0;i<9;i++){
          System.out.println(arnNs[i]);             
        }
    }
   static void Check(){
       for(int i=0;i<9;i++){
           if(arnNs[i]==1){
               if(arnNs[(i+1)]==1){
                   if(arnNs[(i+2)]==1){
                       PanDisp.pangame.Updawg();
                   }
               }
           }
       }
   }
}
