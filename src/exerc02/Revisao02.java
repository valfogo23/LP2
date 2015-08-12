/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerc02;

import java.util.Scanner;

/**
 *
 * @author 41431413
 */
public class Revisao02 {
    public String sol = "1-Solteiro(a)";
    public String des = "2-Desquitado(a)";
    public String cas = "3-Casado(a)";
    public String div = "4-Divorciado(a)";
    public String viu = "5-Viúvo(a)";
    public int est = 0;
    
    public Revisao02(){
       
    }
    
    public void Menu(){

        System.out.println(sol);
        System.out.println(des);
        System.out.println(cas);
        System.out.println(div);
        System.out.println(viu);
        Scanner sc = new Scanner(System.in);
        System.out.print("Escolha o seu estado civil: ");
        est = sc.nextInt();
        
        switch(est){
            case 1:
                System.out.println("Solteiro(a)");
                break;
            case 2:
                System.out.println("Desquitado(a)");
                break;
            case 3:
                System.out.println("Casado(a)");
                break;
            case 4:
                System.out.println("Divorciado(a)");
                break;
            case 5:
                System.out.println("Viuvo(a)");
                break;
            default:
                System.out.println("Opção inválida!!!");
        }
    }
}

