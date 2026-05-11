
void main(String[] args) {

    int anoDeLancamento = 2022;
    System.out.println("Ano de lançamento: " + anoDeLancamento);
    boolean incluidoNoPlano = true;
    double notaDoFilme = 8.1;
    // media calculada pelas 3 notas
    double media = (9.8 + 6.3 + 8) / 3;
    System.out.println(media);
    String sinopse;
    sinopse = """
            Filme Top Gun Maverick
            Filme de aventura com galã dos anos 80
            Muito bom!
            Ano lançamento
            """ + anoDeLancamento;
    System.out.println(sinopse);

    int classificacao;
    // casting
    classificacao = (int)media / 2; // existe os implicitos e os explicitos

    // Também da pra fazer assim.
    int classificacao1 = (int) (media / 2);

    


    System.out.println(classificacao);

}
