// antipattern-composite/Main.java
public class Main {
    public static void main(String[] args) {
        Item neymar = new Item("Neymar");
        Item mbappe = new Item("Mbappé");
        Item messi = new Item("Messi");
        Item casemiro = new Item("Casemiro");

        Grupo ataque = new Grupo("Ataque");
        ataque.adicionar(neymar);
        ataque.adicionar(mbappe);
        ataque.adicionar(messi);

        Grupo meioCampo = new Grupo("Meio-Campo");
        meioCampo.adicionar(casemiro);

        // Exibindo jogadores individuais
        neymar.exibir();
        messi.exibir();
        
        // Exibindo grupos
        ataque.exibir();
        meioCampo.exibir();
    }
}