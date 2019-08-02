
package ejercicio.herencia;

import javax.swing.JOptionPane;




public class IpmTech {
    
    public static void main(String [] args)
    {
        
       String nombre = JOptionPane.showInputDialog("Ingresa el nombre: ");
       String apellido = JOptionPane.showInputDialog("Ingresa el apellido: ");
       String cedula = JOptionPane.showInputDialog("Ingresa la cedula: ");
       int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad: "));
       int estadocivil = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el estado civil \n\t1.Casado \n\t2.Soltero "));
       double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el salario: "));
       double aumento = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el aumento: "));
       int Lineasdecodigo = Integer.parseInt(JOptionPane.showInputDialog("Ingresa las lineas de codigo: "));
       String Lenguajedominante = JOptionPane.showInputDialog("Ingresa el lenguaje dominante: ");
       
       //Creando el objeto
       Programador empleado = new Programador(nombre, apellido, cedula, edad, estadocivil, salario, aumento, Lineasdecodigo, Lenguajedominante);
   
       //Llamando los metodos
        empleado.Imprimir();
        empleado.MostrarClasificacion(edad);
        empleado.Programador(Lineasdecodigo, Lenguajedominante);
    }
}
