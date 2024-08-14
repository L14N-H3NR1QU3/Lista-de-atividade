/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_1;

/**
 *
 * @author l.silva
 */
import java.util.Scanner;
public class ATIVIDADE_1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int total = 0;
        int media;
        for(int i = 0; i < 3; i++){
            System.out.print("Digite a nota "+(i+1)+" do aluno: ");
            total += ler.nextInt();
        }
        media = total/3;
        System.out.println("Media: "+media);
        if (media < 5){
            System.out.println("Reprovado!");
        }
        else if(media >= 5 && media < 7){
            System.out.println("Recuperação!");
        }
        else{
            System.out.println("Aprovado!");
        }
    }
}
