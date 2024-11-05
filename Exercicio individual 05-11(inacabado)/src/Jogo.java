public class Jogo {
    private String nome_player; // Nome do jogador
    private String tipo; // Tipos: Físico, Elemental
    private String nome_personagem; // nome do personagem no jogo
    
    public Jogo(String nome_player, String nome_personagem, String tipo) {
        this.nome_player = nome_player;
        this.nome_personagem = nome_personagem;
        this.tipo = tipo;
    }
    public String getNome() {
        return nome_player;
    }
    
    public void setNome(String nome_player) {
        this.nome_player = nome_player;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getNome_personagem() {
        return nome_personagem;
    }
    
    public void setNome_personagem(String nome_personagem) {
        this.nome_personagem = nome_personagem;
    }
}

