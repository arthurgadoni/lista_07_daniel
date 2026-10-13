public class algoritmo_02 {
    public static void main(String[] args) {
        int[][] conteudos = {
            {0, 1, 2, 0, 1},
            {1, 0, 0, 2, 1},
            {2, 1, 0, 1, 2},
            {0, 0, 1, 2, 0},
            {1, 2, 0, 1, 0}
        };

        int seguros = 0;
        int suspeitos = 0;
        int nocivos = 0;
        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                if (conteudos[linha][coluna] == 0) {
                    seguros++;
                } else if (conteudos[linha][coluna] == 1) {
                    suspeitos++;
                } else if (conteudos[linha][coluna] == 2) {
                    nocivos++;
                    conteudos[linha][coluna] = -1;
                }
            }
        }

        System.out.println("Conteudos seguros são: " + seguros);
        System.out.println("Conteudos suspeitos serão: " + suspeitos);
        System.out.println("Os conteudos nocivos são: " + nocivos);

        System.out.println("Matriz atualizada: ");

        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                System.out.print(conteudos[linha][coluna] + " ");
            }
            System.out.println();
        }
    }
}