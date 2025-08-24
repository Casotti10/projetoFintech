public class Main {

    public static void main(String[] args) {


//        // Autenticação
//        Autenticacao auth = new Autenticacao();
//        auth.autenticar(login.username, login.password);
//        auth.encerrarSessao();


        // Registro de transação
        Transacao transacao = new Transacao("Conta de agua", 150, "Despesa");
        transacao.listarTransacao();
    }
}