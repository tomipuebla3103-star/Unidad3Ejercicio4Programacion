public class Estudiante {
    private int legajo;
    private String nombre;
    private double[] notas;
    private int cantidadNotas;

    public Estudiante( int legajo, String nombre){
        this.legajo = legajo;
        this.nombre = nombre;
        notas = new double[10];
        cantidadNotas = 0;

    }

    public void agregarNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            if (cantidadNotas < notas.length) {
                notas[cantidadNotas] = nota;
                cantidadNotas++;
                System.out.println("Nota agregada correctamente.");
            } else {
                System.out.println("No se pueden agregar más notas.");
            }
        } else {
            System.out.println("Error: la nota debe estar entre 0 y 10.");
        }
    }

    public double calcularPromedio() {
        if (cantidadNotas == 0) {
            return 0;
        }

        double suma = 0;

        for (int i = 0; i < cantidadNotas; i++) {
            suma += notas[i];
        }

        return suma / cantidadNotas;
    }
}
