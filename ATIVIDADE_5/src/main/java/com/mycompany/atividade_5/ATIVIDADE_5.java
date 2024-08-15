/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_5;

/**
 *
 * @author l.silva
 */
import java.util.Scanner;
public class ATIVIDADE_5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num = ler.nextInt();
        for (int i = 1; i <= 10; i++){
            System.out.println(i+"*"+num+"="+(i*num));
        }
    }
}
