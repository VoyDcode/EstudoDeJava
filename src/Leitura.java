import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class Leitura {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {

            System.out.println("Digite sua avaliação sobre o filme: ");
            nota = entrada.nextDouble();
            mediaAvaliacao += nota;
        }
        System.out.println("Média de avalição: " + mediaAvaliacao / 3);



    }
}
