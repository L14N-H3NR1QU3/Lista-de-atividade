/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_13;

/**
 *
 * @author l.silva
 */
import java.util.Scanner;
public class Atividade_13 {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        System.out.println("Digite o ano: ");
        System.out.print("Escolha: ");
        int ano = ler.nextInt();
        if(ano%4 == 0){
            System.out.println("Ano e bissexto!");
        }
        else{
            System.out.println("Ano nao e bissexto!");
        }
    }
}
