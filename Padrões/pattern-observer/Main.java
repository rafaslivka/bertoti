public class Main {
    public static void main(String[] args) {
        Canal tecnologia = new Canal("Tech News");
        Canal esportes = new Canal("Esportes Hoje");

        Usuario alice = new Usuario("Alice");
        Usuario bob = new Usuario("Bob");
        Usuario carlos = new Usuario("Carlos");

        tecnologia.registrar(alice);
        tecnologia.registrar(bob);

        esportes.registrar(alice);
        esportes.registrar(carlos);

        tecnologia.enviarNoticia("Novo smartphone lançado esta semana!");
        System.out.println();
        esportes.enviarNoticia("Campeonato estadual começa no próximo domingo!");
    }
}
