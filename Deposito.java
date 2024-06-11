import java.util.ArrayList;
import java.util.List;

public class Deposito {
    private String provincia;
    private List<Paquete> paquetes;
    private List<Camion> camiones;
    private Taller taller;

    public Deposito(String provincia, Taller taller) {
        this.provincia = provincia;
        this.paquetes = new ArrayList<>();
        this.camiones = new ArrayList<>();
        this.taller = taller;
    }

    public boolean cargarPaquetes(Paquete paquete) {
        for (Camion camion : camiones) {
            if (camion.cargarPaquete(paquete)) {
                return true;
            }
        }
        paquetes.add(paquete);
        return false;
    }

    public void distribuirCarga(Camion camion) {
        List<Paquete> paquetesNoDistribuidos = new ArrayList<>();
        for (Paquete paquete : camion.getPaquetes()) {
            boolean cargado = false;
            for (Camion otroCamion : camiones) {
                if (otroCamion != camion && otroCamion.cargarPaquete(paquete)) {
                    cargado = true;
                    break;
                }
            }
            if (!cargado) {
                paquetesNoDistribuidos.add(paquete);
            }
        }
        camion.vaciarCamion();
        paquetes.addAll(paquetesNoDistribuidos);
    }

    public void vaciarCamion(Camion camion) {
        paquetes.addAll(camion.getPaquetes());
        camion.vaciarCamion();
    }

    public void agregarCamion(Camion camion) {
        camiones.add(camion);
    }
}
