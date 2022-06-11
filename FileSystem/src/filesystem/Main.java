/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package filesystem;

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
      
        
        
        
        
       Disco disk = new Disco(10,10);
       disk.toJson();
       
       /*
       JSONObject json = new JSONObject();
       int tamaho = 5;
       int segmentoTamaho = 10;
            json.put("a","Disco");
            json.put("tamaño",tamaho);
            json.put("tamañoSegmento", segmentoTamaho);
            
            JSONArray segmentos = new JSONArray();
            
            
            for (int i = 0 ; i < tamaho ; i++){
                JSONArray segmento = new JSONArray();
                for (int j = 0; j < segmentoTamaho ; j++){
                    
                    segmento.put("0");
                    
                }
                segmentos.put(i,segmento);
                
            }
            
            json.put("segmentos",segmentos);

            String fileName = "prueba.json";
            try(FileWriter file = new FileWriter(fileName)){

                file.write(json.toString());

            }catch(IOException e){
                e.printStackTrace();
            }
        */
       
    }
    
}
