import java.util.Scanner;

// A: 2 B: 4 = 2 * 4 / 2 = 8 / 2 = 4
// A: 3 B: 5 = 3 * 5 / 2 = 15 / 2 = 7.5
public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da altura do triângulo: ");
        double altura = scanner.nextDouble();

        System.out.println("Digite o valor da base do triângulo: ");
        double base = scanner.nextDouble();

        double area = (base * altura) / 2.0;
        System.out.println("A área do triângulo é igual a " + area);
    }
}
