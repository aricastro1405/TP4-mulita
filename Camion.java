import java.util.ArrayList;
import java.util.List;

public class Camion {
    private String patente;
    private double peso;
    private boolean roto;
    private List<Paquete> paquetes;
    private static final double MAX_PESO = 3000.0;

    public Camion(String patente) {
        this.patente = patente;
        this.peso = 0;
        this.roto = false;
        this.paquetes = new ArrayList<>();
    }

    public boolean cargarPaquete(Paquete paquete) {
        if (verificarPeso(paquete.getPeso())) {
            paquetes.add(paquete);
            peso += paquete.getPeso();
            return true;
        }
        return false;
    }

    public boolean verificarPeso(double peso) {
        return this.peso + peso <= MAX_PESO;
    }

    public void ordenarCarga() {
        paquetes.sort((p1, p2) -> Double.compare(p1.getPeso(), p2.getPeso()));
    }

    public List<Paquete> getPaquetes() {
        return paquetes;
    }

    public void vaciarCamion() {
        paquetes.clear();
        peso = 0;
    }
}
