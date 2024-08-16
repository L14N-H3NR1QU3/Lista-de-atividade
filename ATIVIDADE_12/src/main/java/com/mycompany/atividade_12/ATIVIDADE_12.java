/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_12;

/**
 *
 * @author l.silva
 */
import java.util.Scanner;
public class ATIVIDADE_12 {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int usuario = 1;
        int cand1 = 0;
        int cand2 = 0;
        int cand3 = 0;
        for(int i = 0; i < usuario; i++){
            System.out.println("Vote em um candidato: ");
            System.out.println("1 - Jorge");
            System.out.println("2 - Pedro");
            System.out.println("3 - Marcos");
            System.out.print("Escolha: ");
            int resp1 = ler.nextInt();
            if(resp1 == 1){
                cand1 += 1;
            }
            else if(resp1 == 2){
                cand2 += 1;
            }
            else if(resp1 == 3){
                cand3 += 1;
            }
            System.out.println("Votar novamente? (1 - Sim / 2 - Nao)");
            System.out.print("Escolha: ");
            int resp2 = ler.nextInt();
            if(resp2 == 1){
                usuario += 1;
            }
        }
        System.out.println("Votos do Jorge: "+cand1);
        System.out.println("Votos do Pedro: "+cand2);
        System.out.println("Votos do Marcos: "+cand3);
    }
}
