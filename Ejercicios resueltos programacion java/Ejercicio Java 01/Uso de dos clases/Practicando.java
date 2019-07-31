
package practica;

import javax.swing.JOptionPane;




public class Practicando {
   
    //Atributos
   String Digite;
   
   //Metodo constructor
   public Practicando(String Digite)
   {
       this.Digite = Digite;
   }
   
   //Metodo sin retorno y sin paramentro
   public void Operador(double numero)
   {
           switch(Digite)
           {
               //Elevar Potencia
               case "a":
               case "A":
                  numero = Math.pow(numero, 2);
                  JOptionPane.showMessageDialog(null, "La potencia es: "+numero);
                   break;
                   
               //Extraer Raiz Cuadrada    
               case "b":
               case "B":
                   numero = Math.sqrt(numero);
                   JOptionPane.showMessageDialog(null, "La raiz cuadrada es: "+numero);
                   break;
                   
               //Verificar numero para o impar    
               case "c":
               case "C":
                   if(numero%2==0)
                   {
                       JOptionPane.showMessageDialog(null, "El numero es par: "+numero);
                   }
                   else
                   {
                       JOptionPane.showMessageDialog(null, "El numero es impar: "+numero);
                   }
                   
                   break;
           }            
       
       
       
   }
   
    
   
   
    
}
