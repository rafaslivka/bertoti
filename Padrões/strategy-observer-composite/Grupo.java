// strategy-observer-composite/Grupo.java
import java.util.ArrayList;
import java.util.List;

public class Grupo implements Observer {
    private String nome;
    private List<Personagem> membros = new ArrayList<>();

    public Grupo(String nome) {
        this.nome = nome;
    }

    public void adicionar(Item mbappe) {
        membros.add(mbappe);
    }

    public void exibir() {
        System.out.println("Grupo: " + nome);
        for (Personagem p : membros) {
            System.out.println(" - " + p);
        }
    }

    @Override
    public void update(String mensagem) {
        System.out.println("[" + nome + "] recebeu notícia: " + mensagem);
    }
}
