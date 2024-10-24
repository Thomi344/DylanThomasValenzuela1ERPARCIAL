/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologico;

/**
 *
 * @author User
 */
public class AnimalVacunadoExeption extends RuntimeException{
         public final static String MESSAGE = "El animal se encuentra vacunado";

    public AnimalVacunadoExeption() {
        super(MESSAGE);   
}}
