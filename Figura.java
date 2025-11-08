public abstract class Figura {
    protected String nombre;
    protected int base;
    protected int altura;
    public Figura (String nombre, int base, int altura) {
        this.nombre = nombre;
        this.base = base;
        this.altura = altura;
    }
//    protected abstract void metodoPredeterminado((){
//    };
    protected abstract double getArea();
    protected abstract void mostrarArea();
}
