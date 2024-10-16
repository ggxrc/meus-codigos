public class Gerente extends Funcionario {
    public String senha;

    public Gerente(String nome, float salario, String senha) {
        super(nome, salario);
        this.senha = senha;
    }

    public Boolean autenticarSenha(String senha){
        return senha.equals(this.senha);
    }
}
