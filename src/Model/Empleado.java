package Model;

/**
 *
 * Clase que representa al empleado y clase que se hereda de persona
 */
public class Empleado extends Persona {

    private String cargo;
    private Double sueldo;

    /**
     *
     * Constructores sin parametros
     *
     */

    public Empleado(){
        super();
        this.cargo = "Sin cargo";
        this.sueldo = 0.0;
    }
    /**
     *
     * Constructores con parametros
     *
     */
    public Empleado(String nombre, String rut, String telefono,Direccion direccion, String cargo, Double sueldo){
        super(nombre, rut, telefono,direccion);
        this.sueldo = sueldo;
        this.cargo = cargo;
    }

    /**
     * Gettters
     */

    public String getCargo() {
        return cargo;
    }

    public Double getSueldo() {
        return sueldo;
    }

    /**
     * Setters
     */

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
    /**
     * To string para devolver la informacion de la persona en formato de texto
     */
    @Override
    public String toString() {
        return super.toString() +
                ", Cargo: " + cargo +
                ", Sueldo: $" + sueldo;
    }
}
