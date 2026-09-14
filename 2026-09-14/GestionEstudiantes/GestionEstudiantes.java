public class GestionEstudiantes {

    public static void main(String[] args) {
        
        String[] nombres = {"Juan Perez", "Ana Lopez", "Carlos Ruiz", "Maria Diaz", "Luis Marte"};
        String[] correos = {"juan@ucne.edu", "ana@gmail.com", "carlos@ucne.edu", "maria@yahoo.com", "luis@ucne.edu"};
        double[] parcial1 = {8.5, 9.0, 6.3, 4.5, 7.8};
        double[] parcial2 = {7.0, 8.5, 5.9, 6.0, 9.2};
        double[] parcial3 = {9.0, 7.5, 4.8, 8.0, 6.5};

        System.out.println("NOMBRE           PROMEDIO    ESTADO");
        System.out.println("--------------------------------------");

        for (int i = 0; i < nombres.length; i++) {
            double promedio = (parcial1[i] + parcial2[i] + parcial3[i]) / 3.0;
            String estado = "";
            
            if (promedio >= 6.0) {
                estado = "Aprobado";
            } else {
                estado = "Reprobado";
            }
            
            System.out.printf("%-16s %-11.2f %s\n", nombres[i], promedio, estado);
        }

        System.out.println();

        double sumaPromedios = 0;
        double notaMayor = (parcial1[0] + parcial2[0] + parcial3[0]) / 3.0;
        double notaMenor = (parcial1[0] + parcial2[0] + parcial3[0]) / 3.0;
        
        int posMayor = 0;
        int posMenor = 0;
        
        int aprobados = 0;
        int reprobados = 0;

        for (int i = 0; i < nombres.length; i++) {
            double prom = (parcial1[i] + parcial2[i] + parcial3[i]) / 3.0;
            sumaPromedios = sumaPromedios + prom;

            if (prom > notaMayor) {
                notaMayor = prom;
                posMayor = i;
            }

            if (prom < notaMenor) {
                notaMenor = prom;
                posMenor = i;
            }
            
            if (prom >= 6.0) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        double promedioGeneral = sumaPromedios / nombres.length;

        System.out.printf("Promedio general del grupo: %.2f\n", promedioGeneral);
        System.out.println("Estudiante con el promedio mas alto: " + nombres[posMayor]);
        System.out.println("Estudiante con el promedio mas bajo: " + nombres[posMenor]);
        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de reprobados: " + reprobados);

        System.out.println();

        
        System.out.println("Estudiantes con correo institucional:");
        for (int i = 0; i < correos.length; i++) {
            if (correos[i].endsWith("@ucne.edu")) {
                String nombreMayus = nombres[i].toUpperCase();
                System.out.printf("- %-14s %s\n", nombreMayus, correos[i]);
            }
        }

        System.out.println();

        
        String textoBusqueda = "lopez";
        int indiceEncontrado = buscarEstudiante(nombres, textoBusqueda);

        if (indiceEncontrado != -1) {
            double promEstudiante = (parcial1[indiceEncontrado] + parcial2[indiceEncontrado] + parcial3[indiceEncontrado]) / 3.0;
            
            System.out.println("--- Resultado de la busqueda: '" + textoBusqueda + "' ---");
            System.out.println("Nombre: " + nombres[indiceEncontrado]);
            System.out.println("Correo: " + correos[indiceEncontrado]);
            System.out.println("Parcial 1: " + parcial1[indiceEncontrado]);
            System.out.println("Parcial 2: " + parcial2[indiceEncontrado]);
            System.out.println("Parcial 3: " + parcial3[indiceEncontrado]);
            System.out.printf("Promedio: %.2f\n", promEstudiante);
        } else {
            System.out.println("No se encontro al estudiante.");
        }
    }

    
    public static int buscarEstudiante(String[] nombres, String busqueda) {
        for (int i = 0; i < nombres.length; i++) {
        
            if (nombres[i].toLowerCase().contains(busqueda.toLowerCase())) {
                return i;
            }
        }
        return -1;
    }
}
