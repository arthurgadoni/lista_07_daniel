public class algoritmo_05 {
    public static void main(String[] args) {
        int[][] entregas = {
            {10, 15, 20, 12},
            {18, 25, 14, 16},
            {11, 22, 19, 13},
            {17, 12, 21, 14}
        };

        int soma_bordas = 0;
        System.out.println("Quais a matriz de entregas? ");

        for (int linha = 0; linha < 4; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                System.out.print(entregas[linha][coluna] + "\t");

                if (linha == 0 || linha == 3 || coluna == 0 || coluna == 3) {
                    soma_bordas += entregas[linha][coluna];
                }
            }

            System.out.println();
        }

        System.out.println("A soma dos tempos das bordas é: " + soma_bordas);
    }
}