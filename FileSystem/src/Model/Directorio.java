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
    String ruta;
    ArrayList<Archivo> archivos;
 
    public Directorio(int idDirectorio, String nombre){
        this.ruta = "Escritorio";
        this.idDirectorio = idDirectorio;
        this.idDirectorioPadre = idDirectorio;
        this.idDirectorio = idDirectorio;
        this.nombre = nombre;
        this.archivos = new ArrayList<Archivo>();
    };
    
    public Directorio(String rutaPadre, int idDirectorioPadre, int idDirectorio, String nombre) {
        this.ruta = rutaPadre + "/" + nombre;
        this.idDirectorioPadre = idDirectorioPadre;
        this.idDirectorio = idDirectorio;
        this.nombre = nombre;
        this.archivos = new ArrayList<Archivo>();
    }
    
    public Archivo buscarArchivoXId(int idArchivo){
        
        for (int i = 0 ; i < this.archivos.size() ; i++){
            System.out.println(idArchivo);
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
                "\nRuta:" + ruta + 
                "\n----- Archivos del Directorio: -----\n";
        for (int i = 0 ; i < this.archivos.size() ; i++){
            msg = msg + this.archivos.get(i).verPropiedades();
        }
        return msg;
        
        
    }
    public void cambiarRutasDeArchivos(){
        for (int i = 0; i < this.archivos.size() ; i++){
            this.archivos.get(i).setRuta(ruta + "/" + this.archivos.get(i).getNombre() + this.archivos.get(i).getExt());
        }
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
    public String getRuta() {
        return ruta;
    }
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    
}
