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
public class producto {
    Scanner sc = new Scanner(System.in);
    public int margarita;
    public int galletas;
    public int chetos;
    public int chocoramo;
    public int agregM;
    public int agregG;
    public int agregCH;
    public int agregCHO;
    public int canM=agregM;
    public int totalVM=0;
    public int canG=10;
    public int totalVG=0;
    public int canCH=10;
    public int totalVCH=0;
    public int canCHO=chocoramo();
    public int totalVCHO=0;
    producto(int agregM, int agregG, int agregCH, int agregCHO){
        this.agregM = agregM;
        this.agregG = agregG;
        this.agregCH = agregCH;
        this.agregCHO = agregCHO;
    }

    producto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    protected int margarita(){
        int compra = canM;
        int precioM=2_000;
        if(compra==canM){
            compra--;
            this.canM=compra;
            this.totalVM+=precioM;
            System.out.println("\n"+totalVM);
        }
        return canM;   
    }
    protected int galletas(){
        int compra = canG;
        int precioG=1_000;
        if(compra==canG){
            compra--;
            this.canG=compra;
            this.totalVG+=precioG;
            System.out.println("\n"+totalVG);
        }
        return canG;   
    }
    protected int chetos(){
        int compra = canCH;
        int precioCH=2_000;
        if(compra==canCH){
            compra--;
            this.canCH=compra;
            this.totalVCH+=precioCH;
            System.out.println("\n"+totalVCH);
        }
        return canCH;   
    }
    protected int chocoramo(){
        int compra = canCHO;
        int precioCHO=2_000;
        if(compra==canCHO){
            compra--;
            this.canCHO=compra;
            this.totalVCHO+=precioCHO;
            System.out.println("\n"+totalVCHO);
        }
        return canCHO;   
    }
}
