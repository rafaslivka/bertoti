public interface Subject {
    void adicionar(Observer o);
    void notificar(String mensagem);
}
