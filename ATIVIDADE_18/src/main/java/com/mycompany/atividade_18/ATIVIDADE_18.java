/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_18;

/**
 *
 * @author l.silva
 */
import java.util.Scanner;
public class ATIVIDADE_18 {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int val = 0;
        System.out.println("Digite qual veiculo:");
        System.out.println("1 - Moto");
        System.out.println("2 - Carro");
        System.out.println("3 - Caminhao");
        System.out.print("Escolha: ");
        int resp = ler.nextInt();
        if(resp == 1){
            val = 5;
        }
        else if(resp == 2){
            val = 10;
        }
        else if(resp == 3){
            val = 35;
        }
        System.out.println("O valor a ser pago e "+val+" reais!");
    }
}
