// pattern-composite/Item.java
public class Item implements Componente {
    private String nome;

    public Item(String nome) {
        this.nome = nome;
    }

    @Override
    public void exibir() {
        System.out.println("- " + nome);
    }

    public void adicionar(Item casemiro) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'adicionar'");
    }
}
