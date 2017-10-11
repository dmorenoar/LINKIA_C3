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
public class LINKIA_C3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Alumno a = new Alumno("Jesus",25,"Prog II",10);
        Profesor p = new Profesor("Marta" , 32, "BBDD");
        Profesor p2 = new Profesor("Julio" , 22, "UML");
        System.out.println(a);
        System.out.println(p);
        
        Persona per = new Alumno("Alba", 25, "HTML", 8);
        a.matricular();
        
        Persona[] lista = new Persona[4];
        
        lista[0] = a;
        lista[1] = p;
        lista[2] = p2;
        lista[3] = per;
        
        
        /*NO PODEIS HACERLO NUNCA */ 
        Profesor al = (Profesor) per;
        per.getNombre();
        /* +++++++++++++++++++ */
        
        for(Persona elem: lista){
            
            if(elem instanceof Profesor){
                System.out.println("Soy un profesor");
                
                Profesor aux = (Profesor) elem;
                System.out.println(aux.getEspecialidad());
            
            }else if(elem instanceof Alumno){
                System.out.println("Soy un alumno");
  
            }
 
        }
        
    }
    
}
