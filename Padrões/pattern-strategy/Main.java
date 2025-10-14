public class Main {
    public static void main(String[] args) {
        Atacar forte = new AtaqueForte();
        Atacar rapido = new AtaqueRapido();
        Atacar magia = new AtaqueMagia();

        Personagem guerreiro = new Personagem("Draco", forte);
        Personagem ladino = new Personagem("Selene", rapido);
        Personagem mago = new Personagem("Orion", magia);

        guerreiro.atacar();
        ladino.atacar();
        mago.atacar();

        System.out.println("\nSelene encontra uma espada lendária e muda sua estratégia:");
        ladino.setEstrategiaAtaque(forte);
        ladino.atacar();
    }
}
