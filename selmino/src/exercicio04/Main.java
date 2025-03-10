package exercicio04;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Pedro", "salsicha", 200);
        System.out.println(funcionario.salario);
        funcionario.aumentoSalario(50);
        System.out.println(funcionario.salario);
        funcionario.aumentoSalario("Gerente",10);
        System.out.println(funcionario.salario);
    }
}
