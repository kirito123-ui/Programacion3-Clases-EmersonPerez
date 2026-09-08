public class Camion extends Vehiculo implements Cargable {
    private double capMax;
    private double carga;

    public Camion(String c, String m, String mod, int a, double capMax) {
        super(c, m, mod, a);
        this.capMax = capMax;
        this.carga = 0;
    }

    @Override
    public void conducir() {
        setVelocidadActual(40);
        System.out.println("El camion va lento");
    }

    @Override
    public void cargar(double peso) {
        if (carga + peso <= capMax) {
            carga = carga + peso;
            System.out.println("Cargado. Ahora tiene: " + carga);
        } else {
            System.out.println("Error: No cabe la carga");
        }
    }

    @Override
    public void descargar() {
        carga = 0;
        System.out.println("Camion vacio");
    }

    @Override
    public String toString() {
        return "Vehiculo " + getCodigo() + " " + getMarca() + " " + getModelo() + " de año " + getAnio() + " capacidad: " + capMax + " carga actual: " + carga;
    }
}
