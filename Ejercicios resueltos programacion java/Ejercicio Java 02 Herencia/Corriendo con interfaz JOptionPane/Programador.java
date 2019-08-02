
package ejercicio.herencia;

//Clase hija o Subclase

import javax.swing.JOptionPane;

public class Programador extends Empleado{
    
    //Lineas de codigo
    protected int Lineasdecodigo;
    
    //Lenguaje dominante
    protected String Lenguajedominante;
    
    //Metodo constructor
    public Programador(String nombre, String apellido, String cedula, int edad, int estadocivil, double salario,double aumento,int Lineasdecodigo,String Lenguajedominante)
    {
        super(nombre,apellido,cedula,edad,estadocivil,salario,aumento);
        this.Lineasdecodigo = Lineasdecodigo;
        this.Lenguajedominante = Lenguajedominante;
    }

    //Metodo sin retorno y parametros
    public void Programador(int Lineasdecodigo,String Lenguajedominante)
    {
        JOptionPane.showMessageDialog(null, "Las lineas de codigo son: "+Lineasdecodigo+
                "\nEl lenguaje dominante es: "+Lenguajedominante);
    }
    
    
}

