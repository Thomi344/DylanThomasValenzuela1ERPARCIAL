/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologico;

/**
 *
 * @author User
 */
public class Reptil extends Animal {
    private String tipoDeEscama;
    private String regulacionDeTemperatura;

    public Reptil (String nombre, String edad, double peso, Dieta tipoDeDieta,String tipoDeEscama, String regulacionDeTemperatura) {
        super(nombre, edad, peso, tipoDeDieta);
        this.tipoDeEscama = tipoDeEscama;
        this.regulacionDeTemperatura = regulacionDeTemperatura;
    }

    @Override
    public String toString() {
        return "Reptil{" + "tipoDeEscama=" + tipoDeEscama + ", regulacionDeTemperatura=" + regulacionDeTemperatura + '}';
    }
    
    

    @Override
    public void vacunar() {
        throw new NoVacunasReptilException();}

}
