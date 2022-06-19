/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author Marco
 */
public class Archivo {
    
    int idArchivo;
    int idDirectorio;
    String nombre;
    String ext;
    Date fechaCreacion;
    Date fechaModificacion;
    int tamano;
    String contenido;
    String ruta;
    
    public Archivo(){}
    public Archivo(String nombre,int idArchivo, int idDirectorio, String ext, Date fechaCreacion, String contenido) {
        this.nombre = nombre;
        this.idArchivo = idArchivo;
        this.idDirectorio = idDirectorio;
        this.ext = ext;
        this.fechaCreacion = new Date();
        this.fechaModificacion = new Date();
        this.tamano = contenido.length();
        this.contenido = contenido;
    }
    // Mover archivo de directorio
    public void mover(String rutaDirectorioPadre,int nuevoPadre) {
        this.ruta = "";
        this.ruta = rutaDirectorioPadre + "/" + this.nombre + "/" + this.ruta;
        this.idDirectorio = nuevoPadre;
    }
    // Ver propiedades
    public String verPropiedades(){
        return "---------------------------------------\nidArchivo: " + idArchivo + 
                "\n idDirectorio: " + idDirectorio + 
                "\n Nombre: " + nombre + 
                "\n Extensión: " + ext +
                "\n Ruta: " + ruta +
                "\n Fecha de Creacion: " + fechaCreacion + 
                "\n Fecha de Modificacion: " + fechaModificacion + 
                "\n Tamaño: " + tamano + 
                "\n Contenido: " + contenido + "\n---------------------------------------\n";
    }
    // Copiar Archivo
    public Archivo copy(int idArchivo){
        Archivo newArch = new Archivo();
        
        newArch.idArchivo = idArchivo;
        newArch.idDirectorio = this.idDirectorio;
        newArch.ext = this.ext;
        newArch.fechaCreacion = new Date();
        newArch.fechaModificacion = new Date();
        newArch.tamano = this.contenido.length();
        newArch.contenido = this.contenido;
       
        return newArch;
    }
    // Modifica contenido del archivo
    public void modificar(String contenido){
        this.contenido = contenido;
        this.tamano = contenido.length();
        this.fechaModificacion = new Date();
    }
    public int getIdArchivo() {
        return idArchivo;
    }
    public void setIdArchivo(int idArchivo) {
        this.idArchivo = idArchivo;
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
    public String getExt() {
        return ext;
    }
    public void setExt(String ext) {
        this.ext = ext;
    }
    public Date getFechaCreacion() {
        return fechaCreacion;
    }
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    public Date getFechaModificacion() {
        return fechaModificacion;
    }
    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }
    public int getTamano() {
        return tamano;
    }
    public void setTamano(int tamano) {
        this.tamano = tamano;
    }
    public String getContenido() {
        return contenido;
    }
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    
}
