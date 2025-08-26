public class Main {
    public static void main(String[] args) {

        //Classe usuario
        Usuario usuario = new Usuario("Lucas", "lucas@email.com", "02982783");
        usuario.                                                                         listarUsuario();

        //Classe login
        Login login = new Login("lucas", "123456");
        login.doLogin();
        login.doLogout();

        //Classe transacao
        Transacao transacao = new Transacao("Conta de água", 150, "Despesa");
        transacao.listarTransacao();
        System.out.println("Transação registrada para o usuário: " + usuario.nome);

        //
        Categoria categoriaDespesa = new Categoria(1, "Despesas Fixas", "Despesas mensais recorrentes");
        categoriaDespesa.exibirCategoria();

        Autenticacao auth = new Autenticacao();
        auth.autenticar(login.username, login.password);
        auth.encerrarSessao();
    }
}
