/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_2;

/**
 *
 * @author l.silva
 */
import java.util.Scanner;
import java.util.Random;
public class ATIVIDADE_2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random rand = new Random();
        int numero = rand.nextInt(100)+1;
        int num = 0;
        while(num!=numero){
            System.out.print("Digite um numero: ");
            num = ler.nextInt();
            if(num > numero){
                System.out.println("Numero e menor!");
            }
            else if (num < numero){
                System.out.println("Numero e maior!");
            }
        }
        System.out.println("Acertou o numero e: "+numero);
    }
}
