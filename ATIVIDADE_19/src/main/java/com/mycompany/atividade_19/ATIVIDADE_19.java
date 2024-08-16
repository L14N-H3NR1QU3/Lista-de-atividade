/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_19;

/**
 *
 * @author l.silva
 */
import java.util.Scanner;
public class ATIVIDADE_19 {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        System.out.print("Digite a base da potenciacao: ");
        int base = ler.nextInt();
        System.out.print("Digite o expoente da potenciacao: ");
        int exp = ler.nextInt();
        for(int i = 1; i < exp - 1; i++){
            base *= base;
        }
        System.out.println(base);
    }
}
