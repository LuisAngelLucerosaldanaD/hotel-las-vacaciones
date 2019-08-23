package hotel;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

/*
 * @author Luis Ángel
 */
public class nuevaHabi extends JDialog implements ActionListener{
    //<editor-fold defaultstate="collapsed" desc="variables globales"> 
    private JPanel panelN;
    private JPanel panelP;
    private JTextField cajaTP;
    private JTextField cajaNH;
    private JTextField cajaPH;
    private JTextField cajaTM;
    private JTextField cajaUH;
    private JButton acep;
    private JButton cance;
    // </editor-fold> 
    public nuevaHabi(java.awt.Frame parent , boolean modal) {
        super(parent,modal);
        this.setBounds(500, 100, 400, 600);
        this.setTitle("Nueva Habitacion");
        this.setResizable(false);
        this.setBackground(Color.WHITE);
        inicioComponentes();
    }
    private void inicioComponentes(){
        jpanel();
        labels();
        botones();
        cajas();
    }
    private void jpanel(){
        //<editor-fold defaultstate="collapsed" desc="codigo panel"> 
        panelN = new JPanel();
        panelN.setLayout(null);
        panelP = new JPanel();
        panelP.setLayout(null);
        panelP.setBackground(new java.awt.Color(0, 255, 204));

        panelN.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Nueva Habitación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 2, 13), new java.awt.Color(0, 0, 0))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(panelN);
        panelN.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 275, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 496, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(panelP);
        panelP.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(panelN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        // </editor-fold>
    }
    public void labels(){
        
        JLabel descrip= new JLabel("Datos de la nueva Habitacion");
        descrip.setBounds(40, 20, 250, 20);
        descrip.setFont(new Font("Times New Roman",4,17));
        panelN.add(descrip);
        
        JLabel tipo= new JLabel("Tipo de habitacion:");
        tipo.setBounds(10, 65, 200, 20);
        tipo.setFont(new Font("Times New Roman",3,14));
        panelN.add(tipo);
        
        JLabel NHabi= new JLabel("Numero de la habitacion:");
        NHabi.setBounds(10, 125, 200, 20);
        NHabi.setFont(new Font("Times New Roman",3,14));
        panelN.add(NHabi);
        
        JLabel Phabi= new JLabel("Precio de la habitacion:");
        Phabi.setBounds(10, 185, 200, 20);
        Phabi.setFont(new Font("Times New Roman",3,14));
        panelN.add(Phabi);
        
        JLabel TManHabi= new JLabel("Tiempo de mantenimiento:");
        TManHabi.setBounds(10, 245, 200, 20);
        TManHabi.setFont(new Font("Times New Roman",3,14));
        panelN.add(TManHabi);
        
        JLabel UbicHabi= new JLabel("Ubicación de la Habitación:");
        UbicHabi.setBounds(10, 305, 250, 20);
        UbicHabi.setFont(new Font("Times New Roman",3,14));
        panelN.add(UbicHabi);
        
        JLabel copy= new JLabel("©Hotel-Las-vacaciones TM-2019");
        copy.setBounds(50, 500, 250, 20);
        copy.setCursor(new Cursor(Cursor.HAND_CURSOR));
        copy.setFont(new Font("Times New Roman",3,11));
        panelN.add(copy);
    }
    public void botones(){
        acep= new JButton("Aceptar"); 
        acep.setBounds(10, 370, 100, 30);
        acep.setCursor(new Cursor(Cursor.HAND_CURSOR));
        acep.setMnemonic('a');
        acep.setFont(new Font("Times New Roman", 3, 13));
        acep.addActionListener(this);
        panelN.add(acep);
        
        cance= new JButton("Cancelar"); 
        cance.setBounds(150, 370, 100, 30);
        cance.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cance.setMnemonic('c');
        cance.setFont(new Font("Times New Roman", 3, 13));
        cance.addActionListener(this);
        panelN.add(cance);
    }
    public void cajas(){
        cajaTP = new JTextField();
        cajaTP.setBounds(10, 90, 200, 30);
        panelN.add(cajaTP);
        
        cajaNH = new JTextField();
        cajaNH.setBounds(10, 152, 200, 30);
        panelN.add(cajaNH);
        
        cajaPH = new JTextField();
        cajaPH.setBounds(10, 212, 200, 30);
        panelN.add(cajaPH);
        
        cajaTM = new JTextField();
        cajaTM.setBounds(10, 272, 200, 30);
        panelN.add(cajaTM);
        
        cajaUH = new JTextField();
        cajaUH.setBounds(10, 327, 200, 30);
        panelN.add(cajaUH);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }
    
}
