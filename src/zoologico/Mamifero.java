/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologico;

/**
 *
 * @author User
 */
public class Mamifero extends Animal implements Vacunar{


    public Mamifero(String nombre, String edad, double peso, Dieta tipoDeDieta) {
        super(nombre, edad, peso, tipoDeDieta);
    }
    
    
    
    @Override
    public void vacunar() {
        if (!isVacunado()){
        setVacunado(true);
        System.out.println("El mamifero fue vacunado");}
        else{
            System.out.println("Ya se encuentra vacunado");
        }
    }


    @Override
    public String toString() {
        return "Mamifero{" + "peso=" + getPeso() + ", tipoDeDieta=" + getDieta() + '}';
}

    
}
