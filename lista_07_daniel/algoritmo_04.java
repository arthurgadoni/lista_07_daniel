import java.util.Scanner;

public class algoritmo_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] eficiencia = new double[3][5];
        double soma = 0;

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                System.out.print("Diz pra mim a eficiencia do painel [" + linha + "][" + coluna + "]: ");
                eficiencia[linha][coluna] = sc.nextDouble();
                soma += eficiencia[linha][coluna];
            }
        }

        double media = soma / 15;
        System.out.println("Media global é de: " + media);
        System.out.println("Os paineis abaixo da media são:");

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                if (eficiencia[linha][coluna] < media) {
                    System.out.println("[" + linha + "][" + coluna + "]");
                }
            }
        }

        sc.close();
    }
}