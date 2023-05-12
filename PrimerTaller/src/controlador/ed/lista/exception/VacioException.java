/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.ed.lista.exception;

/**
 *
 * @author sfav
 */
public class VacioException  extends Exception{

    public VacioException(String message) {
        super(message);
    }

    public VacioException() {
        super("La lista se encuentra vacia");
    }

    

    
}
