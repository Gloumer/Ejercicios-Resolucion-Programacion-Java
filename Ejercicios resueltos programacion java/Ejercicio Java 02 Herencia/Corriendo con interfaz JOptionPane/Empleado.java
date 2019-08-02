
package ejercicio.herencia;

//Clase Padre o Superclase

import javax.swing.JOptionPane;


public class Empleado {
    //Atributos
    
    //Nombre
    protected String nombre;

    //Apellido
    protected String apellido;
    
    //Cedula
    protected String cedula;
    
    //Edad
    protected int edad;
    
    //Estado Civil
    protected int estadocivil;
    
    //Variable para guardar la respuesta del estado civil
    String estadoc;
    //Salario
    protected double salario;
    
    //Aumento
    protected double aumento;
    
    //Metodo constructor
    public Empleado(String nombre, String apellido, String cedula, int edad, int estadocivil, double salario,double aumento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;
        this.estadocivil = estadocivil;
        if(estadocivil==1)
        {
             estadoc = "Casado";
        }
        else
        {
            estadoc = "Soltero";
        }
        this.salario = salario;
        this.aumento= aumento;
    }
    
    //Metodo sin retorno y con parametro
    public void MostrarClasificacion(int edad)
    {
        if(edad<21)
        {
            JOptionPane.showMessageDialog(null, "Por su edad su clasificacion es: Principiante");
        }
        else if (edad>=22 && edad<=35)
        {
            JOptionPane.showMessageDialog(null, "Por su edad su clasificacion es: Intermedio");
        }
        else if(edad>35)
        {
            JOptionPane.showMessageDialog(null, "Por su edad su clasificacion es: Senior");
        }
    }
    
    
    
    //Imprimir pantalla
    public void Imprimir()
    {
        
        JOptionPane.showMessageDialog(null, "El nombre es: "+nombre+
                "\nEl apellido es: "+apellido+
                "\nLa cedula es: "+cedula+
                "\nLa edad es: "+edad+
                "\nEl estado civil es: "+estadoc+
                "\nEl salario es: "+salario+
                "\nEl aumento del salario es: "+aumento);
        
    }
    
    //Aumento
    public void Aumento(double aumento)
    {
        this.aumento = aumento;
      salario = salario*(1+(aumento/100));
      
    }
    
}

