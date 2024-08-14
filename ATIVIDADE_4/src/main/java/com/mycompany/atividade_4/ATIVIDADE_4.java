/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_4;

/**
 *
 * @author l.silva
 */
import java.util.Scanner;
public class ATIVIDADE_4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        String nomeCad = "usuario";
        int senhaCad = 000;
        int chances = 0;
        int pass = 0;
        while(chances != 3 && pass != 1){
            System.out.print("Digite o nome: ");
            String nome = ler.next();
            System.out.println(nome);
            System.out.print("Digite a senha: ");
            int senha = ler.nextInt();
            if(nome.equals(nomeCad)  && senha == senhaCad){
                System.out.println("Aprovado!");
                pass = 1;
            }
            else{
                System.out.println("Usuario ou senha esta incorreto!");
                chances += 1;
            }
        }
        if(chances == 3){
            System.out.println("Acabaram as chances!");
        }
    }
}
