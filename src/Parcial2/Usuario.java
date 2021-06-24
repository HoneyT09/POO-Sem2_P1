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
public class Usuario extends Persona implements Conjunto{
    private String uso;

    @Override
    public void setHumano(String humano) {
        super.setHumano(humano); //To change body of generated methods, choose Tools | Templates.
        System.out.println(humano);
    }

    @Override
    public String getHumano() {
        return super.getHumano(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setmodificar(int modificar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setvisita(double visita) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setordenador(double ordenador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
 
}
