public class AtaqueMagia implements Atacar {
    @Override
    public void atacar(String nome) {
        System.out.println(nome + " conjura uma magia flamejante!");
    }

    @Override
    public void agir(String nome) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
