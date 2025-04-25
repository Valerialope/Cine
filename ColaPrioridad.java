import java.util.PriorityQueue;

public class ColaPrioridad {
    private PriorityQueue<Entrada> cola;

    public ColaPrioridad() {
        cola = new PriorityQueue<>();
    }

    public void insertarCliente(Entrada entrada) {
        cola.add(entrada);
    }

    public Entrada procesarCliente() {
        return cola.poll();
    }

    public boolean estaVacia() {
        return cola.isEmpty();
    }
}
