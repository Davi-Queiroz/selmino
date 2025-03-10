package exercicio02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        Aluno aluno = new Aluno();

        // entrada de dados
        System.out.print("Digite o nome do aluno: ");
        aluno.nome = sc.nextLine();
        System.out.print("Digite o RM do aluno: ");
        aluno.rm = sc.nextInt();

        // ler os nomes das disciplinas em que o aluno está matriculado
        for(int i = 0; i < aluno.listaDisciplinas.length; i++) {
            System.out.print("Disciplina " + (i + 1) + ": ");
            aluno.listaDisciplinas[i] = sc.next();

            // para cada disciplina, armazena a nota das duas provas
            for(int j = 0; j < aluno.notas[i].length; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                aluno.notas[i][j] = sc.nextDouble();
            }
            System.out.println();
        }

        // saída de dados
        System.out.println();
        System.out.println("RM: " + aluno.rm);
        System.out.println("Nome: " + aluno.nome);
        for(int i = 0; i < aluno.listaDisciplinas.length; i++) {
            System.out.println("Disciplina: " + aluno.listaDisciplinas[i]);
            System.out.println("Média: " + df.format(aluno.calcularMedia(i)));
            System.out.println("Status: " + aluno.verificarStatus(i));
            System.out.println();
        }
    }
}
