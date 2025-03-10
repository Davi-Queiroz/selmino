package exercicio04;

import java.util.Scanner;

public class Funcionario {
    String nome;
    String cargo;
    double salario;

    public Funcionario(String nome,String cargo, double salario){
        this.nome=nome;
        this.cargo=cargo;
        this.salario=salario;
    }

    public void aumentoSalario(double aumento){

        salario += (salario *(aumento /100));
    }

    public void aumentoSalario(String cargo, double aumento){

        if (this.cargo.equalsIgnoreCase(cargo)){
            salario+=(salario *(aumento/100));
        }
    }

    public void promover(String cargo){
   this.cargo=cargo;
    }
}