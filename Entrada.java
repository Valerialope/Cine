public class Entrada implements Comparable<Entrada> {
    private int sala;
    private int cantidadEntradas;

    public Entrada(int sala, int cantidadEntradas) {
        this.sala = sala;
        this.cantidadEntradas = cantidadEntradas;
    }

    public int getSala() {
        return sala;
    }

    public int getCantidadEntradas() {
        return cantidadEntradas;
    }

    @Override
    public int compareTo(Entrada other) {
        return Integer.compare(this.cantidadEntradas, other.cantidadEntradas);
    }
}