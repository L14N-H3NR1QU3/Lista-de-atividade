/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_15;

/**
 *
 * @author l.silva
 */
import java.util.Scanner;
public class ATIVIDADE_15 {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        System.out.print("Digite um numero: ");
        int num = ler.nextInt();
        int res = 1;
        for(int i = 1; i < num; i++){
            res = res*(i+1);
        }
        System.out.println("Res: "+res);
    }
}
