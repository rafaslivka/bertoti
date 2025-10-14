// antipattern-observer/Main.java
public class Main {
    public static void main(String[] args) {
        Usuario joao = new Usuario("João");
        Usuario maria = new Usuario("Maria");

        Canal palmeiras = new Canal("Palmeiras FC");
        Canal brasileirao = new Canal("Brasileirão");

        palmeiras.publicar("GOOOOL! Corinthians 2 x 0!", joao, maria);
        brasileirao.publicar("Rodada 15 começa hoje!", joao, maria);
    }
}