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
public class menu {
    public void menu(){
            Scanner sc = new Scanner(System.in);
            comprar obj1 = new comprar();
            agregar obj2 = new agregar();
            while(true){
                System.out.print("Menu principal \n"
                        + "1.Agregar\n"
                        + "2.Comprar\n"
                        + "3.Gestion\n"
                        + "4.Salir\n"
                        + "opcion: ");
                int opcion = sc.nextInt();

                switch(opcion){
                    case 1:obj2.agregar();
                    break;
                    case 2:obj1.comprar();
                    break;
                    case 3:
                    break;  
                    case 4:
                    break;
                    case 5:
                    break;
                }
            }  
    } 
}
