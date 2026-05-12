import java.util.Scanner;

public class Desafio2Parte1 {
    static void main() {

                Scanner entrada = new Scanner(System.in);

                System.out.print("Digite o primeiro número: ");
                int numero1 = entrada.nextInt();

                System.out.print("Digite o segundo número: ");
                int numero2 = entrada.nextInt();

                if (numero1 == numero2) {
                    System.out.println("Os números são iguais");
                } else if (numero1 > numero2) {
                    System.out.println("O primeiro número é maior");
                } else {
                    System.out.println("O segundo número é maior");
                }


    }
}
