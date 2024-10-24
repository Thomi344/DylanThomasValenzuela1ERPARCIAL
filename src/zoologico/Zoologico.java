/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologico;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Zoologico {
    private String nombre;
    private List<Animal> animales;

    public Zoologico(String nombre) {
        this.nombre = nombre;
        this.animales = new ArrayList<>();
    }
    
    public void AgregarAnimal(Animal a){
        if(a == null){
            throw new NullPointerException();
        }
        if(!VerificarSiEsta(a)){
            animales.add(a);
        }else{
            throw new AnimalRepetidoException();
        }
        
    }    
    
    
    public void mostrarAnimales(){
        for (Animal a : animales){
            System.out.println(a);
        }
    }
    
    private boolean VerificarSiEsta(Animal animal){
        for (Animal a : animales){
            if(a.equals(animal)){
                return true;
            }
        }
        return false;
    }
    
    public void vacunarAnimales(){
          for (Animal animal : animales) {
              if(!animal.isVacunado())
                animal.vacunar();
          }
          throw new AnimalVacunadoExeption();
                    
    }
}
