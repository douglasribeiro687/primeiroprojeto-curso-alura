import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {

        double notaFilme = 0D;
        double mediaAcumulada = 0D;
        Scanner leitura = new Scanner(System.in);
        double nota = 0;
        int totalDeNotas = 0;

        //for
//        for (int i = 0; i < 3; i++) {
//            System.out.println("Qual sua nota para o filme ?" );
//            mediaAcumulada += leitura.nextDouble();
//        }
//        notaFilme = mediaAcumulada/3;

        // while
        while (nota != -1) {
            System.out.println("Diga sua avaliação para o filme ou -1 para encerrar  ");
            nota = leitura.nextDouble();
            if (nota != -1) {
                mediaAcumulada += nota;
                totalDeNotas++;
            }

        }

        System.out.println("Média de avaliações " + mediaAcumulada / totalDeNotas);
    }
}
