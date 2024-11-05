import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        ArrayList<Genshin> players = new ArrayList<>();
        
        Genshin genshin = new Genshin(null, null, null, 0, 
        100, 100, null);

        players.add(new Genshin("Carlos", "Diluc", "Elemental",
        200, 0, 0, "Espadão"));
        int op;
        do {
            System.out.println("    Menu    ");
            System.out.println("1. Tentar a sorte no banner \n2. Gastar resina \n3. Lutar contra um inimigo \n4. ALT + F4");
            System.out.print("Escolha uma opção: ");
            op = input.nextInt();
            
            switch (op) {
                case 1:
                    genshin.gacha();
                    break;
                case 2:
                    Genshin.setResina(Genshin.getResina() - 40);
                    System.out.println(Genshin.getResina());
                    break;
                case 3:
                    genshin.luta();
                default:
                    break;
            }
        } while (op != 4);

    }
}
