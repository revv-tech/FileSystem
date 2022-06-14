/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public class Disco {
    
    private ArrayList<Segmento> segmentos;
    private int tamaho;
    private int tamanhoSegmento;
    
    public Disco(int tamaho, int tamanhoSegmento) {
        
        this.tamaho = tamaho;
        this.tamanhoSegmento = tamanhoSegmento;
        this.segmentos = new ArrayList<Segmento>();
        this.setSegmentList();
        
    }
    
    // Elimina los contenidos del disco de acuerdo al id de un Archivo
    
    public void removeArchivo(int idArchivo){
        for (int i = 0 ; i < this.tamaho ; i++) {   
            for (int j = 0 ; j < this.tamanhoSegmento ; j++){
                Byte tmp = this.segmentos.get(i).getBytes().get(j);
                if (tmp.getIdArchivo() == idArchivo){
                    tmp.resetByte();
                }    
            }
        }
    }
    
    // Agrega los contenidos del disco de acuerdo al id de un nuevo Archivo
    
    public void addArchivo(String contenido,int idArchivo){
        
        int contenidoLength = contenido.length();
        int counter = 0;
        
        if (!checkMemoriaDisco(contenido)){
            System.out.println("No hay espacio para agregar el archivo");
            return;
        }
        else{
            for (int i = 0 ; i < this.tamaho ; i++) {
                
                for (int j = 0 ; j < this.tamanhoSegmento ; j++){
                   
                   if (!contenido.isBlank()){
                       Byte tmp = this.segmentos.get(i).getBytes().get(j);
                       String firstLetter = contenido.substring(0, 1);
                       
                       if (tmp.getCaracter().equals("-") & tmp.getIdArchivo() == 0){
                           tmp.setCaracter(firstLetter);
                           tmp.setIdArchivo(idArchivo);
                           contenido = contenido.substring(1);
                       }
                   }
                }
            }
            System.out.println("Archivo agregado");
        }
    }
    
    // Chequea si el disco esta lleno
    public boolean checkMemoriaDisco(String contenido){
        int contenidoLength = contenido.length();
        for (int i = 0 ; i < this.tamaho ; i++) {
            for (int j = 0 ; j < this.tamanhoSegmento ; j++){
                if (this.segmentos.get(i).getBytes().get(j).getCaracter().equals("-")){
                    contenidoLength = contenidoLength - 1;
                }
                if (contenidoLength == 0)
                    return true;
            }
        }
        return false;
    }
    
    // Chequea si el disco esta lleno
    public boolean checkMemoriaDiscoModify(String contenido, int idArchivo){
        int contenidoLength = contenido.length();
        for (int i = 0 ; i < this.tamaho ; i++) {
            for (int j = 0 ; j < this.tamanhoSegmento ; j++){
                if (this.segmentos.get(i).getBytes().get(j).getCaracter().equals("-") & this.segmentos.get(i).getBytes().get(j).getIdArchivo() == idArchivo){
                    contenidoLength = contenidoLength - 1;
                }
                if (contenidoLength == 0)
                    return true;
            }
        }
        return false;
    }
    
    // Modificar los contenidos de un archivo en el disco de acuerdo a un id de archivo
    public void modifyArchivo(String contenido, int idArchivo){
        if (!checkMemoriaDiscoModify(contenido,idArchivo)){
            System.out.println("No hay espacio para modificar el archivo con el nuevo contenido debido a que no hay memoria");
            return;
        }else {
            // Elimina el archivo
            this.removeArchivo(idArchivo);
            // Agrega el nuevo contenido
            this.addArchivo(contenido, idArchivo);
        }
        
    }
    
    // Settea los segmentos en default
    public void setSegmentList() {
        for (int i = 0 ; i < this.tamaho ; i++){
            Segmento s = new Segmento(i,this.tamanhoSegmento);
            this.segmentos.add(s);
        }
    }
    

    public ArrayList<Segmento> getSegmentos() {
        return segmentos;
    }

    public void setSegmentos(ArrayList<Segmento> segmentos) {
        this.segmentos = segmentos;
    }
    
    
    /*
    Pasar a JSON
    */
    public void toJson(){
        String nameJson = "disco.json";
        JSONObject json = new JSONObject();
        json.put("a","Disco");
        json.put("tamaño",this.tamaho);
        json.put("tamañoDeSegmento", this.tamanhoSegmento);
        // Paser de Segmentos
        JSONArray segmentosJson = new JSONArray(); // Array de todos los segmentos
        for (int i = 0 ; i < this.tamaho ; i++){
                JSONArray segmentoJson = new JSONArray(); // Array de un solo segmento
                for (int j = 0; j < this.tamanhoSegmento ; j++){
                  segmentoJson.put(segmentos.get(i).getBytes().get(j).getCaracter());
                }
                segmentosJson.put(i,segmentoJson); // Agrega segmento al array de segmentos
                
        }
        
         json.put("segmentos",segmentosJson); // Agrega el array de segmentos al JSON
         
         try(FileWriter file = new FileWriter(nameJson)){

                file.write(json.toString());

            }catch(IOException e){
                e.printStackTrace();
            }
    }
    
}
