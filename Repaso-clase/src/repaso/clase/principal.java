/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso.clase;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class principal {
    
 
    public static void main(String[] args) {

        Rectangulo miRectangulo = new Rectangulo();
        Scanner miEntrada=new Scanner(System.in);
        
        
        miRectangulo.base=miEntrada.nextFloat();
        miRectangulo.altura=miEntrada.nextFloat();
        
        
        System.out.println(miRectangulo.calcularArea());
        System.out.println(miRectangulo.calculaperimetro());

    }

    
}
