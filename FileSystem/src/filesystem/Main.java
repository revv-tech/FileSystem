/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package filesystem;

import Controller.Controlador;
import Model.Disco;
import Model.Byte;
import java.io.FileWriter;
import java.io.IOException;
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
     controlador.disco.toJson();
     
    }
    
}
