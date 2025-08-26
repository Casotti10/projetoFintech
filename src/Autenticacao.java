public class Autenticacao {

    public boolean autenticado;

    // Construtor
    public Autenticacao() {
        this.autenticado = false;
    }

    // Métodos (sem lógica real)
    public void autenticar(String username, String password) {
        System.out.println("-------------------------------");
        System.out.println("Autenticação do usuario realizada.");
    }

    public void encerrarSessao() {
        System.out.println("Autenticação feita.");
    }
}