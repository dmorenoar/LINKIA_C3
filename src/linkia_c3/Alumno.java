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
public class Alumno extends Persona{
    private String asignatura;
    private int nota;

    public Alumno(String nombre, int edad, String asignatura, int nota){
        super(nombre,edad);
        this.asignatura = asignatura;
        this.nota = nota;
    }

    public String getAsignatura() {
        return asignatura;
    }

    //Método que llama a un método de la clase padre.
    public void matricular(){
        System.out.println(super.getNombre());
    }
    
    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumno{" + super.toString() + "asignatura=" + asignatura + ", nota=" + nota + '}';
    }
    //Método abstracto heredado de la clase Persona
    @Override
    public void dameDireccion() {
        System.out.println("La direcion es...");
    }
    
    
    
}
