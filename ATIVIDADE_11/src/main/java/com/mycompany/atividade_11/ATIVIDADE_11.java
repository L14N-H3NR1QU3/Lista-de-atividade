/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_11;

/**
 *
 * @author l.silva
 */
import java.util.Scanner;
public class ATIVIDADE_11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        double res;
        System.out.print("Digite a temperatura desejada: ");
        double temp = ler.nextDouble();
        System.out.println("Escolha a unidade de origem:");
        System.out.println("1 - Fahrenheit");
        System.out.println("2 - Calsius");
        System.out.print("Escolha: ");
        int un = ler.nextInt();
        if(un == 1){
            res = (temp-32)/1.8;
            System.out.println("A temperatura de Fahrenheit para Calsius é: "+res);
        }
        else if(un == 2){
            res = 1.8*temp+32;
            System.out.println("A temperatura de Celsius para Fahrenheit é: "+res);
        }
    }
}
