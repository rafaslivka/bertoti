// pattern-observer/Main.java
public class Main {
    public static void main(String[] args) {
        Canal palmeiras = new Canal("Palmeiras FC");
        Canal brasileirao = new Canal("Brasileirão 2025");

        Usuario joao = new Usuario("João");
        Usuario maria = new Usuario("Maria");
        Usuario pedro = new Usuario("Pedro");

        // Usuários se inscrevem nos canais
        palmeiras.adicionar(joao);
        palmeiras.adicionar(maria);
        
        brasileirao.adicionar(joao);
        brasileirao.adicionar(pedro);

        // Publicações
        palmeiras.publicar("GOOOOL! Palmeiras 2 x 0 Santos!");
        System.out.println();
        brasileirao.publicar("Rodada 15 começa hoje às 16h!");
    }
}