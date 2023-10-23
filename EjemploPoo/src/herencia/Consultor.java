package herencia;

public class Consultor extends Persona{
    
    String nombre_consultarora;
    int num_consultor;

    public Consultor() {
    }

    public Consultor(String nombre_consultarora, int num_consultor) {
        this.nombre_consultarora = nombre_consultarora;
        this.num_consultor = num_consultor;
    }

    public Consultor(String nombre_consultarora, int num_consultor, int id, String dni, String nombre, String apellido, String domicilio, String telefono) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.nombre_consultarora = nombre_consultarora;
        this.num_consultor = num_consultor;
    }

    public String getNombre_consultarora() {
        return nombre_consultarora;
    }

    public void setNombre_consultarora(String nombre_consultarora) {
        this.nombre_consultarora = nombre_consultarora;
    }

    public int getNum_consultor() {
        return num_consultor;
    }

    public void setNum_consultor(int num_consultor) {
        this.num_consultor = num_consultor;
    }
    
    
}
