public class AtaqueFisico implements Ataque {
    @Override
    public void executar(String nome) {
        System.out.println(nome + " desfere um ataque físico esmagador!");
    }
}
