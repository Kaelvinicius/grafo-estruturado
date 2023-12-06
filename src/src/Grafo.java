import java.util.ArrayList;

public class Grafo<t> {
    private ArrayList<Vertice<t>> vertices;
    private ArrayList<Aresta<t>> arestas;

    public Grafo(){
        this.vertices = new ArrayList<Vertice<t>>();
        this.arestas = new ArrayList<Aresta<t>>();
    }

    public void addVertice(t dado){
        Vertice<t> novoVertice = new Vertice<t>(dado);
        this.vertices.add(novoVertice);
    }

    public void addAresta(Double peso, t dadoInicio, t dadoFim){
        Vertice<t> inicio = this.getVertice(dadoInicio);
        Vertice<t> fim = this.getVertice(dadoFim);
        Aresta<t> aresta = new Aresta<t>(peso, inicio, fim);
        inicio.addArestaSaida(aresta);
        fim.addArestaEntrada(aresta);
        this.arestas.add(aresta);
    }

    public Vertice<t> getVertice(t dado){
        Vertice<t> vertice = null;
        for (int i = 0; i < this.vertices.size(); i++){
            if (this.vertices.get(i).getDado().equals(dado)){
                vertice = this.vertices.get(i);
                break;
            }
        }
        return vertice;
    }

    public void buscaEmlargura(){
        ArrayList<Vertice<t>> marcados = new ArrayList<Vertice<t>>();
        ArrayList<Vertice<t>> fila = new ArrayList<Vertice<t>>();
        Vertice<t> atual = this.vertices.get(0);
        marcados.add(atual);
        System.out.println(atual.getDado());
        fila.add(atual);
        while (fila.size() > 0){
            Vertice<t> visitado = fila.get(0);
            for (int i = 0; i < visitado.getArestasSaida().size(); i++){
                Vertice<t> proximo = visitado.getArestasSaida().get(i).getFim();
                if (!marcados.contains(proximo)){
                    marcados.add(proximo);
                    System.out.println(proximo.getDado());
                    fila.add(proximo);
                }
            }
            fila.remove(0);
        }
    }

}