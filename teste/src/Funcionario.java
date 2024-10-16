public class Funcionario {
    public String nome;
    public float salario;

    @Override
    public String toString() {
        return "\nnome: " + nome + "\nsalario: " + salario;
    }

    public Funcionario(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void bonificar(){
        System.out.println("salario antes: " + salario);
        salario *= 1.10;
        System.out.println("salario depois: " + salario);
    }
}
