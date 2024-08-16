/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_14;

/**
 *
 * @author l.silva
 */
import java.util.Scanner;
import java.util.Random;
public class ATIVIDADE_14 {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        Random rand = new Random ();
        System.out.println("Par ou impar? (1 - Par / 2 - Impar)");
        System.out.print("Escolha: ");
        int escTim = ler.nextInt();
        System.out.println("Digite um numero: ");
        int escJog = ler.nextInt();
        int escMac = rand.nextInt(10)+1;
        int res = escJog+escMac;
        if(escTim == 1){
            if(res%2 == 0){
                System.out.println("Jogador venceu! Numero: "+res);
            }
            else{
                System.out.println("Maquina venceu! Numero: "+res);
            }
        }
        else{
            if(res%2 != 0){
                System.out.println("Jogador venceu! Numero: "+res);
            }
            else{
                System.out.println("Maquina venceu! Numero: "+res);
            }
        }
    }
}
