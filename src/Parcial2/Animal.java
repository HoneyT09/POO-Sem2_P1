/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial2;

/**
 *
 * @author Honey
 */
public abstract class Animal {
    protected String color;
    protected String tamaño;

    public Animal(String color, String tamaño) {
        this.color = color;
        this.tamaño = tamaño;
    }

    public String getColor() {
        return color;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
    
    
    
}
