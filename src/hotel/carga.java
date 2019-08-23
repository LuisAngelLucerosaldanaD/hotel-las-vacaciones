/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import javax.swing.JProgressBar;


/**
 *
 * @author Loloy
 */
public class carga extends Thread{
    JProgressBar barraCarga;
    public carga(JProgressBar progreso){
        super();
        this.barraCarga=progreso;
    }
    @Override
    public void run(){
        for (int i = 1; i <= 100; i++) {
            barraCarga.setValue(i);
            pausa(50);
        }
    }
    public void pausa(int i){
        try{
            Thread.sleep(i);
        }catch(Exception e){
            
        }
    }
}
