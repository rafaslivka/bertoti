import java.util.ArrayList;
import java.util.List;

public class Grupo implements Componente {
    private String nome;
    private List<Componente> elementos = new ArrayList<>();

    public Grupo(String nome) {
        this.nome = nome;
    }

    public void adicionar(Componente c) {
        elementos.add(c);
    }

    @Override
    public void mostrar() {
        System.out.println("Grupo: " + nome);
        for (Componente c : elementos) {
            c.mostrar();
        }
    }
}
