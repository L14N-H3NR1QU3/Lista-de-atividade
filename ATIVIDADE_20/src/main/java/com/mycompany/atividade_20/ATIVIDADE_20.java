/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_20;

/**
 *
 * @author l.silva
 */
import java.util.Scanner;
public class ATIVIDADE_20 {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        System.out.print("Digite o valor do produto: ");
        double val = ler.nextDouble();
        System.out.print("Digite o desconto do produto: ");
        double des = ler.nextDouble();
        if(des > 0 && des < 100){
            des = (des/100)*val;
            val -= des;
            System.out.println("O valor do produto com desconto e: "+val);
        }
        else{
            System.out.println("ERRO: Valor do desconto nao e apropriado!");
        }
    }
}
