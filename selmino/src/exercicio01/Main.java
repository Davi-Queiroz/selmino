package exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Jogador jogador = new Jogador();

        // entrada de dados
        System.out.print("Digite o nome do jogador: ");
        jogador.nome = sc.nextLine();
        System.out.println("Score:");
        for(int i = 0; i < jogador.score.length; i++) {
            System.out.print("Score " + (i+1) + ": ");
            jogador.score[i] = sc.nextInt();
        }

        // saída de daods
        System.out.println();
        System.out.println("JOGADOR: " + jogador.nome);
        System.out.println("SCORE TOTAL: " + jogador.calcularScoreTotal());
    }
}
