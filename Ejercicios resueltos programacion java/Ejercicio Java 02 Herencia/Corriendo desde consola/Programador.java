
package ejercicio.herencia;

//Clase hija o Subclase
public class Programador extends Empleado{
    
    public int LineasdeCodigo;
    public String LenguajeDominante;
    
    //Metodo Constructor
    public Programador(String nombre, String apellido, String cedula, int edad, boolean casado, double salario, int LineasdeCodigo, String LenguajeDominante)
    {
        super(nombre,apellido,cedula,edad,casado,salario);
        this.LineasdeCodigo = LineasdeCodigo;
        this.LenguajeDominante = LenguajeDominante;
    }
    
    //Metodo sin retorno y sin parametros
    public void ImprimirDatos()
    {
        
        System.out.println("El nombre es: "+nombre);
        System.out.println("El apellido es: "+apellido);
        System.out.println("La edad es: "+edad);
        System.out.println("La cedula es: "+cedula);
        if(casado)
        {
            System.out.println("Es Casado");
        }
        else
        {
            System.out.println("Es Soltero");
        }
        System.out.println("Su salario es: "+salario);
        System.out.println("Lineas de codigo: "+LineasdeCodigo);
        System.out.println("Lenguaje Dominante: "+LenguajeDominante);
    }
    
}
