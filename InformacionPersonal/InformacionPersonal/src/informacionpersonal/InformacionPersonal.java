
package informacionpersonal;

/**
 *
 * @author maryse
 * 
 * Programa para imprimir cadenas en Java 
 * 
 */

public class InformacionPersonal {

    String nombre = "Angel Baron Garcia";
    int numerodecuenta = 382;
    String Objects = "Programacion, Matematicas, español.", Semester = "Segundo";
    
    public void Nombre()
    {
        System.out.println("Hola " + nombre);
    }
    
    public void Numero(){
        System.out.println("Numero de cuenta:  " + numerodecuenta );
    }
    
    public void Materias(){
        System.out.println("Tus materias son: " + Objects);
    }
    
    public void Semestre(){
        System.out.println("Estas en el " + Semester + " Semestre");
    }
    
    
    public static void main(String[] args) {
        InformacionPersonal nombre = new InformacionPersonal();
        nombre.Nombre();
            
        InformacionPersonal numero = new InformacionPersonal();
        numero.Numero();
        
        InformacionPersonal materias = new InformacionPersonal();
        materias.Materias();
               
       InformacionPersonal semestre = new InformacionPersonal();
       semestre . Semestre();
    }


    
}

