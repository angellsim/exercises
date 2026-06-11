package JogoDaVelha;

import java.util.Scanner;

public class JogoDaVelha {

    static Scanner scanner = new Scanner(System.in);

    static char[][] tabuleiro = new char[3][3];

    public static void main(String[] args) {

        boolean continuar = true;

        while (continuar) {

            inicializarTabuleiro();

            boolean turnoJogador = true;
            boolean fimDeJogo = false;

            while (!fimDeJogo) {

                mostrarTabuleiro();

                if (turnoJogador) {
                    jogadaJogador();
                } else {
                    jogadaComputador();
                }

                char vencedor = verificarVencedor();

                if (vencedor == 'X') {
                    mostrarTabuleiro();
                    System.out.println("\nVocê venceu!");
                    fimDeJogo = true;
                }
                else if (vencedor == 'O') {
                    mostrarTabuleiro();
                    System.out.println("\nComputador venceu!");
                    fimDeJogo = true;
                }
                else if (tabuleiroCheio()) {
                    mostrarTabuleiro();
                    System.out.println("\nDeu velha!");
                    fimDeJogo = true;
                }

                turnoJogador = !turnoJogador;
            }

            System.out.println("\nDeseja jogar novamente?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");

            int opcao = scanner.nextInt();

            if (opcao != 1) {
                continuar = false;
            }
        }
    }

    static void inicializarTabuleiro() {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ' ';
            }
        }
    }

    static void mostrarTabuleiro() {

        System.out.println();

        for (int i = 0; i < 3; i++) {

            System.out.print(" ");

            for (int j = 0; j < 3; j++) {

                System.out.print(tabuleiro[i][j]);

                if (j < 2) {
                    System.out.print(" | ");
                }
            }

            System.out.println();

            if (i < 2) {
                System.out.println("---+---+---");
            }
        }

        System.out.println();
    }

    static void jogadaJogador() {

        int linha;
        int coluna;

        do {

            System.out.print("Linha (0-2): ");
            linha = scanner.nextInt();

            System.out.print("Coluna (0-2): ");
            coluna = scanner.nextInt();

        } while (
                linha < 0 || linha > 2 ||
                coluna < 0 || coluna > 2 ||
                tabuleiro[linha][coluna] != ' '
        );

        tabuleiro[linha][coluna] = 'X';
    }

    static void jogadaComputador() {

        System.out.println("Computador jogando...");

        // Tenta vencer
        if (jogadaInteligente('O')) {
            return;
        }

        // Tenta bloquear
        if (jogadaInteligente('X')) {
            return;
        }

        // Centro
        if (tabuleiro[1][1] == ' ') {
            tabuleiro[1][1] = 'O';
            return;
        }

        // Cantos
        int[][] cantos = {
                {0,0},
                {0,2},
                {2,0},
                {2,2}
        };

        for (int[] canto : cantos) {
            if (tabuleiro[canto[0]][canto[1]] == ' ') {
                tabuleiro[canto[0]][canto[1]] = 'O';
                return;
            }
        }

        // Qualquer posição livre
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (tabuleiro[i][j] == ' ') {
                    tabuleiro[i][j] = 'O';
                    return;
                }
            }
        }
    }

    static boolean jogadaInteligente(char simbolo) {

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                if (tabuleiro[i][j] == ' ') {

                    tabuleiro[i][j] = simbolo;

                    if (verificarVencedor() == simbolo) {

                        if (simbolo == 'X') {
                            tabuleiro[i][j] = 'O';
                        }

                        return true;
                    }

                    tabuleiro[i][j] = ' ';
                }
            }
        }

        return false;
    }

    static char verificarVencedor() {

        for (int i = 0; i < 3; i++) {

            if (
                    tabuleiro[i][0] != ' ' &&
                    tabuleiro[i][0] == tabuleiro[i][1] &&
                    tabuleiro[i][1] == tabuleiro[i][2]
            ) {
                return tabuleiro[i][0];
            }
        }

        for (int i = 0; i < 3; i++) {

            if (
                    tabuleiro[0][i] != ' ' &&
                    tabuleiro[0][i] == tabuleiro[1][i] &&
                    tabuleiro[1][i] == tabuleiro[2][i]
            ) {
                return tabuleiro[0][i];
            }
        }

        if (
                tabuleiro[0][0] != ' ' &&
                tabuleiro[0][0] == tabuleiro[1][1] &&
                tabuleiro[1][1] == tabuleiro[2][2]
        ) {
            return tabuleiro[0][0];
        }

        if (
                tabuleiro[0][2] != ' ' &&
                tabuleiro[0][2] == tabuleiro[1][1] &&
                tabuleiro[1][1] == tabuleiro[2][0]
        ) {
            return tabuleiro[0][2];
        }

        return ' ';
    }

    static boolean tabuleiroCheio() {

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                if (tabuleiro[i][j] == ' ') {
                    return false;
                }
            }
        }

        return true;
    }
}