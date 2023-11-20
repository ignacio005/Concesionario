package presentacion;
import dominio.*;

import java.util.ArrayList;

public class Principal {
    public static void main (String[]args){

        VehiculoTurismo vehiculoturismo1 = new VehiculoTurismo("Ford", "Focus");
        vehiculoturismo1.PrecioFinalVehiculoTurismo(8,30483);
        Concesionario.AnadirVehiculoTurismoPrecio(vehiculoturismo1);
        Furgoneta furgoneta1 =new Furgoneta("Ford","Transit connect van");
        furgoneta1.PrecioFinalFurgoneta(4,30366);
        Concesionario.AnadirFurgonetaPrecio(furgoneta1);

        Concesionario.MostrarVehiculosPrecio();

    }
}
