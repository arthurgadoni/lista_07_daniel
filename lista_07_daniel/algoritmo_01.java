public class algoritmo_01 {
    public static void main(String[] args) {
        double[][] emissoes = {
            {10.5, 12.3, 11.2, 13.4},
            {8.2, 9.5, 10.1, 7.8},
            {15.4, 14.2, 16.3, 13.1},
            {6.7, 8.1, 7.5, 9.2}
        };

        double maior_emissao = 0;
        int trimestre_maior = 0;
        for (int linha = 0; linha < 4; linha++) {
            double total = 0;

            for (int coluna = 0; coluna < 4; coluna++) {
                total += emissoes[linha][coluna];
            }

            System.out.println("A total das filial é " + (linha + 1) + ": " + total);
        }

        for (int coluna = 0; coluna < 4; coluna++) {
            double total = 0;

            for (int linha = 0; linha < 4; linha++) {
                total += emissoes[linha][coluna];
            }

            if (total > maior_emissao) {
                maior_emissao = total;
                trimestre_maior = coluna + 1;
            }
        }

        System.out.println("Trimestre com maior emissao foi: " + trimestre_maior);
        System.out.println("Total de emissoes é de: " + maior_emissao);
    }
}