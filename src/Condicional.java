public class Condicional {
    static void main(String[] args) {

        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "Plus";

        if (anoDeLancamento >= 2022 && notaDoFilme >= 7.5) {
            System.out.println("É amado pelo mercado!");

        }else if(anoDeLancamento >= 2022 || notaDoFilme >= 7 && tipoPlano.equals("Plus")) {
            System.out.println("Ainda é bacana.");

        }else{
            System.out.println("Será necessário comprar um novo plano.");
        }


    }
}
