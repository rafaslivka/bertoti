public class Main {
    public static void main(String[] args) {
        Item cadeira = new Item("Cadeira");
        Item mesa = new Item("Mesa");
        Item computador = new Item("Computador");
        Item impressora = new Item("Impressora");

        Grupo escritorio = new Grupo("Escritório");
        escritorio.adicionar(cadeira);
        escritorio.adicionar(mesa);

        Grupo equipamentos = new Grupo("Equipamentos");
        equipamentos.adicionar(computador);
        equipamentos.adicionar(impressora);

        Grupo sala = new Grupo("Sala de Trabalho");
        sala.adicionar(escritorio);
        sala.adicionar(equipamentos);

        sala.mostrar();
    }
}
