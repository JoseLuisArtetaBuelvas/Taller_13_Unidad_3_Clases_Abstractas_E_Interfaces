public class Triangulo extends Figura{
    public Triangulo(String nombre, int base, int altura) {
        super(nombre, base, altura);
    }
    @Override
    protected double getArea(){
        return (double) (base * altura) / 2;
    }
    @Override
    public void mostrarArea() {
        System.out.println("Nombre: " + nombre + " Area: " + getArea());
    }
}
