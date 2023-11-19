package dominio;

public class VehiculoTurismo extends Vehiculo {

    public VehiculoTurismo(String marca, String modelo) {

        super();

    }

    public void PrecioFinalVehiculoTurismo(int plazas, int preciobasevt) {

        if (plazas <= 5) {

            System.out.println("El precio del vehículo turismo es " + preciobasevt + " €.");

        } else {

            int preciofinal = (int) (preciobasevt + preciobasevt * 0.1);
            System.out.println("El precio del vehículo turismo, por tener más de 5 asientos es " + preciofinal + " €.");

        }
    }
}



