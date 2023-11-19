package dominio;
import java.util.ArrayList;

public class Concesionario {

    private static ArrayList <Vehiculo> coches = new ArrayList <>();

    public static ArrayList <Vehiculo> getListaCoches(){

        return coches;

    }
    public static void AñadirVehiculoTurismoPrecio(VehiculoTurismo vehiculoTurismo){

        coches.add(vehiculoTurismo);

    }
    public static void AñadirFurgonetaPrecio(Furgoneta furgoneta){

        coches.add(furgoneta);

    }
    public static void MostrarVehiculosPrecio(){

        for (int i=0; i< coches.size(); i++){
            System.out.println(i+":"+ getListaCoches());
        }
    }

}
