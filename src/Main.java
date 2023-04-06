public class Main {
    public static void main(String[] args) {
    System.out.println("Wsse é o Scren Match");
    System.out.println("Filme: Top Gun: Maverick");

    int anoDeLancamento = 2020;
    System.out.println("Ano de lançamento: " + anoDeLancamento);
    boolean incluidoNoPlano = true;
    double notaDoFilme = 8.1;

    double media = (9.8 + 8.2 + 4.0) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de aventura muito bom
                Muito bom!!
                ano de lançamento:  """ + anoDeLancamento;

        System.out.println(sinopse);
        int classificacao = (int) (media /2);
        System.out.println(classificacao);
    }
}