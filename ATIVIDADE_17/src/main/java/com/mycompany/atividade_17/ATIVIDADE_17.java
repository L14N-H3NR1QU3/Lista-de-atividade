/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_17;

/**
 *
 * @author l.silva
 */
import java.util.Scanner;
public class ATIVIDADE_17 {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        System.out.println("Digite uma palavra: ");
        String resp = ler.next();
        System.out.println(resp);
        String aeiou = "aeiou";
        String AEIOU = "AEIOU";
        int cont = 0;
        for(int i = 0; i < resp.length(); i++){
            char comp = resp.charAt(i);
            for(int j = 0; j < aeiou.length(); j++){
                if(comp == aeiou.charAt(j) || comp == AEIOU.charAt(j)){
                    cont += 1;
                }
            }
        }
        System.out.println("O numero de vogais: "+cont);
    }
}
