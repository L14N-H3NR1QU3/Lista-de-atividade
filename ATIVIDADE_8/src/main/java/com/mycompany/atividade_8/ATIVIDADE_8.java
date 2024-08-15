/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_8;

/**
 *
 * @author l.silva
 */
import java.util.Scanner;
public class ATIVIDADE_8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        boolean pass = false;
        while(!pass){
            System.out.print("Digite um senha: (senha deve ter 8 caracteres):");
            String senha = ler.next();
            if(senha.length() > 8){
                System.out.println("ERRO: Senha deve ter 8 caracteres");
            }
            else{
                System.out.println("Senha definida!");
                pass = true;
            }
        }
    }
}
