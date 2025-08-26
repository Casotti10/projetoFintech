public class Usuario {

    public String nome;
    public String email;
    public String cpf;

    // Construtor
    public Usuario(String nome, String email, String cpf) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }

    // Metodo
    public void listarUsuario() {
        System.out.println("Cadasto realizado!");
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("CPF: " + cpf);
        System.out.println("-------------------------------");
    }
}
