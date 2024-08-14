/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_3;

/**
 *
 * @author l.silva
 */
import java.util.Random;
import java.util.Scanner;
public class ATIVIDADE_3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        Random rand = new Random ();
        int resp = 0;
        System.out.print("Digite o primeiro numero: ");
        int num1 = ler.nextInt();
        System.out.print("Digite o segundo numero: ");
        int num2 = ler.nextInt();
        System.out.println("Escolha um operador:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtracao");
        System.out.println("3 - Multiplicacao");
        System.out.println("4 - Divisao");
        System.out.print("Escolha: ");
        int op = ler.nextInt();
        if(op == 1){
            resp = num1 + num2;
        }
        else if(op == 2){
            resp = num1 - num2;
        }
        else if(op == 3){
            resp = num1 * num2;
        }
        else if(op == 4){
            resp = num1 / num2;
        }
        else{
            System.out.println("ERROR, por favor digite uma operacao valida!");
        }
        System.out.println("Resultado: "+resp);
    }
}
