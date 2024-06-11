import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private List<Deposito> depositos;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.depositos = new ArrayList<>();
    }

    public void distribuirPaquetes(Paquete paquete) {
        for (Deposito deposito : depositos) {
            if (deposito.cargarPaquetes(paquete)) {
                return;
            }
        }
        System.out.println("No se pudo distribuir el paquete: " + paquete.getCodigo());
    }

    public void agregarDeposito(Deposito deposito) {
        depositos.add(deposito);
    }
}
