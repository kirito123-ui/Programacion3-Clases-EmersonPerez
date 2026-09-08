public abstract class Vehiculo {
    private String codigo;
    private String marca;
    private String modelo;
    private int anio;
    private double velocidadActual;

    public Vehiculo(String c, String m, String mod, int a) {
        codigo = c;
        marca = m;
        modelo = mod;
        anio = a;
        velocidadActual = 0;
    }

    public abstract void conducir();

    public String getCodigo() { return codigo; }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getAnio() { return anio; }
    public double getVelocidadActual() { return velocidadActual; }
    
    public void setVelocidadActual(double v) {
        velocidadActual = v;
    }
}
