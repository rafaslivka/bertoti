// pattern-observer/Usuario.java
public class Usuario implements Observer {
    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(String mensagem) {
        System.out.println("🔔 " + nome + " recebeu: " + mensagem);
    }

    public void receberMensagem(String nome2, String mensagem) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'receberMensagem'");
    }
}
