public class Motocicleta extends Vehiculo {
    private int motor;

    public Motocicleta(String c, String m, String mod, int a, int motor) {
        super(c, m, mod, a);
        this.motor = motor;
    }

    @Override
    public void conducir() {
        setVelocidadActual(80);
        System.out.println("La moto arranca rapido");
    }

    @Override
    public String toString() {
        return "Vehiculo " + getCodigo() + " " + getMarca() + " " + getModelo() + " de año " + getAnio() + " con motor " + motor + "cc. Velocidad: " + getVelocidadActual();
    }
}
