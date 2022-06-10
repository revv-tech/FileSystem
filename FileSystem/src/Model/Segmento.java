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
public class Segmento {
    
    private int id; // Id del segmento
    private ArrayList<Byte> bytes; // Contenidos del seegmento
    private int tamanho; // Tamanho del segmento
    
    public Segmento(int id, int tamanho) {
        this.id = id;
        this.tamanho = tamanho;
        this.bytes = new ArrayList<Byte>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Byte> getBytes() {
        return bytes;
    }

    public void setBytes(ArrayList<Byte> bytes) {
        this.bytes = bytes;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
    
    
    
    
    
    
}
