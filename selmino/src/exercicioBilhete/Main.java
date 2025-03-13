package exercicioBilhete;

public class Main {
    public static void main(String[] args) {
        Usuario usuario=new Usuario("pedro",123,"Estudante");
        Bilhete bilhete=new Bilhete(usuario);

        bilhete.verSaldo();
        bilhete.adicionarSaldo(200);
        bilhete.verSaldo();
        bilhete.passarCatraca();
        bilhete.verSaldo();
    }
}
