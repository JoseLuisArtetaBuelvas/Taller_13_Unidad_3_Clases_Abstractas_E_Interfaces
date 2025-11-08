//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class InstanciarTrianguloRectangulo {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo("Triángulo", 10, 5);
        triangulo.getArea();
        triangulo.mostrarArea();
        Rectangulo rectangulo = new Rectangulo("Rectangulo", 60, 40);
        rectangulo.getArea();
        rectangulo.mostrarArea();
    }
}