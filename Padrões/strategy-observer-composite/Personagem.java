import java.util.ArrayList;
import java.util.List;

public class Personagem implements Observer, Subject {
    private final String nome;
    private Ataque estrategiaAtaque;
    private List<Observer> aliados = new ArrayList<>();

    public Personagem(String nome, Ataque estrategiaAtaque) {
        this.nome = nome;
        this.estrategiaAtaque = estrategiaAtaque;
    }

    public void atacar() {
        estrategiaAtaque.executar(nome);
        notificar(nome + " iniciou um ataque!");
    }

    @Override
    public void update(String mensagem) {
        System.out.println(nome + " recebeu atualização: " + mensagem);
    }

    @Override
    public void adicionar(Observer o) {
        aliados.add(o);
    }

    @Override
    public void notificar(String mensagem) {
        for (Observer o : aliados) {
            o.update(mensagem);
        }
    }

    public String getNome() {
        return nome;
    }

    public Ataque getEstrategiaAtaque() {
        return estrategiaAtaque;
    }

    public void setEstrategiaAtaque(Ataque estrategiaAtaque) {
        this.estrategiaAtaque = estrategiaAtaque;
    }

    public List<Observer> getAliados() {
        return aliados;
    }

    public void setAliados(List<Observer> aliados) {
        this.aliados = aliados;
    }
}
