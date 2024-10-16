
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        ArrayList<Caixa> lista_caixas = new ArrayList<>(); 
        ArrayList<Bolsa> lista_bolsas = new ArrayList<>();
        ArrayList<Pedido> pedidos = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        
        while (true) { 
            System.out.println("        Menu        \n");
        System.out.println("1. Cadastrar brinde \n2. Cadastrar pedido \n3. Listar brindes \n4. Listar pedidos \n5.Sair");
        int op = input.nextInt();
        input.nextLine();

        switch (op) {
            case 1: // Cadastrar brinde
                System.out.print("escolha entre caixa ou bolsa: ");
                String op_brinde = input.nextLine().toLowerCase();
                if (op_brinde.equals("caixa")) {
                    System.out.println("caixa escolhida");
                    System.out.println("tamanho da caixa(15x15, 10x10, 15x25): ");
                    String tamanho = input.nextLine();
                    System.out.print("nome da caixa: ");
                    String nome_caixa = input.nextLine();
                    System.out.print("preço da caixa: ");
                    int preco_caixa = input.nextInt();
                    input.nextLine();
                    lista_caixas.add(new Caixa(nome_caixa, tamanho, preco_caixa));
                }else{
                    System.out.println("bolsa escolhida");
                    System.out.println("tipo da bolsa: ");
                    String tipo = input.nextLine();
                    System.out.println("nome da bolsa: ");
                    String nome_bolsa = input.nextLine();
                    System.out.println("preço da bolsa: ");
                    int preco_bolsa = input.nextInt();
                    input.nextLine();
                    lista_bolsas.add(new Bolsa(nome_bolsa, tipo, preco_bolsa));
                }
                break;
            case 2: // Cadastrar pedido
                System.out.println("Lista de brindes");
                System.out.println("\n      lista de caixas      \n");
                for (Caixa brinde_caixa : lista_caixas) {
                    brinde_caixa.imprime();
                }
                System.out.println("\n      lista de bolsas      \n");
                for (Bolsa brinde_bolsa : lista_bolsas) {
                    brinde_bolsa.imprime();
                }

                System.out.print("nome do cliente: ");
                String cliente = input.nextLine();
                System.out.println("Faça seu pedido, dê a quantidade de brindes: ");
                int quantidade_brinde = input.nextInt();
                input.nextLine();
                System.out.println("escolha um dos brindes mostrados acima: ");
                String nome_brinde = input.nextLine().toLowerCase();
                pedidos.add(new Pedido(nome_brinde, cliente, quantidade_brinde));
                break;
            case 3: // Listar brindes
                for (Caixa brinde_caixa : lista_caixas) {
                    brinde_caixa.imprime();
                }
                System.out.println("\n      lista de bolsas      \n");
                for (Bolsa brinde_bolsa : lista_bolsas) {
                    brinde_bolsa.imprime();
                }
                int total_bolsas = lista_bolsas.size();
                int total_caixas = lista_caixas.size();
                int total_brindes = total_bolsas + total_caixas;
                System.out.println("Quantidade total de brindes: " + total_brindes);
                break;
            case 4: // Listar pedidos
            for (Pedido pedidos_clientes : pedidos) {
                pedidos_clientes.imprime();
            }
                break;
            case 5: // Sair
                System.out.println("bye bye");
                return;
        
            default:
                System.out.println("tente novamente");
                break;
        }
        }
    }
}