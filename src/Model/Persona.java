package Model;

/**
 *
 * Clase padre que representa a una persona de la agencia de turismo
 *
 */
public class Persona {

    private String nombre;
    private String rut;
    private String telefono;
    private Direccion direccion;


    /**
     *
     * Constructores sin parametros
     *
     */

    public Persona() {

        this.nombre = "Sin nombre";
        this.rut = "Sin rut";
        this.telefono = "Sin telefono";
        this.direccion = new Direccion();

        /**
         *
         * Constructores con parametros
         *
         */
    }

        public Persona(String nombre, String rut, String telefono, Direccion direccion){

            this.nombre = nombre;
            this.rut = rut;
            this.telefono = telefono;
            this.direccion = direccion;
        }

        /**
         * Gettters
         */

        public String getNombre(){
            return nombre;
        }

        public String getRut(){
            return rut;
        }

        public String getTelefono(){
            return telefono;
        }

        public Direccion getDireccion(){
            return direccion;
        }

        /**
         * Setters
         */

        public void setNombre(String nombre){
            this.nombre = nombre;
        }

        public void setRut(String rut){
            this.rut = rut;
        }

        public void setTelefono(String telefono){
            this.telefono = telefono;
        }
        public void setDireccion(Direccion direccion){
            this.direccion = direccion;
        }

        /**
         * To string para devolver la informacion de la persona en formato de texto
         */
        @Override
        public String toString(){
            return "Nombre: " + nombre +
                    ", Rut: " + rut +
                    ", Telefono: " + telefono +
                    ", Direccion: " + direccion;

        }
    }


