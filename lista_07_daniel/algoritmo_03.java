public class algoritmo_03 {
    public static void main(String[] args) {
        double[][] temperaturas = {
            {28.5, 30.2, 31.4, 29.8},
            {32.1, 35.6, 33.2, 30.5},
            {31.7, 34.2, 36.8, 32.4},
            {29.3, 31.5, 33.1, 30.7}
        };

        double maior_temperatura = temperaturas[0][0];
        int linha_maior = 0;
        int coluna_maior = 0;
        double soma_diagonal = 0;

        for (int linha = 0; linha < 4; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                if (temperaturas[linha][coluna] > maior_temperatura) {
                    maior_temperatura = temperaturas[linha][coluna];
                    linha_maior = linha;
                    coluna_maior = coluna;
                }
            }

            soma_diagonal += temperaturas[linha][linha];
        }

        double media_diagonal = soma_diagonal / 4;

        System.out.println("Maior temperatura foi de " + maior_temperatura);
        System.out.println("Linha: " + (linha_maior + 1));
        System.out.println("Coluna: " + (coluna_maior + 1));
        System.out.println("A media da diagonal principal é de: " + media_diagonal);
    }
}