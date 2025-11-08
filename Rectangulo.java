public class Rectangulo extends Figura{
    public Rectangulo(String nombre, int base, int altura){
        super(nombre, base, altura);
    }
    @Override
    protected double getArea() {
        return base*altura;
    }
    @Override
    public void mostrarArea() {
        System.out.println("Nombre: " + nombre + " Area: " + getArea());
    }
}
