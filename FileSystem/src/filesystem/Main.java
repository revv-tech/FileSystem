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
      
      for (int i = 0; i < 20; i++){
          disk.addArchivo("Marco", 1);
      }
      disk.addArchivo("Felipe", 2);
      disk.addArchivo("Yepeto", 3);
      disk.addArchivo("Federico", 4);
      disk.removeArchivo(2);
    
      
      disk.toJson();
    }
    
}
