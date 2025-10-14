public class AtaqueRapido implements Atacar {
    @Override
    public void atacar(String nome) {
        System.out.println(nome + " executa um ataque veloz e preciso!");
    }

    @Override
    public void agir(String nome) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
