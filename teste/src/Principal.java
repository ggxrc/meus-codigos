import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        Departamento campus = new Departamento("Ensino");
        

        // Funcionario clt = new Funcionario("clt medio", 5000f);

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("        Menu      ");
        System.out.println("1. Cadastrar funcionários \n2. Cadastrar Gerente \n3. Informações do Departamento \n4. Sair");
        int op = input.nextInt();
        switch (op) {
            case 1:
                System.out.print("informe informações do CLT: ");
                String nome = input.nextLine();
                input.nextLine();
                float salario = input.nextFloat();
                campus.escravos.add(new Funcionario(nome, salario));
                input.nextLine();
                break;
            case 2:
                input.nextLine();
                System.out.print("Informe informações do gerente: ");
                String nome_gerente = input.nextLine();
                Gerente staff = new Gerente(nome_gerente, 10000, "Apirocu");
                campus.gerente = staff;
                break;
            case 3:
                System.out.println("Nome do departamento: " + campus.nome);
                System.out.println("Nome do gerente: " + campus.gerente.nome);
                System.out.println("\n    Lista de CLTs fudidos   ");
                for (Funcionario clt : campus.escravos) {
                    System.out.println(clt.nome);
                }
                break;
            case 4:
                System.out.println("bye bye");
                return;
            default:
                System.out.println("tente denovo");
                break;
        }
         
        }  
    }
}