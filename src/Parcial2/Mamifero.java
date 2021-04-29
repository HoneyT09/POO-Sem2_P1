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
public abstract class Mamifero extends Animal{
    protected String pelaje;
    protected String viviparo;
    
    public Mamifero(){
        super();
        
    }

    public String getPelaje() {
        return pelaje;
    }

    public String getViviparo() {
        return viviparo;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public void setViviparo(String viviparo) {
        this.viviparo = viviparo;
    }
    
    
}
