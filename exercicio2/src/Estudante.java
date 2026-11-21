import java.util.Scanner;

public class Estudante {
    public static void main(String[] args) {
        int idade = 18;
        char inicialDoNome = 'B';
        char inicialDoSobrenome = 'T';
        double media = 9.5;
        boolean aprovado = true;
        String nome = "Bruna";
        String sobrenome = "Tironi";

        System.out.println(idade);
        System.out.println(inicialDoNome);
        System.out.println(inicialDoSobrenome);
        System.out.println(media);
        System.out.println(aprovado);
        System.out.println(nome + " " + sobrenome);

        System.out.println(nome.charAt(0));
        System.out.println(nome.charAt(2));

        System.out.println(nome.length());

        System.out.println(nome.charAt(nome.length() - 1));

        System.out.println(nome.equals("Tironi"));

        Scanner input = new Scanner(System.in);
        
        media = input.nextDouble();

    }
}
