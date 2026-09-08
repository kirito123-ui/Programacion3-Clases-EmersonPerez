public class Automovil extends Vehiculo {
    private int puertas;

    public Automovil(String c, String m, String mod, int a, int p) {
        super(c, m, mod, a);
        puertas = p;
    }

    @Override
    public void conducir() {
        setVelocidadActual(60);
        System.out.println("El auto esta conduciendo por la calle");
    }

    @Override
    public String toString() {
        return "Vehiculo " + getCodigo() + " " + getMarca() + " " + getModelo() + " de año " + getAnio() + " y tiene " + puertas + " puertas. Velocidad: " + getVelocidadActual();
    }
}
