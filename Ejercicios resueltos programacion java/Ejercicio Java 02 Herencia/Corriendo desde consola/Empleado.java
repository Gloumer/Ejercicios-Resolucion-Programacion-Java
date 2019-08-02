
package ejercicio.herencia;

//Clase Padre o Superclase

public class Empleado {
    
    //Atributos
    
    //Nombres y apellidos
    protected  String nombre;
    protected  String apellido;
    
    //Cedula
    protected  String cedula;
    
    //edad
    protected int edad;
    
    //Casado
    protected  boolean casado;
    
    //Salario
    protected double salario;
    
    //Metodo constructor
    public Empleado(String nombre, String apellido, String cedula, int edad, boolean casado, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
       
    }
    
    //Metodo sin retorno y con parametro
    public void MostrarClasificacion(int edad)
    {
        if(edad<=21)
        {
            System.out.println("Por la edad, su clasificacion es: Principiante");
        }
        else if(edad>=22 && edad<=35)
        {
            System.out.println("Por la edad, su clasificacion es: Intermedio");
        }
        else if(edad>35)
        {
            System.out.println("Por la edad, su clasificacion es: Senior");
        }
    }
    
    //Metodo sin retorno y con parametro
    public void SalarioNuevo(double Salario_Aumento)
    {
        salario = salario*(1+(Salario_Aumento/100));
        System.out.println("Su Salario nuevo es: "+salario);
    }
    
    
}
