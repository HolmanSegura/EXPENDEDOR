/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Scanner;

/**
 *
 * @author holma
 */
public class comprar {
    public void comprar(){
        Scanner sc = new Scanner(System.in);
        producto obj1 = new producto();
        while(true){
            System.out.print("Menu Compra \n"
                        + "1.margarita\nPrecio: 2.000  Cantidad: "+obj1.canM
                        + "\n2.galletas\nPrecio: 1.000  Cantidad: "+obj1.canG
                        + "\n3.chetos\nPrecio: 2.000  Cantidad: "+obj1.canCH
                        + "\n4.chocoramo\nPrecio: 1.500  Cantidad: "+obj1.canCHO
                        + "\n5.salir\n"
                        + "opcion: ");
            int opcion = sc.nextInt();
            switch(opcion){
                    case 1:obj1.margarita();
                    break;
                    case 2:obj1.galletas();
                    break;
                    case 3:obj1.chetos();
                    break;  
                    case 4:obj1.chocoramo();
                    break;
                    case 5:System.exit(0);
                    break;
                }
        }
    }
    
}
