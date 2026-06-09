package App;

import Model.Direccion;
import Model.Empleado;

public class Main {
    public static void main(String[] args) {

        /**
         *
         * En la clase Main se muestran las direcciones de los empleados junto con la informacion de ellos.
         */

        Direccion d1 =
                new Direccion(
                        "Av. Parque del agua 1254",
                        "Puerto Varas",
                        "Puerto Varas"
                );
        Empleado e1 =
                new Empleado(
                        "Nicolas Salgado",
                        "11.111.111-1",
                        "+56 9 11111111",
                        d1,
                        "Guia turistico",
                        200000.0
                );
        Direccion d2 =
                new Direccion(
                        "Av. Parque del sol 1234",
                        "Frutillar",
                        "Los Lagos"
                );
        Empleado e2 =
                new Empleado(
                        "Javier Soto",
                        "22.222.222-2",
                        "+56 9 22222222",
                        d2,
                        "Coordinador",
                        150000.0
                );
        Direccion d3 =
                new Direccion(
                        "Av. Parque del viento 4312",
                        "Santiago",
                        "Puente Alto"
                );
        Empleado e3 =
                new Empleado(
                        "Javiera Soto",
                        "33.333.333-3",
                        "+56 9 33333333",
                        d3,
                        "Operadora Turistica",
                        300000.0
                );

        /**
         *
         * Aqui se muestran los resultados en la consola
         */

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
         }
    }