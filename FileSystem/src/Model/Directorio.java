/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Marco
 */
public class Directorio {
    
    int idDirectorioPadre;
    int idDirectorio;
    String nombre;
    ArrayList<Archivo> archivos;
 
    public Directorio(){};
    
    public Directorio(int idDirectorioPadre, int idDirectorio, String nombre) {
        this.idDirectorioPadre = idDirectorioPadre;
        this.idDirectorio = idDirectorio;
        this.nombre = nombre;
        this.archivos = new ArrayList<Archivo>();
    }
    public Directorio copy(String nombre, int idDirectorio){
        Directorio newDir = new Directorio();
        newDir.nombre = nombre;
        newDir.idDirectorio = idDirectorio;
        return newDir;
    }
    public Archivo buscarArchivoXId(int idArchivo){
        System.out.println(idArchivo);
        for (int i = 0 ; i < this.archivos.size() ; i++){
            if (this.archivos.get(i).getIdArchivo() == idArchivo)
                return archivos.get(i);
        }
        System.out.println("El archivo no existe");
        return null;
    }
    
    public String imprimir(){
        String msg = "----------------------------------------\nidDirectorio: " + idDirectorio + 
                "\nidDirectorioPadre: " + idDirectorioPadre + 
                "\nNombre: " + nombre +
                "\n----- Archivos del Directorio: -----\n";
        for (int i = 0 ; i < this.archivos.size() ; i++){
            msg = msg + this.archivos.get(i).verPropiedades();
        }
        return msg;
        
        
    }
    public void agregarArchivo(Archivo newArch){
        this.archivos.add(newArch);
    }
    public int getIdDirectorio() {
        return idDirectorio;
    }
    public int getIdDirectorioPadre() {
        return idDirectorioPadre;
    }
    public void setIdDirectorioPadre(int idDirectorioPadre) {
        this.idDirectorioPadre = idDirectorioPadre;
    }
    public ArrayList<Archivo> getArchivos() {
        return archivos;
    }
    public void setArchivos(ArrayList<Archivo> archivos) {
        this.archivos = archivos;
    }
    public void setIdDirectorio(int idDirectorio) {
        this.idDirectorio = idDirectorio;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
