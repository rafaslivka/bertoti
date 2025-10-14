public class Main {
    public static void main(String[] args) {
        Ataque fisico = new AtaqueFisico();
        Ataque magico = new AtaqueMagico();

        Personagem aiden = new Personagem("Aiden", fisico);
        Personagem luna = new Personagem("Luna", magico);

        Grupo herois = new Grupo("Guardians of Elements");

        aiden.adicionar(luna);  // Observer
        luna.adicionar(herois); // Composite + Observer

        aiden.atacar();
        luna.atacar();
    }
}
