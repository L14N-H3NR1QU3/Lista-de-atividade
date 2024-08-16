/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_16;

/**
 *
 * @author l.silva
 */
import java.util.Scanner;
public class ATIVIDADE_16 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String invert = "";
        System.out.print("Digite uma palavra: ");
        String resp = ler.next();
        for (int i = resp.length() - 1; i >= 0; i--){
            invert += resp.charAt(i);
        }
        System.out.println("Invertido: "+invert);
        if(resp.equals(invert)){
            System.out.println("E um palindromo!");
        }
        else{
            System.out.println("Nao e um palindromo!");
        }
    }
}
