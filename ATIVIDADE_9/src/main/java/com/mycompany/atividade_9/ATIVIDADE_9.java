/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_9;

/**
 *
 * @author l.silva
 */
import java.util.Scanner;
public class ATIVIDADE_9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int primo = 0;
        System.out.print("Digite um numero: ");
        int num = ler.nextInt();
        for (int i = 1; i <= num; i++){
            if(num%i == 0 && num%1 == 0){
                primo += 1;
            }
        }
        if (primo > 2){
            System.out.println("Numero nao e primo!");
        }
        else{
            System.out.println("Numero e primo!");
        }
    }
}
