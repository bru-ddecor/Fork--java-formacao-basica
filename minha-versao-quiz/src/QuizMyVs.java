/*
 * Crie um programa com uma questão de múltipla escolha.
 * A pergunta deverá ter 3 alternativas de resposta, com apenas uma correta.
 * O usuário vai poder escolher a alternativa correta.
 * O programa deve informar se o usuário acertou ou errou, e também qual a
 * alternativa correta.
 */

import java.util.Scanner;

public class QuizMyVs {
    public static void main(String[] args) {
        String pergunta = "Qual é a propriedade musical que permite reconhecer a origem do som? (digite 1, 2, 3 ou 4): ";
        String alternativa1 = "Timbre";
        String alternativa2 = "Duração";
        String alternativa3 = "Intensidade";
        String alternativa4 = "Altura";
        int respostaCerta = 1;

        System.out.println(pergunta);
        System.out.println(alternativa1);
        System.out.println(alternativa2);
        System.out.println(alternativa3);
        System.out.println(alternativa4);

        Scanner input = new Scanner(System.in);
        int resposta = input.nextInt();
        
        if(resposta == 1) {
            System.out.println("Parabéns! Você acertou!");
        } else System.out.println("Que pena, a resposta certa era: " + respostaCerta + " - " + alternativa1);

    }
}
