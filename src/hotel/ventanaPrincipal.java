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
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author Loloy
 */
public class ventanaPrincipal extends JFrame implements ActionListener{
    // <editor-fold defaultstate="collapsed" desc="variables globales">
    private JPanel panelPrincipal;
    private JPanel panelPrincipal2;
    private JButton habitaciones;
    private JButton clientes;
    private JButton reportes;
    private JButton trabajadores;
    
    private JMenuBar menuPrincipal;
    private JMenu opciones;
    private JMenu ayuda;
    
    private JLabel tituloHabitacion;
    private JLabel NHabitacion;
    private JLabel MHabitacion;
    private JLabel AHabitacion;
    private JLabel LHabitacion;
    private JButton nuevaHabitacion;
    private JButton mantenimientoHabitacion;
    private JButton AlquilerHabitacion;
    private JButton listaHabitacion;
    
    private JLabel tituloCliente;
    
    private JLabel tituloTrabajadores;
    
    private JLabel tituloReporte;
    // </editor-fold>  
    
    public  ventanaPrincipal(){
        this.setTitle("Hotel de verano");
        this.setSize(700, 700);
        this.setResizable(false);
        this.setBackground(Color.WHITE);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        iniciarComponentes();
    }
    private void iniciarComponentes(){
        Panel();
        etiquetas();
//        cajasTexto();
        botones();
        menu();
        habitacion();
    }
   private void Panel(){
        panelPrincipal= new JPanel();
        panelPrincipal.setLayout(null);
        //panelPrincipal.setBounds(0, 0, 200, 700);
        panelPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelPrincipal.setBackground(new java.awt.Color(204, 255, 255));
        this.getContentPane().add(panelPrincipal);
        
        panelPrincipal2= new JPanel();
        panelPrincipal2.setLayout(null);
        //panelPrincipal2.setBounds(300, 0, 500, 700);
        panelPrincipal2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelPrincipal2.setBackground(new java.awt.Color(153, 255, 153));
        panelPrincipal2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        this.getContentPane().add(panelPrincipal2);
        
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 606, Short.MAX_VALUE)
        );
        
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(panelPrincipal2);
        panelPrincipal2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPrincipal2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelPrincipal2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        
    } 
   private void etiquetas(){
        Cursor curso = new Cursor(Cursor.HAND_CURSOR);
        ImageIcon imagenAdmin = new ImageIcon("C:\\Users\\Loloy\\Documents\\NetBeansProjects\\Hotel\\imagenes/admin.png");
        JLabel titulo= new JLabel(imagenAdmin);
        titulo.setBounds(50, 5, 110, 150);
        titulo.setCursor(curso);
        panelPrincipal.add(titulo);
        
        JLabel titulo2= new JLabel("Administrador");
        titulo2.setBounds(50, 155, 150, 30);
        titulo2.setFont(new Font("Times New Roman", 3, 17));
        panelPrincipal.add(titulo2);
        
        JSeparator separador1=new JSeparator();
        separador1.setBounds(0, 185, 250, 300);
        panelPrincipal.add(separador1);
   }
   
   private void botones(){
        ImageIcon imagenEntrar = new ImageIcon("C:\\Users\\Loloy\\Documents\\NetBeansProjects\\Hotel\\imagenes/habitacion.png");
        habitaciones =new JButton("Habitaciones");
        habitaciones.setBounds(25, 190, 150, 30);
        habitaciones.setFont(new Font("Times New Roman", 3, 20));
        habitaciones.setBackground(new java.awt.Color(204, 255, 255));
        habitaciones.setBorder(null);
        habitaciones.setIcon(new ImageIcon(imagenEntrar.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
        habitaciones.addActionListener(this);
        panelPrincipal.add(habitaciones);
        
        ImageIcon imagenSalir = new ImageIcon("C:\\Users\\Loloy\\Documents\\NetBeansProjects\\Hotel\\imagenes/cliente.png");
        clientes =new JButton("Clientes");
        clientes.setBounds(30, 220, 100, 30);
        clientes.addActionListener(this);
        clientes.setBackground(new java.awt.Color(204, 255, 255));
        clientes.setFont(new Font("Times New Roman", 3, 20));
        clientes.setIcon(new ImageIcon(imagenSalir.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
        clientes.setBorder(null);
        panelPrincipal.add(clientes);
        
        ImageIcon imagenTrabajadores = new ImageIcon("C:\\Users\\Loloy\\Documents\\NetBeansProjects\\Hotel\\imagenes/trabajadores.png");
        trabajadores =new JButton("Trabajadores");
        trabajadores.setBounds(30, 250, 150, 30);
        trabajadores.addActionListener(this);
        trabajadores.setBackground(new java.awt.Color(204, 255, 255));
        trabajadores.setFont(new Font("Times New Roman", 3, 20));
        trabajadores.setIcon(new ImageIcon(imagenTrabajadores.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
        trabajadores.setBorder(null);
        panelPrincipal.add(trabajadores);
        
        ImageIcon imagenReporte = new ImageIcon("C:\\Users\\Loloy\\Documents\\NetBeansProjects\\Hotel\\imagenes/reporte.png");
        reportes =new JButton("Reporte");
        reportes.setBounds(30, 290, 100, 30);
        reportes.addActionListener(this);
        reportes.setBackground(new java.awt.Color(204, 255, 255));
        reportes.setFont(new Font("Times New Roman", 3, 20));
        reportes.setIcon(new ImageIcon(imagenReporte.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
        reportes.setBorder(null);
        panelPrincipal.add(reportes);
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
    
   private void habitacion(){
       // <editor-fold defaultstate="collapsed" desc="codigo etiquetas">
        tituloHabitacion = new JLabel("Gestión de habitaciones");
        tituloHabitacion.setFont(new Font("Times New Roman", 3, 40));
        tituloHabitacion.setBounds(120, 10,400, 40);
        tituloHabitacion.setVisible(false);
        panelPrincipal2.add(tituloHabitacion);
        
        NHabitacion = new JLabel("Nueva Habitacion");
        NHabitacion.setFont(new Font("Times New Roman", 3, 22));
        NHabitacion.setBounds(30, 250, 200, 30);
        NHabitacion.setVisible(false);
        panelPrincipal2.add(NHabitacion);
        
        MHabitacion = new JLabel("Mantenimiento de Habitacion");
        MHabitacion.setFont(new Font("Times New Roman", 3, 22));
        MHabitacion.setBounds(300, 250, 300, 30);
        MHabitacion.setVisible(false);
        panelPrincipal2.add(MHabitacion);
        
        AHabitacion = new JLabel("Alquiler de Habitacion");
        AHabitacion.setFont(new Font("Times New Roman", 3, 22));
        AHabitacion.setBounds(30, 450, 250, 30);
        AHabitacion.setVisible(false);
        panelPrincipal2.add(AHabitacion);
        
        LHabitacion = new JLabel("Lista de Habitaciones");
        LHabitacion.setFont(new Font("Times New Roman", 3, 22));
        LHabitacion.setBounds(320, 450, 250, 30);
        LHabitacion.setVisible(false);
        panelPrincipal2.add(LHabitacion);
        // </editor-fold>  
        // <editor-fold defaultstate="collapsed" desc="codigo botones">  
        ImageIcon imagenHabi = new ImageIcon("C:\\Users\\Loloy\\Documents\\NetBeansProjects\\Hotel\\imagenes/Nhabitacion.png");
        nuevaHabitacion = new JButton(imagenHabi);
        nuevaHabitacion.setBounds(30, 100, 150, 150);
        nuevaHabitacion.setBorder(null);
        nuevaHabitacion.setVisible(false);
        nuevaHabitacion.setBackground(new java.awt.Color(153, 255, 153));
        nuevaHabitacion.setIcon(new ImageIcon(imagenHabi.getImage().getScaledInstance(nuevaHabitacion.getWidth(), nuevaHabitacion.getHeight(), Image.SCALE_SMOOTH)));
        nuevaHabitacion.addActionListener(this);
        panelPrincipal2.add(nuevaHabitacion);
        
        ImageIcon imagenMantenimiento = new ImageIcon("C:\\Users\\Loloy\\Documents\\NetBeansProjects\\Hotel\\imagenes/soporte.png");
        mantenimientoHabitacion = new JButton("m");
        mantenimientoHabitacion.setBounds(350, 100, 150, 150);
        mantenimientoHabitacion.setBorder(null);
        mantenimientoHabitacion.setIcon(new ImageIcon(imagenMantenimiento.getImage().getScaledInstance(mantenimientoHabitacion.getWidth(), mantenimientoHabitacion.getHeight(), Image.SCALE_SMOOTH)));
        mantenimientoHabitacion.setBackground(new java.awt.Color(153, 255, 153));
        mantenimientoHabitacion.setVisible(false);
        mantenimientoHabitacion.addActionListener(this);
        panelPrincipal2.add(mantenimientoHabitacion);
        
        ImageIcon imagenAlquiler = new ImageIcon("C:\\Users\\Loloy\\Documents\\NetBeansProjects\\Hotel\\imagenes/alquiler.png");
        AlquilerHabitacion = new JButton("a");
        AlquilerHabitacion.setBounds(30, 300, 160, 150);
        AlquilerHabitacion.setBorder(null);
        AlquilerHabitacion.setBackground(new java.awt.Color(153, 255, 153));
        AlquilerHabitacion.setVisible(false);
        AlquilerHabitacion.setIcon(new ImageIcon(imagenAlquiler.getImage().getScaledInstance(AlquilerHabitacion.getWidth(), AlquilerHabitacion.getHeight(), Image.SCALE_SMOOTH)));
        AlquilerHabitacion.addActionListener(this);
        panelPrincipal2.add(AlquilerHabitacion);
        
        ImageIcon imagenLista = new ImageIcon("C:\\Users\\Loloy\\Documents\\NetBeansProjects\\Hotel\\imagenes/habitaciones.png");
        listaHabitacion = new JButton();
        listaHabitacion.setBounds(350, 300, 150, 150);
        listaHabitacion.setBorder(null);
        listaHabitacion.setVisible(false);
        listaHabitacion.setBackground(new java.awt.Color(153, 255, 153));
        listaHabitacion.setIcon(new ImageIcon(imagenLista.getImage().getScaledInstance(listaHabitacion.getWidth(), listaHabitacion.getHeight(), Image.SCALE_SMOOTH)));
        listaHabitacion.addActionListener(this);
        panelPrincipal2.add(listaHabitacion);
        // </editor-fold>  
        
    }
   private void clientes(){
        tituloCliente = new JLabel("Gestión de clientes");
        tituloCliente.setFont(new Font("Times New Roman", 3, 22));
        tituloCliente.setBounds(150, 10, 250, 40);
        tituloCliente.setVisible(false);
        panelPrincipal2.add(tituloCliente);
        
    }
   private void trabajadores(){
        tituloTrabajadores = new JLabel("Gestión de trabajadores");
        tituloTrabajadores.setFont(new Font("Times New Roman", 3, 22));
        tituloTrabajadores.setBounds(150, 10, 250, 40);
        tituloTrabajadores.setVisible(false);
        panelPrincipal2.add(tituloTrabajadores);
        
    }
   private void reporte(){
        tituloReporte = new JLabel("Gestión de reportes");
        tituloReporte.setFont(new Font("Times New Roman", 3, 22));
        tituloReporte.setBounds(150, 10, 250, 40);
        tituloReporte.setVisible(true);
        panelPrincipal2.add(tituloReporte);
        
    }
   @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==habitaciones){
            tituloHabitacion.setVisible(true);
            nuevaHabitacion.setVisible(true);
            mantenimientoHabitacion.setVisible(true);
            AlquilerHabitacion.setVisible(true);
            listaHabitacion.setVisible(true);
            NHabitacion.setVisible(true);
            MHabitacion.setVisible(true);
            AHabitacion.setVisible(true);
            LHabitacion.setVisible(true);
        }
        if(ae.getSource()==clientes){
            tituloCliente.setVisible(true);
        }
        if(ae.getSource()==trabajadores){
            tituloTrabajadores.setVisible(true);
        }
        if(ae.getSource()==reportes){
            reporte();
        }
        if(ae.getSource()==nuevaHabitacion){
            nuevaHabi ventana= new nuevaHabi(this,true);
            ventana.setVisible(true);
        }
    }
    
    
}
