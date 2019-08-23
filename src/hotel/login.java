/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
//import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Loloy
 */
public class login extends JFrame implements ActionListener{
    public JPanel panelLogin;
    private JTextField cajaUsuario;
    private JPasswordField cajaPasword;
    private JButton Ingresar,salir;
    private JMenuBar menuPrincipal;
    private JMenu opciones;
    private JMenu ayuda;
    public  login(){
        this.setTitle("Hotel de verano");
        this.setSize(250, 570);
        this.setResizable(false);
        this.setBackground(Color.WHITE);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        iniciarComponentes();
    }
    private void iniciarComponentes(){
        Panel();
        etiquetas();
        cajasTexto();
        botones();
        menu();
    }
    private void Panel(){
        panelLogin= new JPanel();
        panelLogin.setLayout(null);
        panelLogin.setBackground(Color.WHITE);
        this.getContentPane().add(panelLogin);
    }
    private void etiquetas(){
//        Cursor cursos = new Cursor(Cursor.HAND_CURSOR);
        JLabel titulo= new JLabel("Sistema de registro de huespedes");
        titulo.setBounds(5, 1, 390, 30);
//        titulo.setCursor(cursos);
        titulo.setFont(new Font("Times New Roman", 3, 17));
        panelLogin.add(titulo);
        
        JLabel titulo2= new JLabel("Hotel las vacaciones");
        titulo2.setBounds(50, 35, 390, 30);
        titulo2.setFont(new Font("Times New Roman", 3, 17));
        panelLogin.add(titulo2);
        
        ImageIcon imagenLogin = new ImageIcon("C:\\Users\\Loloy\\Documents\\NetBeansProjects\\Hotel\\imagenes/login.png");
        JLabel imagenTitulo = new JLabel(imagenLogin);
        imagenTitulo.setBounds(1, 1, 230, 400);
        panelLogin.add(imagenTitulo);

//        Cursor curso = new Cursor(Cursor.HAND_CURSOR);
        JLabel usuario= new JLabel("Usuario:");
        usuario.setBounds(10, 330, 100, 30);
        usuario.setFont(new Font("Times New Roman", 3, 14));
        //usuario.setCursor(curso);
        panelLogin.add(usuario);
        
        JSeparator separador1=new JSeparator();
        separador1.setBounds(10, 330, 200, 300);
        panelLogin.add(separador1);
        
        JLabel Pasword= new JLabel("Pasword:");
        Pasword.setBounds(10, 380, 100, 30);
        Pasword.setFont(new Font("Times New Roman", 3, 14));
        panelLogin.add(Pasword);
        
        JSeparator separador=new JSeparator();
        separador.setBounds(10, 380, 200, 300);
        panelLogin.add(separador);
        
        JLabel derechos= new JLabel("©Hotel-las-vacaciones S.A.C TM 2019");
        derechos.setBounds(25, 480, 250, 30);
        //derechos.setCursor(Cursor.getPredefinedCursor (Cursor.HAND_CURSOR));
        derechos.setFont(new Font("Times New Roman", 3, 12));
        panelLogin.add(derechos);
        
        Cursor curso = new Cursor(Cursor.HAND_CURSOR);
        JLabel recu= new JLabel("Has olvidado tu cuenta has? clik aca!");
        recu.setBounds(55, 400, 200, 30);
        recu.setCursor(curso);
        
        recu.setForeground(Color.BLUE);
        recu.setFont(new Font("Times New Roman", 3, 11));
        panelLogin.add(recu);
    }
    private void cajasTexto(){
        cajaUsuario=new JTextField();
        cajaUsuario.setBounds(10, 310, 200, 20);
        cajaUsuario.setCaretColor(Color.GREEN);
        cajaUsuario.setBorder(null);
        panelLogin.add(cajaUsuario);
        
        cajaPasword=new JPasswordField();
        cajaPasword.setBounds(10, 360, 200, 20);
        cajaPasword.setCaretColor(Color.GREEN);
        cajaPasword.setBorder(null);
        panelLogin.add(cajaPasword);
    }
    private void botones(){
        ImageIcon imagenEntrar = new ImageIcon("C:\\Users\\Loloy\\Documents\\NetBeansProjects\\Hotel\\imagenes/enter2.png");
        Ingresar =new JButton("Ingresar");
        Ingresar.setBounds(10, 430, 100, 30);
        Ingresar.setBackground(Color.WHITE);
        Ingresar.setBorder(null);
        Ingresar.setIcon(new ImageIcon(imagenEntrar.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
        Ingresar.addActionListener(this);
        //Ingresar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        panelLogin.add(Ingresar);
        
        //Cursor cur = new Cursor(Cursor.HAND_CURSOR);
        ImageIcon imagenSalir = new ImageIcon("C:\\Users\\Loloy\\Documents\\NetBeansProjects\\Hotel\\imagenes/salida.png");
        salir =new JButton("Salir");
        salir.setBounds(130, 430, 100, 30);
        salir.addActionListener(this);
        salir.setBackground(Color.WHITE);
        //salir.setCursor(cur);
        salir.setIcon(new ImageIcon(imagenSalir.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
        salir.setBorder(null);
        panelLogin.add(salir);
    }
    private void menu(){
        menuPrincipal = new JMenuBar();
        setJMenuBar(menuPrincipal);
        
        ImageIcon imges = new ImageIcon("C:\\Users\\Loloy\\Documents\\NetBeansProjects\\Hotel\\imagenes/ajustes.png");
        opciones = new JMenu("Opciones");
        opciones.setIcon(new ImageIcon(imges.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
        menuPrincipal.add(opciones);
        
        ayuda= new JMenu("Ayuda");
        menuPrincipal.add(ayuda);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==Ingresar){
           ventanaPrincipal ok = new ventanaPrincipal();
           ok.setVisible(true);
           dispose();
        }
        if(ae.getSource()==salir){
            System.exit(0);
        }
    }
    
}
