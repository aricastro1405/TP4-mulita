public class Paquete {
    private String codigo;
    private double peso;

    public Paquete(String codigo, double peso) {
        this.codigo = codigo;
        this.peso = peso;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPeso() {
        return peso;
    }
}
