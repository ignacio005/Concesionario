package dominio;

public class Furgoneta extends Vehiculo{

    public Furgoneta(String marca,String modelo){

        super();

    }
    public void PrecioFinalFurgoneta(int capacidad, int preciobasef){

        int raizCubica = (int) Math.cbrt(capacidad);
        int division = capacidad / 2;
        int preciofinal = preciobasef * division;
        System.out.println("El precio de la furgoneta, según su capacidad es " + preciofinal + " €.");

    }

}
