public class AtaqueForte implements Atacar {
    @Override
    public void atacar(String nome) {
        System.out.println(nome + " desfere um golpe poderoso e esmagador!");
    }

    @Override
    public void agir(String nome) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
