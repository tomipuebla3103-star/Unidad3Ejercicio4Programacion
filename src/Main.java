//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Estudiante estudiante = new Estudiante(101, "Tomas");

    estudiante.agregarNota(8);
    estudiante.agregarNota(9);
    estudiante.agregarNota(7);
    estudiante.agregarNota(12);
    estudiante.agregarNota(-2);

    System.out.println("Promedio final: " + estudiante.calcularPromedio());
}
