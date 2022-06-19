/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Archivo;
import Model.Directorio;
import Model.Disco;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Marco
 */
public class Controlador {
    
    public Disco disco;
    public Directorio principal;
    public static int idArchivo = 0;
    public static int idDirectorio = 0;
    
    // Manejo de directorios y archivos
    public ArrayList<Directorio> directorios;
    public ArrayList<Archivo> archivos;
    
    public void Controlador(){};
    
    // Inicia programa, crea el disco de acuerdo a los tamaños dados y crea el primer directorio
    public void crearDisco(int tamaho, int tamahoSegmento){
        this.disco = new Disco(tamaho, tamahoSegmento);
        this.principal = new Directorio(idDirectorio, "Escritorio");
        this.idDirectorio = this.idDirectorio + 1;
        this.directorios = new ArrayList<Directorio>();
        this.directorios.add(principal); // Agrega el principal a lista de dirs
        this.archivos = new ArrayList<Archivo>();
    }
    // Busca directorio, si es nulo es que no existe
    public Directorio buscarDirectorioXId(int idDirectorio){
        for (int i = 0 ; i < this.directorios.size(); i++){
            Directorio tmp = this.directorios.get(i);
            if (tmp.getIdDirectorio() == idDirectorio){
                return tmp;
            }  
        }
        return null;
    } 
    // Crea archivo
    public void crearArchivo(String nombre, String extension, String contenido, int idDirectorio){
        Directorio padre = buscarDirectorioXId(idDirectorio); // Buscamos el directorio padre
        // Primero crea el archivo en el disco y verifica si hay campo. Si hay campo devuelve true y lo agrega
        if (this.disco.addArchivo(contenido, idArchivo)){
            Date fechaCreacion = new Date();
            Archivo newArch = new Archivo(nombre,idArchivo, idDirectorio, extension, fechaCreacion, contenido); // Crea la estructura archivo
            newArch.setRuta(padre.getRuta() + "/" + nombre + "." + extension);
            padre.agregarArchivo(newArch); // Agrega nuevo archivo
            this.idArchivo = this.idArchivo + 1;
            System.out.println("Se agrego el archivo al directorio y al disco con exito. ID: "+ newArch.getIdArchivo());
        }else
            System.out.println("No se agrego el archivo al directorio y al disco. Contenido: " + contenido);
    }
    // Crea directorio
    public void crearDirectorio(String nombre, int idDirectorioPadre){
        // Busca la ruta del directorio
        Directorio padre = this.buscarDirectorioXId(idDirectorioPadre);
        // Validacion de que no se repita nombre en el directorio padre
        Directorio newDir = new Directorio(padre.getRuta(), idDirectorioPadre, idDirectorio, nombre); // Crea nuevo dir
        this.idDirectorio = this.idDirectorio + 1; // Aumenta id
        this.directorios.add(newDir); // Agregamos el nuevo directorio a la lista de dirs
        System.out.println("Se creo el directorio " + nombre);
    }
    // Lista de elementos en el directorio. Retorna una lista con los archivos y los directorios
    public List[] listaDirActual(int idDirectorio){
        Directorio actual = this.buscarDirectorioXId(idDirectorio);
        ArrayList<Directorio> actualDirs = new ArrayList<Directorio>();
        for (int i = 0 ; i < this.directorios.size() ; i++){
            if (this.directorios.get(i).getIdDirectorioPadre() == idDirectorio && idDirectorio != 0 ) // Verifica si es el padre o no
                actualDirs.add(this.directorios.get(i));
        }
        return new List[] { actual.getArchivos(), actualDirs };
    }
    public ArrayList<Directorio> getDirectoriosDirActual(int idDirectorioPadre){
        ArrayList<Directorio> actualDirs = new ArrayList<>();
        for (int i = 0 ; i < this.directorios.size() ; i++){
            if (this.directorios.get(i).getIdDirectorioPadre() == idDirectorioPadre ) // Verifica si es el padre o no
                if(this.directorios.get(i).getIdDirectorio()!= idDirectorioPadre)
                {
                    actualDirs.add(this.directorios.get(i));
                }
                
        }
        return actualDirs;
    } 
    public Directorio getDirPorNombre(int idDirectorioPadre, String nombre){
        Directorio actualDirs = null;
        for (int i = 0 ; i < this.directorios.size() ; i++){
            if (this.directorios.get(i).getIdDirectorioPadre() == idDirectorioPadre ) // Verifica si es el padre o no
                if(this.directorios.get(i).getIdDirectorio()!= idDirectorioPadre && this.directorios.get(i).getNombre().equals(nombre) )
                {
                    actualDirs = this.directorios.get(i);
                }
                
        }
        return actualDirs;
    }
    public ArrayList<Archivo> getArchivosDirActual(int idDirectorio){
        Directorio actual = this.buscarDirectorioXId(idDirectorio);
        
        return actual.getArchivos();
    }
     public Archivo getArchivoPorNombre(int idDirectorioPadre, String nombre){
        Archivo actualArchivo = null;
        Directorio actual = this.buscarDirectorioXId(idDirectorioPadre);
        
     
        for (int i = 0 ; i < actual.getArchivos().size() ; i++){
         
            if(actual.getArchivos().get(i).getNombre().equals(nombre) )
            {
                actualArchivo  = actual.getArchivos().get(i);
            }
        }
        return actualArchivo;
    }
    // Modificar archivos. Si es verdadero es que se modifico el archivo con exito
    public boolean modFile(int idDirectorio, int idArchivo, String contenido) {
        
        // Verifica si se puede modificar el archivo en el disco, y si se puede lo hace y retorna true.
        if (disco.modifyArchivo(contenido, idArchivo)){
            // Modifica el contenido
            //Directorio padre de archivo
            Directorio padre = this.buscarDirectorioXId(idDirectorio);
            // Archivo a modificar
            Archivo archivoMod = padre.buscarArchivoXId(idArchivo);
            archivoMod.modificar(contenido);
            System.out.println("Se cambio el contenido con exito. ID: " + idArchivo);
            return true;
        }
        System.out.println("Hubo error al cambiar el contenido");
        return false;
    }
    // Ver propiedades de archivo
    public String verPropiedades(int idDirectorio,int idArchivo){
        // String con las propiedades del archivo
        return this.buscarDirectorioXId(idDirectorio).buscarArchivoXId(idArchivo).verPropiedades();
    }
    // Ver contenido del archivo
    public String verFile(int idDirectorio,int idArchivo){
        // String con el contenido del archivo
        return this.buscarDirectorioXId(idDirectorio).buscarArchivoXId(idArchivo).getContenido();
    }
    // Mover Archivo
    public void moverFile(int idDirectorioPadre, int idArchivo, int newDirectorioPadre){
        Directorio dirPadre = this.buscarDirectorioXId(idDirectorioPadre);
        Directorio newPadre = this.buscarDirectorioXId(newDirectorioPadre);
        // Igualamos archivo a mover
        Archivo arch = this.buscarDirectorioXId(idDirectorioPadre).buscarArchivoXId(idArchivo);
        arch.mover(newPadre.getRuta(), newPadre.getIdDirectorio());
        // Agrega archivo a nuevo directorio
        // Si existe uno del mismo nombre leagregamos un (1)
        newPadre.agregarArchivo(arch);
        // Elimina el archvio del directorio actual
        dirPadre.getArchivos().remove(arch);
    }
    // Mover Archivo
    public void moverDir(int idDirectorioPadre,int idDirectorioAMover, int newDirectorioPadre){
        // Igualamos dir a mover
        Directorio dirMov = this.buscarDirectorioXId(idDirectorioAMover);
        Directorio newPadre = this.buscarDirectorioXId(newDirectorioPadre);
        // Iguala directorio padre a nuevo padre
        dirMov.setRuta("");
        dirMov.setRuta(newPadre.getRuta() + "/" + dirMov.getNombre());
        dirMov.setIdDirectorioPadre(newDirectorioPadre);
        dirMov.cambiarRutasDeArchivos();
    }
    // Remover Archivo
    public void removerArch(int idDirectorio,int idArchivo){
        // Remueve del disco
        if (disco.removeArchivo(idArchivo)){
            Directorio dirPadre = this.buscarDirectorioXId(idDirectorio);
            ArrayList<Archivo> archivosDir =  dirPadre.getArchivos();
            for (int i = 0; i < archivosDir.size(); i++ ){
                if (archivosDir.isEmpty())
                    continue;
                if (archivosDir.get(i).getIdArchivo() == idArchivo){
                    archivosDir.remove(i);
                    System.out.println("Archivo eliminado. ID: " + idArchivo);
                }
                
            }
        }
        
    }
    // Imprimir directorios
    public void imprimirDirectorios(){
        for (int i = 0; i < this.directorios.size() ; i++){
            System.out.println(this.directorios.get(i).imprimir() + "\n");
        }
    } 
}
