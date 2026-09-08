public class Main {
    public static void main(String[] args) {
        Vehiculo[] arreglo = new Vehiculo[5];
        
        Automovil auto1 = new Automovil("001", "Toyota", "Corolla", 2010, 4);
        Automovil auto2 = new Automovil("002", "Honda", "Civic", 2015, 2);
        Motocicleta moto1 = new Motocicleta("003", "Yamaha", "Ninja", 2020, 250);
        Camion cam1 = new Camion("004", "Ford", "F150", 2018, 1000);
        Camion cam2 = new Camion("005", "Mack", "Truck", 2005, 5000);

        arreglo[0] = auto1;
        arreglo[1] = auto2;
        arreglo[2] = moto1;
        arreglo[3] = cam1;
        arreglo[4] = cam2;

        for (int i = 0; i < 5; i++) {
            System.out.println("-----------------");
            System.out.println("Clase: " + arreglo[i].getClass());
            System.out.println(arreglo[i].toString()); 
            arreglo[i].conducir();

            if (arreglo[i] instanceof Cargable) {
                System.out.println("Este si se puede cargar");
                Cargable c = (Cargable) arreglo[i];
                c.cargar(500);
                c.descargar();
            }
        }
    }
}
