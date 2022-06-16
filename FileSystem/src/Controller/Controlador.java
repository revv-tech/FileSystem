/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Archivo;
import Model.Directorio;
import Model.Disco;
import java.util.Date;

/**
 *
 * @author Marco
 */
public class Controlador {
    
    public Disco disco;
    public Directorio principal;
    public static int idArchivo = 0;
    public static int idDirectorio = 0;
    
    public void Controlador(){};
    
    // Inicia programa, crea el disco de acuerdo a los tamaños dados y crea el primer directorio
    public void crearDisco(int tamaho, int tamahoSegmento){
        this.disco = new Disco(tamaho, tamahoSegmento);
        this.principal = new Directorio(idDirectorio, "principal");
        this.idDirectorio = this.idDirectorio + 1;
    }
    
    public void crearArchivo(String nombre, String extension, String contenido, int idDirectorio){
        // Primero crea el archivo en el disco y verifica si hay campo. Si hay campo devuelve true y lo agrega
        if (this.disco.addArchivo(contenido, idArchivo)){
            Date fechaCreacion = new Date();
            Archivo newArch = new Archivo(idArchivo, idDirectorio, extension, fechaCreacion, contenido); // Crea la estructura archivo
            
            
            
        }
    }
    
    
    
    
    
    
}
