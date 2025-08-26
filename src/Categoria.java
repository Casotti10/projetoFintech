public class Categoria {
    private int id;
    private String nome;
    private String descricao;

    public Categoria(int id, String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }

    public void exibirCategoria() {
        System.out.println("\n--- Categoria Cadastrada ---");
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Descricao: " + descricao);
    }
}