import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Profile {


    public static void main(String[] args) {

        String nome = "Maria";
        int idade = 30;
        double valor = 55.9999;
        String mensagem = """
                Olá %s tudo bem? esperamos que sim!
                Teremos a possibilidade de aplicar cupons para pessoas acima de %d com desconto de %.2f
                """.formatted(nome,idade,valor);

        System.out.println(mensagem);

    }
}
