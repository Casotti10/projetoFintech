public class Login {

    public String username;
    public String password;

    // Construtor
    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Métodos (sem lógica real)
    public void doLogin() {
        System.out.println("Login: " + username);
    }

    public void doLogout() {
        System.out.println("Login realizado.");
        System.out.println("-------------------------------");
    }
}
