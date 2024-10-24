/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologico;

/**
 *
 * @author User
 */
public class Ave extends Animal implements Vacunar{
    private double envergaduraAlas ;


    public Ave( String nombre, String edad, double peso, Dieta tipoDeDieta,double envergaduraAlas) {
        super(nombre, edad, peso, tipoDeDieta);
        this.envergaduraAlas = envergaduraAlas;

    }

    @Override
    public void vacunar() {
        if (!isVacunado()){
        setVacunado(true);
        System.out.println("El ave fue vacunado");}
        else{
            System.out.println("Ya se encuentra vacunado");
        }
    }

    @Override
    public String toString() {
        return "Ave{" + "envergaduraAlas=" + envergaduraAlas + '}';
    }


    
    
}
