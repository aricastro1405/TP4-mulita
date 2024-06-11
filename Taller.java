import java.util.ArrayList;
import java.util.List;

public class Taller {
    private String domicilio;
    private String telefono;
    private List<Camion> camiones;

    public Taller(String domicilio, String telefono) {
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.camiones = new ArrayList<>();
    }

    public boolean verificarPeso(double peso) {
        return true;
    }

    public void agregarCamion(Camion camion) {
        camiones.add(camion);
    }
}
