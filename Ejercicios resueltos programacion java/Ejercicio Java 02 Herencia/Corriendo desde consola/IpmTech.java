
package ejercicio.herencia;

import java.util.Scanner;


public class IpmTech {
    
    public static void main(String [] args)
    {
        Scanner ingreso = new Scanner(System.in);
        
        //Entrada de datos
        System.out.print("Ingresa el nombre: ");
        String nombre = ingreso.nextLine();
        System.out.print("Ingresa el apellido: ");
        String apellido = ingreso.nextLine();
        System.out.print("Ingresa la cedula: ");
        String cedula = ingreso.nextLine();
        System.out.print("Ingresa la edad: ");
        int edad = ingreso.nextInt();
        System.out.print("Ingrese estado civil: ");
        boolean casado = ingreso.nextBoolean();
        System.out.print("Ingrese el salario: ");
        double salario = ingreso.nextDouble();
        System.out.print("Ingrese el aumento(%) del salario: ");
        double aumento = ingreso.nextDouble();
        System.out.print("Ingrese las lineas de codigo: ");
        int LC = ingreso.nextInt();
        System.out.print("Ingrese el lenguaje dominante: ");
        String LD = ingreso.next();
        
        //Creacion de un objeto con el nombre empleado y agregando las variables que tiene el metodo constructor
        Programador empleado = new Programador(nombre, apellido, cedula, edad, casado, salario, LC, LD);
        
        //Llamando a los metodos
        empleado.MostrarClasificacion(edad);
        empleado.ImprimirDatos();
        empleado.SalarioNuevo(aumento);
        
        
    }
    
}
