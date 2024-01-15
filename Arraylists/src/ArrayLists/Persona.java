package ArrayLists;

public class Persona {

   private int num;
   private String Nombre;
   private int edad;

    public Persona() {
    }

    public Persona(int num, String Nombre, int edad) {
        this.num = num;
        this.Nombre = Nombre;
        this.edad = edad;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "num=" + num + ", Nombre=" + Nombre + ", edad=" + edad + '}';
    }
   
   
    
}
