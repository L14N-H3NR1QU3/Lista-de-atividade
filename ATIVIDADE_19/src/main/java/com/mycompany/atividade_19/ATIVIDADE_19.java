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
        double base = ler.nextDouble();
        System.out.print("Digite o expoente da potenciacao: ");
        int exp = ler.nextInt();
        double resp = 1;
        if(exp > 0){
            if(exp < 3){
                for(int i = 0; i < exp; i++){
                    resp *= base;
                }
            }
            else{
                for(int i = 0; i < exp - 1; i++){
                    resp *= base;
                }
            }
        }
        else if(exp < 0){
            for(int i = exp + 1; i <= 0; i++){
                resp /= 10;
            }
        }
        else{ 
            resp = 1;
        }
        System.out.println(resp);
    }
}
