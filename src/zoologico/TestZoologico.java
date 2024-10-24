/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologico;

/**
 *
 * @author User
 */
public class TestZoologico {
    public static void main(String[] args) {
        Zoologico zoo = new Zoologico ("Chacabuco");
        
        Animal rep = new Reptil ("Raul","12",10,Dieta.OMNIVORO ,"queratinosa","ectotermia");
        Animal mamifero = new Mamifero("Roberto", "20", 12.5, Dieta.CARNIVORO);
        Animal ave = new Ave("Carlos","5",6,Dieta.HERBIVORO,54.7);
        
        
        
        try{
        zoo.AgregarAnimal(rep);
        zoo.AgregarAnimal(mamifero);
        zoo.AgregarAnimal(ave);
        //zoo.AgregarAnimal(ave);
        //zoo.AgregarAnimal(new Ave( "Carlos","5",6,Dieta.HERBIVORO,54.7));
        zoo.mostrarAnimales();
        
        //rep.vacunar();
        mamifero.vacunar();
        ave.vacunar();
        //ave.vacunar();
        //mamifero.vacunar();
        
        }
        
        
        catch(AnimalRepetidoException | NoVacunasReptilException | AnimalVacunadoExeption ex){
            System.out.println(ex.getMessage());
        }
        catch (NullPointerException ex){
            System.out.println("Animal nulo");
        }
    }
        
        
    
}
