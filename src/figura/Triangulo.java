/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;

/**
 *
 * @author Marco
 */
public class Triangulo {
    private double base;
    private double altura;
    
    // Constructor de la clase
   public Triangulo(double base,double altura)
   {
       this.base = base;
       this.altura= altura;
   }
   
   public double GetAltura()
   {
       return this.altura;
   }
   public double GetBase(){
       return this.base;
   }
    
}
