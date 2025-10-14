// pattern-composite/Main.java
public class Main {
    public static void main(String[] args) {
        Item neymar = new Item("Neymar");
        Item mbappe = new Item("Mbappé");
        Item casemiro = new Item("Casemiro");
        Item marquinhos = new Item("Marquinhos");

        Grupo ataque = new Grupo("Ataque");
        ataque.adicionar(neymar);
        ataque.adicionar(mbappe);

        Grupo defesa = new Grupo("Defesa");
        defesa.adicionar(casemiro);
        defesa.adicionar(marquinhos);

        Grupo timeTitular = new Grupo("Time Titular");
        timeTitular.adicionar(ataque);
        timeTitular.adicionar(defesa);
        
        timeTitular.exibir();
    }
}