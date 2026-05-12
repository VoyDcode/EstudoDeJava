import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numero;
        int zerosSeguidos = 3;
        int contadorPositivo = 0;
        int contadorNegativo = 0;

        while (true) {
            System.out.println("Digite um numero: ");
            numero = leitor.nextInt();

            if (numero == 0) {
                zerosSeguidos++;

                if (zerosSeguidos == 4) {
                    System.out.println("Você digitou 4 zeros. Programa encerrado.");
                    break;
                }
            } else {
                zerosSeguidos = 0;

                if (numero > 0) {
                    contadorPositivo++;
                    System.out.println("O numero é positivo!");
                } else {
                    contadorNegativo++;
                    System.out.println("O numero é negativo!");
                }
            }
        }

        System.out.println("Quantidade de positivos: " + contadorPositivo);
        System.out.println("Quantidade de negativos: " + contadorNegativo);

        leitor.close();
    }
}