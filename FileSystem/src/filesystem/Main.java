/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package filesystem;

import Controller.Controlador;
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
      /*
      Disco disk = new Disco(10,10);
      
      for (int i = 0; i < 1; i++){
          disk.addArchivo("Marco", 1);
      }
      disk.addArchivo("Felipe", 2);
      disk.addArchivo("Yepeto", 3);
      disk.addArchivo("Mario", 4);
      disk.modifyArchivo("Federico Vilchez", 2);
    
      
      disk.toJson();
    
     Controlador controlador = new Controlador();
     controlador.crearDisco(10, 10);
     controlador.crearArchivo("Marco", "txt", "Soy Marco Reveiz", 0);
     controlador.crearDirectorio("Trabajo", 0); // 1
     controlador.crearDirectorio("Trabajo1", 1); // 2
     controlador.crearDirectorio("Equis", 2); // 3
     controlador.crearDirectorio("AP", 0); // 4
     controlador.crearDirectorio("AP", 3); // 5
     controlador.crearArchivo("Marco2", "txt", "Soy Diego Castro", 1);
     controlador.crearArchivo("EquisD", "txt", "Soy Felipe Castro", 3);
     controlador.crearArchivo("AP", "txt", "Soy Oscar Castro", 4);  
     controlador.removerArch(1, 1);
     controlador.modFile(4, 3, "Curso de Administracion de Proyectos");
     controlador.moverDir(0, 1, 2);
     System.out.println(controlador.listaDirActual(0));
     controlador.imprimirDirectorios();    
     controlador.disco.toJson();*/
    }
        
  

}
