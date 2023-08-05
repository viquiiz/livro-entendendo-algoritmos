public class App {
    public static void main(String[] args) {
        System.out.println("Soma de todos os itens da lista: " + RecursiveSum.sum(new int[]{1, 2, 3, 4}));

        System.out.println("Contagem de números da lista: " + RecursiveCount.count(new int[]{0, 1, 2, 3, 4, 5}));

        System.out.println("Encontrando o maior número dentro da lista: " + RecursiveMax.max(new int[]{1, 5, 10, 25, 16, 1}));
    }
}
