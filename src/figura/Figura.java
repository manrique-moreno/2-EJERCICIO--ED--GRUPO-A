/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;
import java.io.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Marco
 */
public class Figura implements FiguraInterface {

    /**
     * Cuando una clase implementa una interfaz esta obliga a cumplir todos los
     * contratos de la interfaz
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double area = 0;
      // tipo de dato nombre_variable = palabra reservada(new) tipo de dato(alcance)
        
        // instancia de la clase figura
        Figura ofigura = new Figura();
        
        //  Instanciando la Clase Circulo
        JOptionPane.showMessageDialog(null, "PARA HALLAR EL AREA DEL CIRCULO\n  INGRESE LOS DATOS");
        int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el radio: "));
        Circulo ocirculo = new Circulo();
        ocirculo.set_Radio(a);
        
        area = ofigura.CalculoArea(ocirculo);
        
        System.out.println(" El Area del Circulo es : " + area);
        
        // Instancias la Clase Triangulo
        JOptionPane.showMessageDialog(null, "PARA HALLAR EL AREA DEL TRIANGULO\n    INGRESE LOS DATOS");
        int b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la base: "));
        int h = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la altura: "));
        Triangulo oTriangulo = new Triangulo(b,h);
            
        area = ofigura.CalculoArea(oTriangulo);
        
        System.out.println(" El Area del Triangulo es : " + area);
        
        
        // instancias la clase rectangulo
        
        JOptionPane.showMessageDialog(null, "PARA HALLAR EL AREA DEL RECTANGULO\n   INGRESE LOS DATOS");
        int b2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la base: "));
        int h2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la altura: "));
        Rectangulo oRectangulo = new Rectangulo(b2,h2);
            
        area = ofigura.CalculoArea(oRectangulo);
        
        System.out.println(" El Area del Rectangulo es : " + area);
    }
    
    // 
    public double CalculoArea(Object obj) {
        double area = 0;
            
        //System.out.println(obj.getClass().getSimpleName());
        
        switch (obj.getClass().getSimpleName())
        {
            case "Circulo":
               // convierte el objeto obj recibido por parametro 
                // en la clase instaciada circulo.
               Circulo oCirculo = (Circulo) obj;
                
                area =  Circulo.PI*Math.pow(oCirculo.get_Radio(), 2); 
               
               break;
            
            case "Triangulo":
                 
                Triangulo oTriangulo = (Triangulo) obj;
                 
                area = oTriangulo.GetBase()*oTriangulo.GetAltura()/2;
                
                break;
                
            case "Rectangulo":
                 
                Rectangulo oRectangulo = (Rectangulo) obj;
                 
                area = oRectangulo.GetBase()*oRectangulo.GetAltura();
               
            default: 
                
                break;
        }
        
        
        return area;
    }
    
}
