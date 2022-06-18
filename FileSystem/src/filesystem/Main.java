/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package filesystem;

import Model.Disco;
import Model.Byte;
import View.Explorer;
import java.awt.FlowLayout;
import java.awt.GridLayout;



import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JPanel;

import javax.swing.JTextField;
import javax.swing.JToggleButton;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Marco
 */



public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
       new Explorer().setVisible(true);
      
      /* JButton boton1 = new JButton("Hola");
        JToggleButton btn = new JToggleButton("Como estan?");
        JLabel etiqueta = new JLabel("Saludos y");
        JTextField campo = new JTextField("Adios..", 12);
        JFrame marco = new JFrame();
        marco.setTitle("FlowLayout(int align, int hgap, int vgap)");
        marco.setSize(400,300);
        marco.setLocationRelativeTo(null);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
       
        marco.setLayout(new FlowLayout(FlowLayout.LEFT, 150,0) );
       
        marco.add(boton1);marco.add(btn);
        marco.add(etiqueta);marco.add(campo);*/
     
        /*
      Disco disk = new Disco(10,10);
      for (int i = 0; i < 5; i++){
          disk.addArchivo("Marco", 1);
      }
      disk.addArchivo("Felipe", 2);
      disk.addArchivo("Yepeto", 3);
      disk.addArchivo("Federico", 4);
      disk.removeArchivo(2);
      
      disk.toJson();*/
        
      
        
    }
        
  

}
