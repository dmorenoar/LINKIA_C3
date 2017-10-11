/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkia_c3;

/**
 *
 * @author 
 */
public class Profesor extends Persona implements Matricular{
    private String especialidad;

    public Profesor(String nombre, int edad, String especialidad) {
        super(nombre, edad);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Profesor{" + super.toString() + "especialidad=" + especialidad + '}';
    }

    //Método abstracto heredado de la clase Persona
    @Override
    public void dameDireccion() {
        //Hacemos el control que sea o cálculo etc..
    }

    //Métodos heredados de la interfaz Matricular
    @Override
    public void setMatricula() {
        
    }

    @Override
    public String getPDF() {
        String prueba = "hola";
        
        return prueba;
    }

}
