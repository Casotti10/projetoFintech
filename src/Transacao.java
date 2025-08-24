public class Transacao {

    public String descricao;
    public double valor;
    public String tipo; //RECEITA OU DESPESA

    //Construtor
    //Getter
    public Transacao(String descricao, double valor, String tipo){
        this.descricao = descricao;
        this.valor = valor;
        this.tipo = tipo;
    }

    //Metodo
    public void listarTransacao(){
        System.out.println("Transação realizada!");
        System.out.println("Descricao: " + descricao);
        System.out.println("Valor: "+ valor);
        System.out.println("Tipo da transação: " + tipo);
        System.out.println("-------------------------------");
    }
}
