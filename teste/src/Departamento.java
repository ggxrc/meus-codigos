import java.util.ArrayList;

public class Departamento {
    public String nome;
    public Gerente gerente;

    public Departamento(String nome) {
        this.nome = nome;
    }

    ArrayList<Funcionario> escravos = new ArrayList<>();
    
}
