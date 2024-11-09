import java.util.ArrayList;
import java.util.Random;

public class Genshin extends Jogo{
    private static int resina = 200;
    private int vida_player = 100;
    private int vida_inimigo = 100;
    private String arma;
    Random rng = new Random();
    public int t3, t4, t5;
    ArrayList<Genshin> registroBanner = new ArrayList<>();

    public Genshin(String nome_player, String nome_personagem, String tipo, int resina, int vida_player, int vida_inimigo, String arma) {
        super(nome_player, nome_personagem, tipo);
        Genshin.resina = resina;
        this.vida_player = vida_player;
        this.vida_inimigo = vida_inimigo;
        this.arma = arma;
    }
    
    public void luta() {
        int dano = 0;
        System.out.println("Vida do Inimigo no inicio: " + this.vida_inimigo);
        
        do {
            int chance = rng.nextInt(3);
            dano = rng.nextInt(20);
            switch (chance) {
                case 1:
                    this.setVida_inimigo(this.getVida_inimigo() - dano);
                    break;
                case 2:
                    this.setVida_player(this.getVida_player() - dano);
                    break;
                default:
                    System.out.println("ninguém acertou");
                    break;
            }
            System.out.println("Vida do jogador: " + this.vida_player);
            System.out.println("Vida do Inimigo: " + this.vida_inimigo);
        } while ((vida_player >= 0) && (vida_inimigo >= 0));
    }

    public String gacha() {
        for (int i = 0; i < 10; i++) {
            int chance = rng.nextInt(101);
            if (chance >= 0 && chance <= 70) {
                System.out.println("ganhou um personagem 3 estrelas");
                t3++;
                
            } else if (chance >= 71 && chance <= 90) {
                System.out.println("ganhou um personagem 4 estrelas");
                t4++;
            } else{
                System.out.println("parabéns, você ganhou um 5 estrelas");
                t5++;
            }  
        }
        
        return "Conseguiu ao todo: \nT3: "+ t3 +"\nT4: "+t4+"\nT5: "+t5; 
    }

    public static int getResina() {
        return resina;
    }

    public static void setResina(int resina) {
        Genshin.resina = resina;
    }

    public int getVida_player() {
        return vida_player;
    }

    public void setVida_player(int vida_player) {
        this.vida_player = vida_player;
    }

    public int getVida_inimigo() {
        return vida_inimigo;
    }

    public void setVida_inimigo(int vida_inimigo) {
        this.vida_inimigo = vida_inimigo;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }
    
}
