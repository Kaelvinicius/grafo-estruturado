public class Aresta<t> {
    private  Double peso;
    private  Vertice<t> inicio;
    private  Vertice<t> fim;

    public Aresta(Double peso, Vertice<t> inicio, Vertice<t> fim) {
        this.peso = peso;
        this.inicio = inicio;
        this.fim = fim;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Vertice<t> getInicio() {
        return inicio;
    }

    public void setInicio(Vertice<t> inicio) {
        this.inicio = inicio;
    }

    public Vertice<t> getFim() {
        return fim;
    }

    public void setFim(Vertice<t> fim) {
        this.fim = fim;
    }
}
