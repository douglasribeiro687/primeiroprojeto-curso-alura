public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        System.out.println("Ano do Filme: " + anoDeLancamento);

        double media = (9.8 + 6.3 + 8.) /3;
        System.out.println(media);

        String sinopse = "Filme de aventura com galã dos anos 80.";
        System.out.println(sinopse);

        // casting
        int classificacao = (int) (media/2);
        System.out.println("Classificação: " + classificacao);

        /*
        pode ser usado acima do java 15
         */
//        String mensagem = """
//                  Olá, mundo!
//                  Este é um Text Block.
//                  Ele permite escrever textos com múltiplas linhas
//                  sem precisar usar caracteres de escape ou quebras de linha manualmente ou concatenações.
//                  """;

//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//        }
    }
}