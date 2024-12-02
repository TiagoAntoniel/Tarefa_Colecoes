package tarefa_colecoes;

import sexoENome.ComparaSexoNomeESexo;
import sexoENome.Pessoas;

import java.util.*;

public class colecoes {
    public static void main(String[] args) {
        listaOrdenada();
        listaOrdenadaSexoENomes();
    }

    private static void listaOrdenada() {

        Scanner sc = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();
        System.out.println("********* listaOrdenada *********");
        System.out.print("Quantos nomes serao digitados? ");
        int quantidade = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Nome numero " + (i + 1) + ": ");
            String nome = sc.nextLine();
            nomes.add(nome);
        }
        System.out.println();
        Collections.sort(nomes);

        System.out.println("Nomes ordenados:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        sc.close();
    }

    private static <ComparaSexoSexoENome> void listaOrdenadaSexoENomes() {

        System.out.println("********* sexoENome *********");
        List<Pessoas> lista = new ArrayList<>();

        Pessoas a = new Pessoas("Maria", "f");
        Pessoas b = new Pessoas("roberto", "m");
        Pessoas c = new Pessoas("marcos", "m");
        Pessoas d = new Pessoas("joaquina", "f");
        lista.add(a);
        lista.add(b);
        lista.add(c);
        lista.add(d);
        lista.sort(new ComparaSexoNomeESexo());


        System.out.println("Nome e sexo ordenados: ");
        for (Pessoas p : lista){
            System.out.println(p);
        }
    }
}
