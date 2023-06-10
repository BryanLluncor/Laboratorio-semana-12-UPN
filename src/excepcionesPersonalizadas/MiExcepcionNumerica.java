/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcionesPersonalizadas;

/**
 *
 * @author Bryan
 */
public class MiExcepcionNumerica extends Exception {
    
    private final static String MENSAJE = ""
            +"Error de conversion numerica, "
            +"Ingresa un texto que contega un numero";
            
    public MiExcepcionNumerica(String message) {
        super(message);
    }

}
