import java.util.ArrayList;

public class Vertice <t>{
    private t dado;
    private ArrayList<Aresta<t>> arestasEntrada;
    private ArrayList<Aresta<t>> arestasSaida;

    public Vertice(t valor){
        this.dado = valor;
        this.arestasEntrada = new ArrayList<Aresta<t>>();
        this.arestasSaida = new ArrayList<Aresta<t>>();
    }

    public t getDado() {
        return dado;
    }

    public void setDado(t dado) {
        this.dado = dado;
    }

    public ArrayList<Aresta<t>> getArestasEntrada() {
        return arestasEntrada;
    }

    public void setArestasEntrada(ArrayList<Aresta<t>> arestasEntrada) {
        this.arestasEntrada = arestasEntrada;
    }

    public ArrayList<Aresta<t>> getArestasSaida() {
        return arestasSaida;
    }

    public void setArestasSaida(ArrayList<Aresta<t>> arestasSaida) {
        this.arestasSaida = arestasSaida;
    }

    public void addArestaEntrada(Aresta<t> aresta){
        this.arestasEntrada.add(aresta);
    }

    public void addArestaSaida(Aresta<t> aresta){
        this.arestasSaida.add(aresta);
    }
}
