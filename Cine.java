
public class Cine {
    private int[] entradasVendidas;
    private final int capacidadPorSala = 25;

    public Cine(int numSalas) {
        entradasVendidas = new int[numSalas];
    }

    public void consultarDisponibilidad() {
        for (int i = 0; i < entradasVendidas.length; i++) {
            System.out.println("Sala " + (i + 1) + ": " +
                    (capacidadPorSala - entradasVendidas[i]) + " espacios disponibles");
        }
    }

    public boolean venderEntrada(int sala, int cantidad) {
        if (entradasVendidas[sala] + cantidad <= capacidadPorSala) {
            entradasVendidas[sala] += cantidad;
            return true;
        }
        return false;
    }
}
