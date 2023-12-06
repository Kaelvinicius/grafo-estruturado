import java.util.List;
import java.util.Scanner;

public class Caminho {
    public static void main(String[] args) {
         Grafo <String> grafo = new Grafo<>();

         grafo.addVertice("a");
         grafo.addVertice("b");
         grafo.addVertice("c");

         grafo.addAresta(2.0,"a", "b");
         grafo.addAresta(3.0,"a", "c");

        grafo.buscaEmlargura();

    }
}