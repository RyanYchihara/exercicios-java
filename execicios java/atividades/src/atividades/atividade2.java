
/*
* Exercício 2 Calculadora de Média Aritmética 
* Aluno(a): Ryan Beijo Ychihara/ViniciusCoelho
* RA: 
* Data: 17/03/2026
* Disciplina: Desenvolvimento de Sistemas I
* Professor: Prof. Dr. Faberson Ferrasi
*/


package atividades;

import java.util.Scanner;


public class atividade2 {

    public static void main(String[] args) {
        
         Scanner teclado;
       teclado = new Scanner(System.in);
        int i = 0;
        double num = 0;
       
       while(3>i){
        System.out.println("digite um numero: ");
        num = num + teclado.nextDouble();
        
        i++;
       }
       
      double media = num/3;
       
       System.out.printf("Média: %.2f",media);
      
    }
    
}
