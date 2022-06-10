/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Marco
 */
public class Byte {
    
    private int idArchivo; // ID del archivo al que pertenece
    private String caracter; // Contenido del archivo
    
    public Byte(int idArchivo, String caracter) {
        this.idArchivo = idArchivo;
        this.caracter = caracter;
    }

    public int getIdArchivo() {
        return idArchivo;
    }

    public void setIdArchivo(int idArchivo) {
        this.idArchivo = idArchivo;
    }

    public String getCaracter() {
        return caracter;
    }

    public void setCaracter(String caracter) {
        this.caracter = caracter;
    }
    
    
}
