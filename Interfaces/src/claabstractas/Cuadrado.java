package claabstractas;

public class Cuadrado implements Figura, Dibujable, Rotable {

    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }
        
    @Override
    public double calcularArea() {
        double resultado = lado *lado;
        return resultado;
    }

    @Override
    public void dibujar() {
        System.out.println("Hola, estoy dibujando un cuadrado.");
    }

    @Override
    public void rotar() {
        System.out.println("Hola, estoy rotando un círcule");
    }
    
}
