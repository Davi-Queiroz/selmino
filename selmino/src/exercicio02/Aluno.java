package exercicio02;

public class Aluno {
    // atributos ou variáveis de instância
    int rm;
    String nome;
    String[] listaDisciplinas = new String[3];
    double[][] notas = new double[3][2];

    // método para calcular e retornar a média aritmética do aluno em uma disciplina
    public double calcularMedia(int i) {
        double media = 0;
        for(int j = 0; j < notas[i].length; j++) {
            media += notas[i][j];
        }
        media = media / notas[i].length;
        return media;
    }

    // método para retornar o status de um aluno em uma disciplina
    public String verificarStatus(int i) {
        double media = calcularMedia(i);
        if(media >= 6.0) {
            return "APROVADO";
        }
        return "REPROVADO";
    }
}
