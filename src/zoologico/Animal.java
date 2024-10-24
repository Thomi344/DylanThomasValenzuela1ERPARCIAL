/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologico;

import java.util.Objects;

/**
 *
 * @author User
 */
public abstract class Animal implements Vacunar{
    private String nombre;
    private String edad;
    private double peso;
    private Dieta tipoDeDieta;
    private boolean Vacunado;

    public Animal(String nombre, String edad, double peso, Dieta tipoDeDieta) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.tipoDeDieta = tipoDeDieta;
    }

    public void setVacunado(boolean Vacunado) {
        this.Vacunado = Vacunado;
    }

    public double getPeso() {
        return peso;
    }

    public Dieta getDieta() {
        return tipoDeDieta;
    }
    
      public boolean isVacunado() {
        return Vacunado;
    }

    
     @Override
    public boolean equals(Object o){
         if(this == o){
         return true;
         }
         if(o.getClass() != this.getClass() || o == null ){ // comparo clases
             return false;
         }
         
         Animal otro = (Animal)o;
         return edad.equals(otro.edad)&& nombre.equals(otro.nombre) ; // comparo atributos especificos
    }
    
   

    
    @Override
    public int hashCode(){
        return Objects.hash(nombre,edad);    }

    @Override
    public abstract void vacunar();
    
   
       
    
    
}
