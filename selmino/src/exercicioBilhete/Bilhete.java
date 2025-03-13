package exercicioBilhete;

import java.util.Random;
import java.util.Scanner;

public class Bilhete {
    static final double PASSAGEM = 5.20;
    Usuario usuario;
    int id;
    double saldo;


    public Bilhete(Usuario usuario) {
        this.usuario = usuario;
        this.id = aleatorio();
    }

    private int aleatorio() {
        Random r = new Random();
        return r.nextInt(1000, 10000);
    }

    //metodo paracarregaro bilhete
    public void adicionarSaldo(double valor) {

        this.saldo += valor;
    }

    public void verSaldo() {
        System.out.println("Saldo:" + this.saldo);
    }

    public void passarCatraca() {
        double debito;
        if (usuario.tipoTarifa.equalsIgnoreCase("Normal")) {
            debito = PASSAGEM;
        }
        else {
            debito=PASSAGEM/2;
        }
        if (saldo>=debito){
            System.err.println("Pago: " + PASSAGEM);
            saldo-=debito;
        }
        else {
            System.out.println("Saldo insufiente");
        }
    }

}