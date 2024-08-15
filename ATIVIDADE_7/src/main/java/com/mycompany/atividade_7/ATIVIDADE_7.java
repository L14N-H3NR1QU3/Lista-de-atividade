/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_7;

/**
 *
 * @author l.silva
 */
import java.util.Scanner;
public class ATIVIDADE_7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        System.out.print("Digite um numero para limite de intervalo: ");
        int num = ler.nextInt();
        int par = 0;
        int impar = 0;
        for(int i = 1; i <= num; i++){
            if(i%2 == 0){
                par += 1;
            }
            else{
                impar += 1;
            }
        }
        System.out.println("Numeros pares no intervalo: "+par);
        System.out.println("Numeros impares no intervalo: "+impar);
    }
}
