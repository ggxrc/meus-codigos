public class Pedido {
    public String cliente, brinde;
    public int quantidade;

    public Pedido(String brinde, String cliente, int quantidade) {
        this.brinde = brinde;
        this.cliente = cliente;
        this.quantidade = quantidade;
    }
    public void imprime(){
        System.out.println("Nome do cliente: " + cliente);
        System.out.println("quantidade de itens: " + quantidade);
        System.out.println("tipo do brinde: " + brinde + "\n");
    }
}
