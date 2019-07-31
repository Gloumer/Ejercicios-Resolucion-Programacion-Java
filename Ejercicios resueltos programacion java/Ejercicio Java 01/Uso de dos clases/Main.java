
package practica;

import javax.swing.JOptionPane;




public class Main {
    
    
    public static void main(String [] args)
    {
        
        String digitar;
       
        do
        {
            
         digitar = JOptionPane.showInputDialog("a)Elevar potencia \n"
                + "b)Extraer Raiz Cuadrada \n"
                + "c)Verificar numero par o impar \n"
                + "d)Salir programa\n"
                + "Digite su opcion: ");
         
        //Creando objeto 
        Practicando casilla = new Practicando(digitar);
        
        //Condicional 
        if(digitar.equals("a") || digitar.equals("A") || digitar.equals("b") || digitar.equals("B") || digitar.equals("c") || digitar.equals("C") )
       {
           int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
           
           //Llamando al metodo Operador()
           casilla.Operador(numero);
       }
            
        }while(!"d".equalsIgnoreCase(digitar) );
       
        
    }
    
    
    
}
