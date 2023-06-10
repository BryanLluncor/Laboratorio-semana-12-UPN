/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcionesPersonalizadas;

import excepciones.Excepciones;

/**
 *
 * @author Bryan
 */
public class MiExcepcionGenerica extends Exception{
    private final static String MESSAGE = ""
            + "Esta es una excepcion general y no sabemos la causa";
    
    public MiExcepcionGenerica() {
        super(MESSAGE);
    }
      
}
