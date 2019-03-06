/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import businesLogic.CreacionDeObjetos;
import data.Habilidad;
import data.Items;
import data.Personaje;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class CrearNPC extends javax.swing.JFrame {

   private String name, classs, race;
   private int level, xpPoints, life, iniciative, strong, inteligence, charm, dexterity, wisdom, speed, armor;
   private Habilidad[] habilidades= new Habilidad[3] ;
   private ArrayList <String> objetos1 = new ArrayList <String>();
   private ArrayList <String> habilidad1 = new ArrayList <String>();
   private Items objetos[] = new Items [5]; 
    
    
    
    
    
    /**
     * Creates new form CrearNPC
     */
    public CrearNPC() {
        
        initComponents();
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        clase = new javax.swing.JTextField();
        raza = new javax.swing.JTextField();
        vida = new javax.swing.JTextField();
        nivel = new javax.swing.JTextField();
        velocidad = new javax.swing.JTextField();
        armadura = new javax.swing.JTextField();
        fuerza = new javax.swing.JTextField();
        inteligencia = new javax.swing.JTextField();
        carisma = new javax.swing.JTextField();
        destreza = new javax.swing.JTextField();
        sabiduria = new javax.swing.JTextField();
        iniciativa = new javax.swing.JTextField();
        experiencia = new javax.swing.JTextField();
        crearNPC = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaObjetos = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        itemsAgregados = new javax.swing.JList<>();
        detallesItem = new javax.swing.JButton();
        agregarItem = new javax.swing.JButton();
        quitarItem = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaHabilidades = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        habilidadesAgregadas = new javax.swing.JList<>();
        detallesHabilidad = new javax.swing.JButton();
        agregarHabilidad = new javax.swing.JButton();
        quitarHabilidad = new javax.swing.JButton();
        volver1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("personaje"));

        jLabel1.setText("vida");

        jLabel2.setText("nombre");

        jLabel3.setText("clase");

        jLabel4.setText("raza");

        jLabel5.setText("nivel");

        jLabel6.setText("velocidad");

        jLabel7.setText("armadura");

        jLabel8.setText("fuerza");

        jLabel9.setText("inteligencia");

        jLabel10.setText("carisma");

        jLabel11.setText("destreza");

        jLabel12.setText("sabiduria");

        jLabel13.setText("iniciativa");

        jLabel14.setText("xp");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nombre)
                    .addComponent(clase)
                    .addComponent(raza)
                    .addComponent(vida)
                    .addComponent(nivel)
                    .addComponent(velocidad)
                    .addComponent(armadura)
                    .addComponent(fuerza)
                    .addComponent(inteligencia)
                    .addComponent(carisma)
                    .addComponent(destreza)
                    .addComponent(sabiduria)
                    .addComponent(iniciativa)
                    .addComponent(experiencia, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(clase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(raza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(vida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(velocidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(armadura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(fuerza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(inteligencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(carisma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(destreza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(sabiduria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(iniciativa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(experiencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        crearNPC.setText("crear NPC");
        crearNPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearNPCActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("items"));

        listaObjetos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaObjetos);

        jScrollPane2.setViewportView(itemsAgregados);

        detallesItem.setText("detalles");
        detallesItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detallesItemActionPerformed(evt);
            }
        });

        agregarItem.setText("agregar");
        agregarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarItemActionPerformed(evt);
            }
        });

        quitarItem.setText("quitar");
        quitarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitarItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(agregarItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(detallesItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(quitarItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(detallesItem)
                        .addGap(91, 91, 91)
                        .addComponent(agregarItem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(quitarItem))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("habilidades"));

        listaHabilidades.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(listaHabilidades);

        jScrollPane4.setViewportView(habilidadesAgregadas);

        detallesHabilidad.setText("detalles");
        detallesHabilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detallesHabilidadActionPerformed(evt);
            }
        });

        agregarHabilidad.setText("agregar");
        agregarHabilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarHabilidadActionPerformed(evt);
            }
        });

        quitarHabilidad.setText("quitar");
        quitarHabilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitarHabilidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(detallesHabilidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(agregarHabilidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(quitarHabilidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(detallesHabilidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                        .addComponent(agregarHabilidad)
                        .addGap(82, 82, 82)
                        .addComponent(quitarHabilidad))
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        volver1.setText("volver");
        volver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volver1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(crearNPC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(volver1)
                .addGap(249, 249, 249))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crearNPC)
                    .addComponent(volver1))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volver1ActionPerformed
        adminGUI cons= new adminGUI();
        cons.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volver1ActionPerformed

    private void crearNPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearNPCActionPerformed
        this.name = nombre.getText();
        this.classs = clase.getText();
        this.race = raza.getText();
        this.level = Integer.parseInt(nivel.getText());
        this.xpPoints = Integer.parseInt(experiencia.getText());
        this.life = Integer.parseInt(vida.getText());
        this.iniciative = Integer.parseInt(iniciativa.getText());
        this.strong = Integer.parseInt(fuerza.getText());
        this.inteligence = Integer.parseInt(inteligencia.getText());
        this.charm = Integer.parseInt(carisma.getText());
        this.dexterity = Integer.parseInt(destreza.getText());
        this.wisdom = Integer.parseInt(sabiduria.getText());
        this.speed = Integer.parseInt(velocidad.getText());
        this.armor = Integer.parseInt(armadura.getText());
        asignarObjetos(objetos1);
        asignarHabilidades(habilidad1);
        CreacionDeObjetos buss = new CreacionDeObjetos ();
        if(buss.crearObjetosNPC(name, classs, race, level, xpPoints, life, iniciative, strong, inteligence, charm, dexterity, wisdom, speed, armor, objetos, habilidades)){
            JOptionPane.showMessageDialog(rootPane, "el personaje ha sido creado");
        }else{
            JOptionPane.showMessageDialog(rootPane, "el personaje no ha sido creado");
        }
        
        
        
    }//GEN-LAST:event_crearNPCActionPerformed

    private void detallesItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detallesItemActionPerformed
        String message = null;
        
        message = listaObjetos.getSelectedValue();

        Items aux = new Items();
        aux = aux.leerObjetoItem(message);
        
        JOptionPane.showMessageDialog(rootPane, aux.toString());
    }//GEN-LAST:event_detallesItemActionPerformed

    private void detallesHabilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detallesHabilidadActionPerformed
       String message = null;
        message = listaHabilidades.getSelectedValue();
        Habilidad aux = new Habilidad();
        aux = aux.leerObjetoHabilidad(message);
        JOptionPane.showMessageDialog(rootPane, aux.toString());
    }//GEN-LAST:event_detallesHabilidadActionPerformed

    private void agregarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarItemActionPerformed
        String name = null;
        String [] lista;
        lista = new String [5] ;
        name = listaObjetos.getSelectedValue();
        Items aux = new Items();
        aux = aux.leerObjetoItem(name);
        if(objetos1.size()>4)    {
            JOptionPane.showMessageDialog(rootPane, "maximo 5 items iniciales");
            itemsAgregados.setListData(lista);
            for (int i=0; i<=4 ; i++) {
                lista [i] = objetos1.get(i).toString();
            }
        }else
            objetos1.add(aux.getNombre());
        for (int i=0; i<=objetos1.size()-1 ; i++) {   
                lista [i] = objetos1.get(i);
        }
        itemsAgregados.setListData(lista);  
    }//GEN-LAST:event_agregarItemActionPerformed

    private void quitarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitarItemActionPerformed
        String [] lista;
        lista = new String [5] ;
        for (int i = 0; i < objetos1.size() ; i++) {   
            if(itemsAgregados.getSelectedValue().equals(objetos1.get(i))){
                for (int j = i; j < objetos1.size()-1; j++) {
                lista[j] = objetos1.get(j+1);    
                }
                ArrayList <String> aux = new ArrayList <String>();
                for (int j = 0; j < objetos1.size()-1; j++) {
                        aux.add(lista[j]);
                    }
                objetos1 = aux;
                itemsAgregados.setListData(lista);
            }else
                lista[i] = objetos1.get(i);
                }
    }//GEN-LAST:event_quitarItemActionPerformed

    private void agregarHabilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarHabilidadActionPerformed
        String name = null;
        String [] lista;
        lista = new String [3] ;
        name = listaHabilidades.getSelectedValue();
        Habilidad aux = new Habilidad();
        aux = aux.leerObjetoHabilidad(name);
        if(habilidad1.size()>2)    {
            JOptionPane.showMessageDialog(rootPane, "maximo 3 habilidades iniciales");
            habilidadesAgregadas.setListData(lista);
            for (int i=0; i<=2 ; i++) {
                lista [i] = habilidad1.get(i).toString();
            }
        }else
            habilidad1.add(aux.getNombre());
        for (int i=0; i<=habilidad1.size()-1 ; i++) {
                lista [i] = habilidad1.get(i);
        }
        habilidadesAgregadas.setListData(lista);        // TODO add your handling code here:
    }//GEN-LAST:event_agregarHabilidadActionPerformed

    private void quitarHabilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitarHabilidadActionPerformed
        String [] lista;
        lista = new String [5] ;
        for (int i = 0; i < habilidad1.size() ; i++) {   
            if(habilidadesAgregadas.getSelectedValue().equals(habilidad1.get(i))){
                System.out.println(habilidad1.size());
                for (int j = i; j < habilidad1.size()-1; j++) {
                lista[j] = habilidad1.get(j+1);    
                }
                ArrayList <String> aux = new ArrayList <String>();
                for (int j = 0; j < habilidad1.size()-1; j++) {
                        aux.add(lista[j]);
                        System.out.println(lista[j]);
                    }
                habilidad1 = aux;
                habilidadesAgregadas.setListData(lista);
            }else
                lista[i] = habilidad1.get(i);
                }        // TODO add your handling code here:
    }//GEN-LAST:event_quitarHabilidadActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CrearNPC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearNPC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearNPC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearNPC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearNPC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarHabilidad;
    private javax.swing.JButton agregarItem;
    private javax.swing.JTextField armadura;
    private javax.swing.JTextField carisma;
    private javax.swing.JTextField clase;
    private javax.swing.JButton crearNPC;
    private javax.swing.JTextField destreza;
    private javax.swing.JButton detallesHabilidad;
    private javax.swing.JButton detallesItem;
    private javax.swing.JTextField experiencia;
    private javax.swing.JTextField fuerza;
    private javax.swing.JList<String> habilidadesAgregadas;
    private javax.swing.JTextField iniciativa;
    private javax.swing.JTextField inteligencia;
    private javax.swing.JList<String> itemsAgregados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<String> listaHabilidades;
    private javax.swing.JList<String> listaObjetos;
    private javax.swing.JTextField nivel;
    private javax.swing.JTextField nombre;
    private javax.swing.JButton quitarHabilidad;
    private javax.swing.JButton quitarItem;
    private javax.swing.JTextField raza;
    private javax.swing.JTextField sabiduria;
    private javax.swing.JTextField velocidad;
    private javax.swing.JTextField vida;
    private javax.swing.JButton volver1;
    // End of variables declaration//GEN-END:variables

    public void setItemsDeListaNPCs(ArrayList<String> nombres) {
       String [] lista = new String [nombres.size()];
    for (int i = 0; i < nombres.size(); i++) {
        lista[i] = nombres.get(i);
    }
    this.listaObjetos.setListData(lista);
    }

    public void setHabilidadesDeLista(ArrayList<String> nombres) {
        String [] lista = new String [nombres.size()];
        for (int i = 0; i < nombres.size(); i++) {
            lista[i] = nombres.get(i);
        }
        this.listaHabilidades.setListData(lista);
    }

    private void asignarObjetos(ArrayList<String> objetos1) {
        Items aux[] = new Items [5];
        Items cons = new Items();
        for (int i = 0; i < objetos1.size(); i++) {
            aux[i]=cons.leerObjetoItem(objetos1.get(i));
        }
        setObjetos(aux);
    }
    
    private void asignarHabilidades(ArrayList<String> habilidad1) {
        Habilidad aux[] = new Habilidad [5];
        Habilidad cons = new Habilidad();
        for (int i = 0; i < 3; i++) {
            aux[i]=cons.leerObjetoHabilidad(habilidad1.get(i));
        }
        setHabilidades(aux);
    }

    public Habilidad[] getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(Habilidad[] habilidades) {
        this.habilidades = habilidades;
    }

    public Items[] getObjetos() {
        return objetos;
    }

    public void setObjetos(Items[] objetos) {
        this.objetos = objetos;
    }
    
    
}