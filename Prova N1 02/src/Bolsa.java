public class Bolsa extends Brinde{

    public String tipo;

    public Bolsa(String tipo, String nome, int preco) {
        super(nome, preco);
        this.tipo = tipo;
    }
    public void imprime(){
        System.out.println("Tipo de bolsa: " + tipo);
        System.out.println("Nome da bolsa: " + nome);
        System.out.println("Preço da bolsa: R$" + preco + "\n");
    }

}
