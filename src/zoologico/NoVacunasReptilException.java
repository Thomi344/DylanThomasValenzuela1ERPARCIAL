/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologico;

/**
 *
 * @author User
 */
public class NoVacunasReptilException extends RuntimeException{
        public final static String MESSAGE = "Los Reptiles no pueden ser vacunados";

    public NoVacunasReptilException() {
        super(MESSAGE);
    }
    
}
