public class Desafio {

    public static void main(String[] args) {

        // Exercicio 1
        double valor1 = 12.00;
        double valor2 = 10.00;
        double media = (valor1 + valor2) / 2;
        System.out.println(media);


        // Exercicio 2
        double varaivelDouble = 5.50 + 10.25;
        int variavelInt = (int) varaivelDouble;
        System.out.println(variavelInt);


        // Exercicio 3
        char letra = 'B';
        String nome = "Victor";
        System.out.println("O cliente " + nome + " disse nao gostar da letra B.");

        // Exercicio 4
        double precoProduto = 30.00;
        int quantidade = 6;
        float totalPagar = (float) (precoProduto * quantidade);

        // Exercicio 5
        float valorEmDolares = 2000f;
        float dolar = 4.94f;
        float valorEmReais = valorEmDolares * dolar;
        System.out.printf("Valor em Reais: %.2f%n", valorEmReais);// Print f, ele é parecido com o formatted

        // Exercicio 6

        double precoOriginal = 200;
        double percentualDesconto = 0.10;
        double valorFinal = precoOriginal * percentualDesconto;
        System.out.println("O valor com desconto de 10% foi: "+valorFinal+" Reais");










    }
}
