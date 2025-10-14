public interface Subject {
    void registrar(Observer o);
    void remover(Observer o);
    void notificar(String mensagem);
}
