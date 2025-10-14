import java.util.ArrayList;
import java.util.List;

public class Canal implements Subject {
    private String nome;
    private List<Observer> assinantes = new ArrayList<>();

    public Canal(String nome) {
        this.nome = nome;
    }

    @Override
    public void registrar(Observer o) {
        assinantes.add(o);
    }

    @Override
    public void remover(Observer o) {
        assinantes.remove(o);
    }

    @Override
    public void notificar(String mensagem) {
        for (Observer o : assinantes) {
            o.atualizar(nome + ": " + mensagem);
        }
    }

    public void enviarNoticia(String mensagem) {
        System.out.println("📰 " + nome + " publicou: " + mensagem);
        notificar(mensagem);
    }
}
