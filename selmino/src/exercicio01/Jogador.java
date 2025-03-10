package exercicio01;

public class Jogador {
    // atributos ou variáveis de instância
    String nome;
    int[] score = new int[3];

    // método para calcular e retornar o score total do jogador na partida
    public int calcularScoreTotal() {
        int total = 0;
        for (int i : score) {
            total += i;
        }
        return total;
    }
}
