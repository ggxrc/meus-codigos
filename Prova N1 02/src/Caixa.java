public class Caixa extends Brinde{
    
    public String tamanho;

    public Caixa(String tamanho, String nome, int preco) {
        super(nome, preco);
        this.tamanho = tamanho;
    }

    public void imprime(){
        System.out.println("Nome da caixa: " + nome);
        System.out.println("Preço da caixa: R$" + preco); 
        System.out.println("tamanho da caixa: " + tamanho + "\n");
    }

}
