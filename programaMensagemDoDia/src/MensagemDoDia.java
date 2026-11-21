import java.util.Scanner;

public class MensagemDoDia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Escolha um número de 1 a 10: ");
        int numeroEscolhido = input.nextInt();

        if (numeroEscolhido >= 1 && numeroEscolhido <=5) {
            System.out.println("Quem avisa amigo é.");
        } else if(numeroEscolhido >= 6 && numeroEscolhido <=10) {
            System.out.println("Você é o que você come.");
        } else System.out.println("Número inválido");
    }
}
