// Personagem.java
public abstract class Personagem {
    protected String nome;

    public Personagem(String nome) {
        this.nome = nome;
    }

    public abstract void atacar();

    public static void main(String[] args) {
        Personagem p1 = new Guerreiro("Arthur");
        Personagem p2 = new Arqueiro("Robin");
        Personagem p3 = new Mago("Merlin");

        p1.atacar();
        p2.atacar();
        p3.atacar();
    }
}

class Guerreiro extends Personagem {

    public Guerreiro(String nome) {
        super(nome);
    }

    @Override
    public void atacar() {
        System.out.println(nome + " ataca: Golpe com espada!");
    }
}

class Arqueiro extends Personagem {

    public Arqueiro(String nome) {
        super(nome);
    }

    @Override
    public void atacar() {
        System.out.println(nome + " ataca: Flecha disparada!");
    }
}

class Mago extends Personagem {

    public Mago(String nome) {
        super(nome);
    }

    @Override
    public void atacar() {
        System.out.println(nome + " ataca: Bola de fogo lançada!");
    }
}
