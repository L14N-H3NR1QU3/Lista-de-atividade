/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_6;

/**
 *
 * @author l.silva
 */
import java.util.Scanner;
public class ATIVIDADE_6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite sua altura: ");
        double alt = ler.nextDouble();
        System.out.println("Digite seu peso: ");
        int peso = ler.nextInt();
        double IMC = peso/(alt*alt);
        System.out.println(IMC);
        if(IMC < 18.5){
            System.out.println("Baixo peso");
        }
        else if(IMC > 18.5 && IMC < 24.9){
            System.out.println("Peso normal");
        }
        else if(IMC > 25 && IMC < 29.9){
            System.out.println("Sobrepeso");
        }
        else if(IMC > 30){
            System.out.println("Obesidade");
        }
    }
}
