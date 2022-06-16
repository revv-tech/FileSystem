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
    
    int idDirectorio;
    String nombre;
    ArrayList<Archivo> archivos;
    ArrayList<Directorio> directorios;
    
    public Directorio(){
        this.archivos = new ArrayList<Archivo>();
        this.directorios = new ArrayList<Directorio>();
    };
    public Directorio(int idDirectorio, String nombre) {
        this.idDirectorio = idDirectorio;
        this.nombre = nombre;
        this.archivos = new ArrayList<Archivo>();
        this.directorios = new ArrayList<Directorio>();
    }
    public Directorio copy(String nombre, int idDirectorio){
        Directorio newDir = new Directorio();
        newDir.archivos = this.archivos;
        newDir.nombre = nombre;
        newDir.idDirectorio = idDirectorio;
        return newDir;
    }
    public int getIdDirectorio() {
        return idDirectorio;
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
