
package informacionpersonal;

/**
 *
 * @author maryse
 * 
 * Programa para imprimir cadenas en Java 
 * 
 */

public class InformacionPersonal {

    String nombre_alumno = "Jorge Jesus Garcia Palma ";         
    int numero_cuenta = 1540146;
    String semestre = "Segundo";
    String materias = "Arquitectura de computadoras/7:00/BDA/9:00/Programacion/10:00";
    
    
    public void Informacion(){        
        System.out.println("El nombre completo de la persona es: " +nombre_alumno );
        System.out.println("Su numero de cuenta es: " +numero_cuenta);
        System.out.println("El semestre que cursa es: " +semestre);
        System.out.println("Las materias y los horarios que cursa es: " +materias);
    }
    
    
    public static void main(String[] args) {
        InformacionPersonal informacion= new InformacionPersonal();
        informacion.Informacion();
                
    }
    
}
