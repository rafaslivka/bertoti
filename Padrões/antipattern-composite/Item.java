// antipattern-composite/Item.java
public class Item {
    private String nome;

    public Item(String nome) {
        this.nome = nome;
    }

    public void exibir() {
        System.out.println("Jogador: " + nome);
    }

    void adicionar(Item casemiro) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}