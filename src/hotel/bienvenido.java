/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.*;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Loloy
 */
public class bienvenido extends JFrame{
    carga hilo;
    JProgressBar progreso;
    public  bienvenido(){
        this.setTitle("Hotel de verano");
        this.setSize(400, 300);
        this.setResizable(false);
        this.setBackground(Color.WHITE);
        this.setLocationRelativeTo(null);
        progreso=new JProgressBar();
        hilo = new carga(progreso);
        hilo.start();
        hilo=null;
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        iniciarComponentes();
    }
    private void iniciarComponentes(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);
        this.getContentPane().add(panel);
        
        ImageIcon imagenBienvenida = new ImageIcon("C:\\Users\\Loloy\\Documents\\NetBeansProjects\\Hotel\\imagenes/logis.jpg");
        JLabel bienvenida = new JLabel(imagenBienvenida);
        bienvenida.setBounds(5, 5, 400, 200);
        bienvenida.setBorder(null);
        panel.add(bienvenida);
        
        progreso.setBounds(10, 220, 370, 30);
        progreso.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        progreso.setForeground(Color.MAGENTA );
        progreso.setStringPainted(true);
        progreso.setBackground(new Color(51, 51, 255));
        progreso.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jProgressBar1StateChanged(evt);
            }
        });
        panel.add(progreso);
    }
    private void jProgressBar1StateChanged(javax.swing.event.ChangeEvent evt) {                                           
        if(progreso.getValue()==100){
            dispose();
            login ok= new login();
            ok.setVisible(true);
        }
    } 
}
